package com.pgaccommodation.controller;

import com.pgaccommodation.entity.Owner;
import com.pgaccommodation.entity.PgPlace;
import com.pgaccommodation.service.OwnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/owner/places")
public class OwnerController {

    @Autowired
    private OwnerService service;

    // 4️⃣ Retrieve the owner details of a specific PG
    @GetMapping("/owner/{pgId}")
    public Owner getOwnerOfPg(@PathVariable("pgId") Long pgId) {
        return service.getOwnerByPgId(pgId);
    }

    // 5️⃣ Add a new PG place for an owner
    @PostMapping("/add/{ownerId}")
    public PgPlace addPlace(@PathVariable("ownerId") Long ownerId, @RequestBody PgPlace place) {
        return service.addPlace(ownerId, place);
    }

    // 6️⃣ Retrieve all PG places added by the owner
    @GetMapping("/{ownerId}")
    public List<PgPlace> getAllPlacesByOwner(@PathVariable Long ownerId) {
        return service.getAllPlacesByOwner(ownerId);
    }

    // 7️⃣ Change the status (Available/Not Available)
    @PutMapping("/{pgId}/status")
    public PgPlace updateAvailability(@PathVariable Long pgId, @RequestParam Boolean available) {
        return service.updateAvailability(pgId, available);
    }

    // 8️⃣ Edit place details
    @PutMapping("/edit/{pgId}")
    public PgPlace editPlace(@PathVariable Long pgId, @RequestBody PgPlace place) {
        return service.editPlace(pgId, place);
    }

    // 9️⃣ Delete place details
    @DeleteMapping("/delete/{pgId}")
    public String deletePlace(@PathVariable Long pgId) {
        return service.deletePlace(pgId);
    }
}
