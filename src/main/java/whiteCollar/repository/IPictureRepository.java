package whiteCollar.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import whiteCollar.entity.Picture;
import whiteCollar.entity.Shop;

import java.util.List;

/**
 * Interface de la capa Repository, extiende JpaRepository
 *
 */
@Repository
@Transactional
public interface IPictureRepository extends JpaRepository<Picture, Long> {
    List<Picture> findPicturesByShop(Shop shop);
}
