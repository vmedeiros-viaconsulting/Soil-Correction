package com.soil;

public class Teores extends App{
  public double calculaFosforo(){
    Fosforo p = new Fosforo();

    p.setTextureK(1);
    if(p.getTextureK() == 1){
      p.setValFosforo(9.00);
    } else if(p.getTextureK() == 2){
      p.setValFosforo(12.00);
    }

    System.out.println(p.getValFosforo());

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

    System.out.println(k.getValPotassio());

    return k.getValPotassio();
  }

  public double calculaCalcio(){
    Calcio ca = new Calcio();

    ca.setTextureK(1);
    if(ca.getTextureK() == 1){
      ca.setValCalcio(6);
    } else if(ca.getTextureK() == 2){
      ca.setValCalcio(4);
    }

    System.out.println(ca.getValCalcio());

    return ca.getValCalcio();
  }
}
