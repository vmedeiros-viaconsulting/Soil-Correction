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
}
