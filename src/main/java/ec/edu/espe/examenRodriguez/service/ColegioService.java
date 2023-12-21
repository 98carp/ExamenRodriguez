package ec.edu.espe.examenRodriguez.service;

import ec.edu.espe.examenRodriguez.dao.ColegioRepository;
import ec.edu.espe.examenRodriguez.domain.Colegio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColegioService {
    private final ColegioRepository colegioRepository;

    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }
    public Colegio crearColegio(Colegio colegio){
        return this.colegioRepository.save(colegio);
    }
    public List<Colegio> encontrarColegiosPorPatron(String colegioPatron){
        return this.colegioRepository.findColegiosByNombreLike(colegioPatron);
    }

}
