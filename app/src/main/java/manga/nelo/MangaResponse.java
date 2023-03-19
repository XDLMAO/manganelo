package manga.nelo;

import java.util.List;

public class MangaResponse {

    private String latestUpdate;


    private List<MangaLink> mangaLinks;

    public String getLatestUpdate() {
        return latestUpdate;
    }

    public List<MangaLink> getMangaLinks() {
        return mangaLinks;
    }

    public static class MangaLink {
        private String link;
        private String poster;
        private String title;

        public String getLink() {
            return link;
        }

        public String getPoster() {
            return poster;
        }

        public String getTitle() {
            return title;
        }
    }
}
