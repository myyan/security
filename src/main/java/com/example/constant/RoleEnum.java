package com.example.constant;

/**
 * created by heiqie on 2017/3/20.
 */

public enum RoleEnum {

    GENERAL(1, "USER"),
    MANAGER(2, "USER");

    private int code;
    private String role;

    RoleEnum(int code, String role) {
        this.code = code;
        this.role = role;
    }

    public int getCode() {
        return code;
    }


    public String getRole() {
        return role;
    }


    private static Integer roleOf(String role) {
        for (RoleEnum roleEnum : values()) {
            if (roleEnum.getRole().equals(role)) {
                return roleEnum.getCode();
            }
        }
        return null;
    }
}
