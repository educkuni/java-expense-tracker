import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);


        ArrayList<Expense> expenses = new ArrayList<>();

        int choice = 0;
        while(choice != 4) {
            System.out.print("""
                    ==== EXPENSE TRACKER ====
                    1. Add expense
                    2. View expenses
                    3. Show total
                    4. Exit
                    """);

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("What expense would you like to add?: ");
                    String expense = scanner.nextLine();

                    System.out.println("How much did it cost?: ");
                    double cost = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Enter expense category: ");
                    String category = scanner.nextLine();

                    Expense newExpense = new Expense(expense, cost, category);

                    expenses.add(newExpense);

                }
                case 2 -> {
                    for (Expense expense : expenses) {
                        System.out.println("///////////////////////////////");

                        System.out.println("Expense: " + expense.getDescription());

                        System.out.println("Cost: " + expense.getAmount());

                        System.out.println("Category: " + expense.getCategory());

                        System.out.println("///////////////////////////////");
                    }
                }
                case 3 -> {
                    double total = 0;

                    for (Expense expense : expenses){
                        total += expense.getAmount();
                    }
                    System.out.println(total);
                }
                case 4 -> System.out.println("Goodbye!");

                default -> System.out.println("Error: Invalid option.");

            }



        }
}
}
