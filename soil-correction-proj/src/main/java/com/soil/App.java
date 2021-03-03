package com.soil;
import java.util.Scanner;

public class App{
    public static void main( String[] args ){
        TeoresIdeais t = new TeoresIdeais();
        Soma s = new Soma();

        Scanner ler = new Scanner(System.in);

        double teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio, hl;
        double somaSCmol, somaCtc, v;

        teorFosforo = t.teorIdealFosforo();
        teorPotassio = t.teorIdealPotassio();
        teorCalcio = t.teorIdealCalcio();
        teorMagnesio = t.teorIdealMagnesio();
        teorEnxofre = t.teorIdealEnxofre();
        teorAluminio = 0;

        System.out.printf("Teor ideal do fósforo: %.2f\n", teorFosforo);
        System.out.printf("Teor ideal do potássio: %.2f\n", teorPotassio);
        System.out.printf("Teor ideal de cálcio: %.2f\n",teorCalcio);
        System.out.printf("Teor ideal de magnésio: %.2f\n",teorMagnesio);
        System.out.printf("Teor ideal de enxofre: %.2f\n",teorEnxofre);
        System.out.printf("Teor ideal de alumínio: %.2f\n",teorAluminio);

        somaSCmol = s.somaCmol(teorPotassio, teorCalcio, teorMagnesio);
        System.out.printf("S cmol: %.2f\n", somaSCmol);

        // Soma CTC
        System.out.println("Informe o valor de H+L: ");
        hl = ler.nextDouble();

        somaCtc = s.somaCtcCmol(teorPotassio, teorCalcio, teorMagnesio, hl);
        System.out.printf("CTC cmol: %.2f\n", somaCtc);

        // Soma V% Atual
        v = s.vAtual(teorPotassio, teorCalcio, teorMagnesio, hl);
        System.out.printf("V Atual: %.2f\n", v);
    }
}
