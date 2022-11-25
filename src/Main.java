import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando....");
        Scanner scanner= new Scanner(System.in);
        Autonomos autonomo = new Autonomos();
        Sociedad suciedad = new Sociedad();
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Servicio servicio1 = new Servicio();
        Servicio servicio2 = new Servicio();
        InvoicePrinter imprimir = new InvoicePrinter();


        System.out.println("Epezamos creando un autonomo");
        System.out.println("Nombre:");
        autonomo.setNombre(scanner.nextLine());
        System.out.println("Apellido:");
        autonomo.setApellidos(scanner.nextLine());
        System.out.println("DNI:");
        autonomo.setDNI(scanner.nextLine());
        System.out.println("Direccion Postal:");
        autonomo.setDireccionPostal(scanner.nextLine());
        System.out.println("Poblacion:");
        autonomo.setPoblacion(scanner.nextLine());
        System.out.println("Provincia:");
        autonomo.setProvincia(scanner.nextLine());
        System.out.println("Email:");
        autonomo.setEmail(scanner.nextLine());
        System.out.println("Telefono:");
        autonomo.setTelefono(scanner.nextLine());

        System.out.println("Ahora creamos una sociedad");
        System.out.println("Razon Social:");
        suciedad.setNombre(scanner.nextLine());
        System.out.println("Cif:");
        suciedad.setCif(scanner.nextLine());
        System.out.println("Direccion Postal:");
        autonomo.setDireccionPostal(scanner.nextLine());
        System.out.println("Poblacion:");
        autonomo.setPoblacion(scanner.nextLine());
        System.out.println("Provincia:");
        autonomo.setProvincia(scanner.nextLine());
        System.out.println("Email:");
        autonomo.setEmail(scanner.nextLine());
        System.out.println("Telefono:");
        autonomo.setTelefono(scanner.nextLine());

        System.out.println("Creamos 2 productos");
        System.out.println("Codigo:");
        producto1.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nombre");
        producto1.setNombre(scanner.nextLine());
        System.out.println("Marca");
        producto1.setMarca(scanner.nextLine());
        System.out.println("Modelo");
        producto1.setModelo(scanner.nextLine());
        System.out.println("Precio:");
        producto1.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Tipo iva:");
        producto1.setTipo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("--------------------");
        System.out.println("Codigo:");
        producto2.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nombre");
        producto2.setNombre(scanner.nextLine());
        System.out.println("Marca");
        producto2.setMarca(scanner.nextLine());
        System.out.println("Modelo");
        producto2.setModelo(scanner.nextLine());
        System.out.println("Precio:");
        producto2.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Tipo iva:");
        producto2.setTipo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("a continuacion 2 servicios");
        System.out.println("Codigo:");
        servicio1.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nombre:");
        servicio1.setNombre(scanner.nextLine());
        System.out.println("Precio:");
        servicio1.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Tipo iva:");
        servicio1.setTipo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("--------------------");
        System.out.println("Codigo:");
        servicio2.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nombre:");
        servicio2.setNombre(scanner.nextLine());
        System.out.println("Precio:");
        servicio2.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Tipo iva:");
        servicio2.setTipo(scanner.nextInt());
        scanner.nextLine();

        Factura factura1 = new Factura(autonomo);
        Factura factura2 = new Factura(suciedad);
        ArrayList<Venta>fac1= new ArrayList<Venta>();
        fac1.add(producto1);
        fac1.add(servicio1);
        ArrayList<Venta>fac2= new ArrayList<Venta>();
        fac2.add(producto2);
        fac2.add(servicio2);

        System.out.println("vamos con la fatura 1");
        System.out.println("Codigo:");
        factura1.setCodigoFactura(scanner.nextInt());
        scanner.nextLine();
        factura1.setFecha(new Date());
        System.out.println("----------------------");
        System.out.println("Codigo:");
        factura2.setCodigoFactura(scanner.nextInt());
        scanner.nextLine();
        factura2.setFecha(new Date());

        System.out.println("Primera factura:");
        imprimir.print(factura1);
        System.out.println("Segunda factura:");
        imprimir.print(factura2);
    }
}