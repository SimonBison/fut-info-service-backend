package com.gmail.spbisoft.futinfoservicebackend.repository;

import com.gmail.spbisoft.futinfoservicebackend.model.FuturesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuturesRepository extends JpaRepository<FuturesModel, Integer> {
}
