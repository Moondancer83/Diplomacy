package hu.kalee.diplomacy.map;

import hu.kalee.diplomacy.army.Unit;

/**
 * Created by Ivett on 2015.12.20..
 */
public interface OwnableZone {
    Nation getCore();
    Nation getOwner();
    Unit getStationed();
}
