
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

class LoginTracker {

    private static class Attempt {
        int count;
        long firstAttemptTime;

        Attempt() {
            this.count = 1;
            this.firstAttemptTime = System.currentTimeMillis();
        }
    }

    // Thread-safe map for storing user login attempts
    private ConcurrentHashMap<String, Attempt> loginAttempts = new ConcurrentHashMap<>();
    private static final int MAX_ATTEMPTS = 3;
    private static final long LOCK_WINDOW = TimeUnit.MINUTES.toMillis(10);

    // Call this method on every login attempt
    public boolean loginFailed(String username) {
        loginAttempts.compute(username, (key, attempt) -> {
            long now = System.currentTimeMillis();
            if (attempt == null || now - attempt.firstAttemptTime > LOCK_WINDOW) {
                // Reset attempts after 10 minutes
                return new Attempt();
            } else {
                attempt.count++;
                return attempt;
            }
        });

        // Check if account should be locked
        Attempt attempt = loginAttempts.get(username);
        if (attempt.count >= MAX_ATTEMPTS) {
            System.out.println("Account for " + username + " is temporarily locked!");
            return false; // locked
        }
        return true; // allowed to attempt login
    }
}

public class LoginAttemptTraccker {
    public static void main(String[] args) throws InterruptedException {
        LoginTracker tracker = new LoginTracker();

        // Simulating failed login attempts
        tracker.loginFailed("shahbaz"); // 1
        tracker.loginFailed("shahbaz"); // 2
        tracker.loginFailed("shahbaz"); // 3 → locked
        tracker.loginFailed("shahbaz"); // still locked
    }
}
