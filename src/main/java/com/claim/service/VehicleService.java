package com.claim.service;

import com.claim.entity.Vehicle;
import com.claim.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    public VehicleRepository vehicleRepository;

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle detailVehicle(int vehicleID) {
        return vehicleRepository.findVehicleByID(vehicleID);
    }


    public List<Vehicle> listVehicles() {
        return vehicleRepository.findAll();
    }

//    searchbar function
//    public List<Vehicle> listByModel(String modelInput) {
//        if (modelInput != null) {
//            return vehicleRepository.findVehiclesByModel(modelInput);
//        }
//        return vehicleRepository.findAll();
//    }

    public List<Vehicle> search(String keyword) {
        List<Vehicle> matches = new LinkedList<Vehicle>();
        for (Vehicle match : vehicleRepository.findAll() )

        if (match.getModel().equalsIgnoreCase(keyword)) {
            matches.add(match);
        }
        return matches;
    }

}
