package View;

import java.util.Scanner;

public class WaterPumpView {
    private Scanner scanner = new Scanner(System.in);

    public int getWaterLevelInput() {
        System.out.print("Enter water level (0-100): ");
        return scanner.nextInt();
    }

    public void displayPumpStatus(boolean pumpOn) {
        if (pumpOn) {
            System.out.println("Pump is ON.");
        } else {
            System.out.println("Pump is OFF.");
        }
    }
}

