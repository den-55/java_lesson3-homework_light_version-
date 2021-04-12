package ru.company.entity;

import ru.company.interfaces.Mobile;

public abstract class SiemensMobile implements Mobile {

    protected String model;
    protected String owner;
    protected Boolean isAndroid;
    protected String countryOfManufacture;
    protected String chargingSocket;

    public SiemensMobile(String model, String owner, Boolean isAndroid, String countryOfManufacture, String chargingSocket) {
        this.model = model;
        this.owner = owner;
        this.isAndroid = isAndroid;
        this.countryOfManufacture = countryOfManufacture;
        this.chargingSocket = chargingSocket;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Boolean getAndroid() {
        return isAndroid;
    }

    public void setAndroid(Boolean android) {
        isAndroid = android;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getChargingSocket() {
        return chargingSocket;
    }

    public void setChargingSocket(String chargingSocket) {
        this.chargingSocket = chargingSocket;
    }
}
