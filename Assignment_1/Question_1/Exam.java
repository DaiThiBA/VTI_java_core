package Assignment_1.Question_1;

import java.time.LocalDate;

public class Exam {
    private int id;
    private String code;
    private String title;
    private CategoryQuestion category;
    private int duration; // phút
    private Account creator;
    private LocalDate createDate;

    public Exam(int id, String code, String title, CategoryQuestion category, int duration, Account creator, LocalDate createDate) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.creator = creator;
        this.createDate = createDate;
    }

    public Exam(){

    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
