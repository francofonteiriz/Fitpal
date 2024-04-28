package fitpal;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    	iniciarSesion();
    	menuadmin();
        
    }

    public static void iniciarSesion() {
        
        String[][] usuarios = {
                {"usuario1", "123456", "false"}, 
                {"usuario2", "abcdef", "false"},
                {"admin", "admin123", "true"}
        };

        String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

        boolean usuarioEncontrado = false;
        boolean esAdmin = false;
        for (String[] usuario : usuarios) {
            if (usuario[0].equals(nombreUsuario) && usuario[1].equals(contrasena)) {
                usuarioEncontrado = true;
                esAdmin = Boolean.parseBoolean(usuario[2]);
                break;
            }
        }

        if (usuarioEncontrado) {
            if (esAdmin) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión como administrador exitoso. ¡Bienvenido!");
            } else {
                String[] opcionesUsuarioComun = {"cliente","entrenador"};
                String opcionUsuarioComun = (String) JOptionPane.showInputDialog(null, "Bienvenido, elija una opción:",
                        "Menú de Usuario Común", JOptionPane.DEFAULT_OPTION, null, opcionesUsuarioComun, opcionesUsuarioComun[0]);

                if (opcionUsuarioComun != null) {
                    switch (opcionUsuarioComun) {
                        case "Entrenador":
                            break;
                        case "Cliente":
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción. Saliendo del programa.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos. Inténtelo de nuevo.");
        }
    }


    
    public static String menuadmin() {
        String[] opciones = {"Clientes", "Entrenadores", "Rutinas", "Incentivos", "Dietas", "Areas"};
        String[] op_acciones = {"Crear", "Modificar", "Mostrar", "Borrar"};
        String[] op_beneficios = {"agregar suscripcion", "suspender suscripcion", "quitar suscripcion"};
        String[] entrenadores = {"Entrenador 1", "Entrenador 2", "Entrenador 3"};
        String Elegida = "";

        Elegida = (String) JOptionPane.showInputDialog(null, "Que seccion deseas acceder:", "Menu secciones", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        switch (Elegida) {
            case "Clientes":
                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_acciones, op_acciones[0]);

                switch (Elegida) {
                    case "Crear":
                        break;

                    case "Modificar":
                    	Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_beneficios, op_beneficios[0]);

                        switch (Elegida) {
                            case "agregar suscripcion":
                                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, entrenadores, entrenadores[0]);
                                break;

                            case "suspender suscripcion":
                                String clienteSuspender = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente que desea suspender:");
                                int confirmacionSuspender = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea suspender al cliente " + clienteSuspender + "?", "Confirmar suspensión", JOptionPane.YES_NO_OPTION);
                                if (confirmacionSuspender == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Cliente suspendido exitosamente.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                                }
                                break;

                            case "quitar suscripcion":
                                String clienteQuitar = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente al que desea quitar la suscripción:");
                                int confirmacionQuitar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea quitar la suscripción al cliente " + clienteQuitar + "?", "Confirmar quitar suscripción", JOptionPane.YES_NO_OPTION);
                                if (confirmacionQuitar == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Suscripción del cliente quitada exitosamente.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                                }
                                break;
                        }
                        break;


                    case "Mostrar":
                        break;

                    case "Borrar":
                        String clienteBorrar = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente que desea borrar:");
                        int confirmacionBorrar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar al cliente " + clienteBorrar + "?", "Confirmar borrado", JOptionPane.YES_NO_OPTION);
                        if (confirmacionBorrar == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Cliente borrado exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Operación cancelada.");
                        }
                        break;
                }
                break;

            case "Entrenadores":
                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_acciones, op_acciones[0]);

                switch (Elegida) {
                    case "Crear":
                        break;

                    case "Modificar":
                        break;

                    case "Mostrar":
                        break;

                    case "Borrar":
                        break;
                }
                break;

            case "Rutinas":
                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_acciones, op_acciones[0]);

            	 switch (Elegida) {
                 case "Crear":
                     break;

                 case "Modificar":
                     break;

                 case "Mostrar":
                     break;

                 case "Borrar":
                     break;
             }
                break;

            case "Incentivos":
                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_acciones, op_acciones[0]);

            	 switch (Elegida) {
                 case "Crear":
                     break;

                 case "Modificar":
                     break;

                 case "Mostrar":
                     break;

                 case "Borrar":
                     break;
             }
                break;

            case "Dietas":
                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_acciones, op_acciones[0]);

            	 switch (Elegida) {
                 case "Crear":
                     break;

                 case "Modificar":
                     break;

                 case "Mostrar":
                     break;

                 case "Borrar":
                     break;
             }
                break;

            case "Areas":
                Elegida = (String) JOptionPane.showInputDialog(null, "Que Accion desea hacer: ", "Menu Acciones", JOptionPane.DEFAULT_OPTION, null, op_acciones, op_acciones[0]);

            	 switch (Elegida) {
                 case "Crear":
                     break;

                 case "Modificar":
                     break;

                 case "Mostrar":
                     break;

                 case "Borrar":
                     break;
             }
                break;
        }
        return Elegida;
    }
}
