package support.excelUtils;

public enum Sheet {

    GENERIC_ERRORS("Generic errors"),
    TEST_DATA("Test Data"),
    EMAIL_TEMPLATES("Email templates"),
    SOCIAL_LOGIN("Social Login"),
    REGISTRATION_1("Registration 1"),
    REGISTRATION_2("Registration 2"),
    REGISTRATION_3("Registration 3"),
    REGISTRATION_4("Registration4"),
    REGISTRATION_5("Registration5"),
    RECONSENT("Reconsent"),
    VERIFICATION_PENDING("Verification Pending"),
    EDIT_PROFILE_MENU("Edt Profile Menu"),
    PERSONAL_INFORMATION("Personal information"),
    PROFESSIONAL_INFORMATION("Professional information"),
    MAIN_PRACTICE_INFORMATION("Main practice information"),
    COMMUNICATION_PREFERENCES("Comm. preferences"),
    CHANGE_EMAIL_AND_LOGIN("Change Email and Login"),
    CHANGE_PASSWORD("Change password"),
    DELETE_ONLINE_ACCOUNT("Delete Online Account"),
    DELETE_ONLINE_ACCOUNT_REQUESTED("Delete online account requested"),
    CONSENT_INFORMATION("Consent information"),
    PREFERENCE_CENTER("Preference Center"),
    FORGOT_PASSWORD("Forgot Password"),
    RESET_PASSWORD_SUCCESS("Reset Password Success"),
    RESET_PASSWORD_SUCCESSFULY("Reset Password Successfuly"),
    ACCOUNT_LINKING("Account Linking"),
    TOPICS("TOPICS"),
    ;


    private String value;

    Sheet(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}