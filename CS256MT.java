import java.util.Scanner;
public class CS256MT {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("YourFirstName");
    String firstname = in.nextLine();
    System.out.println("YourLastName");
    String lastname = in.nextLine();
    System.out.println("YourGender");
    String gender = in.nextLine();
    System.out.println("YourAge");
    String age = in.nextLine();
    System.out.println("YourSkinColor");
    String color = in.nextLine();
    System.out.println("I'm " + firstname + " " + lastname + ". " + "I'm " + "a " + gender + ". " + "I'm " + age + " years old" + " and" + " I'm " + color + ". " + " I wish this world peace.");
  }
}