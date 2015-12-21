package hu.kalee.diplomacy.map;

import java.util.List;

/**
 * Created by Ivett on 2015.12.20..
 */
public interface Zone {
    int getId();
    String getName();
    List<Zone> getAdjacents();
}
