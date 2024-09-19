
package almacen;

import java.util.ArrayList;


public class Almacen {

    
    public static void main(String[] args) {
        ArrayList listadoCelulares = new ArrayList();
        Celular mC = new Celular("xaxa", "Samsung", "Gris", 256, "S24+");
        
        //Agregar celular
        listadoCelulares.add(mC);
        //Nuevo celular
        mC = new Celular("yaya", "Redmi", "Rojo", 256, "Note10");
        listadoCelulares.add(mC);
        System.out.println("Numero de celulares: " + listadoCelulares.size());
        
        for (int i = 0; i < listadoCelulares.size(); i++) {
            Celular celTem = (Celular)listadoCelulares.get(i);
            System.out.println(celTem.toString());
            
        }
        System.out.println("Despues de eliminar");
        for (int i = 0; i < listadoCelulares.size(); i++) {
            Celular celTem = (Celular)listadoCelulares.get(i);
           if(celTem.getMarca().equals("Redmi")){
               listadoCelulares.remove(i);
           }
   }
        for (int i = 0; i < listadoCelulares.size(); i++) {
            Celular celTem = (Celular)listadoCelulares.get(i);
            System.out.println(celTem.toString());
            
        }
        //Eliminando por almacenamiento 
        for (int i = 0; i < listadoCelulares.size(); i++) {
            Celular celAlm = (Celular)listadoCelulares.get(i);
            if(celAlm.getAlmacenamiento() >= 200){
                listadoCelulares.remove(i);
                System.out.println("Eliminado: " + celAlm.getMarca());
                i--;
            }
            
        }
      
            
   }
}
