package com.zendesk.sunshine_conversations_client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.activation.MimetypesFileTypeMap;

import org.jboss.logging.Logger;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.internal.ClientConfiguration;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import com.zendesk.sunshine_conversations_client.model.AppListFilter;
import com.zendesk.sunshine_conversations_client.model.ConversationListFilter;
import com.zendesk.sunshine_conversations_client.model.IntegrationListFilter;
import com.zendesk.sunshine_conversations_client.model.Page;

import com.zendesk.sunshine_conversations_client.auth.Authentication;
import com.zendesk.sunshine_conversations_client.auth.HttpBasicAuth;
import com.zendesk.sunshine_conversations_client.auth.HttpBearerAuth;
import com.zendesk.sunshine_conversations_client.auth.ApiKeyAuth;


public class ApiClient {
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private Map<String, String> defaultCookieMap = new HashMap<String, String>();
  private String basePath = "https://api.smooch.io";
  private boolean debugging = false;
  private static int DEFAULT_CONNECTION_POOL_SIZE = 20;

  private Client httpClient;
  private JSON json;
  private String tempFolderPath = null;

  private Map<String, Authentication> authentications;

  private int statusCode;
  private int connectionPoolSize;
  private Map<String, List<String>> responseHeaders;

  private DateFormat dateFormat;

  public ApiClient(){
    this(DEFAULT_CONNECTION_POOL_SIZE);
  }

  public ApiClient(int connectionPoolSize) {
    this.connectionPoolSize = connectionPoolSize;
    json = new JSON();
    httpClient = buildHttpClient(debugging);

    this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.ROOT);

    // Use UTC as the default time zone.
    this.dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

    this.json.setDateFormat((DateFormat) dateFormat.clone());

