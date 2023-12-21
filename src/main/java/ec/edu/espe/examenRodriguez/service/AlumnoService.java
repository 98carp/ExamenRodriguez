package ec.edu.espe.examenRodriguez.service;

import ec.edu.espe.examenRodriguez.dao.AlumnoRepository;
import ec.edu.espe.examenRodriguez.domain.Alumno;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    private  final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;

    }

    public Alumno crearAlumno(Alumno alumno){

        return this.alumnoRepository.save(alumno);
    }



}
