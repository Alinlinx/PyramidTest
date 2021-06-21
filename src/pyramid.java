public class pyramid {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        int rows = 13;

        for (int i=1; i<=rows; i++)
        {
            if (i>=2&&i<7)
            {
                for (int j=rows; j>i+1; j--)
                {
                    System.out.print(" ");
                }

                for (int k=1; k<=((i+1) * 2) -1; k++)
                {
                    if( k == 1 || k == ((i+1) * 2)-1)
                        System.out.print(ANSI_BLUE +"X"+ ANSI_RESET);
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }else if(i==7)
            {
                i+=2;
                for (int j=rows; j>i ; j--)
                {
                    System.out.print(" ");
                }

                for (int k=1; k<=(i * 2) -1 ; k++)
                {
                    if( k == 1 || k == (i * 2) -1)
                    {
                        if(k%2==0)
                            System.out.print(" ");
                        else
                            System.out.print(ANSI_BLUE +"X"+ ANSI_RESET);
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }else
            {
                for (int j=rows; j>i ; j--)
                {
                    System.out.print(" ");
                }

                for (int k=1; k<=(i * 2) -1 ; k++)
                {
                    if( k == 1 || k == (i * 2) -1 || i == rows)
                    {
                        if(k%2==0)
                            System.out.print(" ");
                        else
                            System.out.print(ANSI_BLUE +"X"+ ANSI_RESET);
                    }

                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
