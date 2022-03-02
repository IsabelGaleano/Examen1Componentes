package encripta;

public class EncriptadoVigenere implements Encripta{

    String clave = "PYTHON";

    @Override
    public String encripta(String texto) {
        String claveCompletada = "";
        CifradorVigenere cifradoVigenere = new CifradorVigenere();
        String textoCifrado = "";
        int indice = 0;
        for (int i = indice; i < texto.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (claveCompletada.length() < texto.length()) {
                    if (texto.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }

        for (int i = 0; i < texto.length(); i++) {
            char charTextoClaro = texto.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoClaro != ' ') {
                textoCifrado += cifradoVigenere.getTextoCifrado(charTextoClaro, charClaveCompletada) + "";
            } else {
                textoCifrado += " ";
            }
        }
        System.out.println("EL TEXTO CIFRADO ES: " + textoCifrado);
        return textoCifrado;
    }

    @Override
    public void desencripta(String s) {
        String claveCompletada = "";
        String textoInicial = "";
        DescrifadorVigenere descrifadorVigenere = new DescrifadorVigenere();
        int indice = 0;
        for (int i = indice; i < s.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (claveCompletada.length() < s.length()) {
                    if (s.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char charTextoCifrado = s.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoCifrado != ' ') {
                textoInicial += descrifadorVigenere.getTextoDescifrado(charTextoCifrado, charClaveCompletada) + "";
            } else {
                textoInicial += " ";
            }
        }

        System.out.println("EL TEXTO DECODIFICADO ES: " + textoInicial);
    }





}
