package StudentPracticeTracker.src;

    import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("================================");
        System.out.println("   STUDENT PRACTICE TRACKER");
        System.out.println("================================");
        System.out.println();

    
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();

        System.out.println("Enter Completed Topics:");
        int completedTopics = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Questions Solved:");
        int questionsSolved = Integer.parseInt(sc.nextLine());

        student.setDetails(name, courseName);
        student.setProgress(completedTopics, questionsSolved);

        boolean running = true;

    
        while (running) {

            System.out.println();
            System.out.println("================================");
            System.out.println("            MENU");
            System.out.println("================================");
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println("Enter your choice:");

            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (choice == 1) {
                student.displayDetails();

            } else if (choice == 2) {
                student.displayProgress();

            } else if (choice == 3) {
                System.out.println("How many new topics did you complete?");
                int newTopics = Integer.parseInt(sc.nextLine());
                student.addTopics(newTopics);

            } else if (choice == 4) {
                System.out.println("How many new questions did you solve?");
                int newQuestions = Integer.parseInt(sc.nextLine());
                student.addQuestions(newQuestions);

            } else if (choice == 5) {
                System.out.println("Thank you for using Student Practice Tracker.");
                System.out.println("Keep Practicing!");
                running = false;

            } else {
                System.out.println("Invalid choice.");
                System.out.println("Please enter a value between 1 and 5.");
            }
        }

        sc.close();
    }
}

    

