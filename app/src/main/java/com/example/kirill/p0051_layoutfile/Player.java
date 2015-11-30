package com.example.kirill.p0051_layoutfile;

/**
 * Created by Kirill on 31.10.2015.
 */
public class Player {
    private String name;
    private String role;
    private Boolean currentRole;

    public void setCurrentRole(Boolean currentRole) {
        this.currentRole = currentRole;
    }

    public Boolean getCurrentRole() {

        return currentRole;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String role) {

        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
