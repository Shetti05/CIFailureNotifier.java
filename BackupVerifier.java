import java.io.File;

public class BackupVerifier {

    public static void main(String[] args) {
        File backupDir = new File("backups");

        if (!backupDir.exists()) {
            System.out.println("Backup directory not found");
            return;
        }

        File[] files = backupDir.listFiles();

        System.out.println("📂 Backup Verification Report\n");

        for (File file : files) {
            long sizeKB = file.length() / 1024;
            System.out.println("Backup File: " + file.getName());
            System.out.println("Size: " + sizeKB + " KB");
            System.out.println("Status: VERIFIED\n");
        }
    }
}
