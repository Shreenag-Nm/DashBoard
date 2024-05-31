package com.example.dashboard.project_2.repository;

import com.example.dashboard.project_2.model.DataEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataEntryRepository extends JpaRepository<DataEntry, Long> {

    List<DataEntry> findByEndYear(Integer endYear);
    List<DataEntry> findByTopic(String topic);
    List<DataEntry> findBySector(String sector);
    List<DataEntry> findByRegion(String region);
    List<DataEntry> findByPestle(String pestle);
    List<DataEntry> findBySource(String source);
    List<DataEntry> findBySwot(String swot);
    List<DataEntry> findByCountry(String country);
    List<DataEntry> findByCity(String city);
}
