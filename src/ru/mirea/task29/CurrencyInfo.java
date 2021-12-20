package ru.mirea.task29;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private ArrayList<String> countries;
    private ArrayList<String> names;

    public CurrencyInfo(String[] countriesInfo, String[] namesInfo) {
        this.countries = new ArrayList<>(Arrays.asList(countriesInfo));
        this.names = new ArrayList<>(Arrays.asList(namesInfo));
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = (ArrayList<String>) Arrays.asList(countries);
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = (ArrayList<String>) Arrays.asList(names);
    }


    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "countriesInfo=" + countries +
                ", namesInfo=" + names +
                '}';
    }
}