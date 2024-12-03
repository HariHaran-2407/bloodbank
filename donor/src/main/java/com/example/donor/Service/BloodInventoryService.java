package com.example.donor.Service;

import com.example.donor.Model.BloodInventory;
import com.example.donor.Repository.BloodInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class BloodInventoryService {

    @Autowired
    private BloodInventoryRepository bloodInventoryRepository;

    public List<BloodInventory> getAllBloodInventory(){
        return bloodInventoryRepository.findAll();
    }

    public BloodInventory getByBloodType(String bloodType) {
        return bloodInventoryRepository.findByBloodType(bloodType)
                .orElseThrow(() -> new ResourceNotFoundException("Blood Type not found: " + bloodType));
    }


    public BloodInventory saveBloodInventory(BloodInventory bloodInventory) {
        return bloodInventoryRepository.save(bloodInventory);
    }



    public void deleteBloodInventory(Long id) {
        bloodInventoryRepository.deleteById(id);
    }
}
