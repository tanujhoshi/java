


class Funct{
public static boolean areAllVowels(String str) {
        str = str.toLowerCase(); 
        for (char c : str.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        System.out.println(areAllVowels("aeiou"));  
        System.out.println(areAllVowels("hello"));  
        System.out.println(areAllVowels("AEIOU"));  
    }
}

