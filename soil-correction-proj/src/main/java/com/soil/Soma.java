package com.soil;

public class Soma extends App{
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
}
