package com.literalura.catalog.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumeAPI {
//    public String getData(String url) {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .build();
//        HttpResponse<String> response = null;
//        try {
//            response = client
//                    .send(request, HttpResponse.BodyHandlers.ofString());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String json = response.body();
//        return json;
//    }
//
//    public JsonArray getDataResultsAsJson(String json) {
//        JsonArray jsonResults = JsonParser.parseString(json).getAsJsonObject().get("results").getAsJsonArray();
//        return jsonResults;
//    }
private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpClient client = HttpClient.newHttpClient();

    public String getData(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }

    public JsonNode getDataResultsAsJson(String json) {
        try {
            return objectMapper.readTree(json).get("results");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
