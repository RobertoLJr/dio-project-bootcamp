package dio.br.com.project.domain.entities;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate date;

    public Mentorship() {
        super();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public double calculateXp() {
        return BASE_XP + 20;
    }
}
