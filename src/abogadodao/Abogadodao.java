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
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
//==================================================================================================
//  Clase:
//==================================================================================================
public class Abogadodao {
    /*
    * Clase Abogadodao, sus tareas son el manejo de datos de la tabla Abogado proveniente de la
    * base de datos SQL.
    */
   /*   Variables globales: */
   private Connection cnx; // Variable sql.
   private List<List<String>> MatrizAbogados = new ArrayList<>(); // Constructor de matriz.
   
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
// Funcion Auxiliar:                                                            Notas    
//==================================================================================================
    public void notas(){
        /**
        * Funcion:
        *         Usado para notificar sobre modificaciones o errores del programa.
        * notas:
        *       none -> none
        */
        notasGrande = new ImageIcon("src/imagenes/notasGrande.png");
        String titulo = "Notas de version:";
        String nota = "Ultima modificacion: 5 - Nov - 2018 | 14:05hs.\n\n";
        String info1 = "Agregar funcion a boton \"modificar Abogado\".\n";
        String info2 = "Agregar funcion a boton \"modificar Sentencia\".\n";
        String info3 = "Agregar funcion a boton \"modificar Causa\".\n";
        JOptionPane.showMessageDialog(null,nota+info1+info2+info3,titulo,JOptionPane.WARNING_MESSAGE,notasGrande);
    } // Fin de notas.
//==================================================================================================
// Funcion  Auxiliar::                                                          ListaAbogado
//==================================================================================================
   public void MatrizAbogado(String cod_abogado, String nombre,String fuero,String documento,
 String telefono,String cant_causas,String mail_abogado){
       /**
       * Funcion:
       *         Modificar la lista MatrizAbogado agregando los elementos existentes en la b.d. SQL.
       * MatrizAbogado:
       *               String String String String String String -> none
       */
       
       List<String> ListaDeAbogados = new ArrayList<>(); // Constructor de ArrayList.
       
       /*   Agregar elementos a lista: */
       ListaDeAbogados.add(cod_abogado);  // String -> List<String>
       ListaDeAbogados.add(nombre);       // String -> List<String>
       ListaDeAbogados.add(fuero);        // String -> List<String>
       ListaDeAbogados.add(documento);    // String -> List<String>
       ListaDeAbogados.add(telefono);     // String -> List<String>
       ListaDeAbogados.add(cant_causas);  // String -> List<String>
       ListaDeAbogados.add(mail_abogado); // String -> List<String>
       
       /*   Agregar lista a Matriz: */
       MatrizAbogados.add(ListaDeAbogados);  // List<String> -> List<List<String>>
       
       /*   Mostrar datos por consola: */
       System.out.println(" - Matriz de abogados:\n"+MatrizAbogados+"\n\n");
   }// Fin de ListaDatosAbogados.
//==================================================================================================
// Funcion:                                                                     Abogadodao
//==================================================================================================
   public  Abogadodao() {
       /**
       * Funcion:
       *         Establece conexion con motor SQL.
       * Abogadodao:
       *            none -> none
       */
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           errorSQL = new ImageIcon("src/imagenes/errorSQL.png");
           System.out.println("No encontro el driver.");
           
           /*   Mensaje en pantalla: */
           JOptionPane.showMessageDialog(null, "No encontro el driver.","Error:",JOptionPane.WARNING_MESSAGE,errorSQL);
           
           Logger.getLogger(Abogadodao.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           cnx = DriverManager.getConnection("jdbc:mysql://localhost/estudio","root","2347");
           // Cierre catch.
       } catch (SQLException ex) {
           errorSQL = new ImageIcon("src/imagenes/errorSQL.png");
            System.out.println("No hay motor, o base de datos, o usuario y contraseña.");
            
            /*   Mensaje en pantalla: */
           JOptionPane.showMessageDialog(null, "No hay motor, o base de datos, o usuario y contraseña.","Error:",JOptionPane.WARNING_MESSAGE,errorSQL);
           
           Logger.getLogger(Abogadodao.class.getName()).log(Level.SEVERE, null, ex);
       }
    } // Fin de AbogadoDao.
//==================================================================================================
// Funcion:                                                                     agregarAbogado
//==================================================================================================
    public void agregarAbogado(){
        /**
        * Funcion:
        *         Agregar datos "Abogados" a la base de datos SQL.
        * agregarAbogado:
        *                None -> None
        */
           try {
               ingresoExitoso = new ImageIcon("src/imagenes/ingresoExitoso.png");
               /*   Declaracion de variables: */
               String nombre; // Nombre de abogado.
               String fuero; // Fuero del abogado.
               String documento; // Numero de documento del abogado.
               String telefono; // Telefono del abogado.
               String Scant_causas; // Cantidad de causas que posee el abogado.
               int cant_causas; // Cantidad de causas que posee el abogado. [Uso: cambio de tipo de dato.]
               String mail; // Mail de contacto del abogado.
               String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla abogado.
               
               /* Ingreso de datos por teclado: */
               nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del abogado: ");
               fuero = JOptionPane.showInputDialog(null, "Ingrese fuero del abogado: ");
               documento = JOptionPane.showInputDialog(null, "Ingrese documento del abogado: ");
               telefono = JOptionPane.showInputDialog(null, "Ingrese telefono del abogado: ");
               Scant_causas = JOptionPane.showInputDialog(null, "Ingrese cant_causas del abogado: \n(SOLO NUMEROS ENTEROS)");
               mail = JOptionPane.showInputDialog(null, "Ingrese mail del abogado: ");
               
               /*   Cambio de tipo de dato: */
               cant_causas = Integer.parseInt(Scant_causas);
               
               /*  Agregar a la base de datos: */
               SQL = "insert into abogado (nombre_abogado , fuero_abogado , documento_abogado , telefono_abogado , cant_causas_abogado , mail_abogado) "+
                     "values ('"+nombre+"','"+fuero+"','"+documento+"','"+telefono+"','"+cant_causas+"','"+mail+"')";
               Statement st = cnx.createStatement();
               st.executeUpdate(SQL);
               
               /*   Mensaje en pantalla: */
               JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente.","Ingreso",JOptionPane.WARNING_MESSAGE,ingresoExitoso); // Ingreso de dato finalizado.
               
           } // Cierre de try. 
           catch (SQLException ex) {
           System.out.println("Error, los datos no fueron cargados.");
           Logger.getLogger(Abogadodao.class.getName()).log(Level.SEVERE, null, ex);
           } // Cierre de catch.
    } // Fin de agregarAbogado.
//==================================================================================================
//  Funcion:                                                                    devolverAbogado
//==================================================================================================
    public void devolverAbogado(){
        /**
        * Funcion:
        *         Devuelve datos "Abogados" de la base de datos SQL.
        * devolverAbogado:
        *                None -> None
        */
       try {
           listaAB= new ImageIcon("src/imagenes/listaAB.png");
           /*   Declaracion de variables: */
           Statement st;
           st = cnx.createStatement();
           ResultSet resultado;
           resultado = st.executeQuery("select * from abogado");
           String cod_abogado;
           String nombre;
           String fuero;
           String documento;
           String telefono;
           String cant_causas;
           String mail_abogado;
           String datos = "";
           /*   Bucle de repeticion definida: */
           for(int i=0;resultado.next();i++){
               
               /*   Extraer datos de la tabla abogado de SQL: */
               cod_abogado = resultado.getString("cod_abogado");
               nombre = resultado.getString("nombre_abogado");
               fuero = resultado.getString("fuero_abogado");
               documento = resultado.getString("documento_abogado");
               telefono = resultado.getString("telefono_abogado");
               cant_causas = resultado.getString("cant_causas_abogado");
               mail_abogado = resultado.getString("mail_abogado");
                
                /*   Acumulador: */
                datos+=cod_abogado+" "+nombre+" "+fuero+" "+documento+" "+telefono+" "+cant_causas+" "+mail_abogado+"\n";
                
                /*  Invocacion de funcion: */
                MatrizAbogado(cod_abogado, nombre, fuero, documento, telefono, cant_causas, mail_abogado);
            } // cierre de loopFor.
           /*   Mensajes de notificacion: */
           JOptionPane.showMessageDialog(null,datos,"Abogados ingresados:",JOptionPane.WARNING_MESSAGE,listaAB);
       } // Cierre de try.
       catch (SQLException ex) {
           Logger.getLogger(Abogadodao.class.getName()).log(Level.SEVERE, null, ex);
       } // Cierre de catch.
    } // Fin de devolverAbogado.
//==================================================================================================
//  Funcion:                                                                    modificarAbogado
//==================================================================================================
    public void modificarAbogado(){
        /**
        * Funcion:
        *         Modificar datos "Abogados" a la base de datos SQL.
        * agregarAbogado:
        *                None -> None
        */
        System.out.println("Funcion no establecida.\n");
               
    } // Fin modificarAbogado.
//==================================================================================================
//  Funcion:                                                                    eliminarAbogado    
//==================================================================================================
    public void eliminarAbogado(){
        /**
         * Funcion:
         *         Se encarga de suprimir dato/s de la tabla abogado de la b.s. SQL.
         * eliminarAbogado:
         *                 none -> none
         */
        
        /*  Constructor: */
        eliminar = new ImageIcon("src/imagenes/eliminar.png");
        borrarTodo = new ImageIcon("src/imagenes/borrarTodo.png");
        datosConservados = new ImageIcon("src/imagenes/datosConservados.png");
        ok = new ImageIcon("src/imagenes/ok.png");
        borrados = new ImageIcon("src/imagenes/borrados.png");
        /*  Variables: */
        String mens = "Desea eliminar TODOS los datos en la tabla \"Abogados\"?";
        String ms1;
        String ms2;
        String preg = "Quieres eliminar un elemento en especifico o todos los datos de la tabla \"Abogado\"?";
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
                    String cod_abogado = JOptionPane.showInputDialog(null,"Ingrese ID del abogado que desea eliminar:");
                
                    /*  Agregar a la base de datos: */
                    SQL = "delete from abogado where cod_abogado = '"+cod_abogado+"'";
                    Statement st;
                    st = cnx.prepareStatement(SQL);
                    st.executeUpdate(SQL);
                    JOptionPane.showMessageDialog(null, "Operacion completa.","AVISO:"
                            ,JOptionPane.WARNING_MESSAGE,ok);
                    break;
                } //Cierre de try.
                catch (SQLException ex) {
                    Logger.getLogger(Abogadodao.class.getName()).log(Level.SEVERE, null, ex);
                } // Cierre de catch.
            } // Fin de if usado para eliminar datos en especifico.
        
            if(eleccionNumero==2){ // Opcion para eliminar todos los datos de la tabla abogado de la base de datos SQL.
                SiNo = JOptionPane.showConfirmDialog(null, mens, "Confirmar: ", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,eliminar);
                /*  Condicionales: */
                if(SiNo == JOptionPane.YES_OPTION){
                
                    /* Constantes: */
                    ms1 = "SEGURO que desea eliminar TODOS los datos en la tabla \"Abogados\"?";
                    ms2 = "\nAVISO: Una vez eliminados los datos no hay forma de recuperarlos.";
            
                    /* Ventana de dialogo: */
                    SiNo = JOptionPane.showConfirmDialog(null, ms1+ms2, "Confirmar: ", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,borrarTodo);
            
                    /* Condicional anidado: Condicion positiva. */
                    if(SiNo == JOptionPane.YES_OPTION){
                        try {
                            /*   Declaracion de variables: */
                            String SQL; // Usado en executeUpdate para agregar elementos a la base de datos estudio en la tabla abogado.
                            String mensaje = "Datos de la tabla abogado eliminados de forma existosa.";
                            
                            /*  Agregar a la base de datos: */
                            SQL = "delete from abogado";
                            Statement st;
                            st = cnx.prepareStatement(SQL);
                            st.executeUpdate(SQL);
                            JOptionPane.showMessageDialog(null, mensaje,"Aviso:",
                                    JOptionPane.WARNING_MESSAGE,borrados);
                            break;
                        } //Cierre de try.
                        catch (SQLException ex) {
                            Logger.getLogger(Abogadodao.class.getName()).log(Level.SEVERE, null, ex);
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
} // Fin de clase abogadoDao.