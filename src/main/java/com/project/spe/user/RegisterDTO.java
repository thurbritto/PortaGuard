package com.project.spe.user;

public record RegisterDTO(String login, String password, UserRole role, String nome, Long cpf, String email) {
}
