package entities;


import javax.persistence.*;

@Entity
@Table(name = "QUESTIONNAIRE")
public class Questionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String questionnaireName;

    @JoinColumn(name = "PERSON_ID")
    private long personId;

    public Questionnaire(){}
    public Questionnaire(String name ){
        this.questionnaireName = name;
    }

    public String getQuestionnaireName() {
        return questionnaireName;
    }

    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "questionnaireName='" + questionnaireName + '\'' +
                ", personId=" + personId +
                '}';
    }
}
