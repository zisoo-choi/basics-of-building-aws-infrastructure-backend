package com.example.demo.mysqlTest.controller;

import com.example.demo.mysqlTest.entity.MySqlTestData;
import com.example.demo.mysqlTest.service.MySqlTestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/mysql-test")
public class MySqlTestController {

    final private MySqlTestService testService;

    @GetMapping("/register")
    public MySqlTestData registerTestData () {
        return testService.register();
    }
}
