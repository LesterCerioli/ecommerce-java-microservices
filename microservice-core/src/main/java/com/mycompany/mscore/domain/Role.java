package com.mycompany.mscore.domain;

public class Role {

    private IList<UserRole> Users;

    public IList<UserRole> getUsers() {
        return Users;
    }

    public void setUsers(IList<UserRole> users) {
        Users = users;
    }
}
