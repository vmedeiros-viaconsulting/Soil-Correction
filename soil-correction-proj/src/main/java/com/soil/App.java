package com.soil;
import java.util.Scanner;

public class App{
    public static void main( String[] args ){
        TeoresIdeais t = new TeoresIdeais();
        Soma s = new Soma();

        Scanner ler = new Scanner(System.in);

        double teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio, hl;
        double somaSCmol, somaCtc, v; 

        System.out.println("Informe o valor de H+L: ");
        hl = ler.nextDouble();

        teorFosforo = t.teorIdealFosforo();
        teorPotassio = t.teorIdealPotassio();
        teorCalcio = t.teorIdealCalcio();
        teorMagnesio = t.teorIdealMagnesio();
        teorEnxofre = t.teorIdealEnxofre();
        teorAluminio = 0;

        double[] teoresIdeais = {teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio};

        t.imprimeTeoresIdeais(teoresIdeais);

        somaSCmol = s.somaCmol(teorPotassio, teorCalcio, teorMagnesio);
        somaCtc = s.somaCtcCmol(teorPotassio, teorCalcio, teorMagnesio, hl);
        v = s.vAtual(teorPotassio, teorCalcio, teorMagnesio, hl);

        double[] arrSoma = {somaSCmol, somaCtc, v};
        s.imprimeSomas(arrSoma);
    }
}
