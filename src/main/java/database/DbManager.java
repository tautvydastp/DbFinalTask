package database;

import entities.Answer;
import entities.Question;
import entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbManager implements DbRules {

    public Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }

    public List<Question> getFirstIstorijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 4");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getSecondIstorijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 5");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getThirdIstorijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 6");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Answer> getFirstIstorijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 4");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getSecondIstorijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 5");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getThirdIstorijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 6");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Question> getFirstGeografijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 1");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getSecondGeografijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 2");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getThirdGeografijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 3");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Answer> getFirstGeografijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 1");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getSecondGeografijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 2");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getThirdGeografijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 3");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Question> getFirstMatematikaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 10");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getSecondMatematikaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 11");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getThirdMatematikaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 12");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Answer> getFirstMatematikaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 10");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getSecondMatematikaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 11");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getThirdMatematikaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 12");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Question> getFirstChemijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 7");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getSecondChemijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 8");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getThirdChemijaQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 9");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Answer> getFirstChemijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 7");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getSecondChemijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 8");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getThirdChemijaAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 9");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Question> getFirstLietuviuQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 13");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getSecondLietuviuQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 14");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Question> getThirdLietuviuQuestion() {
        List<Question> questionList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT  ID, QUESTION FROM QUESTION WHERE QUESTION.ID = 15");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");


                Question question = new Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public List<Answer> getFirstLietuviuAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 13");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getSecondLietuviuAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 14");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<Answer> getThirdLietuviuAnswer() {
        List<Answer> answerList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT ID, CHOICE, ANSWER FROM ANSWERS WHERE ANSWERS.QUESTION_ID = 15");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String answer1 = resultSet.getString("ANSWER");
                String choice1 = resultSet.getString("CHOICE");
                String answer2 = resultSet.getString("ANSWER");
                String choice2 = resultSet.getString("CHOICE");
                String answer3 = resultSet.getString("ANSWER");
                String choice3 = resultSet.getString("CHOICE");
                Answer answer = new Answer(answer1, choice1, answer2, choice2, answer3, choice3);
                answerList.add(answer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public List<User> userValidator() {
        List<User> userList = new ArrayList<>();
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT PERSON_ID FROM USER WHERE ROLE='Admin'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                long personId = resultSet.getLong("PERSON_ID");
                User user = new User(personId);
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return userList;
        }
    }


    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        try {

            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT QUESTION.ID, QUESTION FROM QUESTION");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String question1 = resultSet.getString("QUESTION");
                Question question = new entities.Question(id, question1);
                questionList.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionList;

    }

    public void changeQuestion(int number, String text) {

        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE QUESTION SET QUESTION = ?" +
                    " WHERE QUESTION.ID = ?");
            statement.setString(1, text);
            statement.setInt(2, number);

            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createQuestionCorrectA(int id, String question, String answer1, String answer2, String answer3) {

        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO QUESTION(QUESTIONNAIRE_ID, QUESTION)" +
                            "VALUES(?, ?)");
            PreparedStatement statement1 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('A', ?,?,'true')");
            PreparedStatement statement2 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('B', ?,?,'false')");
            PreparedStatement statement3 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('C', ?,?,'false')");
            statement.setInt(1, id);
            statement.setString(2, question);
            statement1.setInt(1, id);
            statement1.setString(2, answer1);
            statement2.setInt(1, id);
            statement2.setString(2, answer2);
            statement3.setInt(1, id);
            statement3.setString(2, answer3);
            statement.execute();
            statement1.execute();
            statement2.execute();
            statement3.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createQuestionCorrectB(int id, String question, String answer1, String answer2, String answer3) {

        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO QUESTION(QUESTIONNAIRE_ID, QUESTION)" +
                            "VALUES(?, ?)");
            PreparedStatement statement1 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('A', ?,?,'false')");
            PreparedStatement statement2 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('B', ?,?,'true')");
            PreparedStatement statement3 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('C', ?,?,'false')");
            statement.setInt(1, id);
            statement.setString(2, question);
            statement1.setInt(1, id);
            statement1.setString(2, answer1);
            statement2.setInt(1, id);
            statement2.setString(2, answer2);
            statement3.setInt(1, id);
            statement3.setString(2, answer3);
            statement.execute();
            statement1.execute();
            statement2.execute();
            statement3.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createQuestionCorrectC(int id, String question, String answer1, String answer2, String answer3) {

        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO QUESTION(QUESTIONNAIRE_ID, QUESTION)" +
                            "VALUES(?, ?)");
            PreparedStatement statement1 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('A', ?,?,'false')");
            PreparedStatement statement2 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('B', ?,?,'false')");
            PreparedStatement statement3 = connection.prepareStatement(
                    "INSERT INTO ANSWERS(CHOICE, QUESTION_ID, ANSWER, CORRECT_ANSWER)" +
                            "VALUES('C', ?,?,'true");
            statement.setInt(1, id);
            statement.setString(2, question);
            statement1.setInt(1, id);
            statement1.setString(2, answer1);
            statement2.setInt(1, id);
            statement2.setString(2, answer2);
            statement3.setInt(1, id);
            statement3.setString(2, answer3);
            statement.execute();
            statement1.execute();
            statement2.execute();
            statement3.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertAnswerToResults(int questionnaireId,
                                      int questionId, String choice) {
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO RESULTS" +
                    "(QUESTIONNAIRE_ID, QUESTION_ID, ANSWER_CHOICE) VALUES" +
                    "(?,?,?)");
            statement.setInt(1, questionnaireId);
            statement.setInt(2, questionId);
            statement.setString(3, choice);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getAllCorrectAnswersCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAllCorrectGeogfrafijaAnswersCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS\n" +
                            "ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND QUESTIONNAIRE_ID = 1\n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAllCorrectIstorijaAnswersCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS\n" +
                            "ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND QUESTIONNAIRE_ID = 2\n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAllCorrectChemijaAnswersCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS\n" +
                            "ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND QUESTIONNAIRE_ID = 3\n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAllCorrectMatematikaAnswersCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS\n" +
                            "ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND QUESTIONNAIRE_ID = 4\n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAllCorrectLietuviuAnswersCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS\n" +
                            "ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND QUESTIONNAIRE_ID = 5\n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public double getAverageCorrectAnswersCount() {
        double count = 0;
        double count2 = 0;
        double averageCount = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ANSWER_CHOICE) FROM RESULTS JOIN ANSWERS ON ANSWERS.QUESTION_ID = RESULTS.QUESTION_ID \n" +
                            "AND ANSWER_CHOICE = CHOICE WHERE CORRECT_ANSWER = 'true';");
            PreparedStatement statement1 = connection.prepareStatement("SELECT COUNT(ANSWER_CHOICE) FROM RESULTS");
            ResultSet resultSet = statement.executeQuery();
            ResultSet resultSet1 = statement1.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ANSWER_CHOICE)");
            }
            while (resultSet1.next()) {
                count2 = resultSet1.getInt("COUNT(ANSWER_CHOICE)");
            }
            averageCount = (count / count2) * 100;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return averageCount;
    }

    public int getAnswersA() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(*) FROM RESULTS WHERE ANSWER_CHOICE = 'A';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(*)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAnswersB() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(*) FROM RESULTS WHERE ANSWER_CHOICE = 'B';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(*)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getAnswersC() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(*) FROM RESULTS WHERE ANSWER_CHOICE = 'C';");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(*)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int getCount() {
        int count = 0;
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT COUNT(ID) FROM RESULTS");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("COUNT(ID)");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}






