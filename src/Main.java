import controller.FacturacionController;
import controller.ProveedorController;
import model.Factura;
import model.Proveedor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        FacturacionController controlador = new FacturacionController();
        FacturacionController controlador = FacturacionController.getInstancia();
        ProveedorController proveedorControlador = ProveedorController.getInstancia();


////        SE OBTIENE FACTURAS - PROVEEDORES CREADOS - PRODUCTOS
        controlador.getFacturas();
        proveedorControlador.getProveedores();
        controlador.getProductos();


//      LOGICA FACTURAS POR FECHA Y PROVEEDOR

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {
            fecha = sdf.parse("01/01/2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String cuitProveedor = "12-34567844-9";
//        ArrayList<Factura> facturasFiltradas = controlador.facturaPorFechaYProveedor(fecha, cuitProveedor);
        controlador.facturaPorFechaYProveedor(fecha, cuitProveedor);




        //    LOGICA OBTENER ORDENES DE PAGO
        controlador.getOrdenesDePago();

        //    LOGICA OBTENER RECIBOS DE PAGO
        controlador.getRecibosDePago();


//        TRAER ORDENES DE COMPRA
        controlador.obtenerOrdenesDeCompra();
//        controlador.obtenerOrdenDeCompra("JUANITA");

        controlador.getCompulsaPreciosPorProducto("Producto 1");

        double deuda = controlador.calcularDeudaPorProveedor("12-34567844-9");
        System.out.println("---------------------");
        System.out.println("Deuda por Proveedor con CUIT: 12-34567844-9 " +  "$" + deuda);

        double deuda1 = controlador.calcularDeudaPorProveedor("98-51765432-1");
        System.out.println("---------------------");
        System.out.println("Deuda por Proveedor con CUIT: 98-51765432-1 " + "$" +deuda1);

        double deuda2 = controlador.calcularDeudaPorProveedor("20-39644562-0");
        System.out.println("---------------------");
        System.out.println("Deuda por Proveedor con CUIT: 98-51765432-1 " + "$" +deuda2);
    }

}
