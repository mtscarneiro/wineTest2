package wine.mtscarneiro.aro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wine.mtscarneiro.aro.entity.FindNearStore;
import wine.mtscarneiro.aro.repositories.FindNearStoreRepository;
import wine.mtscarneiro.aro.services.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class FindNearStoreService {

    @Autowired
    private StoreNameCodeService storeNameCodeService;

    @Autowired
    private ZipCodeStoreService zipCodeStoreService;

    @Autowired
    private FindNearStoreRepository repository;

    public FindNearStore findIt(Long id) {
        storeNameCodeService.findStoreName(id);
        zipCodeStoreService.findZipCodeById(id);

        Optional<FindNearStore> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public List<FindNearStore> findAll() {
        return repository.findAll();
    }

    public FindNearStore findById(Long id) {
        Optional<FindNearStore> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public FindNearStore insert(FindNearStore obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void updateData(FindNearStore entity, FindNearStore obj) {
        entity.setZipCode(obj.getZipCode());
    }

    public FindNearStore update(Long id, FindNearStore obj) {
        FindNearStore entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

}
