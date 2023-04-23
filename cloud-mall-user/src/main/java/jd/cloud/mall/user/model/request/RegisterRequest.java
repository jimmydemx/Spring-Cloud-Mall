package jd.cloud.mall.user.model.request;

import jakarta.validation.constraints.NotNull;

public class RegisterRequest {
    @NotNull(message = "username can't be null")
    private  String username;

    @NotNull(message = "password can't be null")
    private String password;

    @NotNull(message = "email can't be null")
    private String email;

    @NotNull(message = "verificationCode can't be null")
    private String verificationCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
