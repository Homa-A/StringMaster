import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord)
        {
           char[] newsen = new char[sentence.length()-word.length()+newWord.length()];
           int z=0;
           char[] sentence1 = sentence.toCharArray();
           char[] W = word.toCharArray();
           char[] N = newWord.toCharArray();
            for (int i = sentence.length()-1 ; i > 0 ; i--)
            {
                if (sentence1[i] == ' ')
                {
                    z=i;
                    for (int j = 0; j < i; j++)
                    {
                        newsen[j] = sentence1[j];
                    }
                    break;
                }
            }
            z++;
            for (int i = 0; i < newWord.length(); i++,z++)
            {
                    newsen[z] = N[i];
            }
            newsen[sentence.length()-word.length()-1]=' ';
            String javab = new String(newsen);
        return javab;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName)

    {

        char[] F = firstName.toCharArray();
        char[] L = lastName.toCharArray();
        if (F[0]>96 && F[0]<123) 
        {
            F[0] = (char) (F[0] - 32);
        }
        if (L[0]>96 && L[0]<123) 
        {
            L[0] = (char) (L[0] - 32);
        }
        for (int i = 1; i < firstName.length(); i++)
        {
            if (F[i]>64 && F[i]<91)
            {
                F[i] = (char) (F[i] + 32);
            }
        }
        for (int i = 1; i < lastName.length(); i++)
        {
            if (L[i]>64 && L[i]<91)
            {
                L[i] = (char) (L[i] + 32);
            }
        }
        int j=1,z=0,x=0;
        for (int i = 0; i < firstName.length(); i++)
        {
            if (!((F[i]>64 && F[i]<91)||(F[i]>96 && F[i]<123)))
            {
                while (j < firstName.length())
                {
                    F[j]=F[(j+1)];
                    j++;
                }
                j=i+1;
                z++;
            }
        }
        char[] F1 = new  char[firstName.length()-z];
        for (int i = 0; i < firstName.length()-z; i++)
        {
            F1[i]=F[i];
        }
        j=1;
        for (int i = 0; i < lastName.length(); i++)
        {
            if (!((L[i]>64 && L[i]<91)||(L[i]>96 && L[i]<123)))
            {
                while (j < lastName.length())
                {
                    L[j]=L[(j+1)];
                    j++;
                }
                j=i+1;
                x++;
            }
        }
        char[] L1 = new  char[lastName.length()-x];
        for (int i = 0; i < lastName.length()-x; i++)
        {
            L1[i]=L[i];
        }
//        int z=0;
//        for (int i = 0; i < firstName.length(); i++)
//        {
//                if (F[i])
//        }
        String FF = new String(F1);
        String LL = new String(L1);
        char[] g = new char[1];
        g[0]=' ';
        if (L[0] == g[0])
        {
            FF=FF;
        }
        else
        {
            FF = FF + " " + LL;
        }
        return FF;

    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word)
    {
        char[] Word = word.toCharArray();
//        char[] neww = new char[word.length()];
//        int z=0;
//        for (int i = 0; i < word.length()-1 ; i++)
//        {
//                if ((i+1)==word.length())
//                {
//                    neww[z+1] = W[i+1];
//                    break;
////                }
//                if (W[i] == W[(i+1)])
//                {
//                    neww[z] = W[i];
//                    z++;
//                    i++;
//                }
//                else
//                {
//                    neww[z] = W[i];
//                    z++;
//                }
//        }
//        z++;
//        neww[z-1] = W[word.length()-1];
//        String new1 ="";
//        for (int i = 0; i < word.length(); i++)
//        {
//            if ( (neww[i]>64 && neww[i]<91) || (neww[i]>96 && neww[i]<123) || (neww[i]==' '))
//            {
//                    new1 = String.valueOf(+ neww[i]);
//            }
//        }
        int z=0;
        for (int i = 0; i < word.length()-1; i++)
        {
                if (Word[i] == Word[i+1])
                {
                    for (int j = i; j < word.length()-1 ; j++)
                    {
                        Word[j] = Word[j+1];
                    }
                    if(i<Word.length-z){
                        z++;
                        i--;
                    }

                }
        }
        String newsentence = String.copyValueOf(Word, 0, word.length()-z+1);
        return newsentence;
    }
}