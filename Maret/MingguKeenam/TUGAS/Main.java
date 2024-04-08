package Maret.MingguKeenam.TUGAS;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel Atri", "Kota A", 200, (byte) 4);
        Hotel hotel2 = new Hotel("Hotel Beings", "Kota B", 150, (byte) 3);
        Hotel hotel3 = new Hotel("Hotel Cityland", "Kota C", 300, (byte) 5);
        Hotel hotel4 = new Hotel("Hotel Dinopark", "Kota D", 180, (byte) 4);
        Hotel hotel5 = new Hotel("Hotel Eliezer", "Kota E", 250, (byte) 4);

        Hotelservice hotelService = new Hotelservice();
        hotelService.tambah(hotel1);
        hotelService.tambah(hotel2);
        hotelService.tambah(hotel3);
        hotelService.tambah(hotel4);
        hotelService.tambah(hotel5);

        System.out.println("Sebelum pengurutan berdasarkan bintang:");
        hotelService.tampil();

        hotelService.bubblleSort();

        System.out.println("\nSetelah pengurutan berdasarkan bintang:");
        hotelService.tampil();
    }
}

