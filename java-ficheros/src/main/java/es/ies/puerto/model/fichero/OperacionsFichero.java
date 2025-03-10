package es.ies.puerto.model.fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.model.OperacionsInterfazes;
import es.ies.puerto.model.Persona;

public class OperacionsFichero implements OperacionsInterfazes{

    File fichero;
    String path = "/home/dam/Descargas/java-ficheros/src/main/resources/archivo.txt";

    public OperacionsFichero(){
        fichero = new File(path);
        if (!fichero.exists() || !fichero.isFile()) {
            throw new IllegalArgumentException("El recurso no es de tipo fichero: "+path);
        }
    }

    @Override
    public boolean create(Persona persona) {
        if (persona == null || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(fichero);
        if (personas.contains(persona)) {
            return false;
        }
       return create(persona.toString(), fichero);
    }

    private boolean create(String data,File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine(); 
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private Set<Persona> read(File file) {
        Set<Persona> personas = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayLine =  line.split(",");
                Persona persona = new Persona(arrayLine[0], arrayLine[1], Long.valueOf(arrayLine[2]));
                personas.add(persona);

            }
        } catch (IOException e) {
            return new HashSet<>();
        }
        return personas;
    }

    @Override
    public boolean update(Persona persona) {
        if (persona == null || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(fichero);
        if (!personas.contains(persona)) {
            return false;
        }
        for (Persona personaBuscada : personas) {
            if (personaBuscada.equals(persona)) {
                personas.remove(personaBuscada);
                personas.add(persona);
                return updateFile(personas, fichero);
            }
        }
        return false;
    }

    private boolean updateFile(Set<Persona> personas, File file){
        String path = file.getAbsolutePath();
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }
        for (Persona persona : personas) {
            create(persona);
        }
        return true;
    }

    @Override
    public boolean delete(Persona persona) {
        if (persona == null || persona.getIdentificador() == null) {
            return false;
        }
        Set<Persona> personas = read(fichero);
        if (!personas.contains(persona)) {
            return false;
        }
        for (Persona personaBuscada : personas) {
            if (personaBuscada.equals(persona)) {
                personas.remove(personaBuscada);
                return updateFile(personas, fichero);
            }
        }
        return false;
    }

    @Override
    public Persona search(Persona persona) {
        if (persona == null) {
            return persona;
        }
        Set<Persona> personas = read(fichero);
        for (Persona personaBuscar : personas) {
            if (personaBuscar.equals(persona)) {
                return personaBuscar;
            }
        }
        return persona;
    }

    @Override
    public Persona search(String identificador) {
        if (identificador == null || identificador.isEmpty()) {
            return null;
        }
        Persona persona = new Persona(identificador);
        return search(persona);
    }
    
}
