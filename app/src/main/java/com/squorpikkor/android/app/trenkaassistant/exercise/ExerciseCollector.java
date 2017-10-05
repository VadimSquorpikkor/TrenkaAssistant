package com.squorpikkor.android.app.trenkaassistant.exercise;

import java.util.ArrayList;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class ExerciseCollector {
    private ArrayList<Exercise> exercisesList = new ArrayList<>();

    private ArrayList<String> exerciseNameList = new ArrayList<>();

    public void createNewExercise(String name) {
        exercisesList.add(new Exercise(name));
        exerciseNameList.add(name);
    }

    public ArrayList<String> getExerciseNameList() {
        return exerciseNameList;
    }

    public void setExerciseNameList(ArrayList<String> exerciseNameList) {
        this.exerciseNameList.clear();
        this.exerciseNameList.addAll(exerciseNameList);
    }

//    private ArrayList<ArrayList<CurrentExerciseDay>> mainArray;
}
