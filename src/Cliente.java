// clase director
public class Cliente {

    private EmployedBuilder empleadoBuilder;

    public void setEmpleadoBuilder(EmployedBuilder emp) {
        empleadoBuilder = emp;
    }

    public Employed getEmployed() {
        return empleadoBuilder.getEmployed();
    }

    public void construirEmpleado() {
        empleadoBuilder.crearNuevoEmpleado();
        empleadoBuilder.buildTipo();
        empleadoBuilder.buildTelefono();
        empleadoBuilder.buildDireccion();
        empleadoBuilder.buildContactos();

    }

}
