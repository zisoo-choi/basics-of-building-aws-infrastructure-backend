package com.example.demo.randomNumber.service;

import com.example.demo.utility.random.CustomRandom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RandomNumberServiceImpl implements RandomNumberService {
    @Override
    public Integer makeRandomInteger() {
        final int MAX = 10;

        return CustomRandom.generateNumber(MAX);
    }
}
