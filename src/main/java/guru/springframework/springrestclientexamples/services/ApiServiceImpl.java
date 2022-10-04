package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.jsonplaceholder.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Create by dmitri on 2022-10-02.
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @Override
//    public List<User> getUsers(Integer limit) {
//
//        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
//        return userData.getData();
//    }

    @Override
    public List<User> getUsers() {
        User[] userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);

        return Arrays.asList(userData);
    }
}
