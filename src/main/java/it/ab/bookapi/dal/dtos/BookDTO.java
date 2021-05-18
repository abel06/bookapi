package it.ab.bookapi.dal.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String id;
    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private LocalDateTime publishedAt;
    private LocalDateTime lastModified;
    private String pages;
    private String description;
    private String website;
    private List<CategoryDTO> categories = new ArrayList<>();
}