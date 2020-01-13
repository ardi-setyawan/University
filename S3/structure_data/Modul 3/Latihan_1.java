import java.util.Scanner;
class formatBiodata
{ 
    //bagian deklarasi struktur record ----------------------------------
    String nama;

    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}
/**
 * tambahDataDiDepan
 */
public class Latihan_1 {    

    // size array
    public static int SIZE = 3;

    // panjang data dalam array
    public static int N = 3;

    // Scanner
    public static Scanner masukan = new Scanner(System.in);
 
    // tampil data
    public static void tampilData(formatBiodata biodataMahasiswa[], int a) {
        // System.out.println("-------------------------------------------");
        // System.out.println("DATA bERHASIL DIMASUKKAN");
        System.out.println("-------------------------------------------");
        System.out.println("NO NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
        System.out.println("-------------------------------------------");

        for (int i=0; i<a; i++) { 
            System.out.print (i+1 + " ");
            System.out.print (biodataMahasiswa[i].nama + " ");
            System.out.print (biodataMahasiswa[i].alamat + " ");
            System.out.print (biodataMahasiswa[i].umur + " ");
            System.out.print (biodataMahasiswa[i].jekel + " ");
            System.out.print (biodataMahasiswa[i].hobi[0] + " ");
            System.out.print (biodataMahasiswa[i].hobi[1] + " ");
            System.out.print (biodataMahasiswa[i].hobi[2] + " ");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-------------------------------------------");
    }

    public static void tukarData(formatBiodata biodataMahasiswa[], int dari, int ke) {
        formatBiodata
        dataBaru[] = new formatBiodata[SIZE];
        formatBiodata tmpDari = biodataMahasiswa[dari -1];
        formatBiodata tmpKe = biodataMahasiswa[ke -1];

        biodataMahasiswa[ke -1] = tmpDari;
        biodataMahasiswa[dari -1] = tmpKe;
        tampilData(biodataMahasiswa, N);
    }
 
    public static void main(String[] args) { 
        //bagian deklarasi record berbasis LARIK -----------------------
        formatBiodata
        biodataMahasiswa[] = new formatBiodata[SIZE];
        biodataMahasiswa[0] = new formatBiodata();
        biodataMahasiswa[1] = new formatBiodata();
        biodataMahasiswa[2] = new formatBiodata();

        // data awal
        biodataMahasiswa[0].nama = "Krisnanto";
        biodataMahasiswa[0].alamat = "Ponorogo";
        biodataMahasiswa[0].umur = 21;
        biodataMahasiswa[0].jekel = 'L';
        biodataMahasiswa[0].hobi[0] = "main";
        biodataMahasiswa[0].hobi[1] = "renang";
        biodataMahasiswa[0].hobi[2] = "baca";
        biodataMahasiswa[0].ipk = 4.0F;

        biodataMahasiswa[1].nama = "Alex_Yuda_";
        biodataMahasiswa[1].alamat = "Ponorogo";
        biodataMahasiswa[1].umur = 20;
        biodataMahasiswa[1].jekel = 'L';
        biodataMahasiswa[1].hobi[0] = "main";
        biodataMahasiswa[1].hobi[1] = "Nulis";
        biodataMahasiswa[1].hobi[2] = "baca";
        biodataMahasiswa[1].ipk = 4.0F;

        biodataMahasiswa[2].nama = "Yogik";
        biodataMahasiswa[2].alamat = "Ponorogo";
        biodataMahasiswa[2].umur = 20;
        biodataMahasiswa[2].jekel = 'L';
        biodataMahasiswa[2].hobi[0] = "main";
        biodataMahasiswa[2].hobi[1] = "Nulis";
        biodataMahasiswa[2].hobi[2] = "baca";
        biodataMahasiswa[2].ipk = 4.0F;

        System.out.println("DATA AWAL SEBELUM PENAMBAHAN");
        tampilData(biodataMahasiswa, N);
        System.out.print("Pilih data ");
        int dari = masukan.nextInt();
        System.out.print("Tukar dengan ");
        int ke = masukan.nextInt();

        tukarData(biodataMahasiswa, dari, ke);

    }
}