public class Caesar {
    private String plainText;
    private int shift;

    public Caesar(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }

    public String getPlainText(){
        return plainText;
    }

    public int getShift(){
        return shift;
    }

    public static String encrypt(String plainText, int shift){
        if(shift > 26){
            shift = shift % 26;
        } else if (shift < 0){
            shift = (shift % 26) + 26;
        }

        String cipherText = "";
        int length = plainText.length();
        for(int i = 0; i < length; i++){
            char character = plainText.charAt(i);
            if(Character.isLetter(character)){
                if(Character.isLowerCase(character)){
                    char ch = (char)(character + shift);
                    if(ch > 'z'){
                        cipherText += (char)(character - (26 - shift));
                    } else {
                        cipherText += ch;
                    }
                } else if (Character.isUpperCase(character)){
                    char ch = (char)(character + shift);
                    if(ch > 'Z'){
                        cipherText += (char)(character - (26 - shift));
                    } else {
                        cipherText += ch;
                    }
                }
            } else {
                cipherText += character;
            }
        }
        return cipherText;
    }

    public static String decrypt(String plainText, int shift){
        if(shift > 26){
            shift = shift % 26;
        } else if (shift < 0){
            shift = (shift % 26) + 26;
        }

        String cipherText = "";
        int length = plainText.length();
        for(int i = 0; i < length; i++){
            char character = plainText.charAt(i);
            if(Character.isLetter(character)){
                if(Character.isLowerCase(character)){
                    char ch = (char)(character - shift);
                    if(ch < 'a'){
                        cipherText += (char)(character + (26 - shift));
                    } else {
                        cipherText += ch;
                    }
                } else if (Character.isUpperCase(character)){
                    char ch = (char)(character - shift);
                    if(ch < 'A'){
                        cipherText += (char)(character + (26 - shift));
                    } else {
                        cipherText += ch;
                    }
                }
            } else {
                cipherText += character;
            }
        }
        return cipherText;
    }

}
