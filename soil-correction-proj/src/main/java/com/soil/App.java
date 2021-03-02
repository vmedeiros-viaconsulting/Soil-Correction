package com.soil;

public class App{
    public static void main( String[] args ){
        CalculaTeores t = new CalculaTeores();
        double teorFosforo, teorPotassio, teorCalcio, teorMagnesio;

        teorFosforo = t.calculaFosforo();
        teorPotassio = t.calculaPotassio();
        teorCalcio = t.calculaCalcio();
        teorMagnesio = t.calculaMagnesio();

        System.out.println(teorFosforo);
        System.out.println(teorPotassio);
        System.out.println(teorCalcio);
        System.out.println(teorMagnesio);
    }
}
