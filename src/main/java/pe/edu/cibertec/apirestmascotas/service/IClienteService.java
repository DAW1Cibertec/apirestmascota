package pe.edu.cibertec.apirestmascotas.service;

import pe.edu.cibertec.apirestmascotas.model.bd.Cliente;
import pe.edu.cibertec.apirestmascotas.model.dto.ClienteRequestDto;

public interface IClienteService {
    Cliente registrarCliente(ClienteRequestDto clienteRequestDto);
}
