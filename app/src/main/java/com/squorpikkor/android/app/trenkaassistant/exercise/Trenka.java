package com.squorpikkor.android.app.trenkaassistant.exercise;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class Trenka {

    private String date;

    private ArrayList<Exercise> exerciseList;

    Trenka() {
        this.exerciseList = new ArrayList<>();
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    void addExercise(Exercise exercise) {
        exerciseList.add(exercise);
    }
}
