package org.example.json.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "validationError")
public class ValidationError {
    @Id
    private Long id;

    @Column(name = "schema_id")
    private Long schemaId;

    private String errorMessage;
    private String propertyPath;


    @ManyToOne
    @JoinColumn(name = "json_schema_id")
    private JSONSchema jsonSchema;
}
