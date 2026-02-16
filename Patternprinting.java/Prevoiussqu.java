
public class Prevoiussqu {

    public static void main(String[] args) {

        int n = 5  ; //Size of square
        char val='a';

        for (int i = 0; i < n; i++) //No of Rows
        {

            for (int j = 0; j < 5; j++)//no of coloums 
            {
                System.out.print(val+ " ");
                val++;
            }
            System.out.println();
            val='a';

        }

    }

}

    

