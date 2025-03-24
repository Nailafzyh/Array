/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1056array;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author naila
 */
public class Modul1056Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // percobaan1
        int data[][]={{4,6,4,2,8,4,2,10},
                      {4,6,4,2,8,4,2,10}};
        int jlmh_element=0;
        int banyak_element=data[0].length+data[1].length;
        
        //menampilkan semua lement array
        for (int a=0;a<data.length;a++){
            for (int b=0;b<data[a].length;b++){
                System.out.print(data[a][b]+" ");
                jlmh_element +=data[a][b];
            }
            System.out.print("\n");
        }
        //1.menghitung rata-rata array
        double Rata2=jlmh_element/banyak_element;
        //menampilkan
        System.out.println("jumlah semua element array ="+jlmh_element);
        System.out.println("banyaknya elemen pada array ="+banyak_element);
        System.out.println("nilai rata-rata array ="+Rata2);
        
        //input angga dngn JOptionPane
        int angkacari=0;
        angkacari=Integer.parseInt(JOptionPane.showInputDialog("MASUKKAN ANGKA YANG DICARI"));
        
        //menyimpan posisi anggka dlm array
        ArrayList<String>posisi = new ArrayList();
        ArrayList<Integer>baris = new ArrayList();
        ArrayList<Integer>kolom = new ArrayList();
        
        //mencari posissi anggak dlm array
        for (int d=0;d<data.length;d++){
            for (int h=0;h<data[d].length;h++){
                if (data [d][h]==angkacari){
                    posisi.add("baris "+(d+1)+",kolom "+(h+1));
                    baris.add(d);
                    kolom.add(h);
                }
            }
        }
        //tampilan anggka tidak ditemukan
        if (posisi.isEmpty()){
            JOptionPane.showMessageDialog(null, "POSISI TIDAK DITEMUKAN!");
        } else {
        //2.tampilan posisi angka ditemukan  
        System.out.println("POSISI ANGKA YANG DITEMUKAN");
        for (int d=0;d<posisi.size();d++)
            System.out.println((d+1)+"."+posisi.get(d));
    }
    //diminta input diposisi angka yang dicari
    int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih posisi angka yang ingin diganti (1 - "+posisi.size()+")"));
    if (pilihan>0 && pilihan <=posisi.size()){
        int angkabaru=Integer.parseInt(JOptionPane.showInputDialog("masukkan angka baru"));
        data[baris.get(pilihan-1)][kolom.get(pilihan-1)]=angkabaru;
    }  
    //menampilkan array setelah perubahan
        System.out.println("\nARRAY SETELAH PERUBAHAN:");
        for (int a=0; a<data.length; a++){
            for (int b=0; b<data[a].length; b++){
                System.out.print(data[a][b]+ " ");
            }
             System.out.print("\n");
             System.out.println("=--=-=-=-=-=-=--");
        }
        //3. Menjumlahkan semua elemen dengan indeks kolom ganji
        int kolomganjil = 0;
        for (int a=0; a<data.length; a++){
            for (int b=1; b<data[a].length; b+=2){ //indeks kolom gnjil
                kolomganjil += data[a][b];
            }
        }
        System.out.println("jumlah element dengan indeks kolom ganjil: " + kolomganjil);
    }
    
    
}
   
    
     
          
           
               

 
 



