package com.example.donor.Repository;

import com.example.donor.Model.BloodInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface BloodInventoryRepository extends JpaRepository<BloodInventory,Long> {
    Optional<BloodInventory> findByBloodType(String bloodType);
}
