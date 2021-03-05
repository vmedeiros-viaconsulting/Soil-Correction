package com.soil;
import java.util.Scanner;

public class App{
    public static void main( String[] args ){
        TeoresIdeais t = new TeoresIdeais();
        Soma s = new Soma();

        int indice = 7, valTexture = 0;
        double[] valores;
        valores = new double[indice];
        recebeValores(valores);
        imprimeValores(valores);

        double teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio, hl;
        double somaSCmol, somaCtc, v; 

        valTexture = recebeTextura();

        teorFosforo = t.teorIdealFosforo(valTexture);
        teorPotassio = t.teorIdealPotassio(valTexture);
        teorCalcio = t.teorIdealCalcio(valTexture);
        teorMagnesio = t.teorIdealMagnesio(valTexture);
        teorEnxofre = t.teorIdealEnxofre(valTexture);
        teorAluminio = 0;

        double[] teoresIdeais = {teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio};

        t.imprimeTeoresIdeais(teoresIdeais);

        somaSCmol = s.somaCmol(valores[1], valores[2], valores[3]);
        somaCtc = s.somaCtcCmol(valores[1], valores[2], valores[3], valores[6]);
        v = s.vAtual(valores[1], valores[2], valores[3], valores[6]);

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

    public static int recebeTextura(){
        int textura;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor da textura: ");
        textura = ler.nextInt();

        return textura;
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
