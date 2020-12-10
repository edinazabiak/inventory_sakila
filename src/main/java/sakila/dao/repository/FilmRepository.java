package sakila.dao.repository;

import org.springframework.data.repository.CrudRepository;
import sakila.dao.entity.FilmEntity;
import sakila.dao.entity.LanguageEntity;

import java.util.Collection;
import java.util.Optional;

public interface FilmRepository extends CrudRepository<FilmEntity, Integer> {
    Optional<FilmEntity> findById(Integer integer);

    Collection<FilmEntity> findByTitle(String title);
    Collection<FilmEntity> findByTitleAndDescriptionAndReleaseYearAndRentalDurationAndRentalRateAndLengthAndReplacementCostAndSpecialFeatures(
            String title, String description, int releaseYear, int rentalDuration,
            double rentalRate, int length, double replacementCost, String specialFeatures);
}
