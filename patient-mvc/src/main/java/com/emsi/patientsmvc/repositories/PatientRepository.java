package com.emsi.patientsmvc.repositories;

import com.emsi.patientsmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContains(String keyword,Pageable pageable);
    Page<Patient> findByNomContainsAndScoreIsLessThanAndGenreContains(String Keyword, int Score,String genre, Pageable pageable);
    //Page<Patient> findByAppUserUserId(String ID);
}
