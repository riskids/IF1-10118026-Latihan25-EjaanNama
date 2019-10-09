/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 *  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: membandingkan 2 nilai
 */
public class IF110118026Latihan25EjaanNama {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.print("Masukkan nama depan anda untuk dieja : ");
		Scanner sc = new Scanner(System.in);
		String nama_lengkap = sc.next();
		System.out.println("Ejaan untuk \"" + nama_lengkap + "\" adalah : ");
                
		for(int i = 0; i < nama_lengkap.length(); i ++)
			System.out.println("Huruf ke-" + (i+1) + " : " + nama_lengkap.charAt(i));
	}
	
}
