
//abstract builder
public abstract class EmployedBuilder {
    protected Employed empleado;

    public Employed getEmployed() {
        return empleado;
    }

    public void crearNuevoEmpleado() {
        empleado = new Employed();
    }

    public abstract void buildTipo();

    public abstract void buildDireccion();

    public abstract void buildTelefono();

    public abstract void buildContactos();

}
