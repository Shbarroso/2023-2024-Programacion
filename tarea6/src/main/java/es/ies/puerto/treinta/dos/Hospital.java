package es.ies.puerto.treinta.dos;

import java.util.Arrays;

public class Hospital {
    private String nombre;
    private int numPaciente;
    private Paciente[] pacientes;

    public Hospital() {
        numPaciente = 0;
        pacientes = new Paciente[5];
    }

    public Hospital(String nombre) {
        this.nombre = nombre;
        numPaciente = 0;
        pacientes = new Paciente[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPaciente() {
        return numPaciente;
    }

    public void setNumPaciente(int numPaciente) {
        this.numPaciente = numPaciente;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public boolean addPaciente(Paciente paciente){
        if (paciente == null){
            return false;
        }
        if (numPaciente >= pacientes.length){
            return false;
        }
        pacientes[numPaciente] = paciente;
        numPaciente++;
        return true;
    }

    public boolean deletePaciente(Paciente paciente){
        if (paciente == null){
            return false;
        }
        if (numPaciente == 0){
            return false;
        }

        for (int i = 0; i < pacientes.length; i++) {
            if (paciente.equals(pacientes[i])) {
                pacientes[i] = null;
                numPaciente--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre;
        for (int i = 0; i<numPaciente; i++){
            mensaje += pacientes[i];
        }
        return mensaje;
    }
}
