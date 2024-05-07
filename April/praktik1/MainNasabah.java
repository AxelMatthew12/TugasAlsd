package April.praktik1;

import java.util.Scanner;

public class MainNasabah {
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public MainNasabah(int max) {
        this.max = max;
        data = new Nasabah[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Nasabah customer) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = customer;
        size++;
    }

    public Nasabah dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        }
        Nasabah customer = data[front];
        front = (front + 1) % max;
        size--;
        return customer;
    }

    public Nasabah peek() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        }
        return data[front];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.println(data[i].norek + " " + data[i].nama
                                + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            i = (i + 1) % max;
        }
        System.out.println(data[i].norek + " " + data[i].nama
                            + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
        System.out.println("Jumlah elemen = " + size);
    }
    public static void menu() {
        System.out.println("--------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Masukkan jumlah nasabah: ");
       int Jumlah = sc.nextInt();
       MainNasabah antri = new MainNasabah(Jumlah);
       int pilih;

       do {
        menu();
        pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {
            case 1:
                System.out.println("No rekening: ");
                String norek = sc.nextLine();
                System.out.println("Nama: ");
                String nama =sc.nextLine();
                System.out.println("Alamat: ");
                String alamat = sc.nextLine();
                System.out.println("Umur: ");
                int umur = sc.nextInt();
                System.out.println("Saldo: ");
                double saldo = sc.nextDouble();
                Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                sc.nextLine();
                antri.enqueue(nb);
                break;
        case 2:
        Nasabah data = antri.dequeue();
        if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
            && data.umur !=0 && data.saldo !=0) {
            System.out.println("Antrian yang keluar: "+data.norek + " " + data.nama + " " 
                    +data.alamat + " " + data.umur + " " + data.saldo);
                    break;
        }
        case 3:
        antri.peek();
        break;
        case 4:
        antri.print();
        break;
        }
       } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
}
}