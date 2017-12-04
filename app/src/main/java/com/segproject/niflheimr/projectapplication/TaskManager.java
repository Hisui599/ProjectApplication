package com.segproject.niflheimr.projectapplication;

import java.util.ArrayList;

/**
 * Created by Max Chen on 12/3/2017.
 */

public class TaskManager {
    public static final String intentIndexTitle = "selectedRecipe";
    private static TaskManager instance = null;
    private ArrayList<user_chores> taskList;

    protected TaskManager() {
        //This Exists to defeat instantiation

        String[] values = new String[]{
                "Burrito", "Pizza", "Latte", "Raclette", "Feijoada", "empty", "empty", "empty", "empty", "Last Supper"
        };

        taskList = new ArrayList<>();

        for (int i = 0; i < values.length ; i++) {
            //user_chores newRecipe = new user_chores(values[i],"Recipe Description has not been defined.");
            //taskList.add(newRecipe);
        }
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public ArrayList<user_chores> getRecipeList() {
        return taskList;
    }

    public user_chores getRecipeAt(int index) {
        return taskList.get(index);
    }
}
