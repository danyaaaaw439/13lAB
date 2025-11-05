package com.example.domain;

public class Graduate extends Student {
    private String researchTopic; 

    public Graduate(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тема исследования: " + researchTopic);
    }
}
