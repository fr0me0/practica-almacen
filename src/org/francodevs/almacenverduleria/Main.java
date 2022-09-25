package org.francodevs.almacenverduleria;

public class Main {

    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        productos[0] = new Fruta("Manzana", 450, 1000, "Roja");
        productos[1] = new Fruta("Manzana", 420, 1000, "Verde");
        productos[2] = new Limpieza("Skip", 560, "Pino", 1);
        productos[3] = new Limpieza("Lavandina", 330, "Cloro", 2);
        productos[4] = new Lacteo("Leche Descremada", 510, 1000, 900);
        productos[5] = new Lacteo("Casancrem", 420, 500, 1100);
        productos[6] = new NoPerecible("Sardinas", 980, 150, 1220);
        productos[7] = new NoPerecible("Duraznos Enlatados", 3536, 250, 2500);

        for (Producto prod : productos) {
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }

    }

}
