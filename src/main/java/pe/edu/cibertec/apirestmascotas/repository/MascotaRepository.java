package pe.edu.cibertec.apirestmascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apirestmascotas.model.bd.Mascota;

@Repository
public interface MascotaRepository
        extends JpaRepository<Mascota, Integer> {
}
