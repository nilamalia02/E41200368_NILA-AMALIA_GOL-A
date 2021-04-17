/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_m6_nila;
import java.util.Scanner;
/**
 *
 * @author Nila Amalia
 */
public class Binary {
    
    public static int[] data = null;
	public static int pertama, tengah, akhir, temp, count;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//	Input jumlah data
		System.out.print("Jumlah data : ");		
		int jlh = scan.nextInt();
		
		//	Input setiap nilai dan simpan ke array
		data = new int[jlh];
		for(int x = 0; x < data.length; x++)
		{
			System.out.print("Masukkan data ke-"+(x+1)+" : ");	
			data[x] = scan.nextInt();
		}
		
		//	Menampilkan data sebelum di sorting
		System.out.print("Data    : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		
		//	Proses sorting
		sorting();
		
		//	Menampilkan data setelah di sorting
		System.out.println();
		System.out.print("Sorting : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		
		//	Input data yang dicari
		System.out.print("Data yang dicari : ");		
		int dicari = scan.nextInt();
		
		//	Proses metode pencarian binary searching
		System.out.println();
		boolean hasil = false;
		pertama = 0;
		akhir = data.length - 1;
		temp = 0;
		count = 0;
		while(hasil != true)
		{								
			tengah = (pertama + akhir) / 2;
			
			//	value == dicari
			if(data[tengah] == dicari)
			{
				hasil = true;
					break;
			}
			
			//	value < dicari
			else if(data[tengah] < dicari)
			{
				pertama = tengah + 1;
				
			}
				
			//	value > dicari
			else if(data[tengah] > dicari)
			{

			}
			
			//	Cek kasus terburuk
			if(temp != data[tengah])
				temp = data[tengah];
			else
				count++;
			
			//	batasan untuk kasus terburuk
			if(count == 3)
				break;
		}
		
		//	Output
		if(hasil == true)
			System.out.println("Data "+dicari+" ditemukan pada index ke-"+tengah);
		
		else
			System.out.println("Data "+dicari+" tidak ditemukan");
			
	}
	
	//	Sorting Naik
	public static void sorting()
	{
		int temp = 0;
		for(int x = 0; x < data.length; x++)
		{
			for(int y = 0; y < data.length; y++)
			{
				if(x == y)
					continue;
				
				else
				{
					if(data[x] < data[y])
					{
						temp = data[y];
						data[y] = data[x];
						data[x] = temp;
						
					}
				}
			}
		}
	}
}
