package ru.company.entity;

public class Encyclopedia extends Book {

    private Integer pageCounts;
    private Boolean isChildren;
    private Integer cost;
    private String placeOfSale;
    private Boolean isPopular;

    public Encyclopedia(Integer cipher, String author, String title, Integer year, String publishingHouse, Integer pageCounts, Boolean isChildren, Integer cost, String placeOfSale, Boolean isPopular) {
        super(cipher, author, title, year, publishingHouse);
        this.pageCounts = pageCounts;
        this.isChildren = isChildren;
        this.cost = cost;
        this.placeOfSale = placeOfSale;
        this.isPopular = isPopular;
    }

    public Integer getPageCounts() {
        return pageCounts;
    }

    public void setPageCounts(Integer pageCounts) {
        this.pageCounts = pageCounts;
    }

    public Boolean getChildren() {
        return isChildren;
    }

    public void setChildren(Boolean children) {
        isChildren = children;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getPlaceOfSale() {
        return placeOfSale;
    }

    public void setPlaceOfSale(String placeOfSale) {
        this.placeOfSale = placeOfSale;
    }

    public Boolean getPopular() {
        return isPopular;
    }

    public void setPopular(Boolean popular) {
        isPopular = popular;
    }

    @Override
    public String toString() {
        return "Encyclopedia{" +
                "pageCounts=" + pageCounts +
                ", isChildren=" + isChildren +
                ", cost=" + cost +
                ", placeOfSale='" + placeOfSale + '\'' +
                ", isPopular=" + isPopular +
                ", cipher=" + cipher +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
