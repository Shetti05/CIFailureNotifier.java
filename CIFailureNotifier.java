import java.util.Random;

public class CIFailureNotifier {

    public static void main(String[] args) {
        String[] stages = {"Build", "Test", "Deploy"};
        Random random = new Random();

        System.out.println("🚀 CI Pipeline Started\n");

        for (String stage : stages) {
            boolean success = random.nextBoolean();

            if (success) {
                System.out.println(stage + " stage: SUCCESS");
            } else {
                System.out.println(stage + " stage: FAILED");
                System.out.println("📢 Notification: Pipeline failed at " + stage);
                return;
            }
        }

        System.out.println("\n✅ Pipeline Completed Successfully");
    }
}
