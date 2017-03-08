package com.innopolis.smoldyrev.territory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class House extends AbstractTerritory {

    private int peoples;

    public int getPeoples() {
        return peoples;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public House(int peoples) {
        super(new ArrayList<>());
        this.peoples = peoples;
    }

    @Override
    public int countPeoples() {
        return peoples;
    }

    @Override
    public int countSquare() {
        return 0;
    }

    @Override
    public int countBudgets() {
        return 0;
    }

    @Override
    public void add(ISubTerritory subTerritory) {
        System.out.println("no");
    }

    @Override
    public ISubTerritory getSubTerritory(int index) {
        return null;
    }

    @Override
    public House copy() {
        House copyHouse = new House(this.peoples);
        return copyHouse;
    }
}
