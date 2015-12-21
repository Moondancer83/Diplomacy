package hu.kalee.diplomacy.map;

import hu.kalee.diplomacy.army.UnitType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivett on 2015.12.20..
 */
public enum ZoneType {
    LAND(UnitType.LAND), SEA(UnitType.SEA), COAST(UnitType.LAND, UnitType.SEA);

    private List<UnitType> availableUnits;

    ZoneType(UnitType unitType) {
        availableUnits = new ArrayList<UnitType>();
        availableUnits.add(unitType);
    }

    ZoneType(UnitType unitType1, UnitType unitType2) {
        availableUnits = new ArrayList<UnitType>();
        availableUnits.add(unitType1);
        availableUnits.add(unitType2);
    }

    ZoneType(List<UnitType> unitTypes) {
        availableUnits = unitTypes;
    }
}
