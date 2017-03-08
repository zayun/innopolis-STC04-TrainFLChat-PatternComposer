package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class City extends AbstractTerritory {

    private int budgets;

    public City(List<ISubTerritory> subTerritories, int budgets) {
        super(subTerritories);
        this.budgets = budgets;

    }

    @Override
    public int countBudgets() {
        return budgets;
    }

    @Override
    public City copy() {
        City copyCity = new City(this.copySubTerritories(),this.budgets);
        return copyCity;
    }

}
