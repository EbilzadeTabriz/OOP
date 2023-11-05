package next2OOP;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Developer extends Worker{
    private String knewLanguages;
    private double salary;
    public Developer(int id, String name, String secondName,String knewLanguages,double salary) {
        super(id, name, secondName);

        this.knewLanguages=knewLanguages;
        this.salary=salary;

    }
    public void formatAt(String workingSystem){
        System.out.println(getName()+" "+workingSystem+ " working system is loading ");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Developer is familiar with "+knewLanguages+" Developer's salary is  "+salary);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome DeveloperLife ...");
        String islemler="islemler...\n"
                +"1.Developer islemleri\n"
                +"2.Manager islemleri\n"
                +"3.press q to quit";
        System.out.println("********************************");

        System.out.println(islemler);

        System.out.println("********************************");

        while(true){
            System.out.println("Choose the islem: ");
            String islems = scanner.nextLine();

            if (islems.equals("q")){
                System.out.println("Process is shut down....");
                break;
            } else if (islems.equals("1")){
                Developer developer = new Developer(1,"Kenan","Kenanov","Python,Java",2000.00);
                String developerIslem ="1.Format at\n"
                        +"2.Show info\n"
                        +"3.press q to quit";
                System.out.println(developerIslem);
                while(true){
                    System.out.println("Choose islem: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Developer process is done..");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Working system: ");
                        String working_system = scanner.nextLine();
                        developer.formatAt(working_system);

                    } else if (islems.equals("2")) {
                        developer.showInfo();


                    }
                    else {
                        System.out.println("Developer islem");
                    }


                }
            } else if (islems.equals("2")) {

                Manager manager = new Manager(1,"Serxan","Serxanov",20);
                String manager_islem = "Manager islems\n"
                        +"1.Make promotion\n"
                        +"2.Show info\n"
                        +"press q to quit";
                System.out.println(manager_islem);

                while(true){
                    System.out.println("Choose islem: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Manager islems is done");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("how much promotion do you want manger make?");
                        int promotion = scanner.nextInt();
                        scanner.nextLine();
                      manager.promote(promotion);
                        System.out.println("Manager "+promotion+" made for employee");

                    } else if (islems.equals("2")) {
                        manager.showInfo();

                    }
                    else {
                        System.out.println("Invalid manager value ");
                    }

                }
            }
        }
    }
}
