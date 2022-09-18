package asapD.server.repository;

import asapD.server.domain.Item;
import asapD.server.domain.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>{

    @EntityGraph(attributePaths = {"store"})
    Page<Item> findAll(Pageable pageable);
}