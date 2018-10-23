package seedu.address.model.account;

/**
 * Account class represents a single Account that comprises of a username,
 * password, and role associated with an account.
 */
public class Account {
    public static final String USERNAME_CONSTRAINT = "Username cannot be empty.";
    public static final String PASSWORD_CONSTRAINT = "Password cannot be empty.";
    public static final String ROLE_CONSTRAINT = "Role is not specified.";

    private String username;
    private String password;
    private Role role;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = Role.READ_ONLY_USER;
    }

    public Account(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    /**
     * An Account is equal to another Account if both of them have the
     * same username and password.
     * @param other Other Account to compare
     * @return true if both Accounts are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Account)) {
            return false;
        }

        Account otherAccount = (Account) other;
        return otherAccount.getUserName().equalsIgnoreCase(this.username)
                && otherAccount.getPassword().equals(this.password);
    }
}