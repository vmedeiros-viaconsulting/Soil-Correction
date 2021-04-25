package com.soil;

public class PotassiumCorrection extends SoilCorrection{
  private int fontePotassioUtilizar;
  private double[] fontePotassioUtilizarValores = {58.0, 52.0, 22.0, 44.0};

  public void setFontePotassioUtilizar(int fontePotassioUtilizar){
    this.fontePotassioUtilizar = fontePotassioUtilizar;
  }

  public int getFontePotassioUtilizar(){
    return fontePotassioUtilizar;
  }

  public double participacaoPotassioCTCIdeal(){
    return 3.0;
  }

  public double participacaoPotassioCTC(double teorPotassio, double teorCalcio, double teorMagnesio, double teorHAl){
    return teorPotassio/(teorCalcio+teorMagnesio+teorPotassio+teorHAl)*100;
  }

  public double verificaParticipacaoPotassio(PotassiumCorrection potC){
    double result = (getValPotassio() * potC.participacaoPotassioCTCIdeal()/potC.participacaoPotassioCTC(getValPotassio(), getValCalcio(), getValMagnesio(), getValHl()))-getValPotassio();

    return result < 0.01 ? 0.0 : result;
  }

  public double valorFontePotassioUtilizar(PotassiumCorrection potC){
    return potC.fontePotassioUtilizarValores[potC.fontePotassioUtilizar-1];
  }
}
