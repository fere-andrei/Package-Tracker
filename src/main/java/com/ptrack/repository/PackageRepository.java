package com.ptrack.repository;

import com.ptrack.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
    Package findByTrackingNumber(String trackingNumber);
}
