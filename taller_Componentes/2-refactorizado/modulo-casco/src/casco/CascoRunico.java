package casco;

public class CascoRunico implements ProteccionElemental {

    @Override
    public String resistirAtaque(String elemento) {
        if ("FUEGO".equalsIgnoreCase(elemento)
                || "HIELO".equalsIgnoreCase(elemento)
                || "RAYO".equalsIgnoreCase(elemento)
                || "MAGICO".equalsIgnoreCase(elemento)) {
            return "Runas activadas: ataque de " + elemento + " absorbido";
        }
        return "Las runas no reaccionan ante ataques de " + elemento;
    }
}
