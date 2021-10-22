//        class PrimeThread extends Thread {
//            long minPrime;
//            PrimeThread(long minPrime) {
//                this.minPrime = minPrime;
//            }
//
//            public void run() {
//                // compute primes larger than minPrime
////                . . .
//            }
//        }
public class startup {
//    public static void main(String[] args) {
      public void welcome(){
        try{
            System.out.println("                                                                                              ");
        System.out.println("                                                                                              ");
        System.out.println("           ___________                                                                                   ");
        System.out.println("          |           |         _____        _____           ________________                                               ");
        System.out.println("           ----    ---         |      \\    /      |        /                |                                    ");
        System.out.println("              |    |           |       \\  /       |        |                |                          ");
        System.out.println("              |    |           |        \\/        |          \\         -----                                  ");
        System.out.println("              |    |           |                  |             \\       \\                                    ");
        System.out.println("              |    |           |     |\\    /|     |               \\       \\                             ");
        System.out.println("              |    |           |     | \\  / |     |                 \\       \\                           ");
        System.out.println("              |    |           |     |  \\/  |     |         /------          \\                 ");
        System.out.println("           ----    ---         |     |      |     |         |                  |                                ");
        System.out.println("          |           |         -----        -----           \\----------------/                       ");
        System.out.println("           -----------                                                                 ");
        System.out.println("                                                                                           ");
        System.out.println("                    (  WELCOME TO IMMIGRATION MANAGEMENT SYSTEM  )                ");
        System.out.println("                                  By Muhammad Rameez                             ");
    }catch (Exception e){
            System.out.println(e.getMessage());
    }
//        PrimeThread p = new PrimeThread(10003);
//        p.start();

          System.out.println("Loading ...");
          try {
              Thread.sleep(3003);
          }
          catch (Exception e) {
              System.out.println("ERROR");
          }
//    p.sleep(200);
    }
}

