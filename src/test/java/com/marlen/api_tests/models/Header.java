package com.marlen.api_tests.models;

import io.restassured.http.Cookies;
import org.apache.http.cookie.Cookie;

import java.util.HashMap;
import java.util.Map;

public class Header {

    public Map<String, String> contentType() {
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        return header;
    }

    public Map<String, String> accept() {
        Map<String, String> header = new HashMap<>();
        header.put("Accept", "application/json");
        return header;
    }

    public Map<String, String> cookie() {
        Map<String, String> header = new HashMap<>();
        header.put("Cookie", "token=9c202df1327039b");
        return header;
    }

    public Map<String, String> post() {
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        header.put("Accept", "application/json");
        return header;
    }

    public Map<String, String> update() {
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        header.put("Accept", "application/json");
        return header;
    }

    public Map<String, String> authorisation() {
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        header.put("Accept", "application/json");
        header.put("Cookie", "token=e03690ad262b5d4");
        header.put("username", "admin");
        header.put("password", "password123");
        return header;
    }

}
