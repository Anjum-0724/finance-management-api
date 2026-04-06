package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.model.Record;
import com.example.demo.service.RecordService;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService service;

    @GetMapping
    public List<Record> getAllRecords() {
        return service.getAllRecords();
    }

    @PostMapping
    public Record createRecord(@RequestBody Record record) {
        return service.saveRecord(record);
    }
    @PutMapping("/{id}")
    public Record updateRecord(@PathVariable Long id, @RequestBody Record record) {
        record.setId(id);
        return service.saveRecord(record);
    }
    @DeleteMapping("/{id}")
    public String deleteRecord(@PathVariable Long id) {
        service.deleteRecord(id);
        return "Record deleted successfully";
    }
}
