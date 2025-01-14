package ma.enset.hospital.repositories;

import ma.enset.hospital.entities.Medecin;
import ma.enset.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);

}
