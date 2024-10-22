package org.example.json.repositories;

import org.example.json.models.JSONSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JSONSchemaRepository extends JpaRepository<JSONSchema, Long> {
    //
}
