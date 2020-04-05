package entities;


import javax.persistence.*;

@Entity
@Table(name = "QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;

    @Column(name = "QUESTION")
    private String question;

    @Column(name = "QUESTIONNAIRE_ID")
    private int questionnaireId;

    public Question(int questionId, String question) {
        this.questionId = questionId;
        this.question = question;
    }

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(int questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "\n" +getQuestionId() +" Klausimas: "  + question;
    }
}
