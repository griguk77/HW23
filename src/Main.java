import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3, s4, s5, s6, s7, s8, s9; s1 = sc.next(); s2 = sc.next(); s3 = sc.next(); s4 = sc.next(); s5 = sc.next(); s6 = sc.next(); s7 = sc.next(); s8 = sc.next(); s9 = sc.next();
        Driver driver1 = new Driver(s1);
        Driver driver2 = new Driver(s2);
        Driver driver3 = new Driver(s3);
        Cook cook1 = new Cook(s4);
        Cook cook2 = new Cook(s5);
        Cook cook3 = new Cook(s6);
        Programmer programmer1 = new Programmer(s7);
        Programmer programmer2 = new Programmer(s8);
        Programmer programmer3 = new Programmer(s9);

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(driver1);
        workers.add(driver2);
        workers.add(driver3);
        workers.add(cook1);
        workers.add(cook2);
        workers.add(cook3);
        workers.add(programmer1);
        workers.add(programmer2);
        workers.add(programmer3);
        for (Worker worker : workers) {
            System.out.println(worker.voice());
        }

        ArrayList<Drivable> drivables = new ArrayList<>();
        drivables.add(driver1);
        drivables.add(driver2);
        drivables.add(driver3);
        for (Drivable drivable : drivables) {
            System.out.println(drivable.drive());
        }

        ArrayList<Cookable> cookables = new ArrayList<>();
        cookables.add(cook1);
        cookables.add(cook2);
        cookables.add(cook3);
        for (Cookable cookable : cookables) {
            System.out.println(cookable.cook());
        }

        ArrayList<Programmable> programmables = new ArrayList<>();
        programmables.add(programmer1);
        programmables.add(programmer2);
        programmables.add(programmer3);
        for (Programmable programmable : programmables) {
            System.out.println(programmable.program());
        }
    }
}
