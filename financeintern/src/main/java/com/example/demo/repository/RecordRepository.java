package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
