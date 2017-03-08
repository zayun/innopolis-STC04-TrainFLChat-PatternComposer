package com.innopolis.smoldyrev.territory;

import java.util.List;

/**
 * Created by smoldyrev on 08.03.17.
 */
public class Kvartal extends AbstractTerritory {

    private int square;

    public Kvartal(List<ISubTerritory> subTerritories, int square) {
        super(subTerritories);
        this.square= square;
    }

    @Override
    public int countSquare() {
        return square;
    }

    @Override
    public Kvartal copy() {
        Kvartal copyKvartal = new Kvartal(this.copySubTerritories(),this.square);
        return copyKvartal;
    }
}
