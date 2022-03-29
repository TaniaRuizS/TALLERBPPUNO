package co.com.choucair.refdos;

import co.com.choucair.refdos.model.Cliente;
import co.com.choucair.refdos.model.Compras;
import co.com.choucair.refdos.model.Persona;

import java.util.Arrays;

/**
 * Clase encargada de imprimir los objetos persona y cliente
 */
public class Imprimir {
    public static void main (String [] args) {
        Cliente cliente = new Cliente();
        cliente.setEstadoCivil("Soltero");
        cliente.setCantHermanos(4);
        cliente.setCantHijos(3);
        cliente.setNombreMadre("Patricia Restrepo");
        cliente.setNombrePadre("Jesus Zapata");

        Compras compra1 = new Compras();
        compra1.setCantProducto(8);
        compra1.setNombrePoducto("Arroz");
        cliente.setComprasList(Arrays.asList(compra1));

        Persona persona = new Persona();
        persona.setNombre("Tania");
        persona.setPrimerApellido("Ruiz");
        persona.setSegundoApellido("Sanchez");
        persona.setNumeroDeDocumento(123456789);

        imprimirInformacionPersonal(persona);
        impTodaInfoCliente(cliente);
    }

    /**
     * Metodo encargado de imprimir el objeto persona
     * @param persona
     */
    public static void imprimirInformacionPersonal(Persona persona) {
        System.out.println("Informacion personal");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido 1: " + persona.getPrimerApellido());
        System.out.println("Apellido 2: " + persona.getSegundoApellido());
        System.out.println("Numero de documento: " + persona.getNumeroDeDocumento());
    }

    public static void impTodaInfoCliente(Cliente cliente){
        System.out.println("Informacion del cliente");
        System.out.println("Estado civil: "+ cliente.getEstadoCivil());
        System.out.println("Cantidad de hijos: "+ cliente.getCantHijos());
        System.out.println("Cantidad de hermanos: "+ cliente.getCantHermanos());
        System.out.println("Nombre del padre: "+ cliente.getNombrePadre());
        System.out.println("Nombre de la madre: "+ cliente.getNombreMadre());
        System.out.println("Informacion de las compras");

        for (Compras comprasLocal : cliente.getComprasList()) {
            System.out.println("Cantidad de productos: "+ comprasLocal.getCantProducto());
            System.out.println("Nombre del producto: "+ comprasLocal.getNombrePoducto());
        }
    }
}
