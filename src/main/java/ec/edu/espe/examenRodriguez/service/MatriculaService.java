package ec.edu.espe.examenRodriguez.service;

import ec.edu.espe.examenRodriguez.dao.AlumnoRepository;
import ec.edu.espe.examenRodriguez.dao.AsignaturaRepository;
import ec.edu.espe.examenRodriguez.domain.Alumno;
import ec.edu.espe.examenRodriguez.domain.RegistroAsignatura;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {
    private final AlumnoRepository alumnoRepository;
    private final AsignaturaRepository asignaturaRepository;

    public MatriculaService(AlumnoRepository alumnoRepository, AsignaturaRepository asignaturaRepository) {
        this.alumnoRepository = alumnoRepository;
        this.asignaturaRepository = asignaturaRepository;
    }
    public RegistroAsignatura asignaEstudiante(Integer alumnoCode, Integer asignaturaCode){
        RegistroAsignatura registroAsignatura=new RegistroAsignatura();
        return registroAsignatura;
    }

}
