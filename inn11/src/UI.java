import java.util.Scanner;


public class UI {
    private final int ADD_PROPERTY = 1;
    private final int LIST_ALL_PROPERTIES = 2;
    private final int FIND_PROPERTY = 3;
    private final int CALCULATE_AVERAGE_AREA = 4;
    private final int EXIT = 9;

    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1.
     * If 0 is returned, the user has entered a wrong value
     */
    private int showMenu() {
        int menuChoice = 0;
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        //TODO: Add more menu entries
        System.out.println("9. Quit");
        System.out.println("\nPlease enter a number between 1 and 9.\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }

    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public void start(PropertyRegister propertyRegister) {
        boolean finished = false;
        // The while-loop will run as long as the user has not selected to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();
            Scanner sc = new Scanner(System.in);
            switch (menuChoice) {
                case ADD_PROPERTY:
                    //TODO: Er dette riktig sted å ha denne funksjonen? ("Scanner" er ikke i client, veldig mye copy-paste kode, veldig lang/uoversiktlig)
                    int municipalityNumber = 0;
                    do {
                        System.out.print("Municipality number (positive integer between 101 and 5054): ");
                        if (sc.hasNextInt()) {
                            municipalityNumber = sc.nextInt();
                        } else {
                            System.out.println("Please enter a positive integer between 101 and 5054");
                        }
                    } while (municipalityNumber < 101 || municipalityNumber > 5054);

                    String municipalityName = "";
                    do {
                        System.out.print("Municipality name: ");
                        if (sc.hasNext()) {
                            municipalityName = sc.next();
                        } else {
                            System.out.println("Please enter the municipality name.");
                        }
                    } while (municipalityName.equals(""));

                    int propertyNumber = 0;
                    do {
                        System.out.print("Property number: ");
                        if (sc.hasNextInt()) {
                            propertyNumber = sc.nextInt();
                        } else {
                            System.out.println("Please enter a positive integer.");
                        }
                    } while (propertyNumber <= 0);

                    int sectionNumber = 0;
                    do {
                        System.out.print("Section number: ");
                        if (sc.hasNextInt()) {
                            sectionNumber = sc.nextInt();
                        } else {
                            System.out.println("Please enter a positive integer.");
                        }
                    } while (sectionNumber <= 0);

                    System.out.print("Property name: ");
                    String nameOfProperty = sc.next();

                    double area = 0;
                    do {
                        System.out.print("Area: ");
                        if (sc.hasNextDouble()) {
                            area = sc.nextDouble();
                        } else {
                            System.out.println("Please enter a positive double.");
                        }
                    } while (area <= 0);

                    String nameOfOwner = "";
                    do {
                        System.out.print("Name of owner: ");
                        if (sc.hasNextLine()) {
                            nameOfOwner = sc.nextLine();
                        } else {
                            System.out.println("Please enter the full name of the owner.");
                        }
                    } while (nameOfOwner.equals(""));

                    propertyRegister.addProperty(municipalityNumber, municipalityName, propertyNumber, sectionNumber, nameOfProperty, area, nameOfOwner);
                    break;
                case LIST_ALL_PROPERTIES:
                    System.out.println(propertyRegister);
                    break;
                case FIND_PROPERTY:
                    System.out.print("Municipality number: ");
                    if (sc.hasNextInt())
                        propertyRegister.findProperty(1, 2, 3);
                    break;
                case CALCULATE_AVERAGE_AREA:
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selection...");
                    break;
            }
        }
    }
}
