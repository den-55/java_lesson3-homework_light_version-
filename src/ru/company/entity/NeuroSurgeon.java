package ru.company.entity;

public class NeuroSurgeon extends Surgeon {

    private String additionalEducation;
    private Integer workHours;
    private String gender;
    private String category;
    private Integer salary;

    public NeuroSurgeon(String name, String placeOfWork, int workExperience, String placeOfStudy, boolean isPediatricSurgeon, String additionalEducation, Integer workHours, String gender, String category, Integer salary) {
        super(name, placeOfWork, workExperience, placeOfStudy, isPediatricSurgeon);
        this.additionalEducation = additionalEducation;
        this.workHours = workHours;
        this.gender = gender;
        this.category = category;
        this.salary = salary;
    }

    public String getAdditionalEducation() {
        return additionalEducation;
    }

    public void setAdditionalEducation(String additionalEducation) {
        this.additionalEducation = additionalEducation;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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
        return "NeuroSurgeon{" +
                "additionalEducation='" + additionalEducation + '\'' +
                ", workHours=" + workHours +
                ", gender='" + gender + '\'' +
                ", category='" + category + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", placeOfWork='" + placeOfWork + '\'' +
                ", workExperience=" + workExperience +
                ", placeOfStudy='" + placeOfStudy + '\'' +
                ", isPediatricSurgeon=" + isPediatricSurgeon +
                '}' + " " + say(name) + " " + heal() + " " + consult() + " " + study(placeOfStudy) + " " + teach(placeOfWork);
    }
}
