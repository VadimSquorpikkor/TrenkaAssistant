package com.squorpikkor.android.app.trenkaassistant.save_load;

import android.content.Context;

import com.squorpikkor.android.app.trenkaassistant.exercise.ExerciseCollector;


/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class SaveLoadController {

    /**
     * String for command name
     */
    static final String SAVE_EXERCISE_LIST = "save_exercise_list";
    static final String LOAD_EXERCISE_LIST = "load_exercise_list";
    static final String SAVE_EXERCISE_NAME_LIST = "save_exercise_name_list";
    static final String LOAD_EXERCISE_NAME_LIST = "load_exercise_name_list";

    /**
     * String for preferences name
     */
    static final String EXERCISE_NAME_LIST = "exercise_name_list";

    private SaveLoad saveLoad;

    private ExerciseCollector exerciseCollector;

    public SaveLoadController() {

    }

    void getMethod(String command) {
        switch (command) {
            case SAVE_EXERCISE_LIST:

                break;
            case LOAD_EXERCISE_LIST:

                break;
            case SAVE_EXERCISE_NAME_LIST:
                saveLoad.saveStringArray(exerciseCollector.getExerciseNameList(), EXERCISE_NAME_LIST);
                break;
            case LOAD_EXERCISE_NAME_LIST:
                exerciseCollector.setExerciseNameList(saveLoad.loadStringArray(EXERCISE_NAME_LIST));
                break;
            }

    }

    void saveExerciseNameList() {

    }


}
