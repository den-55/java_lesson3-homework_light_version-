package ru.company.entity;

import ru.company.interfaces.Doctor;

public class Surgeon implements Doctor {

    protected String name;
    protected String placeOfWork;
    protected Integer workExperience;
    protected String placeOfStudy;
    protected Boolean isPediatricSurgeon;

    public Surgeon(String name, String placeOfWork, Integer workExperience, String placeOfStudy, Boolean isPediatricSurgeon) {
        this.name = name;
        this.placeOfWork = placeOfWork;
        this.workExperience = workExperience;
        this.placeOfStudy = placeOfStudy;
        this.isPediatricSurgeon = isPediatricSurgeon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public String getPlaceOfStudy() {
        return placeOfStudy;
    }

    public void setPlaceOfStudy(String placeOfStudy) {
        this.placeOfStudy = placeOfStudy;
    }

    public Boolean getPediatricSurgeon() {
        return isPediatricSurgeon;
    }

    public void setPediatricSurgeon(Boolean pediatricSurgeon) {
        isPediatricSurgeon = pediatricSurgeon;
    }

    @Override
    public String heal() {
        return "Я лечу людей";
    }

    @Override
    public String consult() {
        return "Я консультирую больных";
    }

    @Override
    public String study(String placeOfStudy) {
        return "Я учусь в " + placeOfStudy;
    }

    @Override
    public String teach(String placeOfTeach) {
        return "Я преподаю в " + placeOfTeach;
    }

    @Override
    public String say(String name) {
        return "Привет! Меня зовут " + name;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "name='" + name + '\'' +
                ", placeOfWork='" + placeOfWork + '\'' +
                ", workExperience=" + workExperience +
                ", placeOfStudy='" + placeOfStudy + '\'' +
                ", isPediatricSurgeon=" + isPediatricSurgeon +
                '}' + " " + say(name) + " " + heal() + " " + consult() + " " + study(placeOfStudy) + " " + teach(placeOfWork);
    }
}
