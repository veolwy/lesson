package com.company;

public class Main {

    public static void main(String[] args) {
        int temperature = 30;
        int yearsOld = 45;
        boolean isRainy = false;

        if (temperature > 15 && yearsOld == 45) {
            System.out.println("Можно идти гулять");
        }

        if (temperature < 28 || yearsOld == 17) {
            System.out.println("Можно идти гулять");
        }



        isRainy = true;
        if (temperature < -10 && yearsOld > 45) {
            System.out.println("Оставайтесь дома");
        }

    }
}
