package pe.edu.cibertec.apirestmascotas.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apirestmascotas.model.bd.Mascota;
import pe.edu.cibertec.apirestmascotas.repository.MascotaRepository;

@AllArgsConstructor
@Service
public class MascotaService implements IMascotaService {
    private MascotaRepository mascotaRepository;

    @Override
    public Mascota registrarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
