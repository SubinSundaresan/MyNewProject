import java.util.Scanner;

public class catDog {
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int str2 = str.length();
        int counter = 0;
        int counter1 = 0;
        String c = "cat";
        String d = "dog";
        for (int j = 0; j < str2 - 2; j++) {
            String strc = str.substring(j, j + 3);
            if (strc.equals(c) == true) {
                counter = counter + 1;
            } else {
                counter = counter + 0;
            }
        }
        System.out.println(counter+ " cat(s)");
        for (int i = 0; i < str2 - 2; i++) {
            String strd = str.substring(i, i + 3);
            if (strd.equals(d) == true) {
                counter1 = counter1 + 1;
            } else {
                counter1 = counter1 + 0;
            }
        }
        System.out.println(counter1+ " dog (s)");
        if(counter==counter1){
            System.out.println("cats and dogs are equal");
        }else{
            System.out.println("not equal");
        }
    }

}
