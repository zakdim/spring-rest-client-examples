package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.jsonplaceholder.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
//    List<User> getUsers();

    Flux<User> getUsers(Mono<Integer> limit);
}
