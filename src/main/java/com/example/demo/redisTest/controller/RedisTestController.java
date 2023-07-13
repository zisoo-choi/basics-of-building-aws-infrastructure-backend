package com.example.demo.redisTest.controller;

import com.example.demo.randomNumber.service.RandomNumberService;
import com.example.demo.redisTest.service.RedisService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/redis-test")
public class RedisTestController {

    final private RedisService redisService;
    final private RandomNumberService randomNumberService;

    @GetMapping("/set-random-data-and-return")
    public Integer setRandomDataAndReturn () {
        log.info("setRandomDataAndReturn()");

        final Integer randomNumber = randomNumberService.makeRandomInteger();
        redisService.setKeyAndValue(randomNumber.toString(), Long.parseLong(randomNumber.toString()));

        return randomNumber;
    }

    @GetMapping("/get-hash-value-number/{number}")
    public Long getHashValueNumber (@PathVariable Integer number) {
        log.info("getHashValueNubmer(): " + number);

        return redisService.getValueByKey(number.toString());
    }
}
