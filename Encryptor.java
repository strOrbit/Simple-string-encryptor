public class Encryptor {
    public static int encrypt(String password) {
        int encryptedValue = 0;
        for (char c : password.toCharArray()) {
            encryptedValue += c * 65536;

        }
        return encryptedValue;
    }
}
