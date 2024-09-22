package de.java.clip18;

import retrofit2.Call;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2);

        System.out.println(retrofitTest.execute().body());
    }
}
