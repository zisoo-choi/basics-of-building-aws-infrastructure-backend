package com.example.demo.mysqlTest.service;

import com.example.demo.mysqlTest.entity.MySqlTestData;
import com.example.demo.mysqlTest.repository.MySqlTestRepository;
import com.example.demo.utility.random.CustomRandom;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MySqlTestServiceImpl implements MySqlTestService {

    final private MySqlTestRepository testRepository;
    @Override
    public MySqlTestData register() {
        final int MAX = 10;
        final MySqlTestData data = new MySqlTestData(CustomRandom.generateNumber(MAX));
        log.info("data: " + data);
        return testRepository.save(data);
    }
}
