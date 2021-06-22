//concrete builder
public class ObreroEmployedBuilder extends EmployedBuilder {
    @Override
    public void buildTipo() {
        empleado.setTipo("Obrero");
    }

    @Override
    public void buildDireccion() {
        empleado.setTelefono("Av Dimsdale 156");
    }

    @Override
    public void buildTelefono() {
        empleado.setTelefono("92236324");
    }

    @Override
    public void buildContactos() {
        empleado.setDireccion("Lista de contactos de Obrero");
    }
}
