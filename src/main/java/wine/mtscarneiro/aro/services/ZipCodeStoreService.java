package wine.mtscarneiro.aro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import wine.mtscarneiro.aro.model.ZipCodeStore;

@Service
public class ZipCodeStoreService {

    @Autowired
    private WebClient webClient;

    public ZipCodeStore findZipCodeById(Long id) {

        Mono<ZipCodeStore> monostore = this.webClient
                .method(HttpMethod.GET)
                .uri("/zip/{id}", id)
                .retrieve()
                .bodyToMono(ZipCodeStore.class);

        ZipCodeStore ns = monostore.block();
        ZipCodeStore n = new ZipCodeStore();

        assert ns != null;
        System.out.println("Loja N " + ns.getId());
        System.out.println("startZip " + ns.getStartZip());
        System.out.println("endZip " + ns.getEndZip());

        n.setEndZip(ns.getEndZip());
        n.setStartZip(ns.getStartZip());

        return ns;
    }
}
