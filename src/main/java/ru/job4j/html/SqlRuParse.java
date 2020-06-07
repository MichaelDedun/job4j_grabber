package ru.job4j.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SqlRuParse {

    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.sql.ru/forum/job-offers").get();
        Elements row = doc.select(".postslisttopic");
        Elements rowsWithDate = doc.select(".altCol");
        for (int i = 0; i < row.size(); i++) {
            Element td = row.get(i);
            Element href = td.child(0);
            System.out.println(href.attr("href"));
            System.out.println(href.text());
            Element data = rowsWithDate.get(i);
            System.out.println(data.childNodes().get(0));
        }
    }

}

