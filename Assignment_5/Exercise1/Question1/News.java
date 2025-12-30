package Assignment_5.Exercise1.Question1;

import java.util.Scanner;

public class News implements INews{

    private int ID;

    private String title;

    private String publishDate;

    private String author;

    private String content;

    private float averageRate;

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void display() {
        System.out.println(
                " title='" + title + '\'' +
                        ", publishDate='" + publishDate + '\'' +
                        ", author='" + author + '\'' +
                        ", content='" + content + '\'' +
                        ", averageRate=" + averageRate +
                        '}'
        );
    }

    @Override
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        int[] rates = new int[3];

        for(int i = 0; i <= 2 ; i++){
            rates[i] = sc.nextInt();
        }
        this.averageRate = ( rates[0] + rates[1] + rates[2])/3f;
    }
}
