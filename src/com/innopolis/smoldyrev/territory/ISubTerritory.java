package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public interface ISubTerritory {

    int countPeoples();
    int countSquare();
    int countBudgets();

    List<ISubTerritory> copySubTerritories();

    ISubTerritory copy();

    void add(ISubTerritory subTerritory);

    ISubTerritory getSubTerritory(int index);


}
