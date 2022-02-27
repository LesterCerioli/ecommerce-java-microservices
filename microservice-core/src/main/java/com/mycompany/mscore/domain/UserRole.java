package com.mycompany.mscore.domain;

public class UserRoleModel {

    public User user;

    public Role Role;

    //public override long UserId { get; set; }

    //public override long RoleId { get; set; }


    public User getUser() {
        return user;
    }

    public com.mycompany.mscore.domain.Role getRole() {
        return Role;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRole(com.mycompany.mscore.domain.Role role) {
        Role = role;
    }
}
