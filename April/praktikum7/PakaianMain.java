package April.praktikum7;
import java.util.Scanner;

public class PakaianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClothingStack stk = new ClothingStack(5);

        char pilih;
        do {
            System.out.print("Jenis\t: ");
            String jenis = sc.nextLine();
            System.out.print("Warna\t: ");
            String warna = sc.nextLine();
            System.out.print("Merk\t: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran\t: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga\t: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan Menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);

        } while (pilih == 'y');
            System.out.println("-------------------------");
            System.out.println("Pilih : ");
            System.out.println("Print,peek,  print , pop");
            System.out.println("(1   , 2  ,   3   ,    4)");
            System.out.println("-------------------------");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    stk.print();
                    break;
                    case 2:
                    stk.peek();
                    break;
                    case 3:
                    stk.print();
                    break;
                    case 4:
                    stk.pop();
                default:
                System.out.println("Pilihan anda tidak tepat silahkan isi lagi : ");
                    break;
            }


       
    }
}

class Pakaian {
    String jenis, warna, merk, ukuran;
    double harga;

    Pakaian(String jenis, String warna, String merk, String ukuran, double harga) {
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
}

class ClothingStack {
    int size, top;
    Pakaian data[];

    public ClothingStack(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Pakaian pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi Stack Penuh !");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack Masih Kosong!");
        }
    }

    public void peek() {
        if (!isEmpty())
            System.out.println("Elemen Teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
        else
            System.out.println("Stack Masih Kosong!");
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi Stack : ");
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Stack Masih Kosong!");
        }
    }

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Stack Sudah diKosongkan");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
}
