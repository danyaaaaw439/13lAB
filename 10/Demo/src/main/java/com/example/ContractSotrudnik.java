package com.example;

public class ContractSotrudnik extends Sotrudnik {

    public ContractSotrudnik(String fio, String dolzhnost, double oklad)
            throws OkladException, NameException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return oklad;
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
