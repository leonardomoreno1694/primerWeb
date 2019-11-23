package repository;
import org.springframework.data.repository.CrudRepository;
import models.Persona;

public interface personaRepository extends CrudRepository<Persona,Integer>
{
	
}
