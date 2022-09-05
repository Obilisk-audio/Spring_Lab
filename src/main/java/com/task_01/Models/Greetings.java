package com.task_01.Models;

public class Greetings {
    private String name;
    private String timeOfDay;

    public Greetings(String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greetings() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

}
