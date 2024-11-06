package es.ies.puerto.treinta.dos;

/**
 * Falta listar a los pacientes.
 */
public class Ejercicio32 {
    static Paciente paciente;
    static Paciente paciente2;
    static Hospital hospital;

    public static void main(String[] args) {
        paciente = new Paciente("H","H");
        paciente2 = new Paciente("F","K");
        hospital = new Hospital("H");

        hospital.addPaciente(paciente);
        hospital.addPaciente(paciente2);
        System.out.println(hospital);
        hospital.deletePaciente(paciente2);
        System.out.println(hospital);
    }
}
