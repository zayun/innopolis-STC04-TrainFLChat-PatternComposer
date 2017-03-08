package com.innopolis.smoldyrev.territory;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTerritory implements ISubTerritory {

    private List<ISubTerritory> subTerritories;

    public AbstractTerritory(List<ISubTerritory> subTerritories) {

        this.subTerritories = new ArrayList<>();

        for (ISubTerritory territory :
                subTerritories) {
            this.subTerritories.add(territory);
        }
    }

    public List<ISubTerritory> getSubTerritories() {
        return subTerritories;
    }

    @Override
    public int countPeoples() {
        int count=0;
        for (ISubTerritory territory:
                subTerritories) {
            count+=territory.countPeoples();
        }
        return count;
    }

    @Override
    public int countSquare() {
        int count=0;
        for (ISubTerritory territory:
                subTerritories) {
            count+=territory.countSquare();
        }
        return count;
    }

    @Override
    public int countBudgets() {
        int count=0;
        for (ISubTerritory territory:
                subTerritories) {
            count+=territory.countBudgets();
        }
        return count;
    }

    @Override
    public void add(ISubTerritory subTerritory) {
        subTerritories.add(subTerritory);
    }

    @Override
    public ISubTerritory getSubTerritory(int index) {
        return subTerritories.get(index);
    }

    @Override
    public List<ISubTerritory> copySubTerritories() {

        List<ISubTerritory> copySubTerritories = new ArrayList<>();
        for (ISubTerritory territory:
                getSubTerritories()) {
//            copySubTerritories.add(territory.copy()) = territory.copySubTerritories();
            copySubTerritories.add(territory.copy());
        }
        return copySubTerritories;
    }

    @Override
    public abstract ISubTerritory copy();
}
