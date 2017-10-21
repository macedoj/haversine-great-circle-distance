/*
 * The MIT License
 *
 * Copyright 2017, Juliano Macedo.
 * See LICENSE file for details.
 *
 */
package haversine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * <p>
 * JUnit test for the class {@link HaversineAlgorithm}.</p>
 * <i>Coordinates source: https://www.distancecalculator.net</i>
 *
 * @author Juliano Macedo < /macedoj at GitHub >
 * @version 0.2
 */
public class HaversineAlgorithmTest {

    private double startLati;
    private double startLong;
    private double endLati;
    private double endLong;

    public HaversineAlgorithmTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * <code>assertNotEquals</code> test using empty variables to verify the
     * result returned by the distanceInKm method.
     */
    @Test
    public void testDistanceInKmEmptyVars() {
        double expResult = 12.34;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * <code>assertNotEquals</code> test using empty variables to verify the
     * result returned by the distanceInMi method.
     */
    @Test
    public void testDistanceInMiEmptyVars() {
        double expResult = -56.78;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInKm method, with Porto Alegre to São Paulo example.
     */
    @Test
    public void testDistancePoaSampaInKm() {
        startLati = -30.0331;
        startLong = -51.23;
        endLati = -23.5475;
        endLong = -46.6361;
        double expResult = 852.989246230814;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInKm method, with Goiânia to São Paulo example.
     */
    @Test
    public void testDistanceGynSampaInKm() {
        startLati = -16.6786;
        startLong = -49.2539;
        endLati = -23.5475;
        endLong = -46.6361;
        double expResult = 811.1442335297786;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInKm method, with Brasília to Manaus example.
     */
    @Test
    public void testDistanceBsbMaoInKm() {
        startLati = -15.7797;
        startLong = -47.9297;
        endLati = -3.1019;
        endLong = -60.025;
        double expResult = 1933.7761523338133;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInKm method, with Brasília to Fortaleza example.
     */
    @Test
    public void testDistanceBsbForInKm() {
        startLati = -15.7797;
        startLong = -47.9297;
        endLati = -3.7172;
        endLong = -38.5431;
        double expResult = 1689.0504616271794;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInKm method, with Madrid to Barcelona example.
     */
    @Test
    public void testDistanceMadBarInKm() {
        startLati = 40.4165;
        startLong = -3.7026;
        endLati = 41.3888;
        endLong = 2.159;
        double expResult = 504.24594512972055;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInKm method, with Moscow to Saint Petersburg example.
     */
    @Test
    public void testDistanceMosStpInKm() {
        startLati = 55.7522;
        startLong = 37.6156;
        endLati = 59.9386;
        endLong = 30.3141;
        double expResult = 634.4331164612092;
        double result = HaversineAlgorithm.distanceInKm(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInMi method, with Porto Alegre to São Paulo example.
     */
    @Test
    public void testDistancePoaSampaInMi() {
        startLati = -30.0331;
        startLong = -51.23;
        endLati = -23.5475;
        endLong = -46.6361;
        double expResult = 530.0227809196872;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInMi method, with Goiânia to São Paulo example.
     */
    @Test
    public void testDistanceGynSampaInMi() {
        startLati = -16.6786;
        startLong = -49.2539;
        endLati = -23.5475;
        endLong = -46.6361;
        double expResult = 504.02150353263204;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInMi method, with Brasília to Manaus example.
     */
    @Test
    public void testDistanceBsbMaoInMi() {
        startLati = -15.7797;
        startLong = -47.9297;
        endLati = -3.1019;
        endLong = -60.025;
        double expResult = 1201.592421551814;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInMi method, with Brasília to Fortaleza example.
     */
    @Test
    public void testDistanceBsbForInMi() {
        startLati = -15.7797;
        startLong = -47.9297;
        endLati = -3.7172;
        endLong = -38.5431;
        double expResult = 1049.5269743917422;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInMi method, with Madrid to Barcelona example.
     */
    @Test
    public void testDistanceMadBarInMi() {
        startLati = 40.4165;
        startLong = -3.7026;
        endLati = 41.3888;
        endLong = 2.159;
        double expResult = 313.3238071711996;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of distanceInMi method, with Moscow to Saint Petersburg example.
     */
    @Test
    public void testDistanceMosStpInMi() {
        startLati = 55.7522;
        startLong = 37.6156;
        endLati = 59.9386;
        endLong = 30.3141;
        double expResult = 394.21834000861804;
        double result = HaversineAlgorithm.distanceInMi(startLati, startLong, endLati, endLong);

        assertEquals(expResult, result, 0.0);
    }

}
