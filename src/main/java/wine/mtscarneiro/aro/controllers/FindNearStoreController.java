package wine.mtscarneiro.aro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wine.mtscarneiro.aro.entity.FindNearStore;
import wine.mtscarneiro.aro.services.FindNearStoreService;

@RestController
@RequestMapping(value = "/near-me")
public class FindNearStoreController {

    @Autowired
    private FindNearStoreService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FindNearStore> findIt(@PathVariable Long id) {
        FindNearStore obj = this.service.findIt(id);

        return ResponseEntity.ok(obj);
    }

}
