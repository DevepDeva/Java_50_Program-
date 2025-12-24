//Program for Implement a basic encryption and decryption algorithm


public class Encryption_Decryption {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (char character : plaintext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) (base + (character - base + shift) % 26);
            }
            ciphertext.append(character);
        }
        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        StringBuilder plaintext = new StringBuilder();
        for (char character : ciphertext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) (base + (character - base - shift + 26) % 26);
            }
            plaintext.append(character);
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {
        String originalMessage = "Hello World";
        int shiftKey = 3;

        // Encryption
        String encryptedMessage = encrypt(originalMessage, shiftKey);
        System.out.println("Original Message: " + originalMessage);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Decryption
        String decryptedMessage = decrypt(encryptedMessage, shiftKey);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}
