package extra.mensajeEncriptado;

import java.io.Serializable;

public class CifrarDescifrar implements InterfazCifrarDescifrar, Serializable{
	
	private static int codigo = 17;
	
	@Override
	public String cifrar(String texto) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) == ' ') {
            	if (Math.random()<0.2) {
            		cifrado.append("_");
            	}else if (Math.random()<0.4) {
            		cifrado.append("#");
            	}else if (Math.random()<0.6) {
            		cifrado.append("*");
            	}else if (Math.random()<0.8) {
            		cifrado.append("-");
            	}else {
            		cifrado.append("|");
            	}
            }
        }
        return cifrado.toString();
    }

	@Override
    public String descifrar(String texto) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }else if ((texto.charAt(i) == '_') || (texto.charAt(i) == '-') || (texto.charAt(i) == '|') || (texto.charAt(i) == '*') || (texto.charAt(i) == '#')){
            	cifrado.append(" ");
            }
        }
        return cifrado.toString();
    }
	
 
}
