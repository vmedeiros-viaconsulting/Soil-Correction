package com.soil;

public class TeoresIdeais extends App{
  public double teorIdealFosforo(){
    Fosforo p = new Fosforo();

    p.setTextureK(1);
    if(p.getTextureK() == 1){
      p.setValFosforo(9.00);
    } else if(p.getTextureK() == 2){
      p.setValFosforo(12.00);
    }

    return p.getValFosforo();
  }

  public double teorIdealPotassio(){
    Potassio k = new Potassio();

    k.setTextureK(1);
    if(k.getTextureK() == 1){
      k.setValPotassio(0.35);
    } else if(k.getTextureK() == 2){
      k.setValPotassio(0.25);
    }

    return k.getValPotassio();
  }

  public double teorIdealCalcio(){
    Calcio ca = new Calcio();

    ca.setTextureK(1);
    if(ca.getTextureK() == 1){
      ca.setValCalcio(6.0);
    } else if(ca.getTextureK() == 2){
      ca.setValCalcio(4.0);
    }

    return ca.getValCalcio();
  }

  public double teorIdealMagnesio(){
    Magnesio mg = new Magnesio();

    mg.setTextureK(1);
    if(mg.getTextureK() == 1){
      mg.setValMagnesio(1.5);
    } else if(mg.getTextureK() == 2){
      mg.setValMagnesio(1.0);
    }

    return mg.getValMagnesio();
  }

  public double teorIdealEnxofre(){
    Enxofre s = new Enxofre();

    s.setTextureK(1);
    if(s.getTextureK() == 1){
      s.setValEnxofre(9.0);
    } else if(s.getTextureK() == 2){
      s.setValEnxofre(6.0);
    }

    return s.getValEnxofre();
  }

  public void imprimeTeoresIdeais(double arr[]){
    for(int i = 0; i < arr.length; i++){
      if(i == 0){
        System.out.printf("Teor ideal do fósforo: %.2f\n", arr[i]);
      } else if(i == 1){
        System.out.printf("Teor ideal do potássio: %.2f\n", arr[i]);
      } else if(i == 2){
        System.out.printf("Teor ideal de cálcio: %.2f\n",arr[i]);
      } else if(i == 3){
        System.out.printf("Teor ideal de magnésio: %.2f\n",arr[i]);
      } else if(i == 4){
        System.out.printf("Teor ideal de enxofre: %.2f\n", arr[i]);
      } else if(i == 5){
        System.out.printf("Teor ideal de alumínio: %.2f\n", arr[i]);
      } else{
        System.out.println("Erro");
      }
    }
  }
}
