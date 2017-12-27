package com.pingplusplus;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Afon' at '16-12-16 上午10:33' with Gradle 3.1
 *
 * @author Afon, @date 16-12-16 上午10:33
 */
public class PingppAccountTest extends PingppAccountTestBase {

    @Test public void testSetApiKey() {
        assertEquals("apiKey should be set", PingppAccountTestData.getApiKey(), Pingpp.apiKey);
    }

    @Test public void testVerifyVersions() {
        assertEquals("Pingpp.VERSION should match", "2.3.3", Pingpp.VERSION);
        assertEquals("PingppAccount.VERSION should match", "1.2.4", PingppAccount.VERSION);
    }
}
