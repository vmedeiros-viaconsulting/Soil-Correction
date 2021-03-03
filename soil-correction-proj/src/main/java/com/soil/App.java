package com.soil;
import java.util.Scanner;

public class App{
    public static void main( String[] args ){
        TeoresIdeais t = new TeoresIdeais();
        Soma s = new Soma();

        int indice = 7;
        double[] valores;
        valores = new double[indice];
        recebeValores(valores);
        imprimeValores(valores);

        double teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio, hl;
        double somaSCmol, somaCtc, v; 

        teorFosforo = t.teorIdealFosforo();
        teorPotassio = t.teorIdealPotassio();
        teorCalcio = t.teorIdealCalcio();
        teorMagnesio = t.teorIdealMagnesio();
        teorEnxofre = t.teorIdealEnxofre();
        teorAluminio = 0;

        double[] teoresIdeais = {teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio};

        t.imprimeTeoresIdeais(teoresIdeais);

        somaSCmol = s.somaCmol(teorPotassio, teorCalcio, teorMagnesio);
        somaCtc = s.somaCtcCmol(teorPotassio, teorCalcio, teorMagnesio, valores[6]);
        v = s.vAtual(teorPotassio, teorCalcio, teorMagnesio, valores[6]);

        double[] arrSoma = {somaSCmol, somaCtc, v};
        s.imprimeSomas(arrSoma);
    }

    public static double recebeValores(double dados[]){
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i <= dados.length; i++){
            if(i == 0){
                System.out.println("Informe o valor de fósforo: ");
                dados[i] = ler.nextDouble();
            } else if(i == 1){
                System.out.println("Informe o valor de potássio: ");
                dados[i] = ler.nextDouble();
            } else if(i == 2){
                System.out.println("Informe o valor de cálcio: ");
                dados[i] = ler.nextDouble();
            } else if(i == 3){
                System.out.println("Informe o valor de magnésio: ");
                dados[i] = ler.nextDouble();
            } else if(i == 4){
                System.out.println("Informe o valor de enxofre: ");
                dados[i] = ler.nextDouble();
            } else if(i == 5){
                System.out.println("Informe o valor de alumínio: ");
                dados[i] = ler.nextDouble();
            } else if(i == 6){
                System.out.println("Informe o valor de H + L: ");
                dados[i] = ler.nextDouble();
            }
        }
        System.out.println(dados.length-1);
        return dados[dados.length-1];
    }

    public static void imprimeValores(double dados[]){
        for(int i = 0; i < dados.length; i++){
            if(i == 0){
                System.out.printf("Teor do solo de fósforo: %.2f\n", dados[i]);
            } else if(i == 1){
                System.out.printf("Teor do solo de potássio: %.2f\n", dados[i]);
            } else if(i == 2){
                System.out.printf("Teor do solo de cálcio: %.2f\n", dados[i]);
            } else if(i == 3){
                System.out.printf("Teor do solo de magnésio: %.2f\n", dados[i]);
            } else if(i == 4){
                System.out.printf("Teor do solo de enxofre: %.2f\n", dados[i]);
            } else if(i == 5){
                System.out.printf("Teor do solo de alumínio: %.2f\n", dados[i]);
            } else if(i == 6){
                System.out.printf("Teor do solo de H + L: %.2f\n", dados[i]);
            } else{
                System.out.println("Erro");
            }
        }
    }
}
