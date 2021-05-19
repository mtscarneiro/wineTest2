package wine.mtscarneiro.aro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import wine.mtscarneiro.aro.entity.FindNearStore;
import wine.mtscarneiro.aro.model.StoreNameCode;
import wine.mtscarneiro.aro.repositories.FindNearStoreRepository;
import wine.mtscarneiro.aro.services.ZipCodeStoreService;
import wine.mtscarneiro.aro.services.StoreNameCodeService;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private FindNearStoreRepository findNearStoreRepository;

    @Autowired
    private ZipCodeStoreService zipCodeStoreService;

    @Autowired
    private StoreNameCodeService storeNameCodeService;


    @Override
    public void run(String... args) throws Exception {
        FindNearStore f1 = new FindNearStore(null, 105000, "");

        f1.setNearStoreName(storeNameCodeService.findStoreName(1L).getStoreCode());

        findNearStoreRepository.save(f1);
    }
}
