public class Conditions12 {
    public static void main(String[] args) {
        char gender='M';
        int age =25;
        if (gender=='M'){
            if(age>=21){

            
            System.out.println("Elligible Bachelor");

        }
            else{
                System.out.println("BOY underage");

        }
    }
    else if(gender=='F')
    {
        if(age>=19){
            System.out.println("Girls are elligble");

        }
        else{
            System.out.println("GIrls undersage");
        }
    }
    else{
        System.out.println("invalid GEnder");
    }

    }
}
