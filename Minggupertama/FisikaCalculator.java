import java.util.Scanner;

public class FisikaCalculator {
     static void mainbrain() {
        int kesempatan = 5;
        Scanner sc = new Scanner(System.in);
        while (kesempatan > 0) {
            System.out.println("===============================");
            System.out.println("||          WELCOME          ||");
            System.out.println("||       1. MASUK            ||");
            System.out.println("||       2. KELUAR           ||");
            System.out.println("===============================");
            int pilihan1 = sc.nextInt();
            switch (pilihan1) {
                case 1:
                    Mainmenu();
                    break;
                case 2:
                    Logoutmenu();
                    break;
                default:
                    kesempatan--;
                    System.out.println("Mohon menginput sesuai dengan angka menu tertera ! .."+"Kesempatan tersisa : " + kesempatan);
                    sc.nextLine(); // Membersihkan input yang tidak valid dari buffer
                    break;
            }
        }
        System.out.println("Kesempatan habis. Program berakhir.");
        sc.close(); // Menutup scanner untuk mencegah memory leak
    }

    static void Mainmenu() {
        Scanner sc= new Scanner(System.in);
        double masukjarak;
        double masukwaktu;
        double masukkecepatan;
        System.out.println("=============================");
        System.out.println("||    KALKULATOR FISIKA    ||");
        System.out.println("=============================");
        System.out.println("||  1. KECEPATAN           ||");
        System.out.println("||  2. JARAK               ||");
        System.out.println("||  3. WAKTU               ||");
        int optionchoose=sc.nextInt();
        System.out.println("||=========================||");
        if (optionchoose==1) {
            System.out.println("Masukkan nilai jarak =");
            masukjarak=sc.nextDouble();
            System.out.println("Masukkan nilai waktu =");
            masukkecepatan=sc.nextDouble();
            // main calculate
            double kecepatan= masukjarak / masukkecepatan;
            // Result
            System.out.println("Hasil = "+kecepatan);
            // option
            Alternative();

        }else {
            if (optionchoose==2) {
                System.out.println("Masukkan nilai kecepatan : ");
                masukkecepatan=sc.nextDouble();
                System.out.println("Masukkan nilai Waktu     : ");
                masukwaktu=sc.nextDouble();
                // main calculate
                double jarak=masukkecepatan * masukwaktu;
                // Result
                System.out.println("Hasil = "+jarak);
                Alternative();

            }else {
                if (optionchoose==3) {
                    System.out.println("Masukkan nilai jarak     : ");
                    masukjarak=sc.nextDouble();
                    System.out.println("Masukkan nilai kecepatan : ");
                    masukkecepatan=sc.nextDouble();
                    // main calculate
                    double waktu= masukjarak / masukkecepatan;
                    // Result
                    System.out.println("Hasil = "+waktu);
                    Alternative();
                }
            }
        }
    }

    static void Logoutmenu() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Apakah anda yakin ingin keluar : ");
        System.out.println(" 1.Iya  ");
        System.out.println(" 2.Tidak");
        System.out.println(" Pilihan :");
        int optionlast=sc.nextInt();
        if (optionlast==1) {
            System.out.println("Anda telah keluar .. Terimakasih telah berkunjung '||==UwU==||' ");
            System.exit(0);
        }else {
            mainbrain();
            
        }
        sc.nextLine();
    }
static void Alternative(){
    Scanner sc=new Scanner(System.in);
    System.out.println("====================");
    System.out.println("||     NEXT ?     ||");
    System.out.println("||  1.menu awal   ||");
    System.out.println("||  2.menu utama  ||");
    System.out.println("||  3.logout ?    ||");
    System.out.println("====================");
    System.out.println("Pilihan anda :      ");
    int alteroption=sc.nextInt();
    System.out.println("====================");
    switch (alteroption) {
        case 1:
            mainbrain();
            break;
            case 2:
            Mainmenu();
            break;
            case 3:
            Logoutmenu();
            break;
             default:
             System.out.println("Eror code 404 ! ");
            break;
    }
    
}
    public static void main(String[] args) {
        mainbrain();
    }
}
