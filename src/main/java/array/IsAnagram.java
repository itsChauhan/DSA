package array;

public class IsAnagram {


    public static void main(String[] args) {
        System.out.println(isAnagram("goo", "foog"));
    }


    public static boolean isAnagram(String s, String t) {
        if(s == null && t ==null)
            return true;

        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length())
            return false;

        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        for(char c : s.toCharArray()){
            sFreq[c-'a']++;
        }

        for(char c : t.toCharArray()){
            tFreq[c-'a']++;
        }


        for(int i = 0;i< 26;i++){
            if(tFreq[i]!=sFreq[i]){
                return false;
            }
        }

        return true;
    }
}
