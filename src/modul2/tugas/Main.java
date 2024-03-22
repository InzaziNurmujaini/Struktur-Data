package modul2.tugas;

import java.util.Scanner;

public class Main{

    public static void Main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the concert hall: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns in the concert hall: ");
        int cols = input.nextInt();

        ConcertTicketSystem ticketSystem = new ConcertTicketSystem(rows, cols);

        System.out.println("Welcome to the Concert Ticket System!");
        ticketSystem.showSeatPrices();

        char choice;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. View Available Seats");
            System.out.println("2. Buy Ticket");
            System.out.println("3. View Available Seats Count");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            choice = input.next().charAt(0);

            switch (choice) {

                case '1': {
                    ticketSystem.showAvailableSeats();
                    break;
                }
                case '2': {
                    System.out.print("Enter row number: ");
                    int row = input.nextInt();
                    System.out.print("Enter column number: ");
                    int col = input.nextInt();
                    ticketSystem.buyTicket(row, col);
                    break;
                }
                case '3': {
                    System.out.println("Available Seats Count: + " + ticketSystem.seatAvailability);
                    break;
                }
                case '4': {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != '4');
        input.close();
    }
}
