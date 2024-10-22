package org.example.json.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "jsonProperty")
public class JSONProperty {
    @Id
    private Long id;

    private String propertyName;
    private String description;
    private String example;
    private String dataType;
    private String format;

    @ManyToOne
    @JoinColumn(name = "schema_id")
    private JSONSchema jsonSchema;
}
