package com.ptrack.service;

import com.ptrack.model.Package;

import java.util.List;

public interface PackageService {
    List<Package> findAll();
    Package findById(Long id);
    Package save(Package pkg);
    Package update(Long id, Package pkg);
    void delete(Long id);
}
