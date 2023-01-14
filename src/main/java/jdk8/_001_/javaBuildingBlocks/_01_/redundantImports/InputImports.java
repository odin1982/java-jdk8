package jdk8._001_.javaBuildingBlocks._01_.redundantImports;

//how to import Files and Paths?

//case-1:
//import java.nio.file.Files;
//import java.nio.file.Paths;

//case-2:
import java.nio.file.*;

//imports that don't work:
//import java.nio.*; //a wild card only matches class names, en el paquete nio.* se encuentran otras clases
//import java.nio.*.*;
//import java.nio.files.Paths.*;


public class InputImports {
	public void read(Files files) {
		Paths.get("name");
	}
}
