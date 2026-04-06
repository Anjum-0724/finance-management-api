package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.model.Record;
import com.example.demo.repository.RecordRepository;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repo;

    public Record saveRecord(Record record) {
        return repo.save(record);
    }

    public List<Record> getAllRecords() {
        return repo.findAll();
    }
    public void deleteRecord(Long id) {
        repo.deleteById(id);
    }
}