package com.ptrack.service.impl;

import com.ptrack.exception.PackageNotFoundException;
import com.ptrack.model.Package;
import com.ptrack.repository.PackageRepository;
import com.ptrack.service.PackageService;

import java.util.List;

public class PackageServiceImpl implements PackageService {
    private final PackageRepository packageRepository;

    //get rid of the constructure here with autowired if is possible
    public PackageServiceImpl(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }


    @Override
    public List<Package> findAll() {
        return packageRepository.findAll();
    }

    @Override
    public Package findById(Long id) {
        return packageRepository.findById(id).orElseThrow(() -> new PackageNotFoundException("Package not found with id: " + id));
    }

    @Override
    public Package save(Package pkg) {
        return packageRepository.save(pkg);
    }

    @Override
    public Package update(Long id, Package pkg) {
        Package existing = findById(id);
        existing.setStatus(pkg.getStatus());
        existing.setTrackingNumber(pkg.getTrackingNumber());
        existing.setEstimationDelivery(pkg.getEstimationDelivery());
        return packageRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        packageRepository.deleteById(id);
    }
}
