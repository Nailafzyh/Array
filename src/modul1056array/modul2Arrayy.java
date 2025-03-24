/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1056array;

/**
 *
 * @author naila
 */
public class modul2Arrayy {
    public static void main (String[] args){
        //percobaan 2
        String data[][]= {{"NAMA\t","ALAMAT\t","NO.TELPON\t"},{"ABDUL\t","Kediri\t",
            "085646668991"}, {"KUSNO\t","Trenggalek\t","085646668992"},{"PONIRAN\t",
                "Bojonegoro\t","085646668993"}};
        
        for (int f=0; f<data.length; f++){
            for (int g=0; g<data[f].length; g++){
                System.out.print(data[f][g]+"\t");
            }
            System.out.print("\n");
        }
    }
    
}
