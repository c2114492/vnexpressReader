package controller;

import entity.Article;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class VnExpressReader implements Reader{
    @Override
    public void getIndexArticle() {
        try {
            Elements els = Jsoup.connect("https://vnexpress.net/").get().select(".sidebar_home_1 .title_news a:first-child");
            for (Element element : els){
                Article article = new Article();
                article.setUrl(element.attr("href"));
                article.setTitle(element.text());
                article.setStatus(1);
                System.out.println(article.toString());
            }
        } catch (Exception e) {
            System.err.println("Khong the lay duoc tin.");
        }
    }

    @Override
    public void getListCategories() {

    }

    @Override
    public void getArticleByCategory(String categoryName) {

    }

    @Override
    public void getArticleDetail(String articleLink) {

    }
}
