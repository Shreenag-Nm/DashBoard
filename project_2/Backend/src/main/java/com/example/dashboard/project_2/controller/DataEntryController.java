package com.example.dashboard.project_2.controller;

import com.example.dashboard.project_2.Service.DataEntryService;
import com.example.dashboard.project_2.model.DataEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataEntryController {
    @Autowired
    private DataEntryService service;

    @GetMapping
    public List<DataEntry> getAllData() {
        return service.getAllEntries();
    }

    @GetMapping("/endYear")
    public List<DataEntry> getDataByEndYear(@RequestParam Integer endYear) {
        return service.getEntriesByEndYear(endYear);
    }

    @GetMapping("/topic")
    public List<DataEntry> getDataByTopic(@RequestParam String topic) {
        return service.getEntriesByTopic(topic);
    }

    @GetMapping("/sector")
    public List<DataEntry> getDataBySector(@RequestParam String sector) {
        return service.getEntriesBySector(sector);
    }

    @GetMapping("/region")
    public List<DataEntry> getDataByRegion(@RequestParam String region) {
        return service.getEntriesByRegion(region);
    }

    @GetMapping("/pestle")
    public List<DataEntry> getDataByPestle(@RequestParam String pestle) {
        return service.getEntriesByPestle(pestle);
    }

    @GetMapping("/source")
    public List<DataEntry> getDataBySource(@RequestParam String source) {
        return service.getEntriesBySource(source);
    }

    @GetMapping("/swot")
    public List<DataEntry> getDataBySwot(@RequestParam String swot) {
        return service.getEntriesBySwot(swot);
    }

    @GetMapping("/country")
    public List<DataEntry> getDataByCountry(@RequestParam String country) {
        return service.getEntriesByCountry(country);
    }

    @GetMapping("/city")
    public List<DataEntry> getDataByCity(@RequestParam String city) {
        return service.getEntriesByCity(city);
    }
}
