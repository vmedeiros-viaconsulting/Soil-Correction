package com.soil;

public class App{
    public static void main( String[] args ){
        Teores t = new Teores();
        double teorFosforo, teorPotassio, teorCalcio;

        teorFosforo = t.calculaFosforo();
        teorPotassio = t.calculaPotassio();
        teorCalcio = t.calculaCalcio();

        System.out.println(teorFosforo);
    }
}
