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

    // Teste MOPercentual desenvolvido pelo professor Gabriel Costa Silva
    @Test
    public void testeMOPercentual() {
        Soma s = new Soma();

        Assert.assertEquals(3.07, s.calculaMOPercentual(30.7), 1);
    }
    
    // Teste CalculaCarbono desenvolvido pelo professor Gabriel Costa Silva
    @Test
    public void testeCalculaCarbono() {
        Soma s = new Soma();

        Assert.assertEquals(17.848837209302324, s.calculaCarbono(s.calculaMOPercentual(30.7)), 1);
    }

    @Test
    public void testeQuantidadeAplicar(){
        SoilCorrection soil = new SoilCorrection();
        PhosphorCorrection pc = new PhosphorCorrection();
        Soma s = new Soma();

        pc.setTeorFosforoAtingir(12.0);
        pc.setValFosforo(8.59);
        pc.setFonteFosforo(1);
        pc.setEficienciaFosforo(0.7);
        
        Assert.assertEquals(123.95, s.calculoQuantidadeAplicar(pc.getTeorFosforoAtingir(), soil.getValFosforo(), pc.getEficienciaFosforo(), pc.getfonteFosforo(), pc.valorFonteFosforo(pc)), 1);
    }

    @Test
    public void testeSuperFosfatoSimples(){
        SoilCorrection soil = new SoilCorrection();
        PhosphorCorrection pc = new PhosphorCorrection();
        Soma s = new Soma();

        pc.setTeorFosforoAtingir(12.0);
        pc.setValFosforo(8.59);
        pc.setFonteFosforo(1);
        pc.setEficienciaFosforo(0.7);

        double result = ((pc.ssTeor(pc))*2*2.29*100/pc.getEficienciaFosforo()/100)*100/pc.valorFonteFosforo(pc)*2.42;
        
        Assert.assertEquals(12.4, s.calculoSuperfosfatoSimples(pc.getfonteFosforo(), s.calculoQuantidadeAplicar(pc.getTeorFosforoAtingir(), soil.getValFosforo(), pc.getEficienciaFosforo(), pc.getfonteFosforo(), pc.valorFonteFosforo(pc)), result), 1);  
    }

    @Test
    public void testeCalculoEnxofre(){
        SoilCorrection soil = new SoilCorrection();
        PhosphorCorrection pc = new PhosphorCorrection();
        Soma s = new Soma();

        pc.setTeorFosforoAtingir(12.0);
        pc.setValFosforo(8.59);
        pc.setFonteFosforo(1);
        pc.setEficienciaFosforo(0.7);

        Assert.assertEquals(34.7, s.calculoEnxofre(pc.getfonteFosforo(), s.calculoQuantidadeAplicar(pc.getTeorFosforoAtingir(), pc.getValFosforo(), pc.getEficienciaFosforo(), pc.getfonteFosforo(), pc.valorFonteFosforo(pc))), 1);
    }

    @Test
    public void testeCalculoCusto(){
        SoilCorrection soil = new SoilCorrection();
        PhosphorCorrection pc = new PhosphorCorrection();
        Soma s = new Soma();

        pc.setTeorFosforoAtingir(12.0);
        pc.setValFosforo(8.59);
        pc.setFonteFosforo(1);
        pc.setEficienciaFosforo(0.7);

        Assert.assertEquals(156.18, s.calculaCusto(pc.getfonteFosforo(), s.calculoQuantidadeAplicar(pc.getTeorFosforoAtingir(), pc.getValFosforo(), pc.getEficienciaFosforo(), pc.getfonteFosforo(), pc.valorFonteFosforo(pc)), 1260.0), 1);
    }

    @Test
    public void testParticipacaoPotassioCTC(){
        PotassiumCorrection potC = new PotassiumCorrection();
        SoilCorrection soil = new SoilCorrection();

        soil.setValPotassio(0.15);
        soil.setValCalcio(5.76);
        soil.setValMagnesio(1.63);
        soil.setValHl(5.35);

        Assert.assertEquals(1.2, potC.participacaoPotassioCTC(soil.getValPotassio(), soil.getValCalcio(), soil.getValMagnesio(), soil.getValHl()), 1);
    }

    @Test
    public void testParticipacaoPotassioCTCIdeal(){
        PotassiumCorrection potC = new PotassiumCorrection();
        
        potC.setTexture(1);

        Assert.assertEquals(3.0, potC.participacaoPotassioCTCIdeal(), 0);
    }

    @Test
    public void testQuantidadeAplicadaPotassio(){
        PotassiumCorrection potC = new PotassiumCorrection();
        Soma s = new Soma();
        
        potC.setTexture(1);
        potC.setFontePotassioUtilizar(1);
        potC.setValPotassio(0.15);
        potC.setValCalcio(5.76);
        potC.setValMagnesio(1.63);
        potC.setValHl(5.35);

        Assert.assertEquals(450.55, s.calculoQtdAplicarPotassio(potC.verificaParticipacaoPotassio(potC), potC.valorFontePotassioUtilizar(potC)), 1);
    }

    @Test
    public void testKgHectare(){
        PotassiumCorrection potC = new PotassiumCorrection();
        Soma s = new Soma();

        potC.setTexture(1);
        potC.setFontePotassioUtilizar(1);
        potC.setValPotassio(0.15);
        potC.setValCalcio(5.76);
        potC.setValMagnesio(1.63);
        potC.setValHl(5.35);

        Assert.assertEquals(0, s.calculoKgHectare(potC.getFontePotassioUtilizar(), s.calculoQtdAplicarPotassio(potC.verificaParticipacaoPotassio(potC), potC.valorFontePotassioUtilizar(potC))), 1);
    }

    @Test
    public void testCalculoCustoPotassio(){
        PotassiumCorrection potC = new PotassiumCorrection();
        Soma s = new Soma();

        potC.setTexture(1);
        potC.setFontePotassioUtilizar(1);
        potC.setValPotassio(0.15);
        potC.setValCalcio(5.76);
        potC.setValMagnesio(1.63);
        potC.setValHl(5.35);

        Assert.assertEquals(1126.37, s.calculaCustoPotassio(potC.getFontePotassioUtilizar(), 2500.00, s.calculoQtdAplicarPotassio(potC.verificaParticipacaoPotassio(potC), potC.valorFontePotassioUtilizar(potC))), 1);
    }
}
