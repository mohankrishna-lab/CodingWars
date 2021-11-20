package zprac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileNotFoundDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter file name that you wanna use");
		String fileName = sc.nextLine();
		System.out.println("enter whether you wanna read or write (r/w)");
		boolean write = sc.nextLine().trim().charAt(0) == 'w';
		String writtenContent = "";
		if (write) {
			System.out.println("write something to add to the file");
			writtenContent = sc.nextLine();
		}
		
		if (write) {
			try {
				FileOutputStream fos = new FileOutputStream(fileName);
				PrintWriter pw = new PrintWriter(fos);
				pw.println(writtenContent);
				pw.close();
				fos.close();
			}catch (FileNotFoundException e) {
				System.out.printf("Error - A %s occured: %s", e.getClass().toString(), e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				FileInputStream fio = new FileInputStream(fileName);
				Scanner scan = new Scanner(fio);
				
				while(scan.hasNext()) {
					System.out.println(scan.next());
				}
				
				scan.close();
				fio.close();
			} catch (FileNotFoundException e) {
				System.out.printf("Error - A %s occured: %s", e.getClass().toString(), e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
