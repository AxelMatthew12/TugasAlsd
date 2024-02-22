package Minggukedua.NAGA;

import java.util.Scanner;

public class Maindragon {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek dragon
        Braincode dragon = new Braincode();
        
        // Mengatur lebar dan tinggi area permainan
        dragon.width = 10;
        dragon.height = 10;
        
        // Memindahkan dragon ke posisi awal
        dragon.x = 5;
        dragon.y = 5;
        
        // Memanggil method untuk mencetak posisi awal dragon
        dragon.printPosition();
        
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("==================");
            System.out.println("|| Pilih aksi:  ||");
            System.out.println("||1. Move UP    ||");
            System.out.println("||2. Move RIGHT ||");
            System.out.println("||3. Move LEFT  ||");
            System.out.println("||4. Move Down  ||");
            System.out.println("||0. Keluar     ||");
            System.out.println("==================");

            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    dragon.moveup();
                    break;
                
                case 2 :
                    dragon.moveright();
                    break;

                case 3 :
                    dragon.moveleft();
                    break;

                case 4 :
                    dragon.movedown();
                    break;

                case 0 :
                    gameOver = true;
                    System.out.println("Game Over");
                    break;

                default:
                    break;
            }

            if (dragon.x < 0 || dragon.x >= dragon.width || dragon.y < 0 || dragon.y >= dragon.height) {
                dragon.detectCollision();
                gameOver = true;
            } else {
                // Memanggil method untuk mencetak posisi dragon setelah bergerak
                dragon.printPosition();
            }
        }

        sc.close();
    }
}
