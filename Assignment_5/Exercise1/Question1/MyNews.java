package Assignment_5.Exercise1.Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<News> newsList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter publishDate: ");
                    String date = sc.nextLine();

                    System.out.println("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter content: ");
                    String content = sc.nextLine();



                    News news = new News(id, title,date,author,content);
                    newsList.add(news);
                    System.out.println("Insert success!");
                    break;

                case 2:
                    for (News n : newsList) {
                        n.display();
                    }
                    break;

                case 3:
                    for (News n : newsList) {
                        n.calculate();
                        n.display();
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exit program!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
