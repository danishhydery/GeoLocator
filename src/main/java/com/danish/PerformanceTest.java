package com.danish;

import java.io.IOException;

public class PerformanceTest {
    public static void main(String[] args) throws IOException {
        CountryLocator locator = new CountryLocator();

        int requestsPerSecond = 100;
        int totalRequests = requestsPerSecond * 10;
        long startTime = System.nanoTime();

        for (int i = 0; i < totalRequests; i++) {
            double latitude = Math.random() * 180 - 90; // Random latitude between -90 and 90
            double longitude = Math.random() * 360 - 180; // Random longitude between -180 and 180
            locator.getCountryCode(latitude, longitude);
        }

        long endTime = System.nanoTime();
        double averageTime = (endTime - startTime) / (double) totalRequests;
        System.out.printf("Average execution time: %.2f ns%n", averageTime);
    }
}
