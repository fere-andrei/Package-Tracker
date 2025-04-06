package com.ptrack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trackingNumber;
    private String status;
    private LocalDateTime estimationDelivery;

    public Package() {
    }

    public Package(Long id, String trackingNumber, String status, LocalDateTime estimationDelivery) {
        this.id = id;
        this.trackingNumber = trackingNumber;
        this.status = status;
        this.estimationDelivery = estimationDelivery;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getEstimationDelivery() {
        return estimationDelivery;
    }

    public void setEstimationDelivery(LocalDateTime estimationDelivery) {
        this.estimationDelivery = estimationDelivery;
    }
}
