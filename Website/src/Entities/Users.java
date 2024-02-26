package Entities;

import java.util.Date;
import java.util.Objects;

public class Users {
    private String nickname;
    private Date acessDate;

    public Users(String nickname, Date acessDate){
        this.nickname = nickname;
        this.acessDate = acessDate;
    }

    public String getNickname(){
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return Objects.equals(nickname, user.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

}
