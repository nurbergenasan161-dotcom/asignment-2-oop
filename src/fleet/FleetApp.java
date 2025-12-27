package fleet;

import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {

    private ArrayList<Vehicle> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n1-Print  2-Add Car  3-Add Bus  4-Insurance  5-Service  6-Exit");
            int c = sc.nextInt();
            sc.nextLine();

            if (c == 1) {
                if (list.isEmpty()) System.out.println("No vehicles");
                for (Vehicle v : list) System.out.println(v);

            } else if (c == 2) {
                System.out.print("Model: ");
                String m = sc.nextLine();
                System.out.print("Year: ");
                int y = sc.nextInt();
                System.out.print("Price: ");
                double p = sc.nextDouble();
                System.out.print("Doors: ");
                int d = sc.nextInt();
                sc.nextLine();
                list.add(new Car(m, y, p, d));

            } else if (c == 3) {
                System.out.print("Model: ");
                String m = sc.nextLine();
                System.out.print("Year: ");
                int y = sc.nextInt();
                System.out.print("Price: ");
                double p = sc.nextDouble();
                System.out.print("Capacity: ");
                int cap = sc.nextInt();
                sc.nextLine();
                list.add(new Bus(m, y, p, cap));

            } else if (c == 4) {
                double sum = 0;
                for (Vehicle v : list) sum += v.calculateInsuranceFee();
                System.out.println("Total insurance: " + sum);

            } else if (c == 5) {
                for (Vehicle v : list) v.performService(); // полиморфизм

            } else if (c == 6) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        new FleetApp().run();
    }
}
