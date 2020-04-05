package database;

import entities.Answer;
import entities.Question;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

interface DbRules {
    Connection createConnection() throws SQLException;

    List<Question> getFirstIstorijaQuestion();

    List<Question> getSecondIstorijaQuestion();

    List<Question> getThirdIstorijaQuestion();

    List<Answer> getFirstIstorijaAnswer();

    List<Answer> getSecondIstorijaAnswer();

    List<Answer> getThirdIstorijaAnswer();

    List<Question> getFirstGeografijaQuestion();

    List<Question> getSecondGeografijaQuestion();

    List<Question> getThirdGeografijaQuestion();

    List<Answer> getFirstGeografijaAnswer();

    List<Answer> getSecondGeografijaAnswer();

    List<Answer> getThirdGeografijaAnswer();

    List<Question> getFirstMatematikaQuestion();

    List<Question> getSecondMatematikaQuestion();

    List<Question> getThirdMatematikaQuestion();

    List<Answer> getFirstMatematikaAnswer();

    List<Answer> getSecondMatematikaAnswer();

    List<Answer> getThirdMatematikaAnswer();

    List<Question> getFirstChemijaQuestion();

    List<Question> getSecondChemijaQuestion();

    List<Question> getThirdChemijaQuestion();

    List<Answer> getFirstChemijaAnswer();

    List<Answer> getSecondChemijaAnswer();

    List<Answer> getThirdChemijaAnswer();

    List<Question> getFirstLietuviuQuestion();

    List<Question> getSecondLietuviuQuestion();

    List<Question> getThirdLietuviuQuestion();

    List<Answer> getFirstLietuviuAnswer();

    List<Answer> getSecondLietuviuAnswer();

    List<Answer> getThirdLietuviuAnswer();

    List<Question> getAllQuestions();

    void changeQuestion(int number, String text);

    void insertAnswerToResults(int questionnaireId,
                               int questionId, String choice);

    void createQuestionCorrectA(int id, String question,
                                String answer1, String answer2, String answer3);

    void createQuestionCorrectB(int id, String question,
                                String answer1, String answer2, String answer3);

    void createQuestionCorrectC(int id, String question,
                                String answer1, String answer2, String answer3);

    int getAllCorrectLietuviuAnswersCount();

    int getAllCorrectMatematikaAnswersCount();

    int getAllCorrectChemijaAnswersCount();

    int getAllCorrectIstorijaAnswersCount();

    int getAllCorrectGeogfrafijaAnswersCount();

    int getAllCorrectAnswersCount();

}


