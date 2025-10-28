package com.pgaccommodation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgaccommodation.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
