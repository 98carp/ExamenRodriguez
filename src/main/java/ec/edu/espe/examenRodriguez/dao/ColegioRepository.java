package ec.edu.espe.examenRodriguez.dao;
import ec.edu.espe.examenRodriguez.domain.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColegioRepository extends JpaRepository<Colegio,Integer> {

}
