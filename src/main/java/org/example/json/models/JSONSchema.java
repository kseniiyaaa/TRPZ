package org.example.json.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(schema = "jsonSchema")
public class JSONSchema {
    @Id
    @Column(name = "schema_id")
    private Long id;

    private String schemaName;

    @Lob
    private String schemaContent;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schema_id")
    private List<JSONProperty> properties;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schema_id")
    private List<History> history;
}
