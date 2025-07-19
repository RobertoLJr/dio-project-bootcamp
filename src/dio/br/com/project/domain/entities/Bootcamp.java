package dio.br.com.project.domain.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private Integer id;
    private String name;
    private String description;
    private final LocalDate startingDate = LocalDate.now();
    private final LocalDate endingDate = LocalDate.now().plusDays(45);
    private final Set<Dev> enrolledDevs = new HashSet<>();
    private final Set<Content> content = new LinkedHashSet<>();

    public Bootcamp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public Set<Dev> getEnrolledDevs() {
        return enrolledDevs;
    }

    public Set<Content> getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getId(), bootcamp.getId()) && Objects.equals(getName(), bootcamp.getName()) && Objects.equals(getDescription(), bootcamp.getDescription()) && Objects.equals(getStartingDate(), bootcamp.getStartingDate()) && Objects.equals(getEndingDate(), bootcamp.getEndingDate()) && Objects.equals(getEnrolledDevs(), bootcamp.getEnrolledDevs()) && Objects.equals(getContent(), bootcamp.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getStartingDate(), getEndingDate(), getEnrolledDevs(), getContent());
    }
}
