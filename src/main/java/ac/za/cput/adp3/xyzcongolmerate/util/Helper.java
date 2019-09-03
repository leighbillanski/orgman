package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.ArrayList;
import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

        String capital = "";

        for(int i = 0; i<className.length();i++){
            char letter = className.charAt(i);
             if(Character.isUpperCase(letter)){
                 capital += letter;
             }
        }
        return capital;
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
         * 2. Get the capitalized letter(s) from the className and return it.
         */
    }

}
