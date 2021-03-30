package com.soil;

public class Soma extends SoilCorrection{
  public double somaCmol(double teorPotassio, double teorCalcio, double teorMagnesio){
    double sCmol;
    
    sCmol = teorPotassio + teorCalcio + teorMagnesio;
    if(sCmol > 0.01){
        return sCmol;
    } else{
      return 0;
    }
  }

  public double somaCtcCmol(double teorPotassio, double teorCalcio, double teorMagnesio, double hl){
    double ctcCmol;

    ctcCmol = teorPotassio + teorCalcio + teorMagnesio + hl;
    if(ctcCmol > 0.01){
        return ctcCmol;
    } else{
      return 0;
    }
  }

  public double vAtual(double teorPotassio, double teorCalcio, double teorMagnesio, double hl){
    double v;

    v = ((100*(teorPotassio + teorCalcio + teorMagnesio))/(teorPotassio + teorCalcio + teorMagnesio + hl));

    return v;
  }

  double calculaMOPercentual(double mo) {
    if (mo > 0) {
        return mo / 10;
        
    } else {
        return 0.0;
    }
  }

  double calculaCarbono(double moPercentual) {
    if (moPercentual > 0) {
        return moPercentual / 1.72 * 10;
        
    } else {
        return 0.0;
    }
  }

  double calculoQuantidadeAplicar(double teorFosforoAtingir, double teorFosforo, double eficienciaFosforo, double fonteFosforo, double result){
    if((teorFosforoAtingir-teorFosforo) < 0.01){
      return 0;
    }else{
      return ((((teorFosforoAtingir - teorFosforo)*2*2.29)*100/eficienciaFosforo/100)*100/result);
    }
  }

  double calculoSuperfosfatoSimples(int fonteFosforo, double quantidadeAplicar, double teorCalculo){
    if(fonteFosforo == 5){
      return quantidadeAplicar*0.15;
    }else if(fonteFosforo == 1){
      return teorCalculo*0.1/2.42;
    }else if(fonteFosforo == 12){
      return teorCalculo*0.11/2.42;
    }else{
      return 0;
    }
  }

  double calculoEnxofre(int fonteFosforo, double quantidadeAplicar){
    if(fonteFosforo == 1){
      return quantidadeAplicar*0.28;
    }else if(fonteFosforo == 2){
      return quantidadeAplicar*0.2;
    }else if(fonteFosforo == 3){
      return quantidadeAplicar*0.09;
    }else if(fonteFosforo == 4){
      return quantidadeAplicar*0.16;
    }else if(fonteFosforo == 5){
      return quantidadeAplicar*0.28;
    }else if(fonteFosforo == 6){
      return quantidadeAplicar*0.52;
    }else if(fonteFosforo == 7){
      return quantidadeAplicar*0.52;
    }else if(fonteFosforo == 8){
      return quantidadeAplicar*0.45;
    }else if(fonteFosforo == 9){
      return quantidadeAplicar*0.28;
    }else if(fonteFosforo == 10){
      return quantidadeAplicar*0.44;
    }else if(fonteFosforo == 11){
      return quantidadeAplicar*0.0;
    }else if(fonteFosforo == 12){
      return quantidadeAplicar*0.18;
    }else{
      return 0.0;
    }
  }

  double calculaCusto(int fonteFosforo, double quantidadeAplicar, double valor){
    if(fonteFosforo == 1){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 2){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 3){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 4){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 5){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 6){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 7){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 8){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 9){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 10){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 11){
      return valor*quantidadeAplicar/1000;
    }else if(fonteFosforo == 12){
      return valor*quantidadeAplicar/1000;
    }else{
      return 0.0;
    }
  }
}
