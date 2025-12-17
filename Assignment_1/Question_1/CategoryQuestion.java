package Assignment_1.Question_1;

public class CategoryQuestion {
    private int id;
    private String name;



    public CategoryQuestion(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryQuestion (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
