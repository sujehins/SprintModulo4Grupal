package org.example.sistema;

import org.example.Interfas.Asesoria;
import org.example.curso.Capacitacion;
import org.example.model.persona.Administrativo;
import org.example.model.persona.Cliente;
import org.example.model.persona.Profesional;
import org.example.model.persona.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {

    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        asesorias = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public Contenedor(List<Asesoria> asesorias, List<Capacitacion> capacitaciones) {
        this.asesorias = asesorias;
        this.capacitaciones = capacitaciones;
    }

    public List<Asesoria> getAsesorias() {
        return asesorias;
    }

    public void setAsesorias(List<Asesoria> asesorias) {
        this.asesorias = asesorias;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public void almacenarCliente(Cliente cliente){
        asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional){
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo){
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion){
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(int usuarioRut) {
        Iterator<Asesoria> iterator = asesorias.iterator();
        while (iterator.hasNext()) {
            Asesoria asesoria = iterator.next();
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (usuario.getRut() == usuarioRut) {
                    iterator.remove();
                    System.out.println("Usuario eliminado exitosamente.");
                    return;
                }
            }
        }
        System.out.println("No se encontró un usuario con el RUT especificado.");
    }



    public void mostrarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            System.out.println(asesoria.toString());
            if (asesoria instanceof Cliente) {
                Cliente cliente = (Cliente) asesoria;
                String edadCliente = cliente.mostrarEdad(cliente.getFechaNacimiento());
                System.out.println(edadCliente);
            }
        }
    }
    public void mostrarUsuariosPorTipo(int tipoUsuario) {
        if (tipoUsuario == 1) {
            System.out.println("Clientes:");
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Cliente) {
                    Cliente cliente = (Cliente) asesoria;
                    System.out.println(cliente.toString());
                }
            }
        } else if (tipoUsuario == 2) {
            System.out.println("Profesionales:");
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Profesional) {
                    Profesional profesional = (Profesional) asesoria;
                    System.out.println(profesional.toString());
                }
            }
        } else if (tipoUsuario == 3) {
            System.out.println("Administrativos:");
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Administrativo) {
                    Administrativo administrativo = (Administrativo) asesoria;
                    System.out.println(administrativo.toString());
                }
            }
        } else {
            System.out.println("Tipo de usuario no válido.");
        }
    }

    public void mostrarClientes() {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Cliente) {
                Cliente cliente = (Cliente) asesoria;
                System.out.println(cliente.toString());
            }
        }
    }
    public void mostrarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion.toString());
        }
    }
}
