package com.danish;

import java.io.*;
import java.util.*;

public class CountryLocator {
    private static class CountryBoundary {
        String countryCode;
        double minLat;
        double maxLat;
        double minLong;
        double maxLong;

        CountryBoundary(String countryCode, double minLat, double maxLat, double minLong, double maxLong) {
            this.countryCode = countryCode;
            this.minLat = minLat;
            this.maxLat = maxLat;
            this.minLong = minLong;
            this.maxLong = maxLong;
        }

        boolean contains(double latitude, double longitude) {
            return latitude >= minLat && latitude <= maxLat && longitude >= minLong && longitude <= maxLong;
        }
    }

    private List<CountryBoundary> boundaries;

    public CountryLocator() throws IOException {
        boundaries = new ArrayList<>();
        loadCountryBoundaries();
    }

    private void loadCountryBoundaries() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/country_boundaries.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("#") || line.trim().isEmpty()) {
                continue;
            }
            String[] parts = line.split(",");
            String countryCode = parts[0].trim();
            double minLat = Double.parseDouble(parts[1].trim());
            double maxLat = Double.parseDouble(parts[2].trim());
            double minLong = Double.parseDouble(parts[3].trim());
            double maxLong = Double.parseDouble(parts[4].trim());
            boundaries.add(new CountryBoundary(countryCode, minLat, maxLat, minLong, maxLong));
        }
        reader.close();
    }
public List<String> getCountryCode(double latitude, double longitude) {
    List<String> countryCodes = new ArrayList<>();
    for (CountryBoundary boundary : boundaries) {
        if (latitude >= boundary.minLat && latitude <= boundary.maxLat &&
                longitude >= boundary.minLong && longitude <= boundary.maxLong) {
            countryCodes.add(boundary.countryCode);
        }
    }
    return countryCodes;
}
}
