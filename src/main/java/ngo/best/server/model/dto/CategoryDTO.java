package ngo.best.server.model.dto;

/**
 * @author Ioana
 */

public class CategoryDTO {

    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
