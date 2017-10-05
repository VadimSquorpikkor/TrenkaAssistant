package com.squorpikkor.android.app.trenkaassistant.exercise;

import java.util.ArrayList;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class TrenkaCollector {
    private ArrayList<Trenka> trenkaList;
    private int currentTrenkaIs;

    public ArrayList<Trenka> getTrenkaList() {
        return trenkaList;
    }

    void createNewTrenka() {
        trenkaList.add(new Trenka());
        currentTrenkaIs = trenkaList.size()-1;
    }

    void chooseTheTrenka(int trenkaNum) {
        currentTrenkaIs = trenkaNum;
    }

    void addExercise(Exercise exercise) {
        trenkaList.get(currentTrenkaIs);
    }



}
