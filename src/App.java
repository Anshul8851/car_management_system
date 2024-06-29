import java.lang.*;
import java.util.*;

interface utility{
    public void getDetails();
    public void setDetails();
}


public class App {
    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Showroom> showroom = new ArrayList<>();
        ArrayList<Employees> employee = new ArrayList<>();
        ArrayList<Cars> car = new ArrayList<>();
        // Showroom showroom[] = new Showroom[5];
        // Employees employee[] = new Employees[5];
        // Cars car[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        // showroom[showroom_counter] = new Showroom();
                        showroom.add(showroom_counter,new Showroom());
                        // showroom[showroom_counter].setDetails();
                        showroom.get(showroom_counter).setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        // employee[employees_counter] = new Employees();
                        employee.add(employees_counter,new Employees());
                        // employee[employees_counter].setDetails();
                        employee.get(employees_counter).setDetails();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        // car[car_counter] = new Cars();
                        car.add(car_counter,new Cars());
                        // car[car_counter].setDetails();
                        car.get(car_counter).setDetails();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom.get(i).getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            // employee[i].getDetails();
                            employee.get(i).getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            // car[i].getDetails();
                            car.get(i).getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }


    }
}