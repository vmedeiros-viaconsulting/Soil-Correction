package com.soil;

/**
 * Hello world!
 *
 */
public class App extends Potassio
{
    public static void main( String[] args ){
        Potassio k = new Potassio();

        k.setTextureK(1);
        if(k.getTextureK() == 1){
            k.setValPotassio(0.35);
        } else if(k.getTextureK() == 2){
            k.setValPotassio(0.25);
        }

        System.out.println(k.getValPotassio());
    }
}
