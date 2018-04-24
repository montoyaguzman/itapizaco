package modelo.automata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public abstract class AutomataFinito {
    /**
     * Conjunto de estados del automata
     */
    protected List<String> conjuntoDeEstados;
    /**
     * Alfabeto de entrada, contiene unucamente los numeros del 0 al 9
     * y caracteres del alfabeto inglles
     */
    protected List<String> alfabetoEntrada;
    /**
     * Es el estado inicial del automata, debe pertenecer al conjunto de estados.
     */
    protected String estadoInicial;
    /**
     * El conjunto de estados finales del automata, pertenece al conjunto de estados.
     */
    protected List<String> conjuntoEstadosFinales;
    /**
     * Tabla de transiciones utilizada para modelar la funcion de transicion
     * del automata.
     */
    protected String[][] tablaDeTransiciones;

    /**
     * Construye un automata finito vacio, todos sus componentes nulos.
     */
    public AutomataFinito() {
        this.conjuntoDeEstados = null;
        this.alfabetoEntrada = null;
        this.estadoInicial = null;
        this.conjuntoEstadosFinales = null;
        this.tablaDeTransiciones = null;
    }

    /**
     * Construye un automata finito dada la quintipla.
     *
     * @param conjuntoDeEstados
     * @param alfabetoEntrada
     * @param estadoInicial
     * @param conjuntoEstadosFinales
     * @param tablaDeTransiciones
     */
    public AutomataFinito(Collection<String> conjuntoDeEstados, Collection<String> alfabetoEntrada,
            String estadoInicial, Collection<String> conjuntoEstadosFinales, String[][] tablaDeTransiciones) {
        try {
            setConjuntoDeEstados(conjuntoDeEstados);
            setAlfabetoEntrada(alfabetoEntrada);
            setEstadoInicial(estadoInicial);
            setConjuntoEstadosFinales(conjuntoEstadosFinales);
            this.tablaDeTransiciones = tablaDeTransiciones;
        } catch (Exception ex) {
            Logger.getLogger(AutomataFinito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Inicia el conjunto de estados del automata finito, dada una coleccion.
     * @param conjuntoEstados
     */
    public void setConjuntoDeEstados(Collection<String> conjuntoEstados) {
        this.conjuntoDeEstados = new ArrayList<String>(conjuntoEstados);
    }

    /**
     *
     * @return
     */
    public List<String> getConjuntoDeEstados() {
        return conjuntoDeEstados;
    }

    /**
     *
     * @param alfabetoEntrada
     */
    public void setAlfabetoEntrada(Collection<String> alfabetoEntrada) {
        this.alfabetoEntrada = new ArrayList<String>(alfabetoEntrada);
    }

    /**
     *
     * @return
     */
    public List<String> getAlfabetoEntrada() {
        return alfabetoEntrada;
    }

    /**
     *
     * @param estadoInicial
     * @throws Exception
     */
    public void setEstadoInicial(String estadoInicial) throws Exception {
        if(getConjuntoDeEstados().contains(estadoInicial)) {
            this.estadoInicial = estadoInicial;
        }else {
            throw new Exception("El estado inicial debe pertenecer al conjunto de estados");
        }
    }

    /**
     *
     * @return
     */
    public String getEstadoInicial() {
        return estadoInicial;
    }

    /**
     *
     * @param estadosFinales
     * @throws Exception
     */
    public void setConjuntoEstadosFinales(Collection<String> estadosFinales) throws Exception {
        if(getConjuntoDeEstados().containsAll(estadosFinales)) {
            this.conjuntoEstadosFinales = new ArrayList<String>(estadosFinales);
        }else {
            throw new Exception("Los estados finales deben pertenecer al conjunto de estados");
        }
    }

    /**
     *
     * @return
     */
    public List<String> getConjuntoEstadosFinales() {
        return conjuntoEstadosFinales;
    }

    /**
     *
     * @return
     */
    public String[][] getTablaDeTransiciones() {
        return tablaDeTransiciones;
    }

    /**
     *
     * @param tablaDeTransiciones
     */
    public void setTablaDeTransiciones(String[][] tablaDeTransiciones) {
        this.tablaDeTransiciones = tablaDeTransiciones;
    }

    /**
     *
     * @return
     */
    public boolean contieneEstadoInicial() {
        return this.estadoInicial!=null;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public abstract boolean analisisLexico(String cadena) throws Exception ;
    /**
     *
     */
    public abstract void eliminarEstadosInaccesibles();
    /**
     *
     * @param af
     * @return
     */
    public abstract boolean esEquivalente(AutomataFinito af);



}
