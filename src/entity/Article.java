package entity;

public class Article {
        private String url;
        private String title;
        private String content;
        private int status; //1. chưa lấy content -- 2. đã lấy content

        @Override
        public String toString() {
            return "Article{" +
                    "url='" + url + '\'' +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
}