package com.example.donor.Service;

import com.example.donor.Model.Donor;
import com.example.donor.Repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class DonorService {

    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> getAllDonors(){
        return donorRepository.findAll();
    }

    public Optional<Donor> getDonorById(Long id){
        return donorRepository.findById(id);
    }

    public Donor saveDonor(Donor donor){
        return donorRepository.save(donor);
    }



    public void deleteDonor(Long id){
        donorRepository.deleteById(id);
    }
}
