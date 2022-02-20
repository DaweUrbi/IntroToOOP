package encapsulation;

public class User {
    private String username;
    private String sin;

    public User(String username, String sin) {
        this.username = username;
        this.sin = sin;
    }
    // cmd + n : generate
    public String getUsername() {
        return username;
    }

    public boolean isSameUser(User other) {
        return generateId().equals(other.generateId());
    }

    // 'private method' - this is just a helper method and only being used in this class.
    private String generateId() {
        return sin + "!!" + username + "&&";
    }
}