package progetto04;

import java.io.File;

public class AppFiles {

	public static void main(String[] args) {
		var file = new File("testo.txt");
		
		if(file.exists()) {
			System.out.println("Il file esiste");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
		}
		
		var dir = new File("cartella");
		if(dir.exists()) {
			System.out.println(file.isDirectory());
			System.out.println(dir.isDirectory());
			if(dir.isDirectory()) {
				var files = dir.listFiles();
				for(var f : files) {
					System.out.println(f.getAbsolutePath());
				}
			}
		}

	}

}
