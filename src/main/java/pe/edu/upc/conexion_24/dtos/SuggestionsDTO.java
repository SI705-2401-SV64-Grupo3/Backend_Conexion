package pe.edu.upc.conexion_24.dtos;

import pe.edu.upc.conexion_24.entities.Users;

public class SuggestionsDTO {
    private Long id;
    private Users users;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
