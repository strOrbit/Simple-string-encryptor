public class Encryptor {
    public static int encrypt(String password) {
        if (password.contains(" "))
            throw new IllegalArgumentException("Password cannot contains space!");
        else if (password.length() <= 8)
            throw new IllegalArgumentException("Password must be contains 8 or above characters!");
        int encryptedValue = 0;
        for (char c : password.toCharArray()) {
            encryptedValue += c * 65536;

        }
        return encryptedValue;
    }
}
