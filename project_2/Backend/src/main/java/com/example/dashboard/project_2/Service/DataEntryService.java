package com.example.dashboard.project_2.Service;

import com.example.dashboard.project_2.model.DataEntry;
import com.example.dashboard.project_2.repository.DataEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataEntryService {
    @Autowired
    private DataEntryRepository repository;

    public List<DataEntry> getAllEntries(){
        return repository.findAll();
    }


    public List<DataEntry> getEntriesByEndYear(Integer endYear) {
        return repository.findByEndYear(endYear);
    }

    // Filter by topic
    public List<DataEntry> getEntriesByTopic(String topic) {
        return repository.findByTopic(topic);
    }

    // Filter by sector
    public List<DataEntry> getEntriesBySector(String sector) {
        return repository.findBySector(sector);
    }

    // Filter by region
    public List<DataEntry> getEntriesByRegion(String region) {
        return repository.findByRegion(region);
    }

    // Filter by PEST
    public List<DataEntry> getEntriesByPestle(String pestle) {
        return repository.findByPestle(pestle);
    }

    // Filter by source
    public List<DataEntry> getEntriesBySource(String source) {
        return repository.findBySource(source);
    }

    // Filter by SWOT
    public List<DataEntry> getEntriesBySwot(String swot) {
        return repository.findBySwot(swot);
    }

    // Filter by country
    public List<DataEntry> getEntriesByCountry(String country) {
        return repository.findByCountry(country);
    }

    // Filter by city
    public List<DataEntry> getEntriesByCity(String city) {
        return repository.findByCity(city);
    }
}

