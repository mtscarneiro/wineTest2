package wine.mtscarneiro.aro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import wine.mtscarneiro.aro.model.StoreNameCode;

@Service
public class StoreNameCodeService {

    @Autowired
    private WebClient webClient;

    public StoreNameCode findStoreName(Long id) {

        Mono<StoreNameCode> monostore = this.webClient
                .method(HttpMethod.GET)
                .uri("/stores/{id}", id)
                .retrieve()
                .bodyToMono(StoreNameCode.class);

        StoreNameCode ns = monostore.block();
        assert ns != null;


        System.out.println(ns.getStoreCode());
        System.out.println(ns.getId());

        return ns;

    }
}
