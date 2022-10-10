package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.jsonplaceholder.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

//    @Test
//    public void testGetUsers() throws Exception {
//
//        List<User> users = apiService.getUsers(3);
//
//        assertEquals(4, users.size());
//    }
//
    @Test
    public void getUsers() {

        List<User> users = apiService.getUsers(10); // limit is ignore, test service always returns 10 objects

        assertEquals(10, users.size());
    }
}