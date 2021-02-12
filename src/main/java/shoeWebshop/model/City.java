package shoeWebshop.model;

import shoeWebshop.model.Utils.Database;

public class City {
    int id;
    String countyName;
    String cityName;
    int zipCode;

    public City(int id, String countyName, int zipCode) {
        this.id = id;
        this.countyName = countyName;
        this.zipCode = zipCode;
    }

    public City (int id, String cityName){
        this.id = id;
        this.cityName = cityName;
    }

    public static City getCity(String c){
        return Database.getCitys().stream().filter(b -> b.equals(c)).map(b -> new City(b.id, c)).findFirst().orElse(null);
    }

    public String getCountyName() {
        return countyName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", countyName='" + countyName + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
