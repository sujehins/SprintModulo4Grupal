package org.example;

import org.example.curso.Capacitacion;
import org.example.model.persona.Administrativo;
import org.example.model.persona.Cliente;
import org.example.model.persona.Profesional;
import org.example.sistema.Contenedor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Clase Principal, haremos funcionar esto
        Scanner scannerDeDatos = new Scanner(System.in);
        Contenedor contenedor = new Contenedor();
        int opcionIngresada;
        do {
            System.out.println(" ******************************* ");
            System.out.println("1.- Almacenar un cliente");
            System.out.println("2.- Almacenar un profesional");
            System.out.println("3.- Almacenar un administrativo");
            System.out.println("4.- Almacenar una capacitación");
            System.out.println("5.- Eliminar un usuario");
            System.out.println("6.- Listar usuarios");
            System.out.println("7.- Listar usuarios según tipo");
            System.out.println("8.- Listar las capacitaciones");
            System.out.println("9.- Salir del programa");
            System.out.println(" ******************************* ");
            System.out.print("Por favor, ingrese una opción: ");
            opcionIngresada = scannerDeDatos.nextInt();
            scannerDeDatos.nextLine();
            System.out.print("La opción ingresada es: " + opcionIngresada);

            switch (opcionIngresada) {
                case 1:
                    System.out.println(" ** Creando un nuevo Cliente **");
                    String nombreDeCliente = "";
                    do {
                        System.out.println("Por favor, ingrese el nombre del cliente:"); /// aqui quise ingresar como un minimo de 1 caracter. Para nombres muy chicos
                        nombreDeCliente = scannerDeDatos.nextLine().trim();
                        if (nombreDeCliente.length() < 1 || nombreDeCliente.length() > 50) {
                            System.out.println("El nombre debe tener al menos 1 carácter y un máximo de 50 caracteres.");
                        }
                    } while (nombreDeCliente.length() < 1 || nombreDeCliente.length() > 50);
                    String fechaDeNacimientoCliente = "";
                    String formatoFecha = "dd/MM/yyyy";
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFecha);
                    boolean fechaValida = false;

                    do {
                        System.out.println("Por favor, ingrese la fecha de nacimiento del cliente (formato DD/MM/AAAA):");
                        fechaDeNacimientoCliente = scannerDeDatos.nextLine().trim();

                        // Validar el formato de la fecha utilizando expresiones regulares
                        if (!fechaDeNacimientoCliente.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            System.out.println("El formato de fecha ingresado no es válido. Debe ser DD/MM/AAAA.");
                            continue;
                        }

                        try {
                            // Validar si la fecha se puede parsear correctamente utilizando el formateador
                            LocalDate.parse(fechaDeNacimientoCliente, formatter);
                            fechaValida = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("La fecha ingresada no es válida. Asegúrese de que sea una fecha existente.");
                        }
                    } while (!fechaValida);
                    int rutDelCliente = 0;
                    boolean rutValido = false;

                    do {
                        System.out.println("Por favor, ingrese el RUT del cliente (formato sin puntos ni guión):");
                        rutDelCliente = scannerDeDatos.nextInt();

                        if (rutDelCliente < 0 || rutDelCliente >= 99999999) {
                            System.out.println("El RUT ingresado no es válido. Debe ser un número entre 0 y 99,999,998.");
                        } else {
                            rutValido = true;
                        }
                    } while (!rutValido);
                    scannerDeDatos.nextLine();
                    String segundoNombre = "";
                    boolean nombreValido = false;

                    do {
                        System.out.print("Ingresa tu segundo nombre: ");
                        segundoNombre = scannerDeDatos.nextLine();

                        if (segundoNombre.length() < 1 || segundoNombre.length() > 50) {
                            System.out.println("El segundo nombre debe tener entre 1 y 50 caracteres.");
                        } else {
                            nombreValido = true;
                        }
                    } while (!nombreValido);
                    String apellido1 = "";
                    boolean apellidoValido = false;

                    do {
                        System.out.print("Ingresa tu primer apellido: ");
                        apellido1 = scannerDeDatos.nextLine();

                        if (apellido1.length() < 1 || apellido1.length() > 50) {
                            System.out.println("El primer apellido debe tener entre 1 y 50 caracteres.");
                        } else {
                            apellidoValido = true;
                        }
                    } while (!apellidoValido);
                    String apellido2 = "";
                    boolean apellidoValido2 = false;

                    while (!apellidoValido) {
                        System.out.print("Ingresa tu segundo apellido: ");
                        apellido2 = scannerDeDatos.nextLine();

                        if (apellido2.length() < 1 || apellido2.length() > 50) {
                            System.out.println("El segundo apellido debe tener entre 1 y 50 caracteres.");
                        } else {
                            apellidoValido2 = true;
                        }
                    }

                    int telefono = 0;
                    boolean telefonoValido = false;

                    while (!telefonoValido) {
                        System.out.print("Ingresa tu número de teléfono: ");
                        String telefonoStr = scannerDeDatos.nextLine();

                        if (telefonoStr.isEmpty()) {
                            System.out.println("El número de teléfono es obligatorio. Por favor, ingrésalo.");
                        } else {
                            try {
                                telefono = Integer.parseInt(telefonoStr);
                                telefonoValido = true;
                            } catch (NumberFormatException e) {
                                System.out.println("El número de teléfono debe ser un valor numérico. Por favor, ingrésalo nuevamente.");
                            }
                        }
                    }


                    String nombreAFP = "";

                    while (nombreAFP.length() < 4 || nombreAFP.length() > 30) {
                        System.out.print("Ingrese el nombre de la AFP (entre 4 y 30 caracteres): ");
                        nombreAFP = scannerDeDatos.nextLine();

                        if (nombreAFP.length() < 4 || nombreAFP.length() > 30) {
                            System.out.println("El nombre de la AFP debe tener entre 4 y 30 caracteres. Por favor, ingréselo nuevamente.");
                        }
                    }

                    int sistemaSalud = 0;

                    while (sistemaSalud < 1 || sistemaSalud > 2) {
                        System.out.print("Ingrese Sistema de Salud (1-Fonasa / 2-Isapre): ");
                        sistemaSalud = scannerDeDatos.nextInt();

                        if (sistemaSalud < 1 || sistemaSalud > 2) {
                            System.out.println("El valor del Sistema de Salud debe ser 1 (Fonasa) o 2 (Isapre). Por favor, ingréselo nuevamente.");
                        }
                    }

                    scannerDeDatos.nextLine();
                    String direccion = "";

                    while (direccion.length() > 70 || direccion.isEmpty()) {
                        System.out.print("Ingrese dirección (máximo 70 caracteres): ");
                        direccion = scannerDeDatos.nextLine();

                        if (direccion.length() > 70) {
                            System.out.println("La dirección ingresada excede el límite de caracteres permitidos. Por favor, ingrésela nuevamente.");
                        } else if (direccion.isEmpty()) {
                            System.out.println("Debe ingresar una dirección. Por favor, ingrésela nuevamente.");
                        }
                    }

                    String comuna = "";

                    while (comuna.length() > 50 || comuna.isEmpty()) {
                        System.out.print("Ingrese comuna (máximo 50 caracteres): ");
                        comuna = scannerDeDatos.nextLine();

                        if (comuna.length() > 50) {
                            System.out.println("La comuna ingresada excede el límite de caracteres permitidos. Por favor, ingrésela nuevamente.");
                        } else if (comuna.isEmpty()) {
                            System.out.println("Debe ingresar una comuna. Por favor, ingrésela nuevamente.");
                        }
                    }

                    Cliente clienteNuevo = new Cliente(nombreDeCliente, fechaDeNacimientoCliente, rutDelCliente,segundoNombre,apellido1,apellido2,telefono, nombreAFP,sistemaSalud,direccion,comuna);

                    contenedor.almacenarCliente(clienteNuevo);
                    break;
                case 2:
                    System.out.println(" ** Creando un nuevo Profesional **");
                    String nombreDeProfesional = "";

                    while (nombreDeProfesional.length() < 1 || nombreDeProfesional.length() > 50) {
                        System.out.print("Ingrese el nombre del profesional (entre 1 y 50 caracteres): ");
                        nombreDeProfesional = scannerDeDatos.nextLine();

                        if (nombreDeProfesional.length() < 1) {
                            System.out.println("Debe ingresar al menos 1 caracter. Por favor, ingréselo nuevamente.");
                        } else if (nombreDeProfesional.length() > 50) {
                            System.out.println("El nombre ingresado excede el límite de caracteres permitidos. Por favor, ingréselo nuevamente.");
                        }
                    }
                    String fechaDeNacimientoProfesional = "";
                    while (!fechaDeNacimientoProfesional.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        System.out.print("Ingrese la fecha de nacimiento del profesional (formato DD/MM/AAAA): ");
                        fechaDeNacimientoProfesional = scannerDeDatos.nextLine();

                        if (!fechaDeNacimientoProfesional.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            System.out.println("Formato de fecha incorrecto. Por favor, ingréselo nuevamente en el formato DD/MM/AAAA.");
                        }
                    }
                    int rutDelProfesional = 0;
                    while (rutDelProfesional <= 0 || rutDelProfesional >= 99999999) {
                        System.out.print("Ingrese el rut del profesional (menor a 99.999.999): ");
                        rutDelProfesional = scannerDeDatos.nextInt();

                        if (rutDelProfesional <= 0 || rutDelProfesional >= 99999999) {
                            System.out.println("El rut ingresado no cumple con el rango esperado. Por favor, ingréselo nuevamente.");
                        }
                    }
                    // Error
                    String titulo = "";
                    do {
                        System.out.print("Ingrese el título (entre 10 y 50 caracteres): ");
                        titulo = scannerDeDatos.nextLine();

                        if (titulo.length() < 10 || titulo.length() > 50) {
                            System.out.println("El título ingresado no cumple con la longitud esperada. Por favor, ingréselo nuevamente.");
                        }
                    } while (titulo.length() < 10 || titulo.length() > 50);

                    String fechatitulacion = "";
                    do {
                        System.out.print("Ingrese la fecha de titulación (formato DD/MM/AAAA): ");
                        fechatitulacion = scannerDeDatos.nextLine();

                        // Validar el formato de la fecha utilizando una expresión regular
                        if (!fechatitulacion.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            System.out.println("El formato de la fecha de titulación es incorrecto. Por favor, ingrésela nuevamente.");
                        }
                    } while (!fechatitulacion.matches("\\d{2}/\\d{2}/\\d{4}"));
                    ////String nombre, String fechaNacimiento, int rut, String titulo, String fechaIngreso
                    Profesional profesional = new Profesional(nombreDeProfesional, fechaDeNacimientoProfesional, rutDelProfesional, titulo, fechatitulacion);
                    contenedor.almacenarProfesional(profesional);
                    break;
                case 3:
                    System.out.println(" ** Creando un nuevo Administrativo **");
                    String nombreDeAdministrativo = "";

                    do {
                        System.out.print("Ingrese el nombre del administrativo (entre 1 y 50 caracteres): ");
                        nombreDeAdministrativo = scannerDeDatos.nextLine();

                        if (nombreDeAdministrativo.length() < 1 || nombreDeAdministrativo.length() > 50) {
                            System.out.println("El nombre del administrativo debe tener entre 1 y 50 caracteres. Por favor, ingréselo nuevamente.");
                        }
                    } while (nombreDeAdministrativo.length() < 1 || nombreDeAdministrativo.length() > 50);

                    String fechaDeAdministrativo = "";

                    do {
                        System.out.print("Ingrese la fecha de nacimiento del administrativo (formato DD/MM/AAAA): ");
                        fechaDeAdministrativo = scannerDeDatos.nextLine();

                        if (!fechaDeAdministrativo.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            System.out.println("El formato de la fecha debe ser DD/MM/AAAA. Por favor, ingréselo nuevamente.");
                        }
                    } while (!fechaDeAdministrativo.matches("\\d{2}/\\d{2}/\\d{4}"));

                    int rutDelAdministrativo = 0;

                    do {
                        System.out.print("Ingrese el RUT del administrativo (menor a 99.999.999): ");
                        rutDelAdministrativo = scannerDeDatos.nextInt();

                        if (rutDelAdministrativo >= 99999999) {
                            System.out.println("El RUT debe ser menor a 99.999.999. Por favor, ingréselo nuevamente.");
                        }
                    } while (rutDelAdministrativo >= 99999999);


                    String areaAdministrativo = "";

                    do {
                        System.out.print("Ingrese el área del administrativo (entre 5 y 20 caracteres): ");
                        areaAdministrativo = scannerDeDatos.nextLine();

                        if (areaAdministrativo.length() < 5 || areaAdministrativo.length() > 20) {
                            System.out.println("El área debe tener entre 5 y 20 caracteres. Por favor, ingrésela nuevamente.");
                        }
                    } while (areaAdministrativo.length() < 5 || areaAdministrativo.length() > 20);

                    String anoExperiencia = "";

                    do {
                        System.out.print("Ingrese los años de experiencia (máximo 100 caracteres): ");
                        anoExperiencia = scannerDeDatos.nextLine();

                        if (anoExperiencia.length() > 100) {
                            System.out.println("Los años de experiencia deben tener máximo 100 caracteres. Por favor, ingréselos nuevamente.");
                        }
                    } while (anoExperiencia.length() > 100);

                    Administrativo administrativo = new Administrativo(nombreDeAdministrativo, fechaDeAdministrativo, rutDelAdministrativo, areaAdministrativo, anoExperiencia);
                    contenedor.almacenarAdministrativo(administrativo);
                    break;
                case 4:
                    System.out.print("** Creacion de una Capacitacion **");
                    ///int identificador, int rutCliente, String dia, int hora, String lugar, int duracion, int asistentes
                    int identificadorCapacitacion = 0;

                    do {
                        System.out.print("Ingrese el identificador de la capacitación: ");
                        while (!scannerDeDatos.hasNextInt()) {
                            System.out.println("El identificador de la capacitación debe ser un número entero. Por favor, ingréselo nuevamente.");
                            scannerDeDatos.next(); // Limpiar el búfer de entrada
                        }
                        identificadorCapacitacion = scannerDeDatos.nextInt();

                        if (identificadorCapacitacion <= 0) {
                            System.out.println("El identificador de la capacitación debe ser un número entero positivo. Por favor, ingréselo nuevamente.");
                        }
                    } while (identificadorCapacitacion <= 0);

                    int rutCapacitacion = 0;

                    do {
                        System.out.print("Ingrese el número de rut de la capacitación: ");
                        while (!scannerDeDatos.hasNextInt()) {
                            System.out.println("El número de rut debe ser un número entero. Por favor, ingréselo nuevamente.");
                            scannerDeDatos.next(); // Limpiar el búfer de entrada
                        }
                        rutCapacitacion = scannerDeDatos.nextInt();

                        if (rutCapacitacion <= 0) {
                            System.out.println("El número de rut debe ser un número entero positivo. Por favor, ingréselo nuevamente.");
                        }
                    } while (rutCapacitacion <= 0);

                    scannerDeDatos.nextLine();
                    String diaCapacitacion = "";

                    do {
                        System.out.print("Ingrese el día de la capacitación (lunes a domingo): ");
                        diaCapacitacion = scannerDeDatos.nextLine();

                        if (!diaCapacitacion.equalsIgnoreCase("lunes") && !diaCapacitacion.equalsIgnoreCase("martes")
                                && !diaCapacitacion.equalsIgnoreCase("miércoles") && !diaCapacitacion.equalsIgnoreCase("jueves")
                                && !diaCapacitacion.equalsIgnoreCase("viernes") && !diaCapacitacion.equalsIgnoreCase("sábado")
                                && !diaCapacitacion.equalsIgnoreCase("domingo")) {
                            System.out.println("El día de la capacitación debe ser un valor permitido entre 'lunes' y 'domingo'.");
                        }
                    } while (!diaCapacitacion.equalsIgnoreCase("lunes") && !diaCapacitacion.equalsIgnoreCase("martes")
                            && !diaCapacitacion.equalsIgnoreCase("miércoles") && !diaCapacitacion.equalsIgnoreCase("jueves")
                            && !diaCapacitacion.equalsIgnoreCase("viernes") && !diaCapacitacion.equalsIgnoreCase("sábado")
                            && !diaCapacitacion.equalsIgnoreCase("domingo"));

                    String horaCapacitacion = "";

                    do {
                        System.out.print("Ingrese la hora de la capacitación en formato HH/MM: ");
                        horaCapacitacion = scannerDeDatos.nextLine();

                        // Verificar si la hora de capacitación tiene el formato correcto (dos dígitos para la hora y dos dígitos para los minutos)
                        if (!horaCapacitacion.matches("^\\d{2}:\\d{2}$")) {
                            System.out.println("El formato de hora de la capacitación debe ser HH/MM.");
                        }
                    } while (!horaCapacitacion.matches("^\\d{2}:\\d{2}$"));

                    String lugarCapacitacion = "";

                    do {
                        System.out.print("Ingrese el lugar de la capacitación (entre 10 y 50 caracteres): ");
                        lugarCapacitacion = scannerDeDatos.nextLine();

                        // Verificar si el lugar de la capacitación cumple con el mínimo y máximo de caracteres
                        if (lugarCapacitacion.length() < 10 || lugarCapacitacion.length() > 50) {
                            System.out.println("El lugar de la capacitación debe tener entre 10 y 50 caracteres.");
                        }
                    } while (lugarCapacitacion.length() < 10 || lugarCapacitacion.length() > 50);

                    int duracionCapacitacion = 0;

                    do {
                        System.out.print("Ingrese la duración de la capacitación (en minutos): ");
                        duracionCapacitacion = scannerDeDatos.nextInt();

                        // Verificar si la duración de la capacitación está dentro del rango válido
                        if (duracionCapacitacion <= 0 || duracionCapacitacion > 70) {
                            System.out.println("La duración de la capacitación debe estar entre 1 y 70 minutos.");
                        }
                    } while (duracionCapacitacion <= 0 || duracionCapacitacion > 70);

                    int asistenteCapacitacion = 0;

                    do {
                        System.out.print("Ingrese el número de asistentes a la capacitación: ");
                        while (!scannerDeDatos.hasNextInt()) {
                            System.out.println("Ingrese un número válido.");
                            scannerDeDatos.next();
                        }
                        asistenteCapacitacion = scannerDeDatos.nextInt();

                        if (asistenteCapacitacion <= 0 || asistenteCapacitacion > 100) {
                            System.out.println("El número de asistentes debe estar entre 1 y 100.");
                        }
                    } while (asistenteCapacitacion <= 0 || asistenteCapacitacion > 100);

                    Capacitacion capacitacion = new Capacitacion(identificadorCapacitacion,rutCapacitacion,diaCapacitacion,horaCapacitacion,lugarCapacitacion,duracionCapacitacion,asistenteCapacitacion);
                    contenedor.almacenarCapacitacion(capacitacion);
                    break;
                case 5:
                    System.out.print("** Eliminar Usuario **");
                    System.out.print("Ingrese rut de Usuario: ");
                    int eliminarUsuarioConRut = scannerDeDatos.nextInt();
                    contenedor.eliminarUsuario(eliminarUsuarioConRut);
                    break;
                case 6:
                    System.out.print("** Mostrando todos los usuario **");
                    contenedor.mostrarUsuarios();
                    break;
                case 7:
                    System.out.println("** Mostrar Usuarios por tipo. **" + " Ingrese tipo de Usuario (1-Cliente. 2-Profesional. 3-Administrativo ");
                    int tipoDeUsuario = scannerDeDatos.nextInt();
                    contenedor.mostrarUsuariosPorTipo(tipoDeUsuario);
                    break;
                case 8:
                    System.out.println("** Mostrar Capacitaciones **");
                    contenedor.mostrarCapacitaciones();
                    break;
                case 9:
                    System.out.print("Terminado el programa: ");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Por favor, intente de nuevo. ");
            }


        } while (opcionIngresada != 9);

    }
}

