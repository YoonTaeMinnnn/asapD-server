package asapD.server.repository;


import asapD.server.domain.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {
    @Override
    Page<Store> findAll(Pageable pageable);
}