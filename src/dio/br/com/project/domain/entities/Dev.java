package dio.br.com.project.domain.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private Integer id;
    private String name;
    private final Set<Content> registeredContents = new LinkedHashSet<>();
    private final Set<Content> completedContent = new LinkedHashSet<>();

    public Dev() {

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

    public Set<Content> getRegisteredContents() {
        return registeredContents;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getId(), dev.getId()) && Objects.equals(getName(), dev.getName()) && Objects.equals(getRegisteredContents(), dev.getRegisteredContents()) && Objects.equals(getCompletedContent(), dev.getCompletedContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getRegisteredContents(), getCompletedContent());
    }

    /**
     * Enrolls the developer in a given bootcamp.
     * <p>
     * Adds all content from the bootcamp to the developer's list of registered contents
     * and adds the developer to the bootcamp's list of enrolled developers.
     * </p>
     *
     * @param bootcamp the {@code Bootcamp} to enroll in
     */
    public void registerBootcamp(Bootcamp bootcamp) {
        this.registeredContents.addAll(bootcamp.getContent());
        bootcamp.getEnrolledDevs().add(this);
    }

    /**
     * Progresses the developer through the next available content.
     * <p>
     * Moves the first content from the registered contents list to the completed contents list.
     * If no content is available, prints an error message.
     * </p>
     */
    public void progressInContent() {
        Optional<Content> content = this.registeredContents.stream().findFirst();

        if (content.isPresent()) {
            this.completedContent.add(content.get());
            this.registeredContents.remove(content.get());
        } else {
            System.err.println("No content to progress");
        }
    }


    /**
     * Calculates the total XP (experience points) earned by the developer.
     * <p>
     * Sums the XP of all completed contents using each content's {@code calculateXp} method.
     * </p>
     *
     * @return the total XP earned as a {@code double}
     */
    public double calculateXp() {
        return this.completedContent
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }
}
