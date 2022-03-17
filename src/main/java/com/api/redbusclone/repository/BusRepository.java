package com.api.redbusclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.redbusclone.model.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

}
