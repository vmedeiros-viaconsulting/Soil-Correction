package com.soil;

public class Soma extends SoilCorrection{
  private double[] multiplicadorCalcEnxofre = {0.28, 0.2, 0.09, 0.16, 0.28, 0.52, 0.52, 0.45, 0.28, 0.44, 0.0, 0.18};
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

  public enum EnxofreCalc{
    PRIMEIRO, SEGUNDO, TERCEIRO, QUARTO, QUINTO, SEXTO, SETIMO, OITAVO, NONO, DECIMO, DECIMOP, DECIMOS
  };

  double calculoEnxofre(int fonteFosforo, double quantidadeAplicar){
    return quantidadeAplicar*multiplicadorCalcEnxofre[fonteFosforo-1];
  }

  double calculaCusto(int fonteFosforo, double quantidadeAplicar, double valor){
    return valor*quantidadeAplicar/1000;
  }

  double calculoQtdAplicarPotassio(double valPotassioVerificado, double valFontePotassioUtilizar){
    double result = (((valPotassioVerificado*39.1*10)*2*1.2)*100/0.85/100)*100/valFontePotassioUtilizar;

    return result;
  }

  double calculoKgHectare(int fontePotassioUtilizar, double quantidadeAplicarPotassio){
    if(fontePotassioUtilizar == 1){
      return 0;
    }else if(fontePotassioUtilizar == 2){
      return quantidadeAplicarPotassio*0.17;
    }else if(fontePotassioUtilizar == 3){
      return quantidadeAplicarPotassio*0.22;
    }else{
      return 0;
    }
  }

  double calculaCustoPotassio(int fontePotassioUtilizar, double valor, double quantidadeAplicarPotassio){
    return valor*quantidadeAplicarPotassio/1000;
  }
}
