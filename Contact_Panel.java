import java.util.Scanner;

public class Contact_Panel {
//    public static void main(String[] args) {
       public void contact(){
        String[] myname = {" Muhammad Rameez"," Zapeeo Sheikh"};
        String[] myno = {" 03244812756" , " 03234879062"};
        String myemail1 = "muhammadrmz871@gmail.com";
        String myemail2 = "beingaravian@gmail.com";

        Scanner zap = new Scanner(System.in);
        System.out.println("\n********************** Contact Panel ********************** \n\n");

        System.out.println(myname[0]+ " : "+ myno[0]);
        System.out.println(myname[1]+ " : "+ myno[1]);
        System.out.println(" Personal Email : "+myemail1+"\n Busniess Email : "+myemail2);
        System.out.println(" Type your message Below ");
        String msg =zap.next();
        System.out.println(" Message sent Sucessfully");

    }
}
