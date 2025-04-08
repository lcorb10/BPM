package core;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ManejadorUsers {
    private final String archivo;
    private final Map<String, String> usuarios;

    public ManejadorUsers() {
        this.archivo = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\BPMusic\\src\\core\\UsersBPMusic.csv";
        this.usuarios = new HashMap<>();
        cargarUsers();
    }

    private void cargarUsers() {
        File file = new File(archivo);
        if (!file.exists()) {
            try {
                file.createNewFile(); // Crear el archivo si no existe
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al crear el archivo de usuarios", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    usuarios.put(partes[0].trim(), partes[1].trim());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de usuarios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean registrarUser(String usuario, String password) {
        if (usuarios.containsKey(usuario)) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try (FileWriter fw = new FileWriter(archivo, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            
            out.println(usuario + "," + password);
            usuarios.put(usuario, password);
            return true;
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean validarLogin(String usuario, String password) {
        String passAlmacenada = usuarios.get(usuario);
        return passAlmacenada != null && passAlmacenada.equals(password);
    }

    // Método para verificar si un usuario existe
    public boolean existeUsuario(String usuario) {
        return usuarios.containsKey(usuario);
    }
}