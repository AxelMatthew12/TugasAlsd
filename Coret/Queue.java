package Coret;

public class Queue {
    Pasien[] data;
    int rear;
    int front;
    int size;
    int max;

    public Queue (int n) {
        max =n;
        data = new Pasien[max];
        size =0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean Isfull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pasien ps) {
        if (Isfull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            }else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = ps;
            size++;
        }
    }
    public Pasien dequeue() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        }
        Pasien ps = data[front];
        front = (front + 1) % max;
        size--;
        return ps;
    }

    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: "+ data[front].nama+" "+data[front].noID+" "+data[front].jenisKelamin+" "+data[front].umur);
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama+" "+data[i].noID + " "+data[i].jenisKelamin + " "+data[i].umur);

            i = (i+1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noID +" " + data[i].jenisKelamin + " " + data[i].umur);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public static void menu(){
        System.out.println("Pilih Menu ");
        System.out.println("1. Antrian baru");
        System.out.println("2.Histori antrian");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4 Cek semua antrian");
    }
}
