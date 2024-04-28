package April.KumpulanTugas;
import java.util.Scanner;

public class Struk {
    String Notransaksi;
    String tanggal;
    int jumlahBarang;
    double Totalharga;

    Struk(String Notransaksi, String tanggal, int jumlahBarang, double Totalharga) {
        this.Notransaksi = Notransaksi;
        this.tanggal = tanggal;
        this.jumlahBarang = jumlahBarang;
        this.Totalharga = Totalharga;

    }
}
class Stackstruk {
    int size;
    int top;
    Struk data[];

    public Stackstruk (int size) {
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    public boolean IsEmprty() {
        if (top == -1) {
            return true;
        }else {
            return false;
        }
    }
    public boolean IsFull () {
        if (top == size -1) {
            return true;
        }else {
            return false;
        }
    }
    public void push(Struk stk) {
        if (!IsFull()) {
            top ++;
            data[top] = stk;
        } else {
            System.out.println("Isi stack penuh ! ");
        }
    }
    public void pop() {
        if (!IsEmprty()) {
            Struk x = data[top];
            top--;
            System.out.println("Data Struk: "+ x.Notransaksi + " "+ x.tanggal
                                 +" "+ x.jumlahBarang + " " + x.Totalharga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek() {
        System.out.println("Elemen teratas: " + data[top].Notransaksi + " "+ data[top].tanggal + " " + data[top].jumlahBarang + " " + data[top].Totalharga);
    }
    public void print() {
        System.out.println("Isi stack: ");
        for(int i = top; i >= 0; i--) {
            System.out.println(data[i].Notransaksi + " " + data[i].tanggal + " " + data[i].jumlahBarang + " " + data[i].Totalharga);
        }
        System.out.println("");
    }
    public void clear() {
        if (!IsEmprty()) {
            for(int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else {
            System.out.println("Stack masih kosong");
        }
    }

}

class MainDewi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stackstruk stack = new Stackstruk(5);
    char pilih; 


    do {
        System.out.println("NoTransaksi: ");
        String NoTransaksi = sc.nextLine();
        System.out.println("Tanggal: ");
        String Tanggal = sc.nextLine();
        System.out.println("Jumlah barang: ");
        int jumlahBarang = sc.nextInt();
        System.out.println("Total Harga: ");
        double Totalharga = sc.nextDouble();

        Struk s = new Struk(NoTransaksi, Tanggal, jumlahBarang, Totalharga);
        System.out.println("Apakah anda ingin menambahkan struk ? (y/n)");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        stack.push(s);
    } while(pilih == 'y');
     
    stack.print();
    stack.pop();
    stack.peek();
    stack.print();

    }
}
