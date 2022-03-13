package com.claim.repository;

import com.claim.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Integer> {
   @Query("SELECT v from Vehicle v WHERE v.vehicleID = ?1")
   Vehicle findVehicleByID(int vehicleID);


//   query for searchbar




}
