package com.example;

public class ContractEmployee extends Employee {

    public ContractEmployee(String fio, String dolzhnost, double oklad) throws OkladException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты контрактного сотрудника: " + e.getMessage());
            return 0;
        }
    }
}
