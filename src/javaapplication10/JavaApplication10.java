/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;


import java.util.*;
import java.io.*;


class Persona{
    String Name;
    String Phone;
    String Parentship;
    String timeFriendship;
   
        public Persona(String Name, String Phone, String Parentship,String timeFriendship) {
         this.Name = Name ;
         this.Parentship =Parentship;
         this.Phone =Phone;
         this.timeFriendship= timeFriendship;
         
       
    }

    public Persona() {

    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone){
        this.Phone = Phone ;
    }
            
     public String getParentship() {
        return Parentship;
    }

    public void setParentship(String Parentship) {
        this.Parentship = Parentship;
    }
     public String gettimeFriendship() {
        return timeFriendship;
    }

    public void settimeFriendship(String timeFriendship) {
        this.timeFriendship = timeFriendship;
    }
    @Override
    public String toString() {
        return String.format("Nombre:\t%s Telefono:\t%s "+
                        "parentezco:\t%s tiempo de amistad:\t%s ",
                        this.Name, this.Phone, this.Parentship, this.timeFriendship);
    }
   
}


    
 class Reader {

    private static final Scanner reader = new Scanner(System.in);

    public static Scanner get() {
        return reader;
    }

    public static void close() {
        reader.close();
    }
}

    
       
    
   



class Agenda{
    ArrayList<Persona> contactos = new ArrayList<>();
        public void crearFamiliar() {

        try {
            Scanner entrada = Reader.get();
            Persona contacto = new Persona();

            //System.out.print("\nIntroduzca el Nombre de su familiar: ");
            contacto.setName(entrada.next());
           // System.out.print("\nIntroduzca el telefono: ");
            contacto.setPhone(entrada.next());
           // System.out.print("\nIntroduzca el parentesco C: ");
            contacto.setParentship(entrada.next());
            //System.out.print("\nIntroduzca los años de amistad: ");
           
            //contactof.settimeFriendship(0);

            contactos.add(contacto);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
         public void crearAmigo() {

        try {
            Scanner entrada = Reader.get();
            Persona contacto = new Persona();

            //System.out.print("\nIntroduzca el Nombre de su familiar: ");
            contacto.setName(entrada.next());
           // System.out.print("\nIntroduzca el telefono: ");
            contacto.setPhone(entrada.next());
            //System.out.print("\nIntroduzca el parentesco C: ");
           // contactoA.setParentship(entrada.next());
           // System.out.print("\nIntroduzca los años de amistad: ");
           
            contacto.settimeFriendship(entrada.next());

            contactos.add(contacto);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
         public void listarContactos(){
       
       //System.out.println(contactos);
       System.out.println(contactos.size()+" \n");
       
   }
        
         
        
 
         
         //fin mostrar tele
          
        public void imprimirContactos(){
       
              //texto a buscar
                  Scanner buscar = Reader.get();
                  String nombre = buscar.nextLine();
                  
                  Persona person ;
Iterator iter = contactos.iterator();
while(iter.hasNext()){
    
  person = (Persona)iter.next(); // Cast del Objeto a la Clase Persona
   if(!person.getName().equals(nombre))
       {}
  
  else {     
      if (person.getParentship()==null){
  System.out.println(" A " +person.getName()+" es mi amigo hace "+person.gettimeFriendship()+" y su telefono es "+person.getPhone()); // Accedo a los atributos de la clase    por medio de sus Getters
      }
      else{System.out.println(" F " +person.getName()+" es mi "+person.getParentship()+" y su telefono es "+person.getPhone());}
  }
} 
                  
              
                
                 }

        //fin imprimir
           public void eliminarContactos(){
               //texto a buscar
                  Scanner buscar = Reader.get();
             
             String nombre = buscar.nextLine();
            
            //fin texto a buscar1
              
              if(contactos.isEmpty()){
           
           
       }
              else {
                  
                 
     
                  
                              Persona person ;
Iterator iter = contactos.iterator();
while(iter.hasNext()){
  person = (Persona)iter.next(); // Cast del Objeto a la Clase Persona
  if(person.getName().equals(nombre))
  {
  contactos.remove(person);// Accedo a los atributos de la clase    por medio de sus Getters
  }
  
} 
                  
              }
        }
//fin  imprimir
          public void buscarCliente() {
               //texto a buscar
                  Scanner buscar = Reader.get();
             
             String nombre = buscar.nextLine();
           
            //fin texto a buscar
              
              if(contactos.isEmpty()){
           //System.out.println("La lista está vacia");
           
       }
              else {
                  
                 
     
                  
                              Persona person ;
Iterator iter = contactos.iterator();
while(iter.hasNext()){
  person = (Persona)iter.next(); // Cast del Objeto a la Clase Persona
  if(person.getName().equals(nombre))
  {
  System.out.println("se lalma "+person.getName());// Accedo a los atributos de la clase    por medio de sus Getters
  }
  else {System.out.println("-1");}
} 
                  
              }
                
                 }

              

    




}





/**
 *
 * @author beto arias
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    private static Scanner opcion;
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
           int casos;
           
           
           casos = sc.nextInt();
        Agenda agenda = new Agenda();
        try  {
        opcion = new Scanner(System.in);
		int num;
		
		do{/*
            System.out.println("[+] Elegir opción\n");
                System.out.println("1. Crear Familiar");
                System.out.println("2. Crear Amigo");
                System.out.println("3. Mostrar Telefono");
                System.out.println("4. Mostar  datos contacto");
                System.out.println("5. Eliminar Contacto");
                System.out.println("6. Mostar  total de contactos");
                System.out.println("7. Salir\n");*/
                        

            num=opcion.nextInt();

            switch(num){
                case 1: agenda.crearFamiliar(); break;
                case 2: agenda.crearAmigo(); break;
                case 3: agenda.buscarCliente(); break;
                case 4: agenda.imprimirContactos(); break;
                case 5: agenda.eliminarContactos(); break;
                case 6: agenda.listarContactos(); break;
              
              
                
                
                case 7:
                      System.out.println( "Usted ha salido de la consulta" );
                      break;
                default:
                    System.out.println("Solo números entre 1 y 7");
                    
                }
            
                
            }

while( num != 7 );
        }
catch(Exception e) {
            e.printStackTrace();
        }
        
    }
        // TODO code application logic here
    }
    


