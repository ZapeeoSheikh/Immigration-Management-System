import java.util.*;
//import java.util.regex.*;

public class AccountCreation_Panel {
//    public static void main(String[] args) {
//        String fixemail = "@gmail.com";
    public String newpass;
      public void signup(){
        String firstnm , lastnm , susername , semail , scpassword , spassword , scountry , scity ;
        //password validation storing


        Scanner zap = new Scanner(System.in);
        System.out.println("\n********************** Account Creation Panel ********************** \n\n");
        System.out.println(" Welcome to Signup Page ");
        System.out.print(" Enter your first name : ");
        firstnm = zap.next();
        System.out.print(" Enter your last name : ");
        lastnm = zap.next();

        System.out.println(" Your recorded name is ");
        System.out.println("  "+firstnm .concat( " " + lastnm).toUpperCase());

        System.out.print(" Enter your username : ");
            try{
            susername = zap.next();

            }catch(Exception e){
                System.out.println("Sorry, username must be String \n");
            }

//        System.out.println("Your recorded email is ");
//        System.out.println(semail.concat(fixemail));'

        System.out.print(" Enter your Email : ");
        semail = zap.next();

//boolean isValue = true;
//
////        while ( isValue == true ) {
//
//String regex = "@";
//            Pattern pattern = Pattern.compile(regex);
////            for (int i  = 0; i<= )
//        for (int i = 0; i<= semail.length(); i++ ){
//            for (String email : semail.charAt(i) ){
////                if (zap.hasNext()){
//                Matcher matcher = pattern.matcher(email);
//                System.out.println(matcher.matches());
////                    semail.matches("@");
//                    break;
//                }}
//                }
//            System.out.println("Please enter in this form \n abc   '@gmail.com' is autoattached");
//            System.out.println("Enter your Email again: ");
//            semail = zap.nextLine();
//            System.out.println("Your recorded email is ");
////            System.out.println(semail.concat(fixu));

//        }
        System.out.print(" Enter your Country : ");
        scountry = zap . next();
        System.out.print(" Enter your City : ");
        scity = zap.next();
        System.out.print(" Enter your Password : ");
        spassword = zap.next();
//        System.out.println(Passcheck(spassword));
//
//        main(args);


        System.out.print(" Confirm your Password : ");
        scpassword = zap.next();


        while (!(spassword.matches(scpassword ) )) {

            System.out.println(" Password does not match \n Try to use same Password");
            System.out.print("Enter your Password: ");
            spassword = zap.next();
            System.out.print(" Confirm your Password : ");
            scpassword = zap.next();

        }



         if (spassword.equals(scpassword) ){
             System.out.println("yeah!!");
             newpass ="";
             spassword = newpass ;
             System.out.println("Your recorded password is "+newpass);

         }
         else {
             System.out.println(" Password Mismatch!!");
         }
        System.out.println("Your Details has been Recorded");
    }
//    public static String Passcheck (String spassword) {
//        String result = "Valid Password";
//        int length = 0;
//        int numCount = 0;
//        int capCount = 0;
//
//        for (int i = 0; i <= spassword.length(); i++) {
//            if ((spassword.charAt(i) >= 47 && spassword.charAt(i) <= 58) || (spassword.charAt(i) >= 64
//                    && spassword.charAt(i) <= 91) || (spassword.charAt(i) >= 97 && spassword.charAt(i) <= 122)) {
//                //keep the password
//            } else {
//                result = "Password contain invalid character";
//            }
//            if (spassword.charAt(i) >= 47 && spassword.charAt(i) <= 58) {
//                numCount++;
//            }
//            if (spassword.charAt(i) >= 64 && spassword.charAt(i) <= 90) {
//                capCount++;
//            }
//            length = (i + 1);
//        } //end of loop
//        if (numCount < 2) {
//            result = " Not Enough number in password! ";
//        }
//        if (capCount < 2) {
//            result = " Not Enough Capital letter in password! ";
//        }
//        if (length < 8) {
//            result = " Password is too short! ";
//        }
//        return (result);
//    }
}
