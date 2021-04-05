package Utiles;

import Interfaces.Analyse;

public class LowerCase implements Analyse {
    @Override
    public int analyse(String str) {
        int sum1 = 0;
        char[] strArr = str.toCharArray();
        for (char ch : strArr) {
            if (Character.isLowerCase(ch))
                sum1++;
        }
        return(sum1);
    }
}

