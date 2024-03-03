public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number)
    {

        char[] sen = sentence.toCharArray();
        char[][] bakhsh = new char[50][50];
        int j=0;
        int k=0;
        for (int i = 0; i < sentence.length() ; i++)
        {
            if (sen[i] == ' ')
            {
                j++;
                k=0;
            }
            bakhsh[j][k]=sen[i];
            k++;
        }
        char[] J = new char[100];
        int z;
        int i = 0;
        if ((number-1) > j)
        {
            char[] j1 = {'N', 'u', 'm', 'b', 'e', 'r', ' ', '=', ' ', ' ', ' ', 'i', 's', ' ', 'o', 'u', 't', ' ', 'O', 'f', ' ', 'B', 'o', 'u', 'n', 'd', ' '};
            J = j1;
            J[9]= (char) number;
        }
        else
        {
            for ( i = 0; bakhsh[number-1][i] != '\0'; i++)
            {
                J[i] = bakhsh[number-1][i];
            }
        }
        z=i;
        char[] J1 = new char[z];
        for (int l = 0; l <= z; l++)
        {
            J1[l] = J[l];
        }
        String dd = new String(J1);
//        System.out.println(dd);
//        System.out.println("dvds");
        return dd;
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven)
    {
        char[] num = number.toCharArray();
        int e=0,O=0;
        for (int i = 0; i < number.length() ; i++)
        {
            if (num[i] == '0' || num[i] == '2' || num[i] == '4' || num[i] == '6'|| num[i] == '8')
            {
                e ++;
            }
            else
            {
                O ++;
            }
        }
        if (searchForEven == true)
        {
            return e;
        }
        else
        {
            return O;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB)
    {
//        boolean flag = true;
        char[] A = wordA.toCharArray();
        char[] B = wordB.toCharArray();
//        int[] a = new int[A.length];
//        int[] b = new int[B.length];
//        for (int i = 0; i < A.length; i++) {
//            a[i]=A[i];
//        }
//        for (int i = 0; i < A.length; i++) {
//            b[i]=B[i];
//        }
        for (int i = 0; i < wordA.length() && i < wordB.length(); i++)
        {
            if ( (int)B[i] < (int)A[i] )
            {
//                flag = false;
                return wordB;
            }

        }
        return wordA;
//        if (flag == true)
//        {
//            return wordA;
//        }
//        else
//        {
//            return wordB;
//        }
    }
}
