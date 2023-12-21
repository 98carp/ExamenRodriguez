package ec.edu.espe.examenRodriguez.dao;
import ec.edu.espe.examenRodriguez.domain.RegistroAsignatura;
import ec.edu.espe.examenRodriguez.domain.RegistroAsignaturaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroAsignaturaRepository extends JpaRepository<RegistroAsignatura, RegistroAsignaturaPK> {

}
