package com.example.todo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("todo.php")
    Call<List<Todo>> getTodos();
}
