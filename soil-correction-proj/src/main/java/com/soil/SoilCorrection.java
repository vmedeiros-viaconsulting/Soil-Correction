package com.soil;

public class SoilCorrection{
  private double valCalcio, valEnxofre, valFosforo, valMagnesio, valPotassio, valAluminio, valHl;
  private double eficienciaFosforo, teorFosforoAtingir;
  private int texture, fonteFosforo;

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
    if(soil.fonteFosforo == 1){
      return 18.0;
    }else if(soil.fonteFosforo == 2){
      return 41.0;
    }else if(soil.fonteFosforo == 3){
      return 48.0;
    }else if(soil.fonteFosforo == 4){
      return 45.0;
    }else if(soil.fonteFosforo == 5){
      return 18.0;
    }else if(soil.fonteFosforo == 6){
      return 33.0;
    }else if(soil.fonteFosforo == 7){
      return 29.0;
    }else if(soil.fonteFosforo == 8){
      return 32.0;
    }else if(soil.fonteFosforo == 9){
      return 24.0;
    }else if(soil.fonteFosforo == 10){
      return 18.5;
    }else if(soil.fonteFosforo == 11){
      return 52.0;
    }else if(soil.fonteFosforo == 12){
      return 18.0;
    }
    return eficienciaFosforo;
  }

  // Parte 2
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
}