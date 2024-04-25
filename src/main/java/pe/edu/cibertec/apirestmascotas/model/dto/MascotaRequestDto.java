package pe.edu.cibertec.apirestmascotas.model.dto;

import lombok.Data;

@Data
public class MascotaRequestDto {
    private String nombremascota;
    private Integer edad;
}
