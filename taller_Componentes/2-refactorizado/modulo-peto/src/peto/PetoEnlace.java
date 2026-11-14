package peto;

import core.GemaEnergia;

/**
 * Peto con escudo propio. La gema de energia (por ejemplo las botas) es un
 * complemento opcional: si se retira (null), el escudo base sigue activo.
 */
public class PetoEnlace {

    private GemaEnergia gema;

    public PetoEnlace() {
        this(null);
    }

    public PetoEnlace(GemaEnergia gema) {
        this.gema = gema;
    }

    public void setGema(GemaEnergia gema) {
        this.gema = gema;
    }

    /** El escudo base del peto siempre esta activo, con o sin gema. */
    public boolean escudoActivo() {
        return true;
    }

    /** Potencia del escudo: 100 con gema cargada, 60 solo con el escudo base. */
    public int potenciaEscudo() {
        return (gema != null && gema.tieneCarga()) ? 100 : 60;
    }
}
