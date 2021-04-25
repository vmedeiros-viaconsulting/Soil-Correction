package com.soil;

public class PhosphorCorrection extends SoilCorrection{
  private int fonteFosforo;
  private double eficienciaFosforo, teorFosforoAtingir;
  private double[] fonteFosforoValores = {18.0, 41.0, 48.0, 45.0, 18.0, 33.0, 29.0, 32.0, 24.0, 18.5, 52.0, 18.0};

  public void setTeorFosforoAtingir(double teorFosforoAtingir){
    this.teorFosforoAtingir = teorFosforoAtingir;
  }

  public double getTeorFosforoAtingir(){
    return teorFosforoAtingir;
  }

  public void setEficienciaFosforo(double eficienciaFosforo){
    this.eficienciaFosforo = eficienciaFosforo;
  }

  public double getEficienciaFosforo(){
    return eficienciaFosforo;
  }

  public void setFonteFosforo(int fonteFosforo){
    this.fonteFosforo = fonteFosforo;
  }

  public int getfonteFosforo(){
    return fonteFosforo;
  }

  
  public double valorFonteFosforo(PhosphorCorrection pc){
    return pc.fonteFosforoValores[pc.fonteFosforo-1];
  }

  public double ssTeor(PhosphorCorrection pc){
    double sTeor = pc.teorFosforoAtingir - getValFosforo();

    return sTeor < 0.01 ? 0.0 : sTeor;
  }
}
