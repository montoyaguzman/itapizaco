import java.util.BitSet;

public class Automata1 {
protected	int [][] transicion;
protected	BitSet	 estadosFinales;
protected	int	 estadoInicial;

protected	int	 estado;

public Automata1 (int [][] transicion, BitSet estadosFinales, int estadoInicial)
{
this.estadosFinales = estadosFinales;
this.estadoInicial = estadoInicial;
this.transicion = transicion;
}

public boolean enEstadoFinal ()
{
return estadosFinales.get(estado);
}

public void iniciar ()
{
estado = estadoInicial;
}

public void avanzar (int simbolo)
{
estado = transicion [estado][simbolo];
}
}