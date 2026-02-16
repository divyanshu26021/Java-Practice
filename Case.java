
public class Case {

    public static void main(String[] args) {
        // int x=13;
        // if(x%2==0)
        // {
        //     if(x<10){
        //         System.out.println("Pani Puri");
        //     }else{
        //          System.out.println("Bheel Puri");
        //     }

        // }
        // else{
        //    if(x<10){
        //     System.out.println("masala puri");
        //    }
        //    else{
        //     System.out.println("Sev Puri");
        //    }
        // }
        double accBAl = 10000.0;
        int amt = 13;
        if (amt <= accBAl) {
            if (amt % 100 == 0) {
                System.out.println("Withdrawal Sucess");

            } else {
                System.out.println("Invalid ");

            }
        } else {
            System.out.println("Illeghal");
        }

    }

}
