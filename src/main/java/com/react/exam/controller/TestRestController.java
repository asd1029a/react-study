package com.react.exam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * TestRestController.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.08.17
 */
@RestController
@Slf4j
public class TestRestController {

    @GetMapping("/test")
    public Map<String,String> test() {
        Map<String, String> res = new HashMap<>();
        res.put("data", "신발");
        log.info("신발");
        return res;
    }
}
