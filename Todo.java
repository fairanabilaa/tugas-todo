package com.example.todo;

import com.google.gson.annotations.SerializedName;

public class Todo {
    @SerializedName("id")
    private int id;

    @SerializedName("what")
    private String what;

    @SerializedName("time")
    private String time;

    public int getId() {
        return id;
    }

    public String getWhat() {
        return what;
    }

    public String getTime() {
        return time;
    }
}
