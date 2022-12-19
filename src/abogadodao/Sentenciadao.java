//==================================================================================================
//  Paquete:
//==================================================================================================
package abogadodao;
//==================================================================================================
//  Bibliotecas importadas:
//==================================================================================================
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//==================================================================================================
//  Clase:
//==================================================================================================
public class Sentenciadao {
   /*
   * Clase Sentenciadao, sus tareas son el manejo de datos de la tabla Sentencia proveniente de la
   * base de datos SQL.
   */
   /*   Variables globales: */
   private Connection cnx; // Variable sql.
   private List<List<String>> MatrizSentencia = new ArrayList<>(); // Constructor de matriz.
   
   /*  Iconos/Imagenes: */
    Icon ingresoExitoso;    // Variable -> TypeIcon.
    Icon listaAB;           // Variable -> TypeIcon.
    Icon errorSQL;          // Variable -> TypeIcon.
    Icon notasGrande;       // Variable -> TypeIcon.
    Icon eliminar;          // Variable -> TypeIcon.
    Icon borrarTodo;        // Variable -> TypeIcon.
    Icon datosConservados;  // Variable -> TypeIcon.
    Icon ok;                // Variable -> TypeIcon.
    Icon borrados;          // Variable -> TypeIcon.
//==================================================================================================
// Funcion  Auxiliar::                                                          ListaAbogado
//==================================================================================================
   public void MatrizSentencia(String cod_sentencia, String fecha_sentencia,String monto_sentencia,
                               String estado_sentencia){
       /**
       * Funcion:
       *         Modificar la lista MatrizAbogado agregando los elementos existentes en la b.d. SQL.
       * MatrizAbogado:
       *               String String String String String String -> none
       */
       
       List<String> ListaDeSentencia = new ArrayList<>(); // Constructor de ArrayList.
       
       /*   Agregar elementos a lista: */
       ListaDeSentencia.add(cod_sentencia);       // String -> List<String>
       ListaDeSentencia.add(fecha_sentencia);     // String -> List<String>
       ListaDeSentencia.add(monto_sentencia);     // String -> List<String>
       ListaDeSentencia.add(estado_sentencia);    // String -> List<String>
       
       /*   Agregar lista a Matriz: */
       MatrizSentencia.add(ListaDeSentencia);  // List<String> -> List<List<String>>
       
       /*   Mostrar datos por consola: */
       System.out.println(" - Matriz de Sentencia:\n"+MatrizSentencia+"\n\n");
   }// Fin de ListaDatosAbogados.
//==================================================================================================
// Funcion:                                                                     Sentenciadao
//==================================================================================================
   public  Sentenciadao() {
       /**
       * Funcion:
       *         Establece conexion con motor SQL.
       * Sentenciadao:
       *            none -> none
       */
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           errorSQL = new ImageIcon("src/imagenes/errorSQL.png");
           System.out.println("No encontro el driver.");
           
           /*   Mensaje en pantalla: */
           JOptionPane.showMessageDialog(null, "No encontro el driver.","Error:",JOptionPane.WARNING_MESSAGE,errorSQL);
           
           Logger.getLogger(Sentenciadao.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           cnx = DriverManager.getConnection("jdbc:mysql://localhost/estudio","root","2347");
           // Cierre catch.
       } catch (SQLException ex) {
           errorSQL = new ImageIcon("src/imagenes/errorSQL.png");
            System.out.println("No hay motor, o base de datos, o usuario y contraseña.");
            
            /*   Mensaje en pantalla: */
           JOptionPane.showMessageDialog(null, "No hay motor, o base de datos, o usuario y contraseña.","Error:",JOptionPane.WARNING_MESSAGE,errorSQL);
           
           Logger.getLogger(Sentenciadao.class.getName()).log(Level.SEVERE, null, ex);
       }
    } // Fin de AbogadoDao.
//==================================================================================================
// Funcion:                                                                     agregarSentencia
//==================================================================================================
    public void agregarSentencia(){
        /**
        * Funcion:
        *         Agregar datos "Sentencia" a la base de datos SQL.
        * agregarSentencia:
        *                None -> None
        */
           try {
               ingresoExitoso = new ImageIcon("src/imagenes/ingresoExitoso.png");
               
               /*   Declaracion de variables: */
               String fecha_sentencia; // Fuero del abogado.
               String monto_sentencia; // Numero de documento del abogado.
               String estado_sentencia; // Telefono del abogado.
               String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla sentencia.
               
               /* Ingreso de datos por teclado: */
               fecha_sentencia = JOptionPane.showInputDialog(null, "Ingrese la fecha de sentencia: ");
               monto_sentencia = JOptionPane.showInputDialog(null, "Ingrese el monto de la sentencia: ");
               estado_sentencia = JOptionPane.showInputDialog(null, "Ingrese el estado de la sentencia: ");
               
               /*  Agregar a la base de datos: */
               SQL = "insert into sentencia (fecha_sentencia, monto_sentencia, estado_sentencia) "+
                     "values ('"+fecha_sentencia+"','"+monto_sentencia+"','"+estado_sentencia+"')";
               Statement st = cnx.createStatement();
               st.executeUpdate(SQL);
               
               /*   Mensaje en pantalla: */
               JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente.","Ingreso",JOptionPane.WARNING_MESSAGE,ingresoExitoso); // Ingreso de dato finalizado.
               
           } // Cierre de try. 
           catch (SQLException ex) {
               System.out.println("Error, los datos no fueron cargados.");
               Logger.getLogger(Sentenciadao.class.getName()).log(Level.SEVERE, null, ex);
           } // Cierre de catch.
    } // Fin de agregarAbogado.
//==================================================================================================
//  Funcion:                                                                    devolverSentencia
//==================================================================================================
    public void devolverSentencia(){
        /**
        * Funcion:
        *         Devuelve datos "Sentencia" de la base de datos SQL.
        * devolverSentencia:
        *                   None -> None
        */
       try {
           listaAB= new ImageIcon("src/imagenes/listaAB.png");
           /*   Declaracion de variables: */
           String cod_sentencia;
           String fecha_sentencia;
           String monto_sentencia;
           String estado_sentencia;
           String datos = "";
           
           /*   Devolver datos de la base de datos: */
           Statement st;
           st = cnx.createStatement();
           ResultSet resultado;
           resultado = st.executeQuery("select * from sentencia");
           /*   Bucle de repeticion definida: */
           for(int i=0;resultado.next();i++){
               
               /*   Extraer datos de la tabla abogado de SQL: */
               cod_sentencia = resultado.getString("cod_sentencia");
               fecha_sentencia = resultado.getString("fecha_sentencia");
               monto_sentencia = resultado.getString("monto_sentencia");
               estado_sentencia = resultado.getString("estado_sentencia");
                
                /*   Acumulador: */
                datos+=cod_sentencia+" "+fecha_sentencia+" "+monto_sentencia+" "+estado_sentencia+"\n";
                
                /*  Invocacion de funcion: */
                MatrizSentencia(cod_sentencia, fecha_sentencia, monto_sentencia, estado_sentencia);
            } // cierre de loopFor.
           /*   Mensajes de notificacion: */
           JOptionPane.showMessageDialog(null,datos,"Sentencias ingresadas:",JOptionPane.WARNING_MESSAGE,listaAB);
       } // Cierre de try.
       catch (SQLException ex) {
           Logger.getLogger(Sentenciadao.class.getName()).log(Level.SEVERE, null, ex);
       } // Cierre de catch.
    } // Fin de devolverAbogado.
//==================================================================================================
//  Funcion:                                                                    modificarSentencia
//==================================================================================================
    public void modificarSentencia(){
        /**
        * Funcion:
        *         Modificar datos "Abogados" a la base de datos SQL.
        * agregarSentencia:
        *                  None -> None
        */
        System.out.println("Funcion no establecida.\n");
               
    } // Fin modificarAbogado.
//==================================================================================================
//  Funcion:                                                                    eliminarSentencia
//==================================================================================================
    public void eliminarSentencia(){
        /**
         * Funcion:
         *         Se encarga de suprimir dato/s de la tabla abogado de la b.s. SQL.
         * eliminarSentencia:
         *                   none -> none
         */
        
        /*  Constructor: */
        eliminar = new ImageIcon("src/imagenes/eliminar.png");
        borrarTodo = new ImageIcon("src/imagenes/borrarTodo.png");
        datosConservados = new ImageIcon("src/imagenes/datosConservados.png");
        ok = new ImageIcon("src/imagenes/ok.png");
        borrados = new ImageIcon("src/imagenes/borrados.png");
        
        /*  Variables: */
        String mens = "Desea eliminar TODOS los datos en la tabla \"Sentencia\"?";
        String ms1;
        String ms2;
        String preg = "Quieres eliminar un elemento en especifico o todos los datos de la tabla \"Sentencia\"?";
        String preg1 = "\n\n1) Determinado elemento. \n2) Borrar todo. \n0) Salir.";
        String preg2 = "\n\nAVISO: Presione la tecla asociada a su respuesta.";
        String preguntar;
        int SiNo;
        int eleccionNumero;
        
        /*  Ventana de dialogo: */
        preguntar = JOptionPane.showInputDialog(null,preg+preg1+preg2, "Confirmar: ");
        
        /*  Cambio de tipo de dato: */
        eleccionNumero = Integer.parseInt(preguntar);
        
        /*  Bucle de repeticion indefinido: */
        
        while ((eleccionNumero==1) || (eleccionNumero==2)){
            if(eleccionNumero==0){ 
                JOptionPane.showMessageDialog(null, "Operacion finalizada.","AVISO:"
                        ,JOptionPane.WARNING_MESSAGE,ok);
                break; 
            }
            if(eleccionNumero==1){ // Opcion para eliminar todos los datos de la tabla abogado de la base de datos SQL.
                try {
                    /*   Declaracion de variables: */
                    String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla abogado.
                    String cod_sentencia = JOptionPane.showInputDialog(null,"Ingrese ID de la sentencia que desea eliminar:");
                
                    /*  Agregar a la base de datos: */
                    SQL = "delete from sentencia where cod_sentencia = '"+cod_sentencia+"'";
                    Statement st;
                    st = cnx.prepareStatement(SQL);
                    st.executeUpdate(SQL);
                    System.out.println("Operacion completa. Tal vez.");
                    break;
                } //Cierre de try.
                catch (SQLException ex) {
                    Logger.getLogger(Sentenciadao.class.getName()).log(Level.SEVERE, null, ex);
                } // Cierre de catch.
            } // Fin de if usado para eliminar datos en especifico.
        
            if(eleccionNumero==2){ // Opcion para eliminar todos los datos de la tabla abogado de la base de datos SQL.
                SiNo = JOptionPane.showConfirmDialog(null, mens, "Confirmar: ", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,eliminar);
                /*  Condicionales: */
                if(SiNo == JOptionPane.YES_OPTION){
                
                    /* Constantes: */
                    ms1 = "SEGURO que desea eliminar TODOS los datos en la tabla \"Sentencia\"?";
                    ms2 = "\nAVISO: Una vez eliminados los datos no hay forma de recuperarlos.";
            
                    /* Ventana de dialogo: */
                    SiNo = JOptionPane.showConfirmDialog(null, ms1+ms2, "Confirmar: ", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,borrarTodo);
            
                    /* Condicional anidado: Condicion positiva. */
                    if(SiNo == JOptionPane.YES_OPTION){
                        try {
                            /*   Declaracion de variables: */
                            String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla abogado.
                            String mensaje = "Datos de la tabla sentencia eliminados de forma existosa.";
                            
                            /*  Agregar a la base de datos: */
                            SQL = "delete from sentencia";
                            Statement st;
                            st = cnx.prepareStatement(SQL);
                            st.executeUpdate(SQL);
                            JOptionPane.showMessageDialog(null, mensaje,"Aviso:",
                                    JOptionPane.WARNING_MESSAGE,borrados);
                            break;
                        } //Cierre de try.
                        catch (SQLException ex) {
                            Logger.getLogger(Sentenciadao.class.getName()).log(Level.SEVERE, null, ex);
                        } // Cierre de catch.
                    } // Cierre de if anidado, opcion positiva.
            
                    /* Condicional anidado: Condicion negativa. */
                    if(SiNo == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null, "Proceso de eliminacion total ANULADO."
                                ,"AVISO:",JOptionPane.WARNING_MESSAGE,datosConservados);
                        break;
                    } // Cierre de if anidado.
                } // Cierre de if.
        
                /*  Condicional: Resultado negativo*/
                if(SiNo == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operacion finalizada.","AVISO:"
                            ,JOptionPane.WARNING_MESSAGE,ok);
                    break;
                } // Cierre de if anidado, opcion negativa.
            } // Fin de if usado para eliminar todos los datos.
        } // Fin de loopWhile.
    } // Fin de eliminarAbogado.
//==================================================================================================
} // Fin de clase Sentenciadao.
