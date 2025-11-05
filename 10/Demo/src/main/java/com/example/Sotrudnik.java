package com.example;

public class Sotrudnik {
    protected String fio;
    protected String dolzhnost;
    protected double oklad;

    public Sotrudnik(String fio, String dolzhnost, double oklad) throws OkladException, NameException {
        // Проверка имени сотрудника
        if (fio == null || fio.trim().isEmpty()) {
            throw new NameException("Ошибка: ФИО сотрудника не может быть пустым!");
        }

        // Проверка должности
        if (dolzhnost == null || dolzhnost.trim().isEmpty()) {
            throw new NameException("Ошибка: Должность сотрудника не может быть пустой!");
        }

        // Проверка оклада
        if (oklad < 0) {
            throw new OkladException(oklad);
        }

        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.oklad = oklad;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) throws NameException {
        if (fio == null || fio.trim().isEmpty()) {
            throw new NameException("Ошибка: ФИО сотрудника не может быть пустым!");
        }
        this.fio = fio;
    }

    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) throws NameException {
        if (dolzhnost == null || dolzhnost.trim().isEmpty()) {
            throw new NameException("Ошибка: Должность сотрудника не может быть пустой!");
        }
        this.dolzhnost = dolzhnost;
    }

    public double getOklad() {
        return oklad;
    }

    public void setOklad(double oklad) throws OkladException {
        if (oklad < 0) {
            throw new OkladException(oklad);
        }
        this.oklad = oklad;
    }

    public double rasschitatZarplatu() {
        return oklad;
    }
}
