package dio.br.com.project.domain.entities;

public abstract class Content {
    protected static final double BASE_XP = 10.0;

    private Integer id;
    private String title;
    private String description;

    public Content() {
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

    /**
     * Calculates the total XP (experience points) earned for this content.
     * <p>
     * Each subclass must provide its own implementation of this method,
     * typically returning {@code BASE_XP} plus an additional amount specific to the content type.
     * </p>
     *
     * @return the total XP earned, as a {@code double}
     */
    public abstract double calculateXp();
}
