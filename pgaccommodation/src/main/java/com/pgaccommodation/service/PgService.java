package com.pgaccommodation.service;

import java.util.List;

import com.pgaccommodation.entity.PgPlace;

public interface PgService {
    List<PgPlace> getAvailableByCity(String city);
    List<PgPlace> getAvailableByLocality(String locality);
    PgPlace getPgDetails(Long id);
    PgPlace addPgPlace(PgPlace place);
    PgPlace updateStatus(Long id, Boolean available);
}
