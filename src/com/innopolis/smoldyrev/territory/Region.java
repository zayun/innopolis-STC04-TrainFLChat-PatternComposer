package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class Region extends AbstractTerritory {

    public Region(List<ISubTerritory> subTerritories) {
        super(subTerritories);
    }

    @Override
    public Region copy() {
        Region copyRegion = new Region(this.copySubTerritories());
        return copyRegion;
    }
}
