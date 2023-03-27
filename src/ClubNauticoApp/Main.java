package ClubNauticoApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // Construyedo las zonas del Club Nautico

        ZonaClubNautico zona1 = new ZonaClubNautico("A", "Velero", 5, 10F, 12F);
        ZonaClubNautico zona2 = new ZonaClubNautico("B", "Yate", 10, 15F, 25F);
        ZonaClubNautico zona3 = new ZonaClubNautico("C", "Lancha", 15, 8F, 5F);

        ArrayList<ZonaClubNautico> zonaClubNauticos = new ArrayList<>();
        zonaClubNauticos.add(zona1);
        zonaClubNauticos.add(zona2);
        zonaClubNauticos.add(zona3);

        // Construyendo los Amarres

        Amarre amarre1 = new Amarre(1, 232f, 20f, false);
        Amarre amarre2 = new Amarre(2, 350f, 32f, true);
        Amarre amarre3 = new Amarre(3, 120f, 13f, false);

        ArrayList <Amarre> amarres = new ArrayList<>();
        amarres.add(amarre1);
        amarres.add(amarre2);
        amarres.add(amarre3);

        // Construyendo las Embarcaciones

        Embarcacion embarcacion1 = new Embarcacion("AAAAAA","La Pinta", "Yate", 30.20F, 1);
        Embarcacion embarcacion2 = new Embarcacion("BBBBBB","La Niña", "Yate", 33.12F, 2);
        Embarcacion embarcacion3 = new Embarcacion("CCCCCC","La Santa María", "Yate", 33.50F, 3);

        ArrayList<Embarcacion> embaraciones = new ArrayList<>();
        embaraciones.add(embarcacion1);
        embaraciones.add(embarcacion2);
        embaraciones.add(embarcacion3);


        // Construyendo los empleados

        Empleado empleado1 = new Empleado(1, "Daniel", "Calle Calzada de Castro, 50, 1-12", 642531938, "Mecánico");
        Empleado empleado2 = new Empleado(2, "Antonio", "Calle Granada, 15, 2-10", 689089055, "Mantenimiento General");
        Empleado empleado3 = new Empleado(3, "Celia", " C. Javier Sanz, 15", 950156151, "Instructor" );

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

         // Contruyendo el socio

        Socio socio1 = new Socio("Sandra", "Calle Estrella, 14", "78322452T", 643339723, "16-02-2023");

        // Construyendo objetos de la clase SocioCompraAmarre

        SocioCompraAmarre socio1CompraAmarre1 = new SocioCompraAmarre("16-02-2023", socio1, amarre1);
        SocioCompraAmarre socio1CompraAmarre2 = new SocioCompraAmarre("20-07-2023", socio1, amarre2);
        SocioCompraAmarre socio1CompraAmarre3 = new SocioCompraAmarre("25-07-2023", socio1, amarre3);

        ArrayList<SocioCompraAmarre> socio1CompraAmarres = new ArrayList<>();
        socio1CompraAmarres.add(socio1CompraAmarre1);
        socio1CompraAmarres.add(socio1CompraAmarre2);
        socio1CompraAmarres.add(socio1CompraAmarre3);

        // Construyendo objetos de la clase EmbarcacionOcupaAmarre

        EmbarcacionOcupaAmarre embarcacion1OcupaAmarre1 = new EmbarcacionOcupaAmarre("30-03-2023", embarcacion1, amarre1);
        EmbarcacionOcupaAmarre embarcacion2OcupaAmarre2 = new EmbarcacionOcupaAmarre("28-04-2023", embarcacion2, amarre2);
        EmbarcacionOcupaAmarre embarcacion3OcupaAmarre3 = new EmbarcacionOcupaAmarre("28-04-2023", embarcacion3, amarre3);

        ArrayList<EmbarcacionOcupaAmarre> embarcacion1OcupaAmarres = new ArrayList<>();
        embarcacion1OcupaAmarres.add(embarcacion1OcupaAmarre1);

        ArrayList<EmbarcacionOcupaAmarre> embarcacion2OcupaAmarres = new ArrayList<>();
        embarcacion2OcupaAmarres.add(embarcacion2OcupaAmarre2);

        ArrayList<EmbarcacionOcupaAmarre> embarcacion3OcupaAmarres = new ArrayList<>();
        embarcacion3OcupaAmarres.add(embarcacion3OcupaAmarre3);

        System.out.println("\nFecha de compra del amarre: "+socio1CompraAmarres.get(0).fechaCompraAmarre+"\nNombre del Socio: "+socio1CompraAmarres.get(0).socio.nombre+"\nDNI: "+socio1CompraAmarres.get(1).socio.dni
        +"\nDirección: "+socio1CompraAmarres.get(0).socio.direccion+"\nTeléfono: "+socio1CompraAmarres.get(0).socio.telefono+"\nFecha de ingreso al club: "+socio1CompraAmarres.get(0).socio.fechaIngresoClub);

        System.out.println("\nFecha de compra del amarre: "+socio1CompraAmarres.get(1).fechaCompraAmarre+"\nNombre del Socio: "+socio1CompraAmarres.get(1).socio.nombre+"\nDNI: "+socio1CompraAmarres.get(1).socio.dni
                +"\nDirección: "+socio1CompraAmarres.get(1).socio.direccion+"\nTeléfono: "+socio1CompraAmarres.get(1).socio.telefono+"\nFecha de ingreso al club: "+socio1CompraAmarres.get(1).socio.fechaIngresoClub);

        System.out.println("\nFecha de compra del amarre: "+socio1CompraAmarres.get(2).fechaCompraAmarre+"\nNombre del Socio: "+socio1CompraAmarres.get(2).socio.nombre+"\nDNI: "+socio1CompraAmarres.get(2).socio.dni
                +"\nDirección: "+socio1CompraAmarres.get(2).socio.direccion+"\nTeléfono: "+socio1CompraAmarres.get(2).socio.telefono+"\nFecha de ingreso al club: "+socio1CompraAmarres.get(2).socio.fechaIngresoClub);


    }
}
