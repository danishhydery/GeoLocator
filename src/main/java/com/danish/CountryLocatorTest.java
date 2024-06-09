
package com.danish;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CountryLocatorTest {

    private CountryLocator locator;

    @Before
    public void setUp() throws IOException {
        locator = new CountryLocator();
    }

    @Test
    public void testCountryCodes() {
        List<String> usCodes = locator.getCountryCode(37.7749, -122.4194); // US
        assertTrue(usCodes.contains("US"));

        List<String> caCodes = locator.getCountryCode(45.4215, -75.6972); // CA
        assertTrue(caCodes.contains("CA"));

        List<String> mxCodes = locator.getCountryCode(19.4326, -99.1332); // MX
        assertTrue(mxCodes.contains("MX"));

        List<String> brCodes = locator.getCountryCode(-23.5505, -46.6333); // BR
        assertTrue(brCodes.contains("BR"));

        List<String> arCodes = locator.getCountryCode(-34.6037, -58.3816); // AR
        assertTrue(arCodes.contains("AR"));

        List<String> gbCodes = locator.getCountryCode(51.5074, -0.1278);  // GB
        assertTrue(gbCodes.contains("GB"));

        List<String> frCodes = locator.getCountryCode(48.8566, 2.3522);   // FR
        assertTrue(frCodes.contains("FR"));

        List<String> deCodes = locator.getCountryCode(52.5200, 13.4050);  // DE
        assertTrue(deCodes.contains("DE"));

        List<String> ruCodes = locator.getCountryCode(55.7558, 37.6173);  // RU
        assertTrue(ruCodes.contains("RU"));

        List<String> inCodes = locator.getCountryCode(28.6139, 77.2090);  // IN
        assertTrue(inCodes.contains("IN"));

        List<String> cnCodes = locator.getCountryCode(39.9042, 116.4074); // CN
        assertTrue(cnCodes.contains("CN"));

        List<String> jpCodes = locator.getCountryCode(35.6895, 139.6917); // JP
        assertTrue(jpCodes.contains("JP"));

        List<String> auCodes = locator.getCountryCode(-33.8688, 151.2093);// AU
        assertTrue(auCodes.contains("AU"));

        List<String> zaCodes = locator.getCountryCode(-26.2041, 28.0473); // ZA
        assertTrue(zaCodes.contains("ZA"));

        List<String> egCodes = locator.getCountryCode(30.0444, 31.2357);  // EG
        assertTrue(egCodes.contains("EG"));

        List<String> ngCodes = locator.getCountryCode(9.0765, 7.3986);    // NG
        assertTrue(ngCodes.contains("NG"));

        List<String> saCodes = locator.getCountryCode(24.7136, 46.6753);  // SA
        assertTrue(saCodes.contains("SA"));

        List<String> irCodes = locator.getCountryCode(35.6892, 51.3890);  // IR
        assertTrue(irCodes.contains("IR"));

        List<String> idCodes = locator.getCountryCode(-6.2088, 106.8456); // ID
        assertTrue(idCodes.contains("ID"));
    }
}
