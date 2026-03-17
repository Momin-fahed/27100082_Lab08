package com.example.lab08;

import java.util.Objects;

public class City {
    private String name;
    private String province;

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return name.equals(city.name) && province.equals(city.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, province);
    }
}