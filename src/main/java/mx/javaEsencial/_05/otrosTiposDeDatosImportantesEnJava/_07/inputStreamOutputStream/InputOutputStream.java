package mx.javaEsencial._05.otrosTiposDeDatosImportantesEnJava._07.inputStreamOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputOutputStream {
	public static void main(String[] args) throws IOException {
		//Path inputPath = Paths.get("/java/src/main/resources/carta.txt");
		Path inputPath = Paths.get("C:\\Users\\odina\\Documents\\workspace-eclipse\\java\\cursos\\linkedin-bbva\\java-esencial\\java-jdk8\\src\\main\\resources\\carta.txt");
		System.out.println(inputPath.getFileName());
		InputStream input;
		input = Files.newInputStream(inputPath, StandardOpenOption.READ);
		int i;
		while((i = input.read()) != -1) {
			System.out.print((char)i);
		}
		
		InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);
		Path outputPath = Paths.get("C:\\Users\\odina\\Documents\\workspace-eclipse\\java\\cursos\\linkedin-bbva\\java-esencial\\java-jdk8\\src\\main\\resources\\cartaOut.txt");
		Files.newOutputStream(outputPath, StandardOpenOption.CREATE);// en caso de que no exista se crea
		OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);
		i = 0;
		byte[] data = new byte[1024];
		
		while((i = inputStream.read(data)) != -1) {
			outputStream.write(data);
		}
		
		inputStream.close();
		outputStream.close();
		
	}
}
