package app.dto;

public class UserDTO {
    private final Long id;
    private final String username;

    public UserDTO(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() { return id; }
    public String getUsername() { return username; }
}
