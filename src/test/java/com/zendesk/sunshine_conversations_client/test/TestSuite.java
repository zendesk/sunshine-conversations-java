package com.zendesk.sunshine_conversations_client.test;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

/**
 * Test suite for all MockServer-based API tests.
 *
 * This suite runs comprehensive tests against all API endpoints using MockServer
 * to verify that the client properly follows the OpenAPI specification.
 *
 * The tests cover:
 * - All API endpoints with proper request/response validation
 * - Error handling scenarios (400, 401, 404, 423, etc.)
 * - Pagination handling
 * - Authentication mechanisms
 * - Request body validation
 * - Response parsing
 *
 * To run all MockServer tests:
 * ./gradlew test --tests "*MockServerTest"
 *
 * To run individual API tests:
 * ./gradlew test --tests "ConversationsApiMockServerTest"
 */
@Suite
@SuiteDisplayName("Sunshine Conversations API MockServer Test Suite")
@SelectPackages("com.zendesk.sunshine_conversations_client.test")
public class TestSuite {
    // Test suite configuration class
    // Individual test classes are automatically discovered by package scanning
}