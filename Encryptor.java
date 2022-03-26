public class Encryptor {
    public static int encrypt(String string) {
        int encryptedValue = 0;
        for (char c : string.toCharArray()) {
            encryptedValue += c * 65536;
        }
        return encryptedValue;
    }
}
