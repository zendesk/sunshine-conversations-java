# Sunshine Conversations Java SDK - MockServer Tests

This directory contains comprehensive MockServer-based tests for all API endpoints in the Sunshine Conversations Java SDK. These tests validate that the client implementation properly follows the OpenAPI specification.

## Overview

The test suite includes:

- **MockServer Integration**: All tests use MockServer to simulate API responses
- **OpenAPI Compliance**: Tests validate request/response formats match the spec exactly
- **Complete Coverage**: Tests for all 58 API operations across 17 API classes
- **Error Scenarios**: Comprehensive error handling tests (400, 401, 404, 423, etc.)
- **Authentication Testing**: Both basic auth and bearer token authentication
- **Pagination Testing**: Cursor-based pagination validation
- **Model Validation**: Request body and response parsing tests

## Test Structure

### Base Classes

- **`MockServerTestBase`**: Base class providing common MockServer setup and utilities
- **`TestSuite`**: JUnit 5 test suite configuration for running all tests

### API Test Classes

Each API has a dedicated test class following the pattern `{ApiName}MockServerTest`:

- `ActivitiesApiMockServerTest` - Activity posting (typing indicators, read events)
- `ConversationsApiMockServerTest` - Conversation management (CRUD, participants, etc.)
- `MessagesApiMockServerTest` - Message operations (send, retrieve, delete)
- `UsersApiMockServerTest` - User management (CRUD, clients, devices)
- Additional test classes for other APIs...

## Test Categories

### Success Path Tests
- Valid requests with proper authentication
- Correct request body formatting
- Expected response parsing
- Pagination handling

### Error Handling Tests
- **400 Bad Request**: Invalid parameters, malformed requests
- **401 Unauthorized**: Missing or invalid authentication
- **403 Forbidden**: Insufficient permissions
- **404 Not Found**: Non-existent resources
- **423 Locked**: Resource locked (e.g., conversation message limit)

### Edge Cases
- Empty responses
- Large payloads
- Special characters in parameters
- Boundary value testing

## Running Tests

### Run All MockServer Tests
```bash
./gradlew test --tests "*MockServerTest"
```

### Run Specific API Tests
```bash
./gradlew test --tests "ConversationsApiMockServerTest"
./gradlew test --tests "MessagesApiMockServerTest"
./gradlew test --tests "UsersApiMockServerTest"
```

### Run Test Suite
```bash
./gradlew test --tests "TestSuite"
```

### Run with Verbose Output
```bash
./gradlew test --tests "*MockServerTest" --info
```

## Test Data

Tests use consistent test data constants defined in `MockServerTestBase`:

- `TEST_APP_ID`: `5d8cff3cd55b040010928b5b`
- `TEST_CONVERSATION_ID`: `029c31f25a21b47effd7be90`
- `TEST_MESSAGE_ID`: `1234567890abcdef12345678`
- `TEST_USER_ID`: `user123456789012345678901`
- `TEST_API_KEY_ID`: `act_5d8cff3cd55b040010928b5b`

## Test Utilities

### MockServerTestBase Methods

- `createSuccessResponse(jsonBody)` - Creates 200 OK responses
- `createCreatedResponse(jsonBody)` - Creates 201 Created responses
- `createErrorResponse(code, errorCode, title)` - Creates error responses
- `createAuthorizedRequest(method, path)` - Creates authenticated requests
- `createPaginatedResponse(items, hasMore, cursor)` - Creates paginated responses

### Authentication Testing

Tests verify both authentication methods:

```java
// Basic Auth (default in tests)
HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
basicAuth.setUsername(TEST_API_KEY_ID);
basicAuth.setPassword(TEST_API_KEY_SECRET);

// Bearer Token (tested in specific scenarios)
HttpBearerAuth bearerAuth = (HttpBearerAuth) apiClient.getAuthentication("bearerAuth");
bearerAuth.setBearerToken("jwt-token-here");
```

## OpenAPI Specification Validation

Tests ensure compliance with the OpenAPI spec by validating:

### Request Format
- Correct HTTP methods and paths
- Required and optional parameters
- Request body schemas
- Content-Type headers
- Authentication headers

### Response Format
- Status codes match spec definitions
- Response body schemas
- Error response format consistency
- Pagination metadata structure

### Parameter Validation
- Path parameters (24-character ObjectIds)
- Query parameters (pagination, filtering)
- Request body validation
- Header requirements

## Examples

### Basic API Test Pattern
```java
@Test
void apiMethod_SuccessScenario_Success() throws ApiException {
    // Arrange - Set up MockServer expectations
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/endpoint";
    HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);
    mockServer.when(expectedRequest).respond(createSuccessResponse(responseJson));

    // Act - Call the API method
    ResponseType response = api.apiMethod(TEST_APP_ID, parameters);

    // Assert - Verify response and MockServer interactions
    assertThat(response).isNotNull();
    assertThat(response.getData()).hasExpectedProperties();
    mockServer.verify(expectedRequest);
}
```

### Error Testing Pattern
```java
@Test
void apiMethod_ErrorScenario_ThrowsException() {
    // Arrange - Set up error response
    mockServer.when(request).respond(createNotFoundResponse());

    // Act & Assert - Verify exception is thrown
    assertThatThrownBy(() -> api.apiMethod(invalidParams))
        .isInstanceOf(ApiException.class)
        .hasMessageContaining("404");
}
```

## Dependencies

The test suite requires these dependencies (already configured in `build.gradle`):

- **MockServer**: `org.mock-server:mockserver-junit-jupiter:5.15.0`
- **TestContainers**: `org.testcontainers:mockserver:1.19.3`
- **AssertJ**: `org.assertj:assertj-core:3.24.2`
- **JUnit 5**: `org.junit.jupiter:junit-jupiter:5.10.2`

## Contributing

When adding new tests:

1. Follow the existing naming patterns
2. Extend `MockServerTestBase` for common functionality
3. Include both success and error scenarios
4. Validate request format against OpenAPI spec
5. Use consistent test data constants
6. Add comprehensive assertions
7. Document any special test cases

## Troubleshooting

### Common Issues

1. **Port Conflicts**: MockServer uses random ports, but if tests fail to start, check for port availability
2. **Authentication Errors**: Ensure test data matches expected patterns
3. **JSON Parsing**: Verify response JSON matches model expectations
4. **Timing Issues**: MockServer responses are immediate; no need for delays

### Debug Mode

Enable debug logging to see detailed request/response information:

```bash
./gradlew test --tests "*MockServerTest" --debug
```

### MockServer Logs

MockServer logs all interactions. Check test output for request/response details when debugging test failures.