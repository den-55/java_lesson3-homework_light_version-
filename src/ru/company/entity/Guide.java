package ru.company.entity;

public class Guide extends Book {

    private String language;
    private String topic;
    private Boolean pictures;
    private Boolean isPublic;
    private Integer cost;

    public Guide(Integer cipher, String author, String title, Integer year, String publishingHouse, String language, String topic, Boolean pictures, Boolean isPublic, Integer cost) {
        super(cipher, author, title, year, publishingHouse);
        this.language = language;
        this.topic = topic;
        this.pictures = pictures;
        this.isPublic = isPublic;
        this.cost = cost;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Boolean getPictures() {
        return pictures;
    }

    public void setPictures(Boolean pictures) {
        this.pictures = pictures;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Guide{" +
                "language='" + language + '\'' +
                ", topic='" + topic + '\'' +
                ", pictures=" + pictures +
                ", isPublic=" + isPublic +
                ", cost=" + cost +
                ", cipher=" + cipher +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
