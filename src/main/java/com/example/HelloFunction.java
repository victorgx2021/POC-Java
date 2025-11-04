package com.example;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.*;

public class HelloFunction {

    @FunctionName("HelloFunction")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET}, authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage<String> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");
        String name = request.getQueryParameters().getOrDefault("name", "World");
        String response = String.format("Hello, %s! 05", name);
        return request.createResponseBuilder(HttpStatus.OK).body(response).build();
    }
}
