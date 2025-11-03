package com.example;

public class Employee {
    private String fio;
    private String dolzhnost;
    private double oklad;

    public Employee(String fio, String dolzhnost, double oklad) throws OkladException {
        if (oklad < 0) {
            throw new OkladException(oklad);
        }
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.oklad = oklad;
    }

    public String getFio() { return fio; }
    public void setFio(String fio) { this.fio = fio; }

    public String getDolzhnost() { return dolzhnost; }
    public void setDolzhnost(String dolzhnost) { this.dolzhnost = dolzhnost; }

    public double getOklad() { return oklad; }
    public void setOklad(double oklad) { this.oklad = oklad; }

    public double rasschitatZarplatu() {
        return oklad;
    }
}
