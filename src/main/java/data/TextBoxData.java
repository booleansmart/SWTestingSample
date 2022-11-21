package data;

/**
 * @author Muhamad Hanif on 20/11/2022
 * @project SwTestingSampleAutomation
 */
public class TextBoxData {
    private String FullName;
    private String email;
    private String incorrectEmail;
    private String currentAddress;
    private String permanentAddress;

    public TextBoxData(String fullName, String email, String incorrectEmail, String currentAddress, String permanentAddress) {
        FullName = fullName;
        this.email = email;
        this.incorrectEmail = incorrectEmail;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getFullName() {
        return FullName;
    }

    public String getEmail() {
        return email;
    }

    public String getIncorrectEmail() {
        return incorrectEmail;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
