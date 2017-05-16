package com.design.memento.multiple.state;

import java.util.HashMap;

/**
 * ±¸ÍüÂ¼½ÇÉ«
 * 
 * @author User
 *
 */
public class Memento {

    private HashMap<String, Object> stateMap = new HashMap<>();

    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

}
