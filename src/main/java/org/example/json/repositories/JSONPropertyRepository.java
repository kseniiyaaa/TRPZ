package org.example.json.repositories;

import org.example.json.models.JSONProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JSONPropertyRepository extends JpaRepository<JSONProperty, Long> {
 //
}
