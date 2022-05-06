/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author JM
 */
public class informacion {
File archivo;
 public void cargarinformacion(){
try{
archivo = new File("AgendaContactos.txt");
if(archivo.createNewFile()){
JOptionPane.showMessageDialog(null,"AGREGADO CON EXITO");
 }
 }catch(IOException e){
 System.out.println(e);
 }
 } 
 public void agregarInformacion(Persona persona){
 try{
 FileWriter escritura = new FileWriter(archivo, true);
 escritura.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getProfesion()+"%"+persona.getTelefono()+"\r\n");
 escritura.close();
 }catch(Exception e){
 System.out.println(e);
 }
 }
 }
