package org.example.json.repositories;

import org.example.json.models.ValidationError;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationErrorRepository extends JpaRepository<ValidationError, Long> {
   //
}
