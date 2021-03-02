package com.soil;

public class CalculaTeores extends App{
  public double calculaFosforo(){
    Fosforo p = new Fosforo();

    p.setTextureK(1);
    if(p.getTextureK() == 1){
      p.setValFosforo(9.00);
    } else if(p.getTextureK() == 2){
      p.setValFosforo(12.00);
    }

    return p.getValFosforo();
  }

  public double calculaPotassio(){
    Potassio k = new Potassio();

    k.setTextureK(1);
    if(k.getTextureK() == 1){
      k.setValPotassio(0.35);
    } else if(k.getTextureK() == 2){
      k.setValPotassio(0.25);
    }

    return k.getValPotassio();
  }

  public double calculaCalcio(){
    Calcio ca = new Calcio();

    ca.setTextureK(1);
    if(ca.getTextureK() == 1){
      ca.setValCalcio(6.0);
    } else if(ca.getTextureK() == 2){
      ca.setValCalcio(4.0);
    }

    return ca.getValCalcio();
  }

  public double calculaMagnesio(){
    Magnesio mg = new Magnesio();

    mg.setTextureK(1);
    if(mg.getTextureK() == 1){
      mg.setValMagnesio(1.5);
    } else if(mg.getTextureK() == 2){
      mg.setValMagnesio(1.0);
    }

    return mg.getValMagnesio();
  }
}
