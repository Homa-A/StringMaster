import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord)
        {
            char[] newsentence = new char[100];
            char[] sentence1 = sentence.toCharArray();
            char[] word1 = word.toCharArray();
            char[] newword1= newWord.toCharArray();
            boolean flag = true;
            for (int i = 0 ; i < sentence.length() ; i++)
            {
                if (sentence1[i] == word1 [0])
                {
                    int j;
                    for (j = 1 ; j < word.length() ; j++)
                    {
                        i ++;
                        if (sentence1[i] != word1[j] )
                        {
                            flag = false;
                        }
                    }
                    i = i - j;
                        if (flag == true)
                        {
                            for (int k = 0; k < i; k++)
                            {
                                newsentence[k] = sentence1[k];
                            }
                            int z=0;
                            for (int k = (i+1); k < newWord.length(); k++)
                            {
                                newsentence[k] = newword1[z];
                                z++;
                            }
                            z=i + newWord.length();
                            for (int k = i + word.length() ; k < sentence.length(); k++)
                            {
                                newsentence[z] = sentence1[k];
                                z++;
                            }
                        }
                }
            }
            String newsen = new String(newsentence);
        return newsen;

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
        String FF = new String(F);
        String LL = new String(L);
        FF = FF + " "+LL;
        return FF;

    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word)
    {
        char[] W = word.toCharArray();
        int j = 1; 
        for (int i = 0; i < word.length() ; i++) 
        {
            while (j < word.length()) 
            {
                if (W[i] == W[j]) 
                {
                    for (int k = i; k < word.length(); k++) 
                    {
                        W[k] = W[(k+1)];
                    }    
                }
                j ++;    
            }
            j = i+1;
        }
        String newword = new String(W);
        return newword;
    }
}