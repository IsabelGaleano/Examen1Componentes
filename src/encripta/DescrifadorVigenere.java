package encripta;

public class DescrifadorVigenere {

    char tablaVigenere[] = {
            'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'Ñ',
            'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'
    };

    public char getTextoDescifrado(char parTextoCifrado, char parTextoClave) {
        int indiceCharTextoCifrado = 0;
        int indiceCharTextoClave = 0;

        for (int i = 0; i < tablaVigenere.length; i++) {
            if (parTextoCifrado == tablaVigenere[i]) {
                indiceCharTextoCifrado = i;
                break;
            }
        }

        for (int j = 0; j < tablaVigenere.length; j++) {
            if (parTextoClave == tablaVigenere[j]) {
                indiceCharTextoClave = j;
                break;
            }
        }
        if(indiceCharTextoCifrado >= indiceCharTextoClave)
            return tablaVigenere[(indiceCharTextoCifrado - indiceCharTextoClave) % 27];
        else
            return tablaVigenere[27-(indiceCharTextoClave - indiceCharTextoCifrado)];
    }
}
