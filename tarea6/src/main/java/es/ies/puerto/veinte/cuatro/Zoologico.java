package es.ies.puerto.veinte.cuatro;
/**
 * Examen
 */
public class Zoologico {
    private int numeroAnimales;
    private String nombre;
    private Animal[] animales;
/**
 * Constructr por defecto
 */
    public Zoologico() {
        this.numeroAnimales = 0;
        animales = new Animal[5];
    }

    public Zoologico(String nombre) {
        this.nombre = nombre;
        numeroAnimales = 0;
        animales= new Animal[5];
    }

    public int getNumeroAnimales() {
        return this.numeroAnimales;
    }

    public void setNumeroAnimales(int numeroAnimales) {
        this.numeroAnimales = numeroAnimales;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal[] getAnimales() {
        return this.animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }


    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;
        mensaje += "\nAnimales:";
        for (Animal animal : animales) {
            if (animal != null) {
                mensaje += animal;
            }
        }
        return mensaje;
    }

    /**
     * Funcion para incluir un animal en al lista.
     * @param animal
     * @return
     */
    public boolean addAnimal(Animal animal){
        
        if (animal == null) {
            return false;
        }
        if (numeroAnimales >= animales.length) {
            return false;
        }
        
        animales[numeroAnimales] = animal;
        numeroAnimales++;
        return true;
    }

    /**
     * Constructor para eleminar un animal.
     * @param animalEliminar
     * @return
     */
    public boolean deleteAnimal(Animal animalEliminar){
        
        if (animalEliminar == null) {
            return false;
        }
        if (numeroAnimales == 0) {
            return false;
        }
/**
 * != distinto
 */
        for(int i = 0; i< animales.length; i++) {
            if (animales[i] != null) {
                if (animalEliminar.equals(animales[i])) {
                    System.out.println("iguales");
                    animales[i] = null;
                    numeroAnimales--;
                    return true;
                }
            }
        }

        for(int i = 0; i<animales.length - 1; i++){
            if (animales[i] == null) {
                animales[i] = animales[i+1];
                animales[i+1] = null;
            }
        }
        return false;
    }
}
