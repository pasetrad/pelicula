/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.videobuster.modelo;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Estudio
 */
public class ServicioBD {
    
    private static ServicioBD aux;
    
    private ServicioBD(){};
    
    public static ServicioBD metodo(){
        if(aux == null){
            aux = new ServicioBD();
        }
        return aux;
    }
    
    public void agregarCategoria(Categoria cat){
        
        try {
            Statement s = Conexion.obtenerInstancia().createStatement();
            
            String sentencia = "INSERT INTO TBl_categoria (id_,descripcion)"
            + "VALUES("+cat.getId()+",'"+cat.getDescripcion()+"')";
            
            s.execute(sentencia);
            
            System.out.println("Insertado con exito...");
        } catch (SQLException ex) {
            System.out.println("No se pudo agregar Marca...");
        }
    }
    
    public void agregarPelicula(Pelicula peli,Integer id_categoria){
        //(CODIGO, PRECIO, ID_CATEGORIA, FORMATO4K, NOMBRE) VALUES ('10000', '1500', '1', 'S', 'asdasda')
        //'20000', '1500', '1', 's', '1000'
        String sent = "INSERT INTO TBl_pelicula (codigo,precio,id_categoria"
                    + ",formato4k,nombre) VALUES('"+peli.getCodigo()+"','"+
                peli.getPrecio()+"','"+ id_categoria+"','"+peli.getFormato4k()+
                "','"+peli.getNombre()+"')";
        Statement s;
        try {
               s = Conexion.obtenerInstancia().createStatement(); 
//            s.setInt(1, peli.getCodigo());
//            s.setInt(2, peli.getPrecio());
//            s.setInt(3, id_categoria);
//            s.setString(4, peli.getFormato4k());
//            s.setString(5,peli.getNombre());
              s.execute(sent);
//            s.execute(sent);//borrar query
//            s.close();

            System.out.println("Insertado con éxito...");
        } catch (SQLException ex) {
            System.out.println("No se pudo agregar Película...");
        }
    }
    //cargar por categoria
    public ArrayList<Pelicula> listarPorCategoria(Integer id_){
        String sentencia = "SELECT codigo,nombre,descripcion,precio,formato4k  "
                            + "FROM TBl_categoria cat join tbl_pelicula peli" +
                             "on cat.ID_=peli.id_categoria where cat.id_="+id_+
                              " order by codigo asc";
        Statement s;
        ArrayList<Pelicula> pelis = new ArrayList<>();
        
        try {
            s = Conexion.obtenerInstancia().createStatement();
            System.out.println(" Cargando datos...");
            ResultSet resultado=s.executeQuery(sentencia);
                        
            while (resultado.next()){
                Integer codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                String descripcion = resultado.getString("descripcion");
                Integer precio = resultado.getInt("precio");
                String formato4k =resultado.getString("formato4k");
                        
                Pelicula rev = new Pelicula(codigo,precio,descripcion,
                                            formato4k,nombre);
                pelis.add(rev);                
            }
        } catch (SQLException ex) {
            System.out.println("Error en la carga de datos...");
        }
        return pelis;
    }
    
    public ArrayList<Pelicula> listarPeliculas(){
        String sentencia2 ="SELECT codigo,nombre,descripcion,precio,formato4k  "
                           + "FROM TBl_categoria cat join tbl_pelicula peli "
                          + "on cat.ID_=peli.id_categoria ORDER BY codigo ASC";
        Statement s;
        ArrayList<Pelicula> pelis = new ArrayList<>();
        
        try {
            s = Conexion.obtenerInstancia().createStatement();
            System.out.println(" Cargando datos...");
            ResultSet resultado=s.executeQuery(sentencia2);
                       
            while (resultado.next()){
                Integer codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                String descripcion = resultado.getString("descripcion");
                Integer precio = resultado.getInt("precio");
                String formato4k =resultado.getString("formato4k");
                        
                Pelicula rev = new Pelicula(codigo,precio,descripcion,
                                            formato4k,nombre);
                pelis.add(rev);                
            }
        } catch (SQLException exo) {
            System.out.println("Error en la carga de datos 2...");
        }
        return pelis;
    }
    
    public void borrarPelicula(Integer codigo){
        
        String sentencia="DELETE FROM tbl_pelicula WHERE CODIGO='"+codigo+"'";
        try {
            Statement s = Conexion.obtenerInstancia().createStatement();
            s.executeUpdate(sentencia);
            System.out.println(" registro borrado...");
        } catch (SQLException ex) {
            System.out.println("Error al borrar...");
        }
    }
    
    public Pelicula buscarPelicula(Integer codigoPel){
            String sentencia="SELECT codigo,nombre,descripcion,precio,formato4k  FROM TBl_categoria cat join tbl_pelicula peli on cat.ID_=peli.id_categoria where peli.codigo="+codigoPel+"";
            Pelicula pel = new Pelicula();
            try {
                Statement s = Conexion.obtenerInstancia().createStatement();
                ResultSet resultado=s.executeQuery(sentencia);
                while (resultado.next()){
                Integer codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                String descripcion = resultado.getString("descripcion");
                Integer precio = resultado.getInt("precio");
                String formato4k =resultado.getString("formato4k");
                        
                pel = new Pelicula(codigo,precio,descripcion,formato4k,nombre);
//                pel.equals(s)
                System.out.println(pel.toString());
                System.out.println(" Buscando registro...");
                }
            } catch (SQLException ex) {
                System.out.println("Error al buscar...");
            }
            return pel;
    }
    
        public boolean buscarPeliculaB(Integer codigoPel){
            String sentencia="SELECT codigo  FROM  tbl_pelicula peli  where peli.codigo="+codigoPel+"";
            boolean pel =true;
            try {
                Statement s = Conexion.obtenerInstancia().createStatement();
                ResultSet resultado=s.executeQuery(sentencia);
                while (resultado.next()){
                Integer codigo = resultado.getInt("codigo");
                System.out.println(" Buscando registro...");
                System.out.println(codigo);
                
                if(null == codigo){
                    pel= false;
                }
                
                }
            } catch (SQLException ex) {
                System.out.println("Error al buscar...");
            }
            return pel;
    }
    
    
    public void modificarPelicula(Pelicula a,Integer id_categoria){
        
        String sentencia="update tbl_pelicula  set nombre='"+a.getNombre()+"', "
                + "id_categoria="+id_categoria+", precio="+a.getPrecio()+","
                + "formato4k='"+a.getFormato4k()+"' where codigo="+a.getCodigo();
            
         try {
            Statement s = Conexion.obtenerInstancia().createStatement();
            s.executeUpdate(sentencia);
            
            System.out.println(" registro modificado...");
        } catch (SQLException ex) {
            System.out.println("Error al modificar...");
        } 
    }
}
