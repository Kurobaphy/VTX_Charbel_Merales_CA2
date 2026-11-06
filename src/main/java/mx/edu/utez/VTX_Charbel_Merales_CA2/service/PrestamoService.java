package mx.edu.utez.VTX_Charbel_Merales_CA2.service;

import mx.edu.utez.VTX_Charbel_Merales_CA2.model.Prestamo;
import mx.edu.utez.VTX_Charbel_Merales_CA2.repository.PrestamoRepository;
import mx.edu.utez.VTX_Charbel_Merales_CA2.repository.VideojuegoRepository;



public class PrestamoService {

    private final PrestamoRepository prestamoRepository;
    private final VideojuegoRepository videojuegoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository, VideojuegoRepository videojuegoRepository) {
        this.prestamoRepository = prestamoRepository;
        this.videojuegoRepository = videojuegoRepository;
    }









}
