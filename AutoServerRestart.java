import java.util.Random;

public class AutoServerRestart {

    public static void main(String[] args) {
        Random random = new Random();

        boolean serverHealthy = random.nextBoolean();

        System.out.println("🖥️ Server Health Check\n");

        if (serverHealthy) {
            System.out.println("✅ Server is running normally");
        } else {
            System.out.println("❌ Server DOWN!");
            System.out.println("🔄 Restarting server...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Restart interrupted");
            }

            System.out.println("✅ Server restarted successfully");
        }
    }
}
