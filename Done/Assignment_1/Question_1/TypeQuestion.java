package Done.Assignment_1.Question_1;

public class TypeQuestion {
    private int id;
    private TypeQuestionName name;

    public TypeQuestion() {
    }

    public TypeQuestion(int id, TypeQuestionName name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeQuestionName getName() {
        return name;
    }

    public void setName(TypeQuestionName name) {
        this.name = name;
    }
}
