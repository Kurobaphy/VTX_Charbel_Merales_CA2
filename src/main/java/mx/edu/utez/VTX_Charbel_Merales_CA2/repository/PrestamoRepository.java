package mx.edu.utez.VTX_Charbel_Merales_CA2.repository;

import mx.edu.utez.VTX_Charbel_Merales_CA2.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    List<Prestamo> findByVidejuegoId(Long videojuegoId);
}