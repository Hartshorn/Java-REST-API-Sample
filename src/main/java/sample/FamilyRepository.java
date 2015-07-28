package sample;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/** 
 * The family repository interface extends a Spring Data 
 * PagingAndSortingRepository interface, showing off the power of the framework:
 * the implementation is done for us - we need only describe the kinds of 
 * methods we want.
 */
@RepositoryRestResource(collectionResourceRel = "family", path = "family")
public interface FamilyRepository extends PagingAndSortingRepository<Family, Long> {

	List<Person> findByLastName(@Param("name") String name);
}