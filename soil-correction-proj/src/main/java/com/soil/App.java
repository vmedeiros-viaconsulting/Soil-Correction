package com.soil;

public class App{
    public static void main( String[] args ){
        TeoresIdeais t = new TeoresIdeais();
        double teorFosforo, teorPotassio, teorCalcio, teorMagnesio, teorEnxofre, teorAluminio;

        teorFosforo = t.teorIdealFosforo();
        teorPotassio = t.teorIdealPotassio();
        teorCalcio = t.teorIdealCalcio();
        teorMagnesio = t.teorIdealMagnesio();
        teorEnxofre = t.teorIdealEnxofre();
        teorAluminio = 0;

        System.out.println(teorFosforo);
        System.out.println(teorPotassio);
        System.out.println(teorCalcio);
        System.out.println(teorMagnesio);
        System.out.println(teorEnxofre);
        System.out.println(teorAluminio);
    }
}
