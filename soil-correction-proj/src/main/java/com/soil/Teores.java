package com.soil;

public class Teores{
  public void calculaFosforo(){
    Fosforo f = new Fosforo();

    f.setTextureK(1);
    if(f.getTextureK() == 1){
      f.setValFosforo(9.00);
    } else if(f.getTextureK() == 2){
      f.setValFosforo(12.00);
    }

    System.out.println(f.getValFosforo());
  }

  public void calculaPotassio(){
    Potassio k = new Potassio();

    k.setTextureK(1);
    if(k.getTextureK() == 1){
      k.setValPotassio(0.35);
    } else if(k.getTextureK() == 2){
      k.setValPotassio(0.25);
    }

    System.out.println(k.getValPotassio());
  }
}
