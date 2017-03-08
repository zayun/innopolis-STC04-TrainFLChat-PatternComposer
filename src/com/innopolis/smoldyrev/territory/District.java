package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class District extends AbstractTerritory{

    public District(List<ISubTerritory> subTerritories) {
        super(subTerritories);
    }

    @Override
    public District copy() {
        District copyDistrict = new District(this.copySubTerritories());
        return copyDistrict;
    }
}
