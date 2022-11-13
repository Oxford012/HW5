public class Employee {
    private String name;
    private int employeeId;
    private Department department;
    public Employee(){

    }

    public void setDepartment(Department dep){      // jedem Employee kann genau ein Department zugeordnet werden, in einem Department können 0 bis unendlich viele Employee sein
        this.department = dep;                      // Wenn Department gelöscht wird, bleibt Student erhalten
    }
}
