package com.pgaccommodation.service;

import com.pgaccommodation.entity.Owner;
import com.pgaccommodation.entity.PgPlace;
import java.util.List;

public interface OwnerService {
    Owner getOwnerByPgId(Long pgId);               // API 4
    PgPlace addPlace(Long ownerId, PgPlace place); // API 5
    List<PgPlace> getAllPlacesByOwner(Long ownerId); // API 6
    PgPlace updateAvailability(Long pgId, Boolean available); // API 7
    PgPlace editPlace(Long pgId, PgPlace updatedPlace); // API 8
    String deletePlace(Long pgId); // API 9
}
