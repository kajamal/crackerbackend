package com.example.crackerapp.Repository;


import com.example.crackerapp.Model.Contactus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contactusrepo extends JpaRepository<Contactus , Integer> {
}
