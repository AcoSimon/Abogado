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
public class Causadao {
/*
   * Clase Causadao, sus tareas son el manejo de datos de la tabla Causa proveniente de la
   * base de datos SQL.
   */
   /*   Variables globales: */
   private Connection cnx; // Variable sql.
   private List<List<String>> MatrizCausa = new ArrayList<>(); // Constructor de matriz.
   
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
// Funcion  Auxiliar::                                                          ListaCausa
//==================================================================================================
    public void MatrizCausa(String cod_causa, String juzgado_causa,String fecha_causa, 
        String nombre_cliente_causa, String nombre_demandado_causa, String descripcion_causa,
        String fuero_causa, String cod_sentencia_causa){
       /**
       * Funcion:
       *         Modificar la lista MatrizCausa agregando los elementos existentes en la b.d. SQL.
       * MatrizCausa:
       *             String String String String String String String String-> none
       */
       List<String> ListaDeCausa = new ArrayList<>(); // Constructor de ArrayList.
       
       /*   Agregar elementos a lista: */
       ListaDeCausa.add(cod_causa);       // String -> List<String>
       ListaDeCausa.add(juzgado_causa);     // String -> List<String>
       ListaDeCausa.add(fecha_causa);     // String -> List<String>
       ListaDeCausa.add(nombre_cliente_causa);    // String -> List<String>
       ListaDeCausa.add(nombre_demandado_causa);    // String -> List<String>
       ListaDeCausa.add(descripcion_causa);    // String -> List<String>
       ListaDeCausa.add(fuero_causa);    // String -> List<String>
       ListaDeCausa.add(cod_sentencia_causa);    // String -> List<String>
       
       /*   Agregar lista a Matriz: */
       MatrizCausa.add(ListaDeCausa);  // List<String> -> List<List<String>>
       
       /*   Mostrar datos por consola: */
       System.out.println(" - Matriz de Sentencia:\n"+MatrizCausa+"\n\n");
   }// Fin de ListaDatosCausa.
//==================================================================================================
// Funcion:                                                                     Causadao
//==================================================================================================
    public  Causadao() {
       /**
       * Funcion:
       *         Establece conexion con motor SQL.
       * Causadao:
       *            none -> none
       */
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           errorSQL = new ImageIcon("src/imagenes/errorSQL.png");
           System.out.println("No encontro el driver.");
           
           /*   Mensaje en pantalla: */
           JOptionPane.showMessageDialog(null, "No encontro el driver.","Error:",JOptionPane.WARNING_MESSAGE,errorSQL);
           
           Logger.getLogger(Causadao.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           cnx = DriverManager.getConnection("jdbc:mysql://localhost/estudio","root","2347");
           // Cierre catch.
       } catch (SQLException ex) {
           errorSQL = new ImageIcon("src/imagenes/errorSQL.png");
            System.out.println("No hay motor, o base de datos, o usuario y contraseña.");
            
            /*   Mensaje en pantalla: */
           JOptionPane.showMessageDialog(null, "No hay motor, o base de datos, o usuario y contraseña.","Error:",JOptionPane.WARNING_MESSAGE,errorSQL);
           
           Logger.getLogger(Causadao.class.getName()).log(Level.SEVERE, null, ex);
       }
    } // Fin de CausaDao.
//==================================================================================================
// Funcion:                                                                     agregarCausa
//==================================================================================================
    public void agregarCausa(){
        /**
        * Funcion:
        *         Agregar datos "Causa" a la base de datos SQL.
        * agregarSentencia:
        *                None -> None
        */
           try {
               ingresoExitoso = new ImageIcon("src/imagenes/ingresoExitoso.png");
               
               /*   Declaracion de variables: */
               String cod_causas;
               String juzgado_causa;
               String fecha_causa;
               String nombre_cliente_causa;
               String nombre_demandado_causa;
               String descripcion_causa;
               String fuero_causa;
               String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla sentencia.
               int cod_causas_int;
               
               /* Ingreso de datos por teclado: */
               cod_causas = JOptionPane.showInputDialog(null, "Ingrese el codigo de la causa: ");
               cod_causas_int = Integer.parseInt(cod_causas);
               juzgado_causa = JOptionPane.showInputDialog(null, "Ingrese el juzgado de la causa: ");
               fecha_causa = JOptionPane.showInputDialog(null, "Ingrese la fecha de la causa: ");
               nombre_cliente_causa = JOptionPane.showInputDialog(null, "Ingrese el nombre de cliente: ");
               nombre_demandado_causa = JOptionPane.showInputDialog(null, "Ingrese el nombre del demandado: ");
               descripcion_causa = JOptionPane.showInputDialog(null, "Ingrese la descripcion de la causa: ");
               fuero_causa = JOptionPane.showInputDialog(null, "Ingrese el fuero de la causa: ");
               
               /*  Agregar a la base de datos: */
               SQL = "insert into causa (cod_causa,juzgado_causa, fecha_causa, nombre_cliente_causa, nombre_demandado_causa,"
                       + "descripcion_causa, fuero_causa) "+
                     "values ('"+cod_causas_int+"','"+juzgado_causa+"','"+fecha_causa+"','"+nombre_cliente_causa+
                       "','"+nombre_demandado_causa+"','"+descripcion_causa+"','"+fuero_causa+"')";
               Statement st = cnx.createStatement();
               st.executeUpdate(SQL);
               
               /*   Mensaje en pantalla: */
               JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente.","Ingreso",JOptionPane.WARNING_MESSAGE,ingresoExitoso); // Ingreso de dato finalizado.
               
           } // Cierre de try. 
           catch (SQLException ex) {
               System.out.println("Error, los datos no fueron cargados.");
               Logger.getLogger(Causadao.class.getName()).log(Level.SEVERE, null, ex);
           } // Cierre de catch.
    } // Fin de agregarCausa.
//==================================================================================================
//  Funcion:                                                                    devolverCausa
//==================================================================================================
    public void devolverCausa(){
        /**
        * Funcion:
        *         Devuelve datos "Causa" de la base de datos SQL.
        * devolverCausa:
        *               None -> None
        */
       try {
           listaAB= new ImageIcon("src/imagenes/listaAB.png");
           /*   Declaracion de variables: */
           String cod_causas;
           String juzgado_causa;
           String fecha_causa;
           String nombre_cliente_causa;
           String nombre_demandado_causa;
           String descripcion_causa;
           String fuero_causa;
           String cod_sentencia_causa;
           String datos = "";
           
           /*   Devolver datos de la base de datos: */
           Statement st;
           st = cnx.createStatement();
           ResultSet resultado;
           resultado = st.executeQuery("select * from causa");
           
           /*   Bucle de repeticion definida: */
           for(int i=0;resultado.next();i++){
               
               /*   Extraer datos de la tabla abogado de SQL: */
               cod_causas = resultado.getString("cod_causa");
               juzgado_causa = resultado.getString("juzgado_causa");
               fecha_causa = resultado.getString("fecha_causa");
               nombre_cliente_causa = resultado.getString("nombre_cliente_causa");
               nombre_demandado_causa = resultado.getString("nombre_demandado_causa");
               descripcion_causa = resultado.getString("descripcion_causa");
               fuero_causa = resultado.getString("fuero_causa");
               cod_sentencia_causa = resultado.getString("cod_sentencia_causa");
                
                /*   Acumulador: */
                datos+=cod_causas+" "+juzgado_causa+" "+fecha_causa+" "+nombre_cliente_causa+
                        nombre_demandado_causa+descripcion_causa+fuero_causa+"\n";
                
                /*  Invocacion de funcion: */
                MatrizCausa(cod_causas, juzgado_causa, fecha_causa, nombre_cliente_causa, 
                        nombre_demandado_causa, descripcion_causa, fuero_causa, cod_sentencia_causa);
            } // cierre de loopFor.
           
           /*   Mensajes de notificacion: */
           JOptionPane.showMessageDialog(null,datos,"Causas ingresadas:",JOptionPane.WARNING_MESSAGE,listaAB);
       } // Cierre de try.
       catch (SQLException ex) {
           Logger.getLogger(Causadao.class.getName()).log(Level.SEVERE, null, ex);
       } // Cierre de catch.
    } // Fin de devolverAbogado.
//==================================================================================================
//  Funcion:                                                                    modificarCausa
//==================================================================================================
    public void modificarCausa(){
        /**
        * Funcion:
        *         Modificar datos "Causa" a la base de datos SQL.
        * agregarCausa:
        *                  None -> None
        */
        System.out.println("Funcion no establecida.\n");
    } // Fin modificarCausa.
//==================================================================================================
//  Funcion:                                                                    eliminarCausa
//==================================================================================================
    public void eliminarCausa(){
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
        String mens = "Desea eliminar TODOS los datos en la tabla \"Causa\"?";
        String preg = "Quieres eliminar un elemento en especifico o todos los datos de la tabla \"Causa\"?";
        String preg1 = "\n\n1) Determinado elemento. \n2) Borrar todo. \n0) Salir.";
        String preg2 = "\n\nAVISO: Presione la tecla asociada a su respuesta.";
        String ms1;
        String ms2;
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
                    String cod_causas = JOptionPane.showInputDialog(null,"Ingrese ID de la causa que desea eliminar:");
                
                    /*  Agregar a la base de datos: */
                    SQL = "delete from causa where cod_causas = '"+cod_causas+"'";
                    Statement st;
                    st = cnx.prepareStatement(SQL);
                    st.executeUpdate(SQL);
                    JOptionPane.showMessageDialog(null, "Operacion completa.","AVISO:"
                            ,JOptionPane.WARNING_MESSAGE,ok);
                    break;
                } //Cierre de try.
                catch (SQLException ex) {
                    System.out.println("Los datos no se eliminaron.");
                    Logger.getLogger(Causadao.class.getName()).log(Level.SEVERE, null, ex);
                    break;
                } // Cierre de catch.
            } // Fin de if usado para eliminar datos en especifico.
        
            if(eleccionNumero==2){ // Opcion para eliminar todos los datos de la tabla abogado de la base de datos SQL.
                SiNo = JOptionPane.showConfirmDialog(null, mens, "Confirmar: ", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,eliminar);
                /*  Condicionales: */
                if(SiNo == JOptionPane.YES_OPTION){
                
                    /* Constantes: */
                    ms1 = "SEGURO que desea eliminar TODOS los datos en la tabla \"Causa\"?";
                    ms2 = "\nAVISO: Una vez eliminados los datos no hay forma de recuperarlos.";
            
                    /* Ventana de dialogo: */
                    SiNo = JOptionPane.showConfirmDialog(null, ms1+ms2, "Confirmar: ", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,borrarTodo);
            
                    /* Condicional anidado: Condicion positiva. */
                    if(SiNo == JOptionPane.YES_OPTION){
                        try {
                            /*   Declaracion de variables: */
                            String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla abogado.
                            String mensaje = "Datos de la tabla \"Causa\" eliminados de forma existosa.";
                            
                            /*  Agregar a la base de datos: */
                            SQL = "delete from causa";
                            Statement st;
                            st = cnx.prepareStatement(SQL);
                            st.executeUpdate(SQL);
                            JOptionPane.showMessageDialog(null, mensaje,"Aviso:",
                                    JOptionPane.WARNING_MESSAGE,borrados);
                            break;
                        } //Cierre de try.
                        catch (SQLException ex) {
                            Logger.getLogger(Causadao.class.getName()).log(Level.SEVERE, null, ex);
                            break;
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
} // Fin de Causadao.