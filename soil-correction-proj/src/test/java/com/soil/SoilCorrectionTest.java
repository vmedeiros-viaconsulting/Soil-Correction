package com.soil;
import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class SoilCorrectionTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testValFosforo1()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(1);
        Assert.assertEquals(9.0, soil.valorIdealFosforo(soil).doubleValue());
    }
}
