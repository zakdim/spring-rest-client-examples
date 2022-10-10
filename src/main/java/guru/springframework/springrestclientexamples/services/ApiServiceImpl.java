package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.jsonplaceholder.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * Create by dmitri on 2022-10-02.
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    private final String apiUrl;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

//    @Override
//    public List<User> getUsers(Integer limit) {
//
//        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
//        return userData.getData();
//    }

    /**
     * Limit parameter is ignore. Test endpoint for users always returns 10 entries
     * @param limit
     * @return
     */
    @Override
    public List<User> getUsers(Integer limit /* ignore */) {

        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(apiUrl)
                .queryParam("limit", limit);

        User[] userData = restTemplate.getForObject(uriBuilder.toUriString(), User[].class);

        return Arrays.asList(userData);
    }
}
