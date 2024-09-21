package com.prototype1.proto1.Area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class AreaController {

    @Autowired
    private AreaRepository areaRepository;

    @GetMapping("/api/areas")
    public ResponseEntity<List<Area>> getAreas() {
        return ResponseEntity.ok(areaRepository.findAll());
    }
}