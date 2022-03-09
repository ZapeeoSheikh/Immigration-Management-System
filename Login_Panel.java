import java.util.Scanner;

public class Login_Panel {
//    public static void main(String[] args) {
       public void login(){
        static String fixusername = "@gmail.com";
        static String lpassword;
        static String lusername;
        static String dob;
        static String semail;
        Scanner zap = new Scanner(System.in);
        AccountCreation_Panel acp = new AccountCreation_Panel();

        //Login Credentials
        System.out.println(new String (new char[50]).replace("\0","\r\n"));
        System.out.println("\n********************** Login Panel ********************** \n\n");
//        System.out.println("Please Select one of the above options");
//        System.out.println("Press 1 for Login");
//        System.out.println("Press 2 for Signup");

//        int user = zap.nextInt();
//        if (user == 1) {
            System.out.println(" Welcome to Login Page ");
            System.out.print(" Enter your username : ");
            lusername = zap.next();

//            System.out.println("Your recorded email is ");
//            System.out.println(lemail.concat(fixemail));

            System.out.print(" Enter your Password : ");
            lpassword = zap.next();

            //System.out.println("\u000C");      //Symbol on a Screen
//            System.exit(0);          // Exit screen   // Terminate program


            while (!(lusername.equals("susername") && lpassword.equals("newpass"))) {

                System.out.println("\n Incorrect Email or Password");
                System.out.print(" Enter your username : ");
                lusername = zap.next();
//                System.out.println(lusername.concat(fixusername));

                System.out.print(" Enter your Password : ");
                lpassword = zap.next();
            }
            System.out.println("\n\t ************| \t Welcome to your profile \t |************ \n");
            form();
           System.exit(0);          // Exit screen   // Terminate program

//        }
    }
    public void form(){
        Scanner zap = new Scanner(System.in);

        System.out.println("Please Select your Region");
        System.out.println(" 1. Asia \n 2. Africa \n 3. Europe ");
        int region = zap.nextInt();
        if(region == 1){
            System.out.println("Please Select Your Country \n 1. Pakistan \n 2. China \n 3. Iran ");
            int c1= zap.nextInt();
            //......................country 01 of Asia...............
            //........................ Pakistan .....................

            if(c1 == 1) {
                System.out.println("Please Select your city\n 1. Lahore \n 2. Karachi \n 3. Islamabad");
                int d1 = zap.nextInt();
                //............. city 01 of Pakistan
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Lahore University of Management and Sciences \n 2. Government College University Lahore \n 3. University of Engineering and Techonology Lahore");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of LUMS University \n ____________________________" +
                                "____________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ______" +
                                "__________________________________________________\n| Program  |  Islamabad &" +
                                " Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs " +
                                "2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF | " +
                                "   \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      | " +
                                "   Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D  " +
                                "    |    \t Rs 8500\t      |    Rs 1.9 M \t|\n _______________________________" +
                                "_________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of GCU Lahore \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of UET Lahore \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }


                }
                //...................city 02 of Pakistan
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Institute of Business Administration Karachi \n 2. Agha khan University \n 3. NED University of Engineerning and Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Institute of Business Administration Karachi \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Agha khan University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of NED University of Engineerning and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of Pakistan ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. National University of Science and Techonology  \n 2. Quaid-i-Azam University Islamabad \n 3. Comsets University Islamabad");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of National University of Science and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Quaid-i-Azam University Islamabad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Comsets University Islamabad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
            //......................country 02 of Asia...............
            //........................ China .. .....................
            else if(c1 == 2) {
                System.out.println("Please Select your city\n 1. Beijing \n 2. Shanghai \n 3. Wuhan");
                int d1 = zap.nextInt();
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Tsinghua University \n 2. Shanghai University \n 3. Beijing Institute of Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Tsinghua University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Beijing Institute of Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 02 of China
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Xi'an Jiaotong University \n 2. Shanghai Jiao Tong University \n 3. Tongji University");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Xi'an Jiaotong University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai Jiao Tong University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Tongji University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of China ........
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Huazhong University of Science and Techonology  \n 2. China University of Geo-Sciences University \n 3. Wuhan University ");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Huazhong University of Science and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of China University of Geo-Sciences University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Wuhan University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
            //...................... Country 03 of Asia...............
            //......................... IRAN .........................
            else if(c1 == 3) {
                System.out.println("Please Select your city\n 1. Tehran \n 2. Isfahan \n 3. Mashhad");
                int d1 = zap.nextInt();
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. University of Tehran \n 2. Islamic Azad University of South Tehran  \n 3. Iran Universities of Medical Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Tehran \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Islamic Azad University of South Tehran \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Iran Universities of Medical Sciences \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 02 of iran
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. University of Isfahan \n 2. Isfahan University of Techonology \n 3. Golpayegan of kashan");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Isfahan \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Isfahan University of Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Golpayegan of kashan \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of Iran ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Islamic Azad University of Mashhad  \n 2. Imam Reza International University \n 3. University of Applied Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Islamic Azad University of Mashhad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Imam Reza International University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of University of Applied Sciences \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
        }
//*********************************************************************************************************************************
        //..........Region 02 Else if part of region 01

        else if (region == 2){
            System.out.println("Please Select Your Country \n 1. South Africa \n 2. Nigeria \n 3. Zambia ");
            int c1= zap.nextInt();
            if(c1 == 1) {
                System.out.println("Please Select your city\n 1. Lahore \n 2. Karachi \n 3. Islamabad");
                int d1 = zap.nextInt();
                //............. city 01 of Pakistan
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Lahore University of Management and Sciences \n 2. Government College University Lahore \n 3. University of Engineering and Techonology Lahore");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of LUMS University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of GCU Lahore \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of UET Lahore \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }


                }
                //...................city 02 of Pakistan
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Institute of Business Administration Karachi \n 2. Agha khan University \n 3. NED University of Engineerning and Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Institute of Business Administration Karachi \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Agha khan University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of NED University of Engineerning and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of Pakistan ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. National University of Science and Techonology  \n 2. Quaid-i-Azam University Islamabad \n 3. Comsets University Islamabad");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of National University of Science and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Quaid-i-Azam University Islamabad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Comsets University Islamabad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
            //......................country 02 of Asia...............
            //........................ China .. .....................
            else if(c1 == 2) {
                System.out.println("Please Select your city\n 1. Beijing \n 2. Shanghai \n 3. Wuhan");
                int d1 = zap.nextInt();
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Tsinghua University \n 2. Shanghai University \n 3. Beijing Institute of Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Tsinghua University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Beijing Institute of Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 02 of China
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Xi'an Jiaotong University \n 2. Shanghai Jiao Tong University \n 3. Tongji University");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Xi'an Jiaotong University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai Jiao Tong University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Tongji University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of China ........
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Huazhong University of Science and Techonology  \n 2. China University of Geo-Sciences University \n 3. Wuhan University ");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Huazhong University of Science and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of China University of Geo-Sciences University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Wuhan University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
            //...................... Country 03 of Asia...............
            //......................... IRAN .........................
            else if(c1 == 3) {
                System.out.println("Please Select your city\n 1. Tehran \n 2. Isfahan \n 3. Mashhad");
                int d1 = zap.nextInt();
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. University of Tehran \n 2. Islamic Azad University of South Tehran  \n 3. Iran Universities of Medical Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Tehran \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Islamic Azad University of South Tehran \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Iran Universities of Medical Sciences \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 02 of iran
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. University of Isfahan \n 2. Isfahan University of Techonology \n 3. Golpayegan of kashan");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Isfahan \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Isfahan University of Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Golpayegan of kashan \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of Iran ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Islamic Azad University of Mashhad  \n 2. Imam Reza International University \n 3. University of Applied Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Islamic Azad University of Mashhad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Imam Reza International University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of University of Applied Sciences \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }}
        //******************************************************************************************************************************************************
        //.......................Region 02 End --> Reigon 03 Start.............
        else if (region == 3){
            System.out.println("Please Select Your Country \n 1. Germany \n 2. Hungary \n 3. United Kingdom ");
            int c1= zap.nextInt();
            if(c1 == 1) {
                System.out.println("Please Select your city\n 1. Berlin \n 2. Munich \n 3. Frankfurt");
                int d1 = zap.nextInt();
                //............. city 01 of Pakistan
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Lahore University of Management and Sciences \n 2. Government College University Lahore \n 3. University of Engineering and Techonology Lahore");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of LUMS University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of GCU Lahore \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of UET Lahore \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }


                }
                //...................city 02 of Pakistan
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Institute of Business Administration Karachi \n 2. Agha khan University \n 3. NED University of Engineerning and Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Institute of Business Administration Karachi \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Agha khan University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of NED University of Engineerning and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of Pakistan ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. National University of Science and Techonology  \n 2. Quaid-i-Azam University Islamabad \n 3. Comsets University Islamabad");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of National University of Science and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Quaid-i-Azam University Islamabad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Comsets University Islamabad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
            //......................country 02 of Asia...............
            //........................ China .. .....................
            else if(c1 == 2) {
                System.out.println("Please Select your city\n 1. Beijing \n 2. Shanghai \n 3. Wuhan");
                int d1 = zap.nextInt();
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Tsinghua University \n 2. Shanghai University \n 3. Beijing Institute of Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Tsinghua University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Beijing Institute of Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 02 of China
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Xi'an Jiaotong University \n 2. Shanghai Jiao Tong University \n 3. Tongji University");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Xi'an Jiaotong University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai Jiao Tong University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Tongji University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of China ........
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Huazhong University of Science and Techonology  \n 2. China University of Geo-Sciences University \n 3. Wuhan University ");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Huazhong University of Science and Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of China University of Geo-Sciences University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Wuhan University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }
            //...................... Country 03 of Asia...............
            //......................... IRAN .........................
            else if(c1 == 3) {
                System.out.println("Please Select your city\n 1. Tehran \n 2. Isfahan \n 3. Mashhad");
                int d1 = zap.nextInt();
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. University of Tehran \n 2. Islamic Azad University of South Tehran  \n 3. Iran Universities of Medical Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Tehran \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Islamic Azad University of South Tehran \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Iran Universities of Medical Sciences \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 02 of iran
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. University of Isfahan \n 2. Isfahan University of Techonology \n 3. Golpayegan of kashan");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Isfahan \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Isfahan University of Techonology \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Golpayegan of kashan \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
                //...................city 03 of Iran ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Islamic Azad University of Mashhad  \n 2. Imam Reza International University \n 3. University of Applied Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Islamic Azad University of Mashhad \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Islamabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 28300\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 19500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 15500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 10500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2500\t      |    Rs 1.0 M \t|\n|ph.D      |    \t Rs 8500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Imam Reza International University \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 10000\t      |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 11500\t      |    Rs 2.0 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.2 M \t|\n|MBA(acc)  |    \t Rs 9500 \t      |    Rs 2.0 M \t|\n|Ms (Comp) |    \t Rs 1500\t      |    Rs 1.1 M \t|\n|ph.D      |    \t Rs 6500\t      |    Rs 1.8 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 200   |\n|Campus Transfer Fee      | Rs 5000  |\n|Degree Correction Fee    | Rs 2000  |\n|Semester Freeze Fee      | Rs 10000 |\n ____________________________________\n");
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of University of Applied Sciences \n ________________________________________________________\n|\t\t\t\t\tFee Structure\t\t\t\t\t    |\n ________________________________________________________\n| Program  |  Fasilabad & Lahore Camp | Total fee(8 Sem)|\n|Bs (Comp) |    \t Rs 8500\t       |    Rs 2.8 M \t|\n|Bs (Engg) |    \t Rs 9500\t       |    Rs 2.1 M \t|\n|BBA & BAF |    \t Rs 14500\t      |    Rs 1.4 M \t|\n|MBA(acc)  |    \t Rs 11500\t      |    Rs 1.9 M \t|\n|Ms (Comp) |    \t Rs 2700\t      |    Rs 1.3 M \t|\n|ph.D      |    \t Rs 7500\t      |    Rs 1.9 M \t|\n ________________________________________________________");
                        System.out.println("\n\n ____________________________________\n|Additional Transicpt fee | Rs 400   |\n|Campus Transfer Fee      | Rs 9500  |\n|Degree Correction Fee    | Rs 1000  |\n|Semester Freeze Fee      | Rs 12000 |\n ____________________________________\n");
                    }

                }
            }}}

}

