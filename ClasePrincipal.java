package paquete.luis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClasePrincipal {

	public static void main(String[] args)  {
		File f=new File("C:\\ficheros_luis\\fichero_output_ascii.txt");
		try {
			if(!f.exists())
				{
				f.createNewFile();
				}
			FileOutputStream fos=new FileOutputStream(f);
		
			//byte lista_bytes[]= new byte[5];
			byte letra_a=78;
			int n=130;
			byte mibyte=(byte)n;
			//System.out.println("El entero vale: "+n+" y el byte vale: "+mibyte);
			for (int b=65; b<200; b++)
			{
				String string_numero=String.valueOf(b);
				//int n_caracteres=numero.length();
				//"65", ...."126"
				for(int indice_string=0; indice_string<string_numero.length(); indice_string++)
				{
					char c=string_numero.charAt(indice_string);
					fos.write(c);
				}
					
				System.out.println("Byte: "+b);
				fos.write(61);
				fos.write(62);
				fos.write(b);
				fos.write(10);
			}
	
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

}
}
