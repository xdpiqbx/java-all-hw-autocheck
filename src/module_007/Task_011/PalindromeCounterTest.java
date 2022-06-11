package module_007.Task_011;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter{
    public int count(String phrase){
        String [] words = phrase.split(" ");
        int palindromeCounter = 0;
        for (String word: words) {
            if(this.isPalindrome(word.toLowerCase())){
                palindromeCounter++;
            }
        }
        return palindromeCounter;
    }
    private boolean isPalindrome(String word){
        char [] letters = word.toCharArray();
        int lastIndex = word.length()-1;
        int iterationsCount = lastIndex / 2;
        for (int i = 0, j = lastIndex; i <= iterationsCount; i++, j--) {
            if(letters[i] != letters[j]){
                return false;
            }
        }
        return true;
    }
}