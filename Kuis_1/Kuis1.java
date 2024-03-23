import java.util.*;

public class Kuis1 {
    // Inisialisasi fakta dan variabel global
    static boolean faktaA = true;
    static boolean faktaE = true;
    static boolean faktaC, faktaD, faktaF, faktaG, faktaH, faktaI, faktaJ, faktaK;

    public static void main(String[] args) {
        // Memeriksa apakah K bernilai benar
        forwardChaining();
        boolean isKTrue = faktaK;
        System.out.println("==============================");
        System.out.println("Apakah K bernilai benar? " + isKTrue);
    }

    public static void forwardChaining() {
        System.out.println("Fakta : A dan E");
        boolean A = faktaA;
        boolean E = faktaE;

        // Aturan R1
        if (A) {
            faktaC = true;
            System.out.println("R1: A and B then C");
        }

        // Aturan R2
        if (faktaC) {
            faktaD = true;
            System.out.println("R2: C then D");
        }

        // Aturan R3
        if (A && E) {
            faktaF = true;
            System.out.println("R3: A and E then F");
        }

        // Aturan R4
        if (A) {
            faktaG = true;
            System.out.println("R4: A then G");
        }

        // Aturan R5
        if (faktaF && faktaG) {
            faktaD = true;
            System.out.println("R5: F and G then D");
        }

        // Aturan R6
        if (faktaG && E) {
            faktaH = true;
            System.out.println("R6: G and E then H");
        }

        // Aturan R7
        if (faktaC && faktaH) {
            faktaI = true;
            System.out.println("R7: C and H then I");
        }

        // Aturan R8
        if (faktaI && A) {
            faktaJ = true;
            System.out.println("R8: I and A then J");
        }

        // Aturan R9
        if (faktaG) {
            faktaJ = true;
            System.out.println("R9: G then J");
        }

        // Aturan R10
        if (faktaJ) {
            faktaK = true;
                System.out.println("R10: J then K");
        }
    }
}
