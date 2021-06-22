// clase principal

public class App {
    public static void main(String[] args) throws Exception {
        Cliente emplead = new Cliente(); // Director
        EmployedBuilder gerente_empleado_builder = new GerenteEmployedBuilder();
        EmployedBuilder obrero_empleado_builder = new ObreroEmployedBuilder();

        emplead.setEmpleadoBuilder(gerente_empleado_builder);
        emplead.construirEmpleado();

        Employed empleado = emplead.getEmployed();

        System.out.println(empleado.toString());

    }
}
