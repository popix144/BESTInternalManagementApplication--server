package ngo.best.server.model.dto;

/**
 * @author Ioana
 */

public class RoleDTO {

    private String name;

    public RoleDTO() {
    }

    public RoleDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
