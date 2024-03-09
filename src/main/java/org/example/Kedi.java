package org.example;

public class Kedi { //scope  kapsam

    int yas;
    String rengi;





   // ilk hazirlik bir kere
    public Kedi(int yas, String rengi) {
        this.yas = yas;
        this.rengi = rengi;
    }


    //Calisma aninda degisime izin verir
    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public int getYas() {
        return yas;
    }

    public String getRengi() {
        return rengi;
    }

    public static void main(String[] args) {
        Kedi kedi1 = new Kedi(1, "Siyah");
        Kedi kedi2 = new Kedi(2,"Sari");
        Kedi kedi3 = new Kedi(3, "Beyaz");

        kedi1.setYas(5);

        System.out.println("set Kedi1=" + kedi1.yas + " "+ kedi1.rengi);
        System.out.println("get ile alınan Kedi2 = " + kedi2.getYas() + "     Rengi=" +"   "+  kedi2.getRengi());


    }
}
