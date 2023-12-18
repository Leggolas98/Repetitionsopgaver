public class PasswordValidator {
    int minLength = 8;
    int maxLength = 20;
    boolean numbersRequired;

    public PasswordValidator(int minLength, int maxLength, boolean numbersRequired) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid(String password) {
        if (minLength >= 8 || maxLength <= 20 || numbersRequired == true) {
            System.out.println("Password is valid");
            return true;
        } else {
            System.out.println("Password is invalid");
            return false;
        }
    }
}

