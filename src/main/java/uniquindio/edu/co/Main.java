package uniquindio.edu.co;


import uniquindio.edu.co.model.*;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {

            Cine cine1 = new Cine("CinePlus", 9998, "Armenia-Quindio");

            int opcion = 0;
            while (opcion != 10) {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        ´-+================ + CinePlus + ================+-´
                                          +-MENU CLIENTES-+
                        1. Registrar cliente nuevo
                        2. Informacion del Cliente
                        3. Reservar boletas de pelicula
                                        +-MENU EMPLEADOS-+
                        4. Registrar empleado nuevo
                        5. Registar funcion nueva
                        6. Informacion de las funciones
                        7. Ventas
                        8. Calcular valor de Ocupacion por funciones
                        9. Salir
                        
                        ----Seleccione una opción:-----
                        """));

                if (opcion == 1) {
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo:");
                    int numeroTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de telefono"));
                    String correo = JOptionPane.showInputDialog(null, "Ingrese su correo electrónico:");
                    int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de documento para el registro"));
                    String resultado = cine1.registrarCliente(nombre, numeroTelefono, correo, documento);
                    JOptionPane.showMessageDialog(null, resultado);

                } else if (opcion == 2) {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento para buscar al cliente:"));
                    Persona cliente = cine1.buscarCliente(codigo);
                    if (cliente != null) {
                        JOptionPane.showMessageDialog(null, "Cliente encontrado:\n" + cliente);
                    } else {
                        JOptionPane.showMessageDialog(null, "El cliente no esta registrado :(");
                    }

                }else if (opcion == 3) { //--rerserva boletas---
                    String fechaRealizacion = JOptionPane.showInputDialog(null, "Ingrese la fecha de realizacion:");
                    int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la fila para los asientos (1-10)"));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la columna para los asientos (1-10)"));
                    int numeroAsiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de boletas que desee"));
                    int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el documento con el que va a realizar la reserva"));
                    int opcionSala = Integer.parseInt(JOptionPane.showInputDialog(null, """
                            Seleccione el tipo de sala que desea
                            1. Tradicional (sin costos adicionales)
                            2. VIP (30% de recargo adicional)
                            3. 3D (20% de recargo adicional)
                            Seleccione una opción:
                            """));
                    TipoSalas tipoSala = null;
                    if (opcionSala == 1) {
                    tipoSala = TipoSalas.TRADICIONAL;
                    }else if (opcionSala == 2) {
                    tipoSala = TipoSalas.SALA_VIP;
                    } else if (opcionSala == 3) {
                        tipoSala = TipoSalas.SALA_3D;
                    }
                    int codigoUnico = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese codigo de la funcion a reservar reserva"));
                    String resultado = cine1.reservarBoletas(fechaRealizacion, fila, columna, numeroAsiento, null, null, documento, tipoSala,codigoUnico);
                    JOptionPane.showMessageDialog(null, resultado);


                }else if(opcion == 5){
                    int codigoUnico = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo con el que se guardara la funcion"));
                    String fechaFuncion = JOptionPane.showInputDialog(null, "Ingrese el dia de la funcion:");
                    int horaIncio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de inico de la pelicula"));
                    int duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuanto dura aproximadamente la pelicula?:"));
                    String titulo = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula:");
                    int opcionGenero = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                Seleccione el genero de la pelicula
                                1. ACCION,
                                2. COMEDIA,
                                3. DRAMA,
                                4. TERROR,
                                5. ANIMACION
                                Seleccione una opción:
                                """));
                    GeneroPelicula genero1 = null;
                    if (opcionGenero == 1) {
                        genero1 = GeneroPelicula.ACCION;
                    } else if (opcionGenero == 2) {
                        genero1 = GeneroPelicula.COMEDIA;
                    } else if (opcionGenero == 3) {
                        genero1 = GeneroPelicula.DRAMA;
                    } else if (opcionGenero == 4) {
                        genero1 = GeneroPelicula.TERROR;
                    } else if (opcionGenero == 5) {
                        genero1 = GeneroPelicula.ANIMACION;
                    }
                    int opcionClasificacion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                Seleccione la clasificacion de la pelicula
                                1. MAYORES_DE_EDAD
                                2. MENORES_DE_EDAD
                                3. TODAS_LAS_EDADES
                                Seleccione una opción:
                                """));
                    ClasificacionPelicula clasificacion = null;
                    if (opcionClasificacion == 1) {
                        clasificacion = ClasificacionPelicula.MAYORES_DE_EDAD;
                    } else if (opcionClasificacion == 2) {
                        clasificacion = ClasificacionPelicula.MAYORES_DE_EDAD;
                    } else if (opcionClasificacion == 3) {
                        clasificacion = ClasificacionPelicula.TODAS_LAS_EDADES;
                    }
                        String resultado = cine1.registrarFuncion(codigoUnico, fechaFuncion, horaIncio, duracion, titulo, genero1, clasificacion);
                        JOptionPane.showMessageDialog(null, resultado);
                }else if (opcion == 6) {
                    int codigoUnico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la funcion a encontrar:"));
                    Funcion pelicula = cine1.buscarFuncion(codigoUnico);
                    if (pelicula != null) {
                        JOptionPane.showMessageDialog(null, "Funcion encontrada:\n" + pelicula);
                    }else {
                        JOptionPane.showMessageDialog(null, "La funcion no esta registrada:(");

                    }
                }
            }
        }
}