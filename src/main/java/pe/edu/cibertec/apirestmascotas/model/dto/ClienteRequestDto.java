package pe.edu.cibertec.apirestmascotas.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClienteRequestDto {
    private String nombrecliente;
    private String apellidocliente;
    private List<MascotaRequestDto> mascotas = new ArrayList<>();
}