    // Set default User-Agent.
    setUserAgent("OpenAPI-Generator/15.5.2/java");

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    authentications.put("basicAuth", new HttpBasicAuth());
    authentications.put("bearerAuth", new HttpBearerAuth("bearer"));
    // Prevent the authentications from being modified.
    authentications = Collections.unmodifiableMap(authentications);
  }

  /**
   * Gets the JSON instance to do JSON serialization and deserialization.
   * @return the JSON utility class
   */
  public JSON getJSON() {
    return json;
  }

  public Client getHttpClient() {
    return httpClient;
  }

  public ApiClient setHttpClient(Client httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  public String getBasePath() {
    return basePath;
  }

  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  /**
   * Gets the status code of the previous request
   * @return the status code of the previous request
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the response headers of the previous request
   * @return the response headers of the previous request
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   * @return the authentications
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   * @param username the username
   */
  public void setUsername(String username) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setUsername(username);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   * @param password the password
   */
  public void setPassword(String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setPassword(password);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   * @param apiKey the API key
   */
  public void setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   * @param apiKeyPrefix the API key prefix
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Set the User-Agent header's value (by adding to the default header map).
   * @param userAgent the User-Agent header value
   * @return this {@code ApiClient}
   */
  public ApiClient setUserAgent(String userAgent) {
    addDefaultHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Add a default header.
   *
   * @param key The header's key
   * @param value The header's value
   * @return this {@code ApiClient}
   */
  public ApiClient addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
    return this;
  }

  /**
   * Check that whether debugging is enabled for this API client.
   * @return {@code true} if debugging is enabled for this API client
   */
  public boolean isDebugging() {
    return debugging;
  }

  /**
   * Enable/disable debugging for this API client.
   *
   * @param debugging To enable (true) or disable (false) debugging
   * @return this {@code ApiClient}
   */
  public ApiClient setDebugging(boolean debugging) {
    this.debugging = debugging;
    // Rebuild HTTP Client according to the new "debugging" value.
    this.httpClient = buildHttpClient(debugging);
    return this;
  }

  /**
   * The path of temporary folder used to store downloaded files from endpoints
   * with file response. The default value is <code>null</code>, i.e. using
   * the system's default tempopary folder.
   *
   * @return the temporary folder path
   * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/File.html#createTempFile(java.lang.String,%20java.lang.String,%20java.io.File)"></a>
   */
  public String getTempFolderPath() {
    return tempFolderPath;
  }

  public ApiClient setTempFolderPath(String tempFolderPath) {
    this.tempFolderPath = tempFolderPath;
    return this;
  }

  /**
   * Get the date format used to parse/format date parameters.
   * @return the date format used to parse/format date parameters
   */
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  /**
   * Set the date format used to parse/format date parameters.
   * @param dateFormat a date format used to parse/format date parameters
   * @return this {@code ApiClient}
   */
  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    // also set the date format for model (de)serialization with Date properties
    this.json.setDateFormat((DateFormat) dateFormat.clone());
    return this;
  }

  /**
   * Parse the given string into Date object.
   * @param str a string to parse
   * @return a {@code Date} object
   */
  public Date parseDate(String str) {
    try {
      return dateFormat.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Format the given Date object into string.
   * @param date a {@code Date} object to format
   * @return the {@code String} version of the {@code Date} object
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   * @param param an object to format
   * @return the {@code String} version of the object
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for(Object o : (Collection)param) {
        if(b.length() > 0) {
          b.append(",");
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
    Serialization for deepObject style query parameters
  */
  public <T> List<Pair> serializeDeepObjectParameter(List<Pair> params, String objectName, String fieldName, T fieldValue){
    if (fieldValue != null) {
      params.add(new Pair(String.format("%s[%s]", objectName, fieldName), fieldValue.toString()));
    }

    return params;
  }

  /*
    Format to {@code Pair} objects.
  */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) return params;

    Collection valueCollection = null;
    if (value instanceof Collection) {
      valueCollection = (Collection) value;
    } else {
      if (value instanceof Page) {
        serializeDeepObjectParameter(params, name, "size", ((Page) value).getSize());
        serializeDeepObjectParameter(params, name, "before", ((Page) value).getBefore());
        serializeDeepObjectParameter(params, name, "after", ((Page) value).getAfter());
      } else if (value instanceof AppListFilter || value instanceof ConversationListFilter || value instanceof IntegrationListFilter) {
        Field[] fields = value.getClass().getDeclaredFields();
        for(Field field: fields) {
          if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
            String fieldName = field.getName();
            try {
              Method fieldGetter = value.getClass().getDeclaredMethod(String.format("get%s%s", fieldName.substring(0, 1).toUpperCase(), fieldName.substring(1)));
              serializeDeepObjectParameter(params, "filter", fieldName, fieldGetter.invoke(value));
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
              e.printStackTrace();
            }
          }
        }
      } else {
        params.add(new Pair(name, parameterToString(value)));
      }

      return params;
    }

    if (valueCollection.isEmpty()){
      return params;
    }

    // get the collection format
    collectionFormat = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat); // default: csv

    // create the params based on the collection format
    if (collectionFormat.equals("multi")) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if (collectionFormat.equals("csv")) {
      delimiter = ",";
    } else if (collectionFormat.equals("ssv")) {
      delimiter = " ";
    } else if (collectionFormat.equals("tsv")) {
      delimiter = "\t";
    } else if (collectionFormat.equals("pipes")) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder() ;
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME.
   * JSON MIME examples:
   *   application/json
   *   application/json; charset=UTF8
   *   APPLICATION/JSON
   *   application/vnd.company+json
   * @param mime MIME (Multipurpose Internet Mail Extensions)
   * @return True if the given MIME is JSON, false otherwise.
   */
  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
  }

  /**
   * Select the Accept header's value from the given accepts array:
   *   if JSON exists in the given array, use it;
   *   otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty,
   *   null will be returned (not to set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array:
   *   if JSON exists in the given array, use it;
   *   otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty,
   *   JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   * @param str a {@code String} to escape
   * @return the escaped version of the {@code String}
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Serialize the given Java object into string entity according the given
   * Content-Type (only JSON is supported for now).
   * @param obj the object to serialize
   * @param formParams the form parameters
   * @param contentType the content type
   * @return an {@code Entity}
   * @throws ApiException on failure to serialize
   */
  public Entity<?> serialize(Object obj, Map<String, Object> formParams, String contentType) throws ApiException {
    Entity<?> entity = null;
    if (contentType.startsWith("multipart/form-data")) {
      MultipartFormDataOutput multipart = new MultipartFormDataOutput();
      for (Entry<String, Object> param: formParams.entrySet()) {
        if (param.getValue() instanceof File) {
          File file = (File) param.getValue();
          try {
            MimetypesFileTypeMap fileTypeMap = new MimetypesFileTypeMap();
            MediaType mediaType = MediaType.valueOf(fileTypeMap.getContentType(file));
            multipart.addFormData(param.getKey(), new FileInputStream(file), mediaType, file.getName());
          } catch (FileNotFoundException e) {
            throw new ApiException("Could not serialize multipart/form-data "+e.getMessage());
          }
        } else {
          multipart.addFormData(param.getKey(),param.getValue().toString(),MediaType.APPLICATION_OCTET_STREAM_TYPE);
        }
      }
      entity = Entity.entity(multipart, MediaType.MULTIPART_FORM_DATA_TYPE);
    } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
      Form form = new Form();
      for (Entry<String, Object> param: formParams.entrySet()) {
        form.param(param.getKey(), parameterToString(param.getValue()));
      }
      entity = Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE);
    } else {
      // We let jersey handle the serialization
      entity = Entity.entity(obj, contentType);
    }
    return entity;
  }

  /**
   * Deserialize response body to Java object according to the Content-Type.
   * @param <T> a Java type parameter
   * @param response the response body to deserialize
   * @param returnType a Java type to deserialize into
   * @return a deserialized Java object
   * @throws ApiException on failure to deserialize
   */
  public <T> T deserialize(Response response, GenericType<T> returnType) throws ApiException {
    if (response == null || returnType == null) {
      return null;
    }

    if ("byte[]".equals(returnType.toString())) {
      // Handle binary response (byte array).
      return (T) response.readEntity(byte[].class);
    } else if (returnType.equals(File.class)) {
      // Handle file downloading.
      @SuppressWarnings("unchecked")
      T file = (T) downloadFileFromResponse(response);
      return file;
    }

    String contentType = null;
    List<Object> contentTypes = response.getHeaders().get("Content-Type");
    if (contentTypes != null && !contentTypes.isEmpty())
      contentType = String.valueOf(contentTypes.get(0));
    if (contentType == null)
      throw new ApiException(500, "missing Content-Type in response");

    return response.readEntity(returnType);
  }

  /**
   * Download file from the given response.
   * @param response a response
   * @return a file from the given response
   * @throws ApiException If fail to read file content from response and write to disk
   */
  public File downloadFileFromResponse(Response response) throws ApiException {
    try {
      File file = prepareDownloadFile(response);
      Files.copy(response.readEntity(InputStream.class), file.toPath());
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public File prepareDownloadFile(Response response) throws IOException {
    String filename = null;
    String contentDisposition = (String) response.getHeaders().getFirst("Content-Disposition");
    if (contentDisposition != null && !"".equals(contentDisposition)) {
      // Get filename from the Content-Disposition header.
      Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      Matcher matcher = pattern.matcher(contentDisposition);
      if (matcher.find())
        filename = matcher.group(1);
    }

    String prefix = null;
    String suffix = null;
    if (filename == null) {
      prefix = "download-";
      suffix = "";
    } else {
      int pos = filename.lastIndexOf(".");
      if (pos == -1) {
        prefix = filename + "-";
      } else {
        prefix = filename.substring(0, pos) + "-";
        suffix = filename.substring(pos);
      }
      // File.createTempFile requires the prefix to be at least three characters long
      if (prefix.length() < 3)
        prefix = "download-";
    }

    if (tempFolderPath == null)
      return File.createTempFile(prefix, suffix);
    else
      return File.createTempFile(prefix, suffix, new File(tempFolderPath));
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param <T> a Java type parameter
   * @param path The sub-path of the HTTP URL
   * @param method The request method, one of "GET", "POST", "PUT", "HEAD" and "DELETE"
   * @param queryParams The query parameters
   * @param body The request body object
   * @param headerParams The header parameters
   * @param cookieParams The cookie parameters
   * @param formParams The form parameters
   * @param accept The request's Accept header
   * @param contentType The request's Content-Type header
   * @param authNames The authentications to apply
   * @param returnType The return type into which to deserialize the response
   * @return The response body in type of string
   * @throws ApiException if the invocation failed
   */
  public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> cookieParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {
    // In case a per-request authorization is used, skip applying default authorization
    if(!headerParams.containsKey("Authorization")){
        updateParamsForAuth(authNames, queryParams, headerParams, cookieParams);
    }

    // Not using `.target(this.basePath).path(path)` below,
    // to support (constant) query string in `path`, e.g. "/posts?draft=1"
    WebTarget target = httpClient.target(this.basePath + path);

    if (queryParams != null) {
      for (Pair queryParam : queryParams) {
        if (queryParam.getValue() != null) {
          target = target.queryParam(queryParam.getName(), queryParam.getValue());
        }
      }
    }

    Invocation.Builder invocationBuilder = target.request().accept(accept);

    for (Entry<String, String> headerParamsEnrty : headerParams.entrySet()) {
      String value = headerParamsEnrty.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.header(headerParamsEnrty.getKey(), value);
      }
    }

    for (Entry<String, String> defaultHeaderEnrty: defaultHeaderMap.entrySet()) {
      if (!headerParams.containsKey(defaultHeaderEnrty.getKey())) {
        String value = defaultHeaderEnrty.getValue();
        if (value != null) {
          invocationBuilder = invocationBuilder.header(defaultHeaderEnrty.getKey(), value);
        }
      }
    }

    for (Entry<String, String> cookieParamsEntry : cookieParams.entrySet()) {
      String value = cookieParamsEntry.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.cookie(cookieParamsEntry.getKey(), value);
      }
    }

    for (Entry<String, String> defaultCookieEntry: defaultHeaderMap.entrySet()) {
      if (!cookieParams.containsKey(defaultCookieEntry.getKey())) {
        String value = defaultCookieEntry.getValue();
        if (value != null) {
          invocationBuilder = invocationBuilder.cookie(defaultCookieEntry.getKey(), value);
        }
      }
    }

    Entity<?> entity = serialize(body, formParams, contentType);

    Response response = null;

    if ("GET".equals(method)) {
      response = invocationBuilder.get();
    } else if ("POST".equals(method)) {
      response = invocationBuilder.post(entity);
    } else if ("PUT".equals(method)) {
      response = invocationBuilder.put(entity);
    } else if ("DELETE".equals(method)) {
      response = invocationBuilder.method("DELETE", entity);
    } else if ("PATCH".equals(method)) {
      response = invocationBuilder.method("PATCH", entity);
    } else if ("HEAD".equals(method)) {
      response = invocationBuilder.head();
    } else if ("OPTIONS".equals(method)) {
      response = invocationBuilder.options();
    } else if ("TRACE".equals(method)) {
      response = invocationBuilder.trace();
    } else {
      throw new ApiException(500, "unknown method type " + method);
    }

    statusCode = response.getStatusInfo().getStatusCode();
    responseHeaders = buildResponseHeaders(response);

    if (response.getStatus() == Status.NO_CONTENT.getStatusCode()) {
      return null;
    } else if (response.getStatusInfo().getFamily().equals(Status.Family.SUCCESSFUL)) {
      if (returnType == null)
        return null;
      else
        return deserialize(response, returnType);
    } else {
      String message = "error";
      String respBody = null;
      if (response.hasEntity()) {
        try {
          respBody = String.valueOf(response.readEntity(String.class));
          message = respBody;
        } catch (RuntimeException e) {
          // e.printStackTrace();
        }
      }
      throw new ApiException(
        response.getStatus(),
        message,
        buildResponseHeaders(response),
        respBody);
    }
  }

   /**
   * Build the Client used to make HTTP requests.
   */
  private Client buildHttpClient(boolean debugging) {
    final ClientConfiguration clientConfig = new ClientConfiguration(ResteasyProviderFactory.getInstance());
    clientConfig.register(json);
    if(debugging){
      clientConfig.register(Logger.class);
    }

    ResteasyClientBuilder clientBuilder = (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();
    clientBuilder.connectionPoolSize(connectionPoolSize);
    clientBuilder.withConfig(clientConfig);
    return clientBuilder.build();
  }
  private Map<String, List<String>> buildResponseHeaders(Response response) {
    Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();
    for (Entry<String, List<Object>> entry: response.getHeaders().entrySet()) {
      List<Object> values = entry.getValue();
      List<String> headers = new ArrayList<String>();
      for (Object o : values) {
        headers.add(String.valueOf(o));
      }
      responseHeaders.put(entry.getKey(), headers);
    }
    return responseHeaders;
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   */
  private void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams) {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams, cookieParams);
    }
  }
}
