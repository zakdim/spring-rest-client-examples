package guru.springframework.api.domain;

import java.util.List;

/**
 * Create by dmitri on 2022-10-02.
 */
public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
