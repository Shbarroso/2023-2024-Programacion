package es.ies.puerto.model;

public interface OperacionsInterfazes {
    public boolean create(Persona persona);
    public boolean update(Persona persona);
    public boolean delete(Persona persona);
    public Persona search(Persona persona);
    public Persona search(String identificador);
}