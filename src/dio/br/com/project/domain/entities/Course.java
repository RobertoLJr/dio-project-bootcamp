package dio.br.com.project.domain.entities;

public class Course extends Content {
    private double courseDuration;

    public Course() {
        super();
    }

    public double getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(double courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }

    @Override
    public double calculateXp() {
        return BASE_XP * courseDuration;
    }
}
