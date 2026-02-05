import java.util.Random;

public class DeploymentStatusTracker {

    public static void main(String[] args) {
        String[] stages = {
            "Code Checkout",
            "Build",
            "Unit Tests",
            "Docker Image Build",
            "Deployment"
        };

        Random random = new Random();

        System.out.println("🚀 Deployment Started\n");

        for (String stage : stages) {
            boolean success = random.nextInt(10) > 2; // 80% success rate

            if (success) {
                System.out.println(stage + " : SUCCESS");
            } else {
                System.out.println(stage + " : FAILED");
                System.out.println("\n❌ Deployment stopped at: " + stage);
                return;
            }
        }

        System.out.println("\n✅ Deployment Completed Successfully");
    }
}
