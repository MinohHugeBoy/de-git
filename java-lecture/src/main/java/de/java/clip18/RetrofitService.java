package de.java.clip18;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("/api/user/")
    Call<Object> retrofitTest(@Query("page") int page);
}
