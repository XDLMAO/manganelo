package manga.nelo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private MangaAPI mangaApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ww5.manganelo.tv")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mangaApi = retrofit.create(MangaAPI.class);
        fetchLatestManga();
    }

    private void fetchLatestManga() {
        mangaApi.getLatestManga().enqueue(new Callback<MangaResponse>() {
            @Override
            public void onResponse(Call<MangaResponse> call, Response<MangaResponse> response) {
                if (response.isSuccessful()) {
                    MangaResponse mangaResponse = response.body();

                } else {

                }
            }

            @Override
            public void onFailure(Call<MangaResponse> call, Throwable t) {

            }
        });
    }
}








