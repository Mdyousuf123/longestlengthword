package src;

class Yousuf {

    /**Below method will find the longest word    */

    static String LongestWordWithLength(String str)
    {
        String[] words = str.split(" "); // parsing in to array and then do traversal in below for loop
        int length = 0;

        String s1 = "";
    /**
    * Traversing happens below
    */
        for(String word:words){
            if(length < word.length()){
                length = word.length();
                s1=word;
            }
        }
        return s1;
    }

    public static void main(String args[])
    {
        String str = "The cow jumped over the moon";

        String answer = LongestWordWithLength(str);

        System.out.println(answer.length());
        System.out.println(answer);

    }
}

