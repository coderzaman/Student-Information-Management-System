/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;

import java.sql.*;
import java.text.DecimalFormat;

/**
 *
 * @author Aktaruzzaman
 */
public class ResultCalculator {

    private Connection connection;
    private double first, second, third, fourth, fifth, sixth, seventh, eight;
    private double tcFirst, tcSecond, tcThird, tcFourth, tcFifth, tcSixth, tcSeven, tcEight;
    private double cgpa = 0;
    private double sgFirst, sgSecond, sgThird, sgFourth, sgFifth, sgSixth, sgSevent, sgEight;
    String formattedValue;
    public static double SGPA(double credit, double marks) {
        if (marks < 40) {
            return 00 * credit;
        } else if (marks >= 40 && marks <= 44) {
            return 2.00 * credit;
        } else if (marks >= 45 && marks <= 49) {
            return 2.25 * credit;
        } else if (marks >= 50 && marks <= 54) {
            return 2.50 * credit;
        } else if (marks >= 55 && marks <= 60) {
            return 2.75 * credit;
        } else if (marks >= 61 && marks <= 64) {
            return 3.00 * credit;
        } else if (marks >= 65 && marks <= 70) {
            return 3.25 * credit;
        } else if (marks >= 71 && marks <= 74) {
            return 3.50 * credit;
        } else if (marks >= 75 && marks <= 79) {
            return 3.75 * credit;
        } else if (marks >= 80 && marks <= 100) {
            return 4 * credit;
        } else {
            return 0;
        }
    }

    public String CGPA(String studentId) {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/studentmangementsystem?serverTimezone=UTC";
        try {
            connection = DriverManager.getConnection(url, user, password);

            String queryPublishResult = "SELECT courseCredit, score, courses.semester "
                    + "FROM result "
                    + "JOIN courses ON result.courseTitle = courses.courseTitle "
                    + "WHERE stdId = ? "
                    + "ORDER BY courses.semester ASC";

            PreparedStatement publishSubject = connection.prepareStatement(queryPublishResult);
            publishSubject.setString(1, studentId);
            ResultSet setPublishSubject = publishSubject.executeQuery();

            String sem;
            double credit;
            double score;
            while (setPublishSubject.next()) {
                credit = setPublishSubject.getDouble(1);
                score = setPublishSubject.getDouble(2);
                sem = setPublishSubject.getString(3);
                
                if (sem.equals("1st")) {
                    tcFirst += credit;
                    first += SGPA(credit, score);
                    sgFirst = first / tcFirst;
                } else if (sem.equals("2nd")) {
                    tcSecond += credit;
                    second += SGPA(credit, score);
                    sgSecond = second / tcSecond;
                } else if (sem.equals("3rd")) {
                    tcThird += credit;
                    third += SGPA(credit, score);
                    sgThird = third / tcThird;
                } else if (sem.equals("4th")) {
                    tcFourth += credit;
                    fourth += SGPA(credit, score);
                    sgFourth = fourth / tcFourth;
                } else if (sem.equals("5th")) {
                    tcFifth += credit;
                    fifth += SGPA(credit, score);
                    sgFifth = fifth / tcFifth;
                } else if (sem.equals("6th")) {
                    tcSixth += credit;
                    sixth += SGPA(credit, score);
                    sgSixth = sixth / tcSixth;
                } else if (sem.equals("7th")) {
                    tcSeven += credit;
                    seventh += SGPA(credit, score);
                    sgSevent = seventh / tcSeven;
                } else if (sem.equals("8th")) {
                    tcEight += credit;
                    eight += SGPA(credit, score);
                    sgEight = eight / tcEight;
                }
            }
           
            Double totalSgpa = sgFirst + sgSecond + sgThird +  sgFourth + sgFifth + sgSixth + sgSevent + sgEight;
           
            String selectSemester = "SELECT COUNT(DISTINCT courses.semester) AS semester_count "
                    + "FROM result "
                    + "INNER JOIN courses ON result.courseTitle = courses.courseTitle "
                    + "WHERE stdId = ?";
            PreparedStatement statemetToalComSem = connection.prepareStatement(selectSemester);
            statemetToalComSem.setString(1, studentId);
            ResultSet resultSet = statemetToalComSem.executeQuery();
            
            if (resultSet.next()) {
                if(totalSgpa != 0){
                     cgpa = totalSgpa / resultSet.getDouble("semester_count");
                     DecimalFormat df = new DecimalFormat("#.##");
                     formattedValue = df.format(cgpa);
                }
           
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return formattedValue;

    } 
}
