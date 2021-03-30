package com.senati.eti;

import com.senati.eti.model.Alumno;
import java.io.*;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("=================");
			System.out.print("Nombre.......: ");
			String nom = sc.nextLine();
			System.out.print("Apellido.....: ");
			String ape = sc.nextLine();
			System.out.print("Género [M-F].: ");
			String gen = sc.nextLine();
			System.out.print("Edad [15-30].....: ");
			int ed = sc.nextInt();
			
			Alumno alu = new Alumno(nom, ape, gen, ed);
			
			pw.println("Datos registrados");
			pw.println("-----------------");
			pw.println("Nombre y apellido....: " + alu.NombreCompleto());
			pw.println("Genero...............: " + alu.NombreGenero());
			pw.println("Edad.................: " + alu.MostrarEstado());
			
			
		} catch (Exception ex1) {
			ex1.printStackTrace();
		} finally {
			//Cierre del archivo
			try {
				if (archivo != null) archivo.close();
			} catch (Exception ex2) {
				ex2.printStackTrace();
			}
		}
				

	}

}
