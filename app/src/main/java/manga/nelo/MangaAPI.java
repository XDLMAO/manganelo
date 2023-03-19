package manga.nelo;

import retrofit2.Call;

public interface MangaAPI {

    Call<MangaResponse> getLatestManga();
}