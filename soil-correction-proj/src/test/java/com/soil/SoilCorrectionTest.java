package com.soil;
import org.junit.Test;
import org.junit.Assert;

public class SoilCorrectionTest 
{
    @Test
    public void testValFosforo1()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(1);

        try{
            Assert.assertEquals(9.0, soil.valorIdealFosforo(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValFosforo2()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(2);

        try{
            Assert.assertEquals(12.0, soil.valorIdealFosforo(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValPotassio1()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(1);

        try{
            Assert.assertEquals(0.35, soil.valorIdealPotassio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValPotassio2()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(2);

        try{
            Assert.assertEquals(0.25, soil.valorIdealPotassio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValCalcio1()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(1);

        try{
            Assert.assertEquals(6.0, soil.valorIdealCalcio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValCalcio2()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(2);

        try{
            Assert.assertEquals(4.0, soil.valorIdealCalcio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValMagnesio1()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(1);

        try{
            Assert.assertEquals(1.5, soil.valorIdealMagnesio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValMagnesio2()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(2);

        try{
            Assert.assertEquals(1.0, soil.valorIdealMagnesio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValEnxofre1()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(1);

        try{
            Assert.assertEquals(9.0, soil.valorIdealEnxofre(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValEnxofre2()
    {
        SoilCorrection soil = new SoilCorrection();
        soil.setTexture(2);

        try{
            Assert.assertEquals(6.0, soil.valorIdealEnxofre(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testValAluminio()
    {
        SoilCorrection soil = new SoilCorrection();

        try{
            Assert.assertEquals(0.0, soil.valorIdealAluminio(soil), 0);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void somaSCmol()
    {
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);

        try{
            Assert.assertEquals(7.54, s.somaCmol(soil.getValPotassio(), soil.getValCalcio(), soil.getValMagnesio()), 1);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void somaCtc()
    {
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);
        soil.setValHl(5.35);

        try{
            Assert.assertEquals(12.89, s.somaCtcCmol(soil.getValPotassio(), soil.getValCalcio(), soil.getValMagnesio(), soil.getValHl()), 1);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }


    @Test
    public void testVAtual()
    {
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);
        soil.setValHl(5.35);

        try{
            Assert.assertEquals(58.49, s.vAtual(soil.getValPotassio(), soil.getValCalcio(), soil.getValMagnesio(), soil.getValHl()), 1);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testeMOPercentual() {
        Soma s = new Soma();

        Assert.assertEquals(3.07, s.calculaMOPercentual(30.7), 1);
    }
    
    @Test
    public void testeCalculaCarbono() {
        Soma s = new Soma();

        Assert.assertEquals(17.848837209302324, s.calculaCarbono(s.calculaMOPercentual(30.7)), 1);
    }

    @Test
    public void testeQuantidadeAplicar(){
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setTeorFosforoAtingir(12.0);
        soil.setValFosforo(8.59);
        soil.setFonteFosforo(1);
        soil.setEficienciaFosforo(0.7);
        
        Assert.assertEquals(123.95, s.calculoQuantidadeAplicar(soil.getTeorFosforoAtingir(), soil.getValFosforo(), soil.getEficienciaFosforo(), soil.getfonteFosforo(), soil.valorFonteFosforo(soil)), 1);
    }
}
