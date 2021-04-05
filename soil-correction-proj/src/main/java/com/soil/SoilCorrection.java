package com.soil;

public class SoilCorrection{
  private double valCalcio, valEnxofre, valFosforo, valMagnesio, valPotassio, valAluminio, valHl;
  private double eficienciaFosforo, teorFosforoAtingir;
  private int texture, fonteFosforo, fontePotassioUtilizar;
  private double[] fonteFosforoValores = {18.0, 41.0, 48.0, 45.0, 18.0, 33.0, 29.0, 32.0, 24.0, 18.5, 52.0, 18.0};
  private double[] fontePotassioUtilizarValores = {58.0, 52.0, 22.0, 44.0};

  public static void main( String[] args ){
    System.out.println("Bem vindo ao programa de correção de solos!");
  }

  public int getTexture(){
    return texture;
  }

  public void setTexture(int texture){
    this.texture = texture;
  }

  public double getValCalcio(){
    return valCalcio;
  }

  public void setValCalcio(double valCalcio){
    this.valCalcio = valCalcio;
  }

  public double getValEnxofre(){
    return valEnxofre;
  }

  public void setValEnxofre(double valEnxofre){
    this.valEnxofre = valEnxofre;
  }

  public double getValFosforo(){
    return valFosforo;
  }

  public void setValFosforo(double valFosforo){
    this.valFosforo = valFosforo;
  }

  public double getValMagnesio(){
    return valMagnesio;
  }

  public void setValMagnesio(double valMagnesio){
    this.valMagnesio = valMagnesio;
  }

  public double getValPotassio(){
    return valPotassio;
  }

  public void setValPotassio(double valPotassio){
    this.valPotassio = valPotassio;
  }

  public double getValAluminio(){
    return valAluminio;
  }

  public void setValAluminio(double valAluminio){
    this.valAluminio = valAluminio;
  }

  public double getValHl(){
    return valHl;
  }

  public void setValHl(double valHl){
    this.valHl = valHl;
  }

  public void setTeorFosforoAtingir(double teorFosforoAtingir){
    this.teorFosforoAtingir = teorFosforoAtingir;
  }

  public Double getTeorFosforoAtingir(){
    return teorFosforoAtingir;
  }

  public void setEficienciaFosforo(double eficienciaFosforo){
    this.eficienciaFosforo = eficienciaFosforo;
  }

  public Double getEficienciaFosforo(){
    return eficienciaFosforo;
  }

  public void setFonteFosforo(int fonteFosforo){
    this.fonteFosforo = fonteFosforo;
  }

  public int getfonteFosforo(){
    return fonteFosforo;
  }

  public void setFontePotassioUtilizar(int fontePotassioUtilizar){
    this.fontePotassioUtilizar = fontePotassioUtilizar;
  }

  public int getFontePotassioUtilizar(){
    return fontePotassioUtilizar;
  }

  public Double valorIdealFosforo(SoilCorrection soil){
    if(soil.texture == 1){
      return 9.0;
    }else{
      return 12.0;
    }
  }

  public Double valorIdealPotassio(SoilCorrection soil){
    if(soil.texture == 1){
      return 0.35;
    }else{
      return 0.25;
    }
  }

  public Double valorIdealCalcio(SoilCorrection soil){
    if(soil.texture == 1){
      return 6.0;
    }else{
      return 4.0;
    }
  }

  public Double valorIdealMagnesio(SoilCorrection soil){
    if(soil.texture == 1){
      return 1.5;
    }else{
      return 1.0;
    }
  }

  public Double valorIdealEnxofre(SoilCorrection soil){
    if(soil.texture == 1){
      return 9.0;
    }else{
      return 6.0;
    }
  }

  public Double valorIdealAluminio(SoilCorrection soil){
    return 0.0;
  }

  public Double valorFonteFosforo(SoilCorrection soil){
    return soil.fonteFosforoValores[soil.fonteFosforo-1];
  }

  // EQQ72
  public Double ssTeor(SoilCorrection soil){
    if((soil.teorFosforoAtingir - soil.valFosforo) < 0.01){
      return 0.0;
    }else{
      return soil.teorFosforoAtingir - soil.valFosforo;
    }
  }

  public Double participacaoPotassioCTCIdeal(SoilCorrection soil){
    if(soil.texture == 1){
      return 3.0;
    }else{
      return 3.0;
    }
  }

  public Double participacaoPotassioCTC(double teorPotassio, double teorCalcio, double teorMagnesio, double teorHAl){
    return teorPotassio/(teorCalcio+teorMagnesio+teorPotassio+teorHAl)*100;
  }

  public Double verificaParticipacaoPotassio(SoilCorrection soil){
    double result = (soil.valPotassio * soil.participacaoPotassioCTCIdeal(soil)/soil.participacaoPotassioCTC(soil.valPotassio, soil.valCalcio, soil.valMagnesio, soil.valHl))-soil.valPotassio;

    if(result < 0.01){
      return 0.0;
    }else{
      return result;
    }
  }

  public Double valorFontePotassioUtilizar(SoilCorrection soil){
    return soil.fontePotassioUtilizarValores[soil.fontePotassioUtilizar-1];
  }
}