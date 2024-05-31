package com.example.dashboard.project_2.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


@Entity
@Table(name="datapoint")
public class DataEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer endYear;
    private Float citylng;
    private Float citylat;
    private Integer intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private Integer startYear;
    private String impact;
    private Date added;
    private Date published;
    private String city;
    private String country;
    private Integer relevance;
    private String pestle;
    private String source;
    private String title;
    private Integer likelihood;

    public Long getId() {
        return id;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Float getCitylng() {
        return citylng;
    }

    public Float getCitylat() {
        return citylat;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public String getSector() {
        return sector;
    }

    public String getTopic() {
        return topic;
    }

    public String getInsight() {
        return insight;
    }

    public String getSwot() {
        return swot;
    }

    public String getUrl() {
        return url;
    }

    public String getRegion() {
        return region;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public String getImpact() {
        return impact;
    }

    public Date getAdded() {
        return added;
    }

    public Date getPublished() {
        return published;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public String getPestle() {
        return pestle;
    }

    public String getSource() {
        return source;
    }

    public String getTitle() {
        return title;
    }

    public Integer getLikelihood() {
        return likelihood;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public void setCitylng(Float citylng) {
        this.citylng = citylng;
    }

    public void setCitylat(Float citylat) {
        this.citylat = citylat;
    }

    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public void setSwot(String swot) {
        this.swot = swot;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLikelihood(Integer likelihood) {
        this.likelihood = likelihood;
    }
}
