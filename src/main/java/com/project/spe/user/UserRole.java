package com.project.spe.user;

public enum UserRole {
    ADMIN("admin"),
    PORTEIRO("porteiro");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
