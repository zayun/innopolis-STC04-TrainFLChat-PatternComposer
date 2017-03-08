package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class Country extends AbstractTerritory {
    public Country(List<ISubTerritory> subTerritories) {
        super(subTerritories);
    }


    @Override
    public Country copy() {
        Country copyCountry = new Country(this.copySubTerritories());
        return copyCountry;
    }
}
