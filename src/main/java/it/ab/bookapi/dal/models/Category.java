package it.ab.bookapi.dal.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "category",uniqueConstraints={@UniqueConstraint(columnNames={"name"})})

public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq_gen")
    @SequenceGenerator(name = "cat_seq_gen", sequenceName = "cat_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

}