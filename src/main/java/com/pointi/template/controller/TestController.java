package com.pointi.template.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class TestController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/api-test")
    public Map<String, Object> apiTest() {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("ok", true);
        body.put("appName", appName);
        body.put("message", "Connection complete");
        body.put("serverTime", OffsetDateTime.now().toString());
        log.info("Connection complete");
        return body;
    }
}
