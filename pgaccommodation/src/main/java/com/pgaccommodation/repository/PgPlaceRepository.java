package com.pgaccommodation.repository;

import com.pgaccommodation.entity.PgPlace;
import com.pgaccommodation.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PgPlaceRepository extends JpaRepository<PgPlace, Long> {
    List<PgPlace> findByCityAndAvailableTrue(String city);
    List<PgPlace> findByLocalityAndAvailableTrue(String locality);
}
