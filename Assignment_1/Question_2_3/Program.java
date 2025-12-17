package Assignment_1.Question_2_3;

import Assignment_1.Question_1.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        /* =======================
           DEPARTMENT
        ======================= */
        Department d1 = new Department(1, "Sale");
        Department d2 = new Department(2, "Marketing");
        Department d3 = new Department(3, "IT");

        /* =======================
           POSITION
        ======================= */
        Position p1 = new Position(1, PositionName.DEV);
        Position p2 = new Position(2, PositionName.TEST);
        Position p3 = new Position(3, PositionName.PM);

        /* =======================
           ACCOUNT
        ======================= */
        Account a1 = new Account(
                1,
                "a1@gmail.com",
                "user1",
                "Nguyen Van A",
                d1,
                p1,
                LocalDate.of(2024, 1, 10)
        );

        Account a2 = new Account(
                2,
                "a2@gmail.com",
                "user2",
                "Tran Thi B",
                d2,
                p2,
                LocalDate.of(2024, 2, 15)
        );

        Account a3 = new Account(
                3,
                "a3@gmail.com",
                "user3",
                "Le Van C",
                d3,
                p3,
                LocalDate.of(2024, 3, 20)
        );

        /* =======================
           GROUP
        ======================= */
        Group g1 = new Group(1, "Java Fresher", a1, LocalDate.now());
        Group g2 = new Group(2, "Backend Team", a2, LocalDate.now());
        Group g3 = new Group(3, "Testing Team", a3, LocalDate.now());

        /* =======================
           GROUP_ACCOUNT
        ======================= */
        GroupAccount ga1 = new GroupAccount(g1, a1, LocalDate.now());
        GroupAccount ga2 = new GroupAccount(g2, a2, LocalDate.now());
        GroupAccount ga3 = new GroupAccount(g3, a3, LocalDate.now());

        /* =======================
           TYPE_QUESTION
        ======================= */
        TypeQuestion tq1 = new TypeQuestion(1, TypeQuestionName.ESSAY);
        TypeQuestion tq2 = new TypeQuestion(2, TypeQuestionName.MULTIPLE_CHOICE);
        TypeQuestion tq3 = new TypeQuestion(3, TypeQuestionName.ESSAY);

        /* =======================
           CATEGORY_QUESTION
        ======================= */
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, "SQL");
        CategoryQuestion cq3 = new CategoryQuestion(3, "Postman");

        /* =======================
           QUESTION
        ======================= */
        Question q1 = new Question(
                1,
                "Java là gì?",
                cq1,
                tq1,
                a1,
                LocalDate.now()
        );

        Question q2 = new Question(
                2,
                "SQL JOIN dùng để làm gì?",
                cq2,
                tq2,
                a2,
                LocalDate.now()
        );

        Question q3 = new Question(
                3,
                "REST API là gì?",
                cq3,
                tq1,
                a3,
                LocalDate.now()
        );

        /* =======================
           ANSWER
        ======================= */
        Answer ans1 = new Answer(1, "Ngôn ngữ lập trình", q1, true);
        Answer ans2 = new Answer(2, "Hệ điều hành", q1, false);
        Answer ans3 = new Answer(3, "Giao thức", q3, true);

        /* =======================
           EXAM
        ======================= */
        Exam e1 = new Exam(
                1,
                "EX001",
                "Java Basic Test",
                cq1,
                60,
                a1,
                LocalDate.now()
        );

        Exam e2 = new Exam(
                2,
                "EX002",
                "SQL Test",
                cq2,
                45,
                a2,
                LocalDate.now()
        );

        Exam e3 = new Exam(
                3,
                "EX003",
                "API Test",
                cq3,
                30,
                a3,
                LocalDate.now()
        );

        /* =======================
           EXAM_QUESTION
        ======================= */
        ExamQuestion eq1 = new ExamQuestion(e1, q1);
        ExamQuestion eq2 = new ExamQuestion(e2, q2);
        ExamQuestion eq3 = new ExamQuestion(e3, q3);

        /* =======================
           PRINT DEMO (Question 3)
        ======================= */
        System.out.println(d1.getName());
        System.out.println(a1.getFullName());
        System.out.println(g1.getName());
        System.out.println(q1.getContent());
        System.out.println(ans1.getContent());
        System.out.println(e1.getTitle());

    }
}