# Zendesk Sunshine Conversations Java SDK

This repository contains the official Java SDK for the Zendesk Sunshine Conversations API, providing a comprehensive Java client library for integrating conversation management capabilities into Java applications.

## Architecture Overview

### Generated Code Architecture
This SDK is **entirely auto-generated** using the OpenAPI Generator toolchain from the official Sunshine Conversations API specification. Key architectural characteristics:

- **Code Generation**: Uses OpenAPI Generator v7.12.0 (configured in build.gradle)
- **API Specification**: Based on OpenAPI 3.0.2 specification (`api/openapi.yaml`)
- **Version**: Currently at v17.0.0 (final release as of 2025-08-25)
- **Generated Annotation**: All classes include `@javax.annotation.Generated` annotations

### Package Structure
```
com.zendesk.sunshine_conversations_client/
├── api/           # 17 API client classes (8,035 total lines)
├── auth/          # Authentication implementations
├── model/         # 261 model/data classes
├── ApiClient.java # Core HTTP client
├── Configuration.java # Default configuration
└── JSON.java      # JSON serialization utilities
```

## Key Directories and Components

### `/src/main/java/com/zendesk/sunshine_conversations_client/`

#### API Layer (`/api/`)
Contains 17 auto-generated API client classes representing different service endpoints:
- **ActivitiesApi** (156 lines) - Conversation activities (typing, read events)
- **ConversationsApi** (826 lines) - Core conversation management (largest API class)
- **MessagesApi** (496 lines) - Message sending and retrieval
- **UsersApi** (690 lines) - User management operations
- **IntegrationsApi** (578 lines) - Third-party integrations
- **WebhooksApi** (638 lines) - Webhook management
- **SwitchboardsApi** (449 lines) - Conversation routing
- Additional APIs for apps, clients, devices, participants, etc.

#### Model Layer (`/model/`)
Contains 261 auto-generated model classes representing API data structures:
- Message types: `TextMessage`, `ImageMessage`, `FileMessage`, `CarouselMessage`, etc.
- Core entities: `User`, `Conversation`, `App`, `Integration`, `Webhook`
- Event types: Various webhook event payload classes
- Configuration objects: Platform-specific integration settings

#### Authentication (`/auth/`)
- **HttpBasicAuth** - Basic authentication (recommended)
- **HttpBearerAuth** - Bearer token authentication
- **ApiKeyAuth** - API key authentication
- **Authentication** - Base interface

#### Core Infrastructure
- **ApiClient** - HTTP client with RESTEasy implementation
- **Configuration** - Global configuration and default client
- **JSON** - Jackson-based JSON serialization
- **ApiException** - Exception handling
- **Pair** - Utility for key-value pairs

## Build System and Dependency Management

### Dual Build System
The project supports both **Maven** and **Gradle** builds:

#### Gradle Configuration (`build.gradle`)
- **Primary build tool** with comprehensive configuration
- Supports both standard Java and Android targets
- **Key plugins**: `java`, `maven-publish`, `signing`, `org.openapi.generator`
- **Java compatibility**: Java 8+ (source/target compatibility)
- **Publishing**: Maven Central via Sonatype + Zendesk Artifactory for snapshots

#### Maven Configuration (`pom.xml`)
- **Alternative build option** for Maven-based projects
- Identical dependency management to Gradle
- Java 8+ compilation target
- Full test and documentation generation support

### Key Dependencies
```groovy
// HTTP Client (RESTEasy)
org.jboss.resteasy:resteasy-client:6.2.4.Final
org.jboss.resteasy:resteasy-multipart-provider:6.2.4.Final

// JSON Processing (Jackson)
com.fasterxml.jackson.core:jackson-core:2.15.2
com.fasterxml.jackson.core:jackson-databind:2.15.2
com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.15.2

// OpenAPI Support
io.swagger:swagger-annotations:1.5.22
org.openapitools:jackson-databind-nullable:0.2.2

// Testing
junit:junit:5.9.2
```

