package com.example.demo.mysqlTest.repository;

import com.example.demo.mysqlTest.entity.MySqlTestData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlTestRepository extends JpaRepository<MySqlTestData, Long> {
}
