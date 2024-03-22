package modul2.tugas;


public class ConcertTicketSystem {

    public static final int DEFAULT_PRICE = 50;
    private int[][] seatPrices;
    private boolean[][] seatAvailability;
    private int totalRows;
    private int totalCols;
    private int seatsAvailable;

    public ConcertTicketSystem(int rows, int cols) {
        this.totalRows = rows;
        this.totalCols = cols;
        this.seatsAvailable = rows * cols;
        initializeSeatPricesAndAvailability();
    }


    private void initializeSeatPricesAndAvailability() {
        seatPrices = new int[totalRows][totalCols];
        seatAvailability = new boolean[totalRows][totalCols];
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                seatPrices[i][j] = DEFAULT_PRICE;
                seatAvailability[i][j] = true;
            }
        }
    }

    public void showSeatPrices(){
        System.out.println("Seat Pricess: ");
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                System.out.println("Row " + (i + 1)+ " Column " + (j + 1) +": $"+ seatPrices[i][j]);
            }
        }
    }

    public void showAvailableSeats() {
        System.out.println("Available Seats:");
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if (seatAvailability[i][j]) {
                    System.out.print("[ " + (i + 1) + "," + (j + 1) + " ] ");
                } else {
                    System.out.print("[ X ] ");
                }
            }
            System.out.println();
        }
    }

    public void buyTicket(int row, int col) {
        if (isaBoolean(row, col)) {
            int price = seatPrices[row - 1][col - 1];
            System.out.println("You have purchased a ticket at row" + row + "and column" + col + " for $" + price);
            seatAvailability[row - 1][col - 1] = false;
            seatsAvailable = getSeatsAvailable() - 1;
        } else {
            System.out.println("Invalid seat selection or seat is already taken.");
        }
    }

    private boolean isaBoolean(int row, int col) {
        return row >= 1 && row <= totalRows && col >= 1 && col <= totalCols && seatAvailability[row - 1][col - 1];
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }
}