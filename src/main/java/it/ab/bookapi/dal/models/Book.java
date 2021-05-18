package it.ab.bookapi.dal.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_seq", allocationSize = 1)
    private Long id;
    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private LocalDateTime publishedAt;
    private LocalDateTime lastModified;
    private String pages;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    private String website;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "bookCategories",
            joinColumns = {
                    @JoinColumn(name = "book_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "category_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<Category> categories = new HashSet<>();
}
