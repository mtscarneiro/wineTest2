package wine.mtscarneiro.aro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wine.mtscarneiro.aro.model.ZipCodeStore;
import wine.mtscarneiro.aro.services.ZipCodeStoreService;

@RestController
public class ZipCodeStoreController {

    @Autowired
    private ZipCodeStoreService storeService;

    @GetMapping("/zip-near-store/{id}")
    public ResponseEntity<ZipCodeStore> getZipCodeStore(@PathVariable Long id) {
        ZipCodeStore zipCodeStore = this.storeService.findZipCodeById(id);

        return ResponseEntity.ok(zipCodeStore);
    }
}
