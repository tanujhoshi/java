
class EH7 {
    public static void checkVowels(String input) throws Exception {
        boolean hasVowels = false;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowels = true;
                break;
            }
        }
        if (!hasVowels) {
            throw new Exception("The string does not contain vowels: " + input);
        }
        System.out.println("The string contains vowels: " + input);
    }

    public static void main(String[] args) {
        try {
            checkVowels("Hello World");
            checkVowels("qwrtypsdfghjklzxcvbnm");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
