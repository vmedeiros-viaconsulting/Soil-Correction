package com.soil;

public class Soma extends SoilCorrection{
  private double[] multiplicadorCalcEnxofre = {0.28, 0.2, 0.09, 0.16, 0.28, 0.52, 0.52, 0.45, 0.28, 0.44, 0.0, 0.18};
  private double[] multiplicadorSuperFosfato = {0.15, (0.1/2.42), (0.11/2.42)};
  private double[] multiplicadorKgHectare = {0.0, 0.17, 0.22};
  public double somaCmol(double teorPotassio, double teorCalcio, double teorMagnesio){
    double sCmol;
    
    sCmol = teorPotassio + teorCalcio + teorMagnesio;
    
    return sCmol > 0.01 ? sCmol : 0.0;
  }

  public double somaCtcCmol(double teorPotassio, double teorCalcio, double teorMagnesio, double hl){
    double ctcCmol;

    ctcCmol = teorPotassio + teorCalcio + teorMagnesio + hl;
    
    return ctcCmol > 0.01 ? ctcCmol : 0.0;
  }

  public double vAtual(double teorPotassio, double teorCalcio, double teorMagnesio, double hl){
    double v;
    double somaTeores = teorPotassio + teorCalcio + teorMagnesio;

    v = ((100*(somaTeores))/(somaTeores + hl));

    return v;
  }

  // Função calculaMOPercentual desenvolvida pelo professor Gabriel Costa Silva
  double calculaMOPercentual(double mo) {
    double moResult = mo / 10;
    
    return mo > 0 ? moResult : 0.0;
  }

  // Função calculaCarbono desenvolvida pelo professor Gabriel Costa Silva
  double calculaCarbono(double moPercentual) {
    double result = moPercentual / 1.72 * 10;
    
    return moPercentual > 0 ? result : 0.0;
  }

  double calculoQuantidadeAplicar(double teorFosforoAtingir, double teorFosforo, double eficienciaFosforo, double fonteFosforo, double result){
    double calculoTeorFosforo = (teorFosforoAtingir - teorFosforo)*2*2.29;
    double calculoTeorEficiencia = ((calculoTeorFosforo)*100/eficienciaFosforo/100);
    double cQuantidadeAplicar = calculoTeorEficiencia*100/result;
    
    return (teorFosforoAtingir - teorFosforo) < 0.01 ? 0.0 : cQuantidadeAplicar;
  }

  double calculoSuperfosfatoSimples(int fonteFosforo, double quantidadeAplicar, double teorCalculo){
    if(fonteFosforo == 5){
      return quantidadeAplicar*0.15;
    }else if(fonteFosforo == 1){
      return teorCalculo*0.1/2.42;
    }else if(fonteFosforo == 12){
      return teorCalculo*0.11/2.42;
    }
    return 0;
  }

  double calculoEnxofre(int fonteFosforo, double quantidadeAplicar){
    return quantidadeAplicar*multiplicadorCalcEnxofre[fonteFosforo-1];
  }

  double calculaCusto(int fonteFosforo, double quantidadeAplicar, double valor){
    return valor*quantidadeAplicar/1000;
  }

  double calculoQtdAplicarPotassio(double valPotassioVerificado, double valFontePotassioUtilizar){
    double calculoPotassioVerificado = ((valPotassioVerificado*39.1*10)*2*1.2);
    double calculoPotassioUtilizar = ((calculoPotassioVerificado)*100/0.85/100);
    double result = (calculoPotassioUtilizar)*100/valFontePotassioUtilizar;

    return result;
  }

  double calculoKgHectare(int fontePotassioUtilizar, double quantidadeAplicarPotassio){
    return quantidadeAplicarPotassio*multiplicadorKgHectare[fontePotassioUtilizar-1];
  }

  double calculaCustoPotassio(int fontePotassioUtilizar, double valor, double quantidadeAplicarPotassio){
    return valor*quantidadeAplicarPotassio/1000;
  }
}