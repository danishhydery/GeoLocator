package com.danish;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CountryLocator locator = new CountryLocator();
        System.out.println("Enter the Latitude");
        double latitude = scanner.nextDouble(); // Random latitude between -90 and 90
        System.out.println("Enter the Longitude");
        double longitude = scanner.nextDouble(); // Random longitude between -180 and 180
        List<String> res = locator.getCountryCode(latitude, longitude);

        if(res.isEmpty()) {
            System.out.println("No Country Found");
            return;
        }
        System.out.println("Countries that lies in above Latitude and Longitude Range are:");
        for (String countryCode : res) {
            System.out.println(countryCode);
        }
    }
}