package br.com.suganame.certification_nlw.modules.students.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.suganame.certification_nlw.modules.students.entities.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {
    public Optional<StudentEntity> findByEmail(String email);
}
