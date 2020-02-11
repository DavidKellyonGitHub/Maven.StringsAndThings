package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        Integer yCounter = 0;
        char[] letters = input.toCharArray();
        if (letters[letters.length-1]== 'y' || letters[letters.length-1]== 'z'){
            yCounter++;
        }
        for (int i = 0; i<letters.length-1;i++){
            if ((letters[i] == 'y' || letters[i]=='z') && letters[i+1]==' '){
                yCounter++;
            }
        }
        return yCounter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String removedResult = base.replaceAll(remove, "");
        return removedResult;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isOccurrences = input.split("is",-1).length;
        int notOccurrences = input.split("not",-1).length;
        return (isOccurrences == notOccurrences);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char[] letters = input.toCharArray();
        boolean result = true;
        int happyG = 0;
        int sadG = 0;
        for (int i = 1; i < letters.length - 1; i++) {
            if (letters[i] == 'g') {
                if (letters[i + 1] == 'g' || letters[i - 1] == 'g') {
                    happyG++;
                } else sadG++;
            }



        }
        return sadG == 0;
    }


        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input){
            char[] letters = input.toCharArray();
            Integer sameCount = 0;
            for (int i = 1; i<letters.length-1;i++){
                if((letters[i]==letters[i-1])&(letters[i]==letters[i+1])){
                    sameCount++;
                }
            }

            return sameCount;
        }
    }

