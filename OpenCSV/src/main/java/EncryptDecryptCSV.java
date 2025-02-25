import com.opencsv.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.*;
import java.util.Base64;

public class EncryptDecryptCSV {
    private static final String KEY = "1234567812345678"; // 16-char secret key

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(KEY.getBytes(), "AES"));
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }

    public static String decrypt(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(KEY.getBytes(), "AES"));
        return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
    }

    public static void writeEncryptedCSV(String filePath) throws Exception {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"});
            String[] employee1 = {"101", "Alice", encrypt("alice@example.com"), encrypt("70000")};
            String[] employee2 = {"102", "Bob", encrypt("bob@example.com"), encrypt("80000")};
            writer.writeNext(employee1);
            writer.writeNext(employee2);
        }
    }

    public static void readDecryptedCSV(String filePath) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            for (String[] row : records) {
                if (!row[0].equals("ID")) { // Skip header
                    row[2] = decrypt(row[2]); // Decrypt Email
                    row[3] = decrypt(row[3]); // Decrypt Salary
                }
                System.out.println(Arrays.toString(row));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String filePath = "openCSV/src/main/resources/employees_encrypted.csv";
        writeEncryptedCSV(filePath);
        System.out.println("Encrypted CSV written successfully.");
        System.out.println("Reading and decrypting CSV:");
        readDecryptedCSV(filePath);
    }
}
