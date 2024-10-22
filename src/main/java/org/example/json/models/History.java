package org.example.json.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(schema = "validationError")
public class History {
    @Id
    private Long id;

    private String schemaVersion;
    private String changeDescription;
    private Date changeDate;

    @ManyToOne
    @JoinColumn(name = "schema_id")
    private JSONSchema jsonSchema;
}
