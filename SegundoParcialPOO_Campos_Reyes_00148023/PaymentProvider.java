package SegundoParcialPOO_Campos_Reyes_00148023;

public class PaymentProvider {
    private String username;
    private String token;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Token: " + token;
    }

    public String getUsername() {
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }
}

