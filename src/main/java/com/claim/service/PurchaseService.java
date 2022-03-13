package com.claim.service;

import com.claim.entity.Purchase;
import com.claim.entity.Vehicle;
import com.claim.repository.PurchaseRepository;
import com.claim.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    public PurchaseRepository purchaseRepository;

    public List<Purchase> listPurchasedVehicles() {
        return purchaseRepository.findAll();
    }
}
