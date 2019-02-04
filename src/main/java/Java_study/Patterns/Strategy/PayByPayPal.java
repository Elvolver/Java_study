package Java_study.Patterns.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean singedIn;

    static {
        DATA_BASE.put("123", "elvolver@mail.ru");
        DATA_BASE.put("321", "qwerty@mail.ru");
    }

    public void setSingedIn(boolean singedIn) {
        this.singedIn = singedIn;
    }

    private boolean verify() {
        setSingedIn(email.equals(DATA_BASE.get(password)));
        return singedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (singedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!singedIn) {
                System.out.println("Enter the user`s email: ");
                email = READER.readLine();
                System.out.println("Enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
