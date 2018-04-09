package controller;

public interface Reader {
    void getIndexArticle();
    void getListCategories();
    void getArticleByCategory(String categoryName);
    void getArticleDetail(String articleLink);
}
