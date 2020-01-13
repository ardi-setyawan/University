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

class Tugas_1
{

    public static int N = 2;

    public static void inputData(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol=0, i = 0, stopTombol = 0;
        char stop;
        
        do{ 
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            try
            { 
                bacaTombol = System.in.read();
            }
            catch(java.io.IOException e)
            {
            }
            biodataMahasiswa[i].jekel = (char)bacaTombol;
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("hobi ke-1 : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("hobi ke-2 : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
            
            System.out.println("Mau Masukkan Data Lagi ? (Y/N)");
            try
            { 
                stopTombol = System.in.read();
            }
            catch(java.io.IOException e)
            {
            }
            stop = (char)stopTombol;
            i++;
            
            if(i >= N){
                System.out.println("Maaf, Data Max Yang Bisa Di Masukkan Adalah "+N);
                break;
            }
        }while(stop == 'Y' || stop == 'y');
        tampilData(biodataMahasiswa, i);
        masukan.close();

    }

    public static void tampilData(formatBiodata biodataMahasiswa[], int a) {
        System.out.println("-------------------------------------------");
        System.out.println("DATA bERHASIL DIMASUKKAN");
        System.out.println("-------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
        System.out.println("-------------------------------------------");
        for (int i=0; i<a; i++) { 
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
 
    public static void main(String[] args) {

    //bagian deklarasi record berbasis LARIK -----------------------
    formatBiodata biodataMahasiswa[] = new formatBiodata[N];
    for (int i = 0; i < N; i++) {
        biodataMahasiswa[i] = new formatBiodata();
    }
    
    inputData(biodataMahasiswa);
    }
}