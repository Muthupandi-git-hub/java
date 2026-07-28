import java.util.*;

class CityList1 {

    ArrayList<String> city = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Constructor to initialize the list
    CityList1() {
        city.add("Chennai");
        city.add("Madurai");
        city.add("Salem");
    }

    void append() {
        System.out.print("Enter a city to add: ");
        city.add(sc.next());
    }

    void position() {
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index <= city.size()) {
            System.out.print("Enter city to insert: ");
            String name = sc.nextLine();
            city.add(index, name);
        } else {
            System.out.println("Invalid index!");
        }
    }

    void searching() {
        System.out.print("Enter city to search: ");
        String search = sc.next();

        boolean found = false;

        for (String c : city) {
            if (c.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("City Found");
        else
            System.out.println("City Not Found");
    }

    void start() {
        System.out.print("Enter starting letter: ");
        String ch = sc.next().toLowerCase();

        System.out.println("Cities starting with " + ch + ":");

        for (String c : city) {
            if (c.toLowerCase().startsWith(ch)) {
                System.out.println(c);
            }
        }
    }

    int input() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Append City");
        System.out.println("2. Insert City at Position");
        System.out.println("3. Search City");
        System.out.println("4. Display Cities Starting With");
        System.out.println("5. Exit");
        System.out.print("Enter Choice: ");

        return sc.nextInt();
    }

    void display() {
        System.out.println("Current List: " + city);
    }

    public static void main(String[] args) {

        CityList1 obj = new CityList1();

        while (true) {

            int choice = obj.input();

            switch (choice) {

                case 1:
                    obj.append();
                    obj.display();
                    break;

                case 2:
                    obj.position();
                    obj.display();
                    break;

                case 3:
                    obj.searching();
                    break;

                case 4:
                    obj.start();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}