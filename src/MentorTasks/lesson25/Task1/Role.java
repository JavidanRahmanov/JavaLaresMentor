package MentorTasks.lesson25.Task1;

public class Role {

    private String roleName;
    private final int minAge;
    private final int maxAge;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public Role(String roleName, int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.roleName = roleName;
    }
}