### Version Management
- **Current version**: 17.0.0 (final release)
- **Snapshot versioning**: Includes Git SHA in snapshot versions
- **API targeting**: Each SDK version targets specific Sunshine Conversations API version

## Code Generation and Patterns

### OpenAPI Generator Integration
- **Generator version**: 7.12.0
- **Configuration**: `.openapi-generator/` contains generation metadata
- **Ignored files**: `.openapi-generator-ignore` prevents generation of certain files
- **Client codegen**: Uses `JavaClientCodegen` language generator

### Generated Code Patterns
All generated classes follow consistent patterns:

```java
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0"
)
public class ExampleApi {
    private ApiClient apiClient;
    // Standard constructor and configuration methods
    // API method implementations with full parameter validation
}
```

### API Client Pattern
Each API class follows the same structure:
- Constructor accepting optional `ApiClient` parameter
- Fallback to `Configuration.getDefaultApiClient()`
- Full parameter validation with descriptive error messages
- Consistent exception handling via `ApiException`
- Support for both synchronous and asynchronous operations

## Testing and Quality Assurance

### Testing Structure
- **No custom test suite** - This is a generated client library
- **Testing approach**: Generated from tested API specification
- **CI/CD**: GitHub Actions workflow tests Java 17 and 21
- **Build verification**: `mvn -B package` in CI pipeline

### Quality Measures
- **Maven Surefire**: Configured for parallel test execution
- **Javadoc generation**: Automatic documentation generation
- **Code signing**: GPG signing for Maven Central releases
- **Multi-JVM testing**: CI tests against Java 17 and 21

## Development Workflow

### Release Process
1. **Specification updates** trigger regeneration
2. **Version bump** in build configuration
3. **Automated generation** via OpenAPI Generator
4. **CI validation** on multiple Java versions
5. **Publishing** to Maven Central and Zendesk Artifactory

### Android Support
The SDK includes conditional Android support:
- **Enable via**: `target=android` in `gradle.properties`
- **Android SDK**: Target API 23, Min API 14
- **Java 8 language features**: Full compatibility
- **AAR packaging**: Generates Android Archive format

### Authentication Configuration
```java
// Basic Auth (Recommended)
ApiClient client = Configuration.getDefaultApiClient();
HttpBasicAuth basicAuth = (HttpBasicAuth) client.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");

// Regional Configuration
client.setBasePath("https://api.eu-1.smooch.io"); // for EU region
```

## Documentation and Resources

### Generated Documentation
- **`/docs/`**: 280+ Markdown files with API documentation
- **README.md**: Comprehensive usage guide and examples
- **CHANGELOG.md**: Detailed version history and breaking changes

### API Coverage
The SDK provides complete coverage of the Sunshine Conversations API v2:
- **17 API endpoint groups** with full CRUD operations
- **261 model classes** covering all data structures
- **Complete webhook event support** for real-time integrations
- **Multi-channel support**: Web, mobile, social platforms, messaging apps

## Important Notes

### Deprecation Notice
⚠️ **Final Release**: Version 17.0.0 is the final release of this SDK. Future API updates will not be reflected in new SDK versions. Users are encouraged to:
- Use existing open-source tools like OpenAPI Generator
- Generate custom clients from the official API specification
- Reference the official specification at: https://github.com/zendesk/sunshine-conversations-api-spec

### Migration Information
- **Java 8+ Required**: Java 6/7 no longer supported (as of v17.0.0)
- **API Version Compatibility**: Each SDK version targets specific API versions
- **Upgrade paths**: Documented in README for API version migrations

### Best Practices
1. **Use basic authentication** over JWT when possible
2. **Configure appropriate timeouts** for your use case
3. **Handle ApiException** appropriately in production code
4. **Use connection pooling** for high-throughput scenarios
5. **Consider regional endpoints** for better performance