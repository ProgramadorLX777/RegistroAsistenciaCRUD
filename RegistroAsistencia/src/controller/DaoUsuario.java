package controller;

import db.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;

public class DaoUsuario {

    private Conexion oConexion;
    private List<Usuario> listaDeUsuarios;

    public DaoUsuario() {
    }

    public DaoUsuario(Conexion oConexion) {
        this.oConexion = oConexion;
    }

    public void crearUsuario(Usuario oUsuario) throws SQLException {
        int idUsuario = oUsuario.getIdUsuario();
        String rut = oUsuario.getRut();
        String nombre = oUsuario.getNombre();
        String apellidoPaterno = oUsuario.getApellidoPaterno();
        String apellidoMaterno = oUsuario.getApellidoMaterno();
        String direccion = oUsuario.getDireccion();
        String fono = oUsuario.getFono();
        String fechaNacimiento = oUsuario.getFechaNacimiento();
        String passUsuario = oUsuario.getPassUsuario();

        String sql = "INSERT INTO registro_asistencia (id_usuario, rut, nombre, apellido_paterno, apellido_materno, direccion, fono, fecha_nacimiento, pass_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = oConexion.prepareStatement(sql)) {
            statement.setInt(1, idUsuario);
            statement.setString(2, rut);
            statement.setString(3, nombre);
            statement.setString(4, apellidoPaterno);
            statement.setString(5, apellidoMaterno);
            statement.setString(6, direccion);
            statement.setString(7, fono);
            statement.setString(8, fechaNacimiento);
            statement.setString(9, passUsuario);

            statement.executeUpdate();
            statement.close();
        }

    }

    public List<Usuario> getUsuario() throws SQLException {
        listaDeUsuarios = new ArrayList<>();

        String sql = "SELECT * FROM registro_asistencia";
        try (PreparedStatement preparedStatement = oConexion.prepareStatement(sql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Usuario oUsuario = new Usuario();
                    oUsuario.setIdUsuario(resultSet.getInt("id_usuario"));
                    oUsuario.setRut(resultSet.getString("rut"));
                    oUsuario.setNombre(resultSet.getString("nombre"));
                    oUsuario.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                    oUsuario.setApellidoMaterno(resultSet.getString("apellido_materno"));
                    oUsuario.setDireccion(resultSet.getString("direccion"));
                    oUsuario.setFono(resultSet.getString("fono"));
                    oUsuario.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                    oUsuario.setPassUsuario(resultSet.getString("pass_usuario"));
                    listaDeUsuarios.add(oUsuario);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error al ejecutar la consulta: " + e.getMessage());
        }
        
        System.out.println("Iniciando la conexión a la base de datos...");
        System.out.println("Conexión establecida.");

        return listaDeUsuarios;

    }

    public List<Usuario> getUsuariosegunFiltro(String filtro) throws SQLException {
        listaDeUsuarios = new ArrayList<>();

        String sql = "SELECT * FROM registro_asistencia WHERE id_usuario LIKE '%" + filtro + "%';";
        Usuario oUsuario;

        try (ResultSet resultSet = oConexion.ejecutarSelect(sql)) {
            while (resultSet.next()) {
                oUsuario = new Usuario();
                oUsuario.setIdUsuario(resultSet.getInt("id_usuario"));
                oUsuario.setRut(resultSet.getString("rut"));
                oUsuario.setNombre(resultSet.getString("nombre"));
                oUsuario.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                oUsuario.setApellidoMaterno(resultSet.getString("apellido_materno"));
                oUsuario.setDireccion(resultSet.getString("direccion"));
                oUsuario.setFono(resultSet.getString("fono"));
                oUsuario.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                oUsuario.setPassUsuario(resultSet.getString("pass_usuario"));
                listaDeUsuarios.add(oUsuario);
            }
        }

        return listaDeUsuarios;
    }

    public void borrarUsuario(int id_usuario) throws SQLException {
        String sql = "DELETE from registro_asistencia where id_usuario=" + id_usuario + ";";
        oConexion.ejecutar(sql);

    }

    public void updateUsuario(int id_usuario, String rut, String nombre, String apellido_paterno, String apellido_materno, String direccion, String fono, String fecha_nacimiento, String pass_usuario) throws SQLException {
        try {
            String sql = "UPDATE registro_asistencia SET rut=?, nombre=?, precio=?, apellido_paterno=?, apellido_materno=?, direccion=?, fono=?, fecha_nacimiento=?, pass_usuario=? WHERE id_usuario=?";
            try (PreparedStatement statement = oConexion.prepareStatement(sql)) {
                statement.setInt(1, id_usuario);
                statement.setString(2, rut);
                statement.setString(3, nombre);
                statement.setString(4, apellido_paterno);
                statement.setString(5, apellido_materno);
                statement.setString(6, direccion);
                statement.setString(7, fono);
                statement.setString(8, fecha_nacimiento);
                statement.setString(9, pass_usuario);

                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
