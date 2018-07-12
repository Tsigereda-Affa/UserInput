import java.util.Scanner;
 public class Main {
    public static void main( String[] args ){
        //Input String: "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName,houseNumber,streetName,streetType,city
        //System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        //System.out.println(streetName + " " + streetType + " " + city);
        Scanner sca= new Scanner(System.in);
       // String firstInitial = sca.nextLine();
       // String lastName = sca.nextLine();
        //int houseNumber = sca.nextInt();
       // String streetName = sca.nextLine();
       // String streetType = sca.nextLine();
       // String city = sca.next();
        System.out.println("What is your first initial?" );
        String firstInitial = sca.next();
       // System.out.println(firstInitial);
        System.out.println("What is your last name?");
        String lastName = sca.next();
       // System.out.println(lastName);
        System.out.println("What is your house number? ");
        int houseNumber = sca.nextInt();
        System.out.println("What is your street name? ");
        String streetName = sca.next();
        //System.out.println(streetName);
        System.out.println("What is your street type? ");
        String streetType = sca.next();
       // System.out.println(streetType);
        System.out.println("What is your city? ");
        String city = sca.next();
       // System.out.println(city);
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
