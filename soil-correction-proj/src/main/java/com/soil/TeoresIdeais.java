package com.soil;

public class TeoresIdeais extends App{
  public double teorIdealFosforo(int textura){
    Fosforo p = new Fosforo();

    do{
      p.setTextureK(textura);
      if(p.getTextureK() == 1){
        p.setValFosforo(9.00);
      } else if(p.getTextureK() == 2){
        p.setValFosforo(12.00);
      } else{
        error();
      }
    }while(!(textura == 1 || textura == 2));

    return p.getValFosforo();
  }

  public double teorIdealPotassio(int textura){
    Potassio k = new Potassio();

    do{
      k.setTextureK(textura);
      if(k.getTextureK() == 1){
        k.setValPotassio(0.35);
      } else if(k.getTextureK() == 2){
        k.setValPotassio(0.25);
      } else{
        error();
      }
    }while(!(textura == 1 || textura == 2));

    return k.getValPotassio();
  }

  public double teorIdealCalcio(int textura){
    Calcio ca = new Calcio();

    do{
      ca.setTextureK(textura);
      if(ca.getTextureK() == 1){
        ca.setValCalcio(6.0);
      } else if(ca.getTextureK() == 2){
        ca.setValCalcio(4.0);
      } else{
        error();
      }
    }while(!(textura == 1 || textura == 2));

    return ca.getValCalcio();
  }

  public double teorIdealMagnesio(int textura){
    Magnesio mg = new Magnesio();

    do{
      mg.setTextureK(textura);
      if(mg.getTextureK() == 1){
        mg.setValMagnesio(1.5);
      } else if(mg.getTextureK() == 2){
        mg.setValMagnesio(1.0);
      } else{
        error();
      }
    }while(!(textura == 1 || textura == 2));  

    return mg.getValMagnesio();
  }

  public double teorIdealEnxofre(int textura){
    Enxofre s = new Enxofre();

    do{
      s.setTextureK(textura);
      if(s.getTextureK() == 1){
        s.setValEnxofre(9.0);
      } else if(s.getTextureK() == 2){
        s.setValEnxofre(6.0);
      } else{
        error();
      }
    }while(!(textura == 1 || textura == 2));

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
        error();
      }
    }
  }

  public void error(){
    System.out.println("Erro");
  }
}
