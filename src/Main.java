import observer.ConsoleLogger;
import observer.VehicleManager;
import service.VehicleService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VehicleManager manager = new VehicleManager();
        manager.addObserver(new ConsoleLogger());

        VehicleService service = new VehicleService(manager);

        while (true) {
            System.out.println("\n=== Vehicle Management CLI ===");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View All Vehicles");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter type (car/bike): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();

                    service.createVehicle(type, id, brand);
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    String removeId = scanner.nextLine();
                    manager.removeVehicle(removeId);
                    break;

                case 3:
                    manager.displayAllVehicles();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
