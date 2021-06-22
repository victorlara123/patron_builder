//concrete builder
public class GerenteEmployedBuilder extends EmployedBuilder {

    @Override
    public void buildTipo() {
        empleado.setTipo("Gerente");
    }

    @Override
    public void buildDireccion() {
        empleado.setTelefono("Av siempre viva 242");
    }

    @Override
    public void buildTelefono() {
        empleado.setTelefono("92236323");
    }

    @Override
    public void buildContactos() {
        empleado.setDireccion("Lista de contactos de Gerente");
    }
}
