package com.example;

public class ShtatSotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatSotrudnik(String fio, String dolzhnost, double oklad, double premiya)
            throws OkladException, NameException {
        super(fio, dolzhnost, oklad);
        this.premiya = premiya;
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (premiya < 0) {
                throw new PremiyaException("Премия не может быть отрицательной!");
            }
            return oklad + premiya;
        } catch (PremiyaException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return oklad; 
        }
    }
}
