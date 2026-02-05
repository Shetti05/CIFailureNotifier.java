import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogHealthChecker {

    public static void main(String[] args) {
        String logFile = "app.log";

        int error = 0, warn = 0, info = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("ERROR")) error++;
                else if (line.contains("WARN")) warn++;
                else if (line.contains("INFO")) info++;
            }

            System.out.println("📄 Log Health Report\n");
            System.out.println("INFO  : " + info);
            System.out.println("WARN  : " + warn);
            System.out.println("ERROR : " + error);

            if (error > 5) {
                System.out.println("\n⚠️ Application Status: UNSTABLE");
            } else {
                System.out.println("\n✅ Application Status: STABLE");
            }

        } catch (IOException e) {
            System.out.println("Log file not found!");
        }
    }
}
