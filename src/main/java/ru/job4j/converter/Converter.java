package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl =  value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float ineuro = 140;
        float indollar = 180;
        float excepted = 2;
        float exceptedd = 3;
        float out = Converter.rubleToEuro(ineuro);
        float outd = Converter.rubleToDollar(indollar);
        boolean passed =  excepted == out;
        boolean passedd = exceptedd == outd;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are 3. Test result for dollar : " + passedd);
    }

}

