package com.pgaccommodation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgaccommodation.entity.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
