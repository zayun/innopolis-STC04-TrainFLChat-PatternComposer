package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class Oblast extends AbstractTerritory {

    public Oblast(List<ISubTerritory> subTerritories) {
        super(subTerritories);
    }

    @Override
    public Oblast copy() {
        Oblast copyOblast = new Oblast(this.copySubTerritories());
        return copyOblast;
    }
}
