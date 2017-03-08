package com.innopolis.smoldyrev;

import com.innopolis.smoldyrev.territory.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ISubTerritory> houses= new ArrayList<>();
        houses.add(new House(50));
        houses.add(new House(10));
        houses.add(new House(30));

        List<ISubTerritory> kvartales = new ArrayList<>();
        kvartales.add(new Kvartal(houses,1000));
        kvartales.add(new Kvartal(houses,2000));

        List<ISubTerritory> districts = new ArrayList<>();
        districts.add(new District(kvartales));

        List<ISubTerritory> cities = new ArrayList<>();
        cities.add(new City(districts,10000));

        List<ISubTerritory> oblasties = new ArrayList<>();
        oblasties.add(new Oblast(cities));

        List<ISubTerritory> regiones = new ArrayList<>();
        regiones.add(new Region(oblasties));

        List<ISubTerritory> countries = new ArrayList<>();
        countries.add(new Country(regiones));

        for (ISubTerritory country:
             countries) {
            System.out.println(country.countPeoples());
            System.out.println(country.countSquare());
            System.out.println(country.countBudgets());
        }

        System.out.println("===========================");

        List<ISubTerritory> countries2 = new ArrayList<>();
        countries2.add(countries.get(0).copy());

        countries2.get(0).getSubTerritory(0).getSubTerritory(0).getSubTerritory(0).
                getSubTerritory(0).getSubTerritory(0).add(new House(100));

        for (ISubTerritory country:
                countries2) {
            System.out.println(country.countPeoples());
            System.out.println(country.countSquare());
            System.out.println(country.countBudgets());
        }
    }
}
