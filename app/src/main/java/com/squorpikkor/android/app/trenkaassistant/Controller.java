package com.squorpikkor.android.app.trenkaassistant;

import com.squorpikkor.android.app.trenkaassistant.exercise.ExerciseCollector;
import com.squorpikkor.android.app.trenkaassistant.exercise.TrenkaCollector;
import com.squorpikkor.android.app.trenkaassistant.save_load.SaveLoadController;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class Controller {

    private SaveLoadController saveLoadController;
    private ExerciseCollector exerciseCollector;
    private TrenkaCollector trenkaCollector;

    public Controller() {
        saveLoadController = new SaveLoadController();
        exerciseCollector = new ExerciseCollector();
        trenkaCollector = new TrenkaCollector();
    }


    public static final String CREATE_NEW_EXERCISE = "create_new_exercise";
    public static final String CREATE_NEW_TRENKA = "create_new_trenka";
    public static final String LOAD_EXERCISE_LIST = "load_exercise_list";

    public void getMethod(String command) {
        switch (command) {
            case LOAD_EXERCISE_LIST:

                break;
            case CREATE_NEW_TRENKA:

                break;
        }
    }

    public void getMethod(String command, String stringParameter) {
        switch (command) {
            case CREATE_NEW_EXERCISE:
                exerciseCollector.createNewExercise(stringParameter);
                break;
        }
    }
}
