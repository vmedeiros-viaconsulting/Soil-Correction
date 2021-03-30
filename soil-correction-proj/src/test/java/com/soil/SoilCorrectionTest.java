package com.soil;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
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

    @Test
    public void testeSuperFosfatoSimples(){
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setTeorFosforoAtingir(12.0);
        soil.setValFosforo(8.59);
        soil.setFonteFosforo(1);
        soil.setEficienciaFosforo(0.7);

        double result = ((soil.ssTeor(soil))*2*2.29*100/soil.getEficienciaFosforo()/100)*100/soil.valorFonteFosforo(soil)*2.42;
        
        Assert.assertEquals(12.4, s.calculoSuperfosfatoSimples(soil.getfonteFosforo(), s.calculoQuantidadeAplicar(soil.getTeorFosforoAtingir(), soil.getValFosforo(), soil.getEficienciaFosforo(), soil.getfonteFosforo(), soil.valorFonteFosforo(soil)), result), 1);  
    }

    @Test
    public void testeCalculoEnxofre(){
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setTeorFosforoAtingir(12.0);
        soil.setValFosforo(8.59);
        soil.setFonteFosforo(1);
        soil.setEficienciaFosforo(0.7);

        Assert.assertEquals(34.7, s.calculoEnxofre(soil.getfonteFosforo(), s.calculoQuantidadeAplicar(soil.getTeorFosforoAtingir(), soil.getValFosforo(), soil.getEficienciaFosforo(), soil.getfonteFosforo(), soil.valorFonteFosforo(soil))), 1);
    }

    @Test
    public void testeCalculoCusto(){
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setTeorFosforoAtingir(12.0);
        soil.setValFosforo(8.59);
        soil.setFonteFosforo(1);
        soil.setEficienciaFosforo(0.7);

        Assert.assertEquals(156.18, s.calculaCusto(soil.getfonteFosforo(), s.calculoQuantidadeAplicar(soil.getTeorFosforoAtingir(), soil.getValFosforo(), soil.getEficienciaFosforo(), soil.getfonteFosforo(), soil.valorFonteFosforo(soil)), 1260.0), 1);
    }

    @Test
    public void testParticipacaoPotassioCTC(){
        SoilCorrection soil = new SoilCorrection();

        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);
        soil.setValHl(5.35);

        Assert.assertEquals(1.2, soil.participacaoPotassioCTC(soil.getValPotassio(), soil.getValCalcio(), soil.getValMagnesio(), soil.getValHl()), 1);
    }

    @Test
    public void testParticipacaoPotassioCTCIdeal(){
        SoilCorrection soil = new SoilCorrection();
        
        soil.setTexture(1);

        Assert.assertEquals(3.0, soil.participacaoPotassioCTCIdeal(soil), 0);
    }

    @Test
    public void testQuantidadeAplicadaPotassio(){
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();
        
        soil.setTexture(1);
        soil.setFontePotassioUtilizar(1);
        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);
        soil.setValHl(5.35);

        Assert.assertEquals(450.55, s.calculoQtdAplicarPotassio(soil.verificaParticipacaoPotassio(soil), soil.valorFontePotassioUtilizar(soil)), 1);
    }

    @Test
    public void testKgHectare(){
        SoilCorrection soil = new SoilCorrection();
        Soma s = new Soma();

        soil.setTexture(1);
        soil.setFontePotassioUtilizar(1);
        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);
        soil.setValHl(5.35);

        Assert.assertEquals(0, s.calculoKgHectare(soil.getFontePotassioUtilizar(), s.calculoQtdAplicarPotassio(soil.verificaParticipacaoPotassio(soil), soil.valorFontePotassioUtilizar(soil))), 1);
    }

}
