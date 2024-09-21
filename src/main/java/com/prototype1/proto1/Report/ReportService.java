package com.prototype1.proto1.Report;

import com.prototype1.proto1.Area.Area;
import com.prototype1.proto1.Area.AreaRepository;
import com.prototype1.proto1.GeoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private AreaRepository areaRepository;

    public void handleNewReport(double reportLat, double reportLng, String reportDetails) {
        List<Area> areas = areaRepository.findAll();

        for (Area area : areas) {
            double distance = GeoUtils.calculateDistance(reportLat, reportLng, area.getLat(), area.getLng());

            if (distance <= area.getRadius()) {

                areaRepository.updateByLngAndLat(area.getLng(),area.getLat());
                areaRepository.save(area);
                return;
            }
        }

        Area newArea = new Area(reportLat, reportLng, 1000, "red");
        areaRepository.save(newArea);
    }
}
