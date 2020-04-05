package entities;


import javax.persistence.*;

@Entity
@Table(name = "ANSWERS")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @Column(name = "QUESTION_ID")
    private int questionId;

    @Column(name = "CHOICE")
    private String choice;

    @Column(name = "ANSWER")
    private String answer;

    @Column(name = "CORRECT_ANSWER")
    private String correctAnswer;
    private int count;

    public Answer(){}

    public Answer(int count){
        this.count = count;
    }

    public Answer(String answer, String choice,
                  String answer2, String choice2,
                  String answer3, String choice3){
        this.answer = answer;
        this.choice = choice;
        this.answer = answer2;
        this.choice = choice2;
        this.answer = answer3;
        this.choice = choice3;
    }


    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return getChoice() + ": " + answer;
    }
}
