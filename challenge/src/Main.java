import com.challenge.oops.*;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    // Create organs
    Eye leftEye = new Eye("Healthy", "Brown");
    Eye rightEye = new Eye("Myopia", "Blue");
    Heart heart = new Heart("Normal", 72);

    boolean running = true;

    System.out.println("========================================");
    System.out.println("  Welcome to Organ Management System");
    System.out.println("========================================\n");

    while (running) {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Left Eye Operations");
        System.out.println("2. Right Eye Operations");
        System.out.println("3. Heart Operations");
        System.out.println("4. Display All Organs Info");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                handleEyeOperations(scanner, leftEye, "Left Eye");
                break;
            case 2:
                handleEyeOperations(scanner, rightEye, "Right Eye");
                break;
            case 3:
                handleHeartOperations(scanner, heart);
                break;
            case 4:
                System.out.println("\n========== ALL ORGANS INFORMATION ==========");
                System.out.println("\n--- LEFT EYE ---");
                leftEye.getDetails();
                System.out.println("\n--- RIGHT EYE ---");
                rightEye.getDetails();
                System.out.println("\n--- HEART ---");
                heart.getDetails();
                System.out.println("==========================================");
                break;
            case 5:
                running = false;
                System.out.println("\nThank you for using Organ Management System!");
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("\nInvalid choice! Please try again.");
        }
    }

    scanner.close();
}

void handleEyeOperations(Scanner scanner, Eye eye, String eyeName) {
    System.out.println("\n--- " + eyeName + " Operations ---");
    System.out.println("1. Open Eye");
    System.out.println("2. Close Eye");
    System.out.println("3. Change Eye Color");
    System.out.println("4. Display Eye Details");
    System.out.println("5. Check if Eye is Opened");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (choice) {
        case 1:
            eye.open();
            break;
        case 2:
            eye.close();
            break;
        case 3:
            System.out.print("Enter new eye color: ");
            String newColor = scanner.nextLine();
            eye.setColor(newColor);
            System.out.println("Eye color changed to " + newColor);
            break;
        case 4:
            System.out.println("\n--- " + eyeName + " Details ---");
            eye.getDetails();
            break;
        case 5:
            if (eye.isOpened()) {
                System.out.println(eyeName + " is currently opened");
            } else {
                System.out.println(eyeName + " is currently closed");
            }
            break;
        default:
            System.out.println("Invalid choice!");
    }
}

void handleHeartOperations(Scanner scanner, Heart heart) {
    System.out.println("\n--- Heart Operations ---");
    System.out.println("1. Start Beating");
    System.out.println("2. Stop Beating");
    System.out.println("3. Increase Heart Rate");
    System.out.println("4. Decrease Heart Rate");
    System.out.println("5. Set Heart Rate");
    System.out.println("6. Display Heart Details");
    System.out.println("7. Check if Heart is Beating");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            heart.beat();
            break;
        case 2:
            heart.stop();
            break;
        case 3:
            System.out.print("Enter amount to increase: ");
            int increaseAmount = scanner.nextInt();
            heart.increaseRate(increaseAmount);
            break;
        case 4:
            System.out.print("Enter amount to decrease: ");
            int decreaseAmount = scanner.nextInt();
            heart.decreaseRate(decreaseAmount);
            break;
        case 5:
            System.out.print("Enter new heart rate (bpm): ");
            int newRate = scanner.nextInt();
            heart.setHeartRate(newRate);
            System.out.println("Heart rate set to " + newRate + " bpm");
            break;
        case 6:
            System.out.println("\n--- Heart Details ---");
            heart.getDetails();
            break;
        case 7:
            if (heart.isBeating()) {
                System.out.println("Heart is currently beating at " + heart.getHeartRate() + " bpm");
            } else {
                System.out.println("Heart is currently stopped");
            }
            break;
        default:
            System.out.println("Invalid choice!");
    }
}


