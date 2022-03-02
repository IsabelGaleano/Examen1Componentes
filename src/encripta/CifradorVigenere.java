package encripta;

public class CifradorVigenere {

    char tablaVigenere[] = {
            'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'Ñ',
            'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'
    };

    public char getTextoCifrado(char parTextoClaro, char parTextoClave) {
        int indiceX = 0;
        int indiceY = 0;

        for (int i = 0; i < tablaVigenere.length; i++) {
            if (parTextoClaro == tablaVigenere[i]) {
                indiceX = i;
                break;
            }
        }

        for (int j = 0; j < tablaVigenere.length; j++) {
            if (parTextoClave == tablaVigenere[j]) {
                indiceY = j;
                break;
            }
        }

        return tablaVigenere[(indiceX + indiceY) % 27];
    }
}
