import oop.person.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Admin admin = new Admin();
        Client client = new Client();

        // Input Admin Details
        System.out.println("Enter Admin Details:");
        System.out.print("Admin Name: ");
        admin.setName(s.nextLine());
        System.out.print("Admin Email: ");
        admin.setEmail(s.nextLine());
        System.out.print("Admin Address: ");
        admin.setAddress(s.nextLine());
        System.out.print("Admin Phone Number: ");
        admin.setPhone(new String[]{s.nextLine()});
        System.out.print("Admin ID: ");
        admin.setAdminID(s.nextLine());
        System.out.print("Admin Password: ");
        admin.setPassword(s.nextLine());

        // Input Client Details
        System.out.println("\nEnter Client Details:");
        System.out.print("Client Name: ");
        client.setName(s.nextLine());
        System.out.print("Client Email: ");
        client.setEmail(s.nextLine());
        System.out.print("Client Address: ");
        client.setAddress(s.nextLine());
        System.out.print("Client Phone Number: ");
        client.setPhone(new String[]{s.nextLine()});
        System.out.print("Client Payment Method: ");
        client.setPaymentMethod(s.nextLine());
        System.out.print("Client Bank/Check Number: ");
        client.setBankCheck(s.nextInt());
        s.nextLine();

        // Display Admin and Client Details
        System.out.println("\n--- Admin Details ---");
        System.out.println(admin);

        System.out.println("\n--- Client Details ---");
        System.out.println(client);

        s.close();
    }
}
