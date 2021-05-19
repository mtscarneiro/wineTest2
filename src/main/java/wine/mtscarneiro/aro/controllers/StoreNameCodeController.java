package wine.mtscarneiro.aro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wine.mtscarneiro.aro.model.StoreNameCode;
import wine.mtscarneiro.aro.model.ZipCodeStore;
import wine.mtscarneiro.aro.services.StoreNameCodeService;

@RestController
public class StoreNameCodeController {

    @Autowired
    private StoreNameCodeService service;


    @GetMapping("/near-store/{id}")
    public ResponseEntity<StoreNameCode> getNearStore(@PathVariable Long id) {
        StoreNameCode storeName = this.service.findStoreName(id);

        return ResponseEntity.ok(storeName);
    }
}
