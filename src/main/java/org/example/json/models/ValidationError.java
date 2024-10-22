package org.example.json.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "validationError")
public class ValidationError {
    @Id
    private Long id;

    private String errorMessage;
    private String propertyPath;


    @ManyToOne
    @JoinColumn(name = "schema_id")
    private JSONSchema jsonSchema;
}
