package pe.edu.cibertec.apirestmascotas.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmascota;
    private String nombremascota;
    private Integer edad;
    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;
}
