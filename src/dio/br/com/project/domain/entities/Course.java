package dio.br.com.project.domain.entities;

public class Course {
    private Integer id;
    private String title;
    private String description;
    private Double courseDuration;

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(Double courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }
}
