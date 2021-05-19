package wine.mtscarneiro.aro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wine.mtscarneiro.aro.entity.FindNearStore;

public interface FindNearStoreRepository extends JpaRepository<FindNearStore, Long> {
}
