class StarPattern 
{
    public static void main(String[] args) 
    {
        System.out.println("\nStar\n");
        // upper corner
        for (int i = 1; i <= 3; i++) 
        {
            for (int j = 1; j <= 13 - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        // middle corner
        for (int i = 11 - 1; i > 0; i--) 
        {
            if (i != 7) 
            {
                for (int j = 1; j <= 13 - i; j++) 
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) 
                {
                    System.out.print("*");
                }
                System.out.println("");
            } 
            else 
            {
                for (int j = 1; j <= 13 - (i + 2); j++) 
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (i + 2) * 2 - 1; k++) 
                {
                    System.out.print("*");
                }
                System.out.println("");

                break;
            }
        }
        // bottom corner
        for (int i = 1; i <= 13; i++) 
        {
            if (i == 1) 
            {
                i += 8;
            } 
            else 
            {
                for (int j = 1; j <= 13 - i; j++) 
                {
                    System.out.print(" ");
                }
                if (i == 10) 
                {
                    for (int k = 1; k <= i * 2 - 1; k++) 
                    {
                        if (k == 7) 
                        {
                            for (int l = 1; l <= k; l++) 
                            {
                                System.out.print(" ");
                            }
                            k += 6;
                        } 
                        else 
                        {
                            System.out.print("*");
                        }
                    }
                } 
                else if (i == 11) 
                {
                    for (int k = 1; k <= i * 2 - 1; k++) 
                    {
                        if (k == 5) 
                        {
                            for (int l = 1; l <= k + 8; l++) 
                            {
                                System.out.print(" ");
                            }
                            k += 12;
                        } 
                        else 
                        {
                            System.out.print("*");
                        }
                    }
                } 
                else if (i == 12) 
                {
                    for (int k = 1; k <= i * 2 - 1; k++) 
                    {
                        if (k == 3) 
                        {
                            for (int l = 1; l <= k + 16; l++) 
                            {
                                System.out.print(" ");
                            }
                            k += 18;
                        } 
                        else 
                        {
                            System.out.print("*");
                        }
                    }
                } 
                else if (i == 13) 
                {
                    for (int k = 1; k <= i * 2 - 1; k++) 
                    {
                        if (k == 2) 
                        {
                            for (int l = 1; l <= k + 21; l++) 
                            {
                                System.out.print(" ");
                            }
                            k += 22;
                        } 
                        else 
                        {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}