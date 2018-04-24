public class Fecha {

    // Las fechas tienen como origen el 1/1/1 (gregoriano) a las 0:00:00
    private double instante; // fecha y hora en dias (decimal)
    private long fecha;      // fecha en dias (entero)
    private long hora;       // hora (de un dia) en milisegundos (entero)
    public int formato = 0;  // 0 -> 29-3
                             // 1 -> 29/3/68
                             // 2 -> 29-Mar-1968
                             // 3 -> Viernes, 29 de Marzo de 1968
                             // +10 -> se a¤ade hora y minutos
                             // +20 -> se a¤ade hora, minutos y segundos

    private short cicFec[];  // 400 a¤os, 100 a¤os, 4 a¤os, a¤o, mes, dia 
    private short cicHor[];  // dia(s), hora, minuto, segundo, milisegundo

    static private long cFecDur[] =
    {
       146097, 36524, 1461, 365, -1, 1
    };

    static private long cHorDur[] =
    {
       86400000, 3600000, 60000, 1000, 1
    };

    static public short diasem0 = 0;

    static private short diasMes1[] =
    {
      31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    static private short diasHastaMes1[] =
    {
       0, 31, 59, 90,120,151,181,212,243,273,304,334
    };

    static private short diasMes2[] =
    {
      31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    static private short diasHastaMes2[] =
    {
       0, 31, 60, 91,121,152,182,213,244,274,305,335
    };

    static private String nombreDiaSem[] =
    {
       "Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"
    };

    static private String nombreMes[] =
    {
       "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
       "Agosto","Septiembre","Octubre","Noviembre","Diciembre"
    };

    // -------------
    // Constructores
    // -------------

    public Fecha()
    {
       inicio();
       hoy();
    }

    public Fecha( String lin )
    {
       inicio();
       traducir( lin );
    }

    public Fecha( int dia, int mes, int anno, int hora, int min, int seg )
    {
       inicio();
       setDiaMesAnno(dia,mes,anno);
       setHoraMinSeg(hora,min,seg);
    }

    // ----------
    // Miscelanea
    // ----------

    public void inicio()
    {
       cicFec = new short[cFecDur.length];
       cicHor = new short[cHorDur.length];
    }

    public void hoy()
    {
       long tpo = System.currentTimeMillis();
       setDiaMesAnno(1,1,1970);
       setHoraMinSeg(2,0,0);
       fecha += tpo/cHorDur[0];
       fecha2Ciclos();
       hora += tpo%cHorDur[0];
       hora2Ciclos();
       fecHor2Ins();
    }

    // --------------------------------------
    // Traductores instante <--> fecha y hora
    // --------------------------------------

    private void ins2FecHor( )
    {
       fecha = new Double(instante).longValue();
       hora = new Double((instante%1)*cHorDur[0]).longValue();
    }

    private void fecHor2Ins( )
    {
       instante = fecha + (double) (hora)/cHorDur[0];
    }

    // -----------------------------
    // Traductores fecha <--> ciclos
    // -----------------------------

    private void ciclos2Fecha()
    {
       short i;
       for(fecha=0,i=0; i<cFecDur.length; i++)
       {
          fecha += (cFecDur[i]>0) ? cicFec[i]*cFecDur[i]
                                  : cic2FecEsp(i,cicFec[i]);
       }
       fecHor2Ins();
    }

    private void fecha2Ciclos()
    {
       long resto = fecha;
       short i;
       for(i=0; i<cFecDur.length; i++)
       {
          if (cFecDur[i]>0) {
             cicFec[i] = (short) (resto/cFecDur[i]);
             resto %= cFecDur[i];
          } else {
             cicFec[i] = fec2CicEsp(i,resto);
             resto -= cic2FecEsp(i,cicFec[i]);
          }
       }
    }

    // La comprobacion de bisiesto es interesante, se hace publica

    public boolean bisiesto( )
    {
       return( (cicFec[3]==3) && ((cicFec[2]!=24) || (cicFec[1]==3))  );
    }

    // Tratamiento especial de los meses

    private long cic2FecEsp( short numcic, short valcic )
    { 
       return( ( bisiesto()
                 ? diasHastaMes2[valcic]
                 : diasHastaMes1[valcic] )
             );
    }

    private short fec2CicEsp( short numcic, long resfec )
    {
       short dHM[];
       dHM = ( bisiesto() ? diasHastaMes2 : diasHastaMes1 );

       short mes = 1;
       while ( (mes<12) && (dHM[mes]<=resfec) ) mes++;
       mes--;
       return( mes );
    }

    // -----------------------------
    // Traductores hora <--> ciclos
    // -----------------------------

    private void ciclos2Hora()
    {
       short i;
       for(hora=0,i=0; i<cHorDur.length; i++) hora += cicHor[i]*cHorDur[i];
       fecHor2Ins();
    }

    private void hora2Ciclos()
    {
       long resto = hora;
       short i;
       for(i=0; i<cHorDur.length; i++)
       {
          cicHor[i] = (short) (resto/cHorDur[i]);
          resto %= cHorDur[i];
       }
    }

    // -------------------------------------------
    // Traductores ciclos <--> formato tradicional
    // -------------------------------------------

    public double getInstante( ) { return( instante ); }
    public long getFecha( ) { return( fecha ); }

    public short getHoras( )        { return( cicHor[0] ); }
    public short getMinutos( )      { return( cicHor[1] ); }
    public short getSegundos( )     { return( cicHor[2] ); }
    public short getMilisegundos( ) { return( cicHor[3] ); }

    public short getDia( ) { return( (short) (cicFec[5]+1) ); }
    public short getMes( ) { return( (short) (cicFec[4]+1) ); }

    public int getAnno( ) {
       return( cicFec[0]*400 + cicFec[1]*100 + cicFec[2]*4 + cicFec[3] + 1 );
    }

    public short getDiaSemana( ) {
       return( (short) ((fecha + diasem0) % 7) );
    }

    public short getDiaAnno( ) {                    
        return( (short)
                ( cic2FecEsp( (short) 4, cicFec[4] ) + cicFec[5] + 1) ) ;
    }

    public short getSiglo( ) {
        return( (short) (cicFec[0]*4 + cicFec[1] + 1) );
    }

    // Dar valores

    private boolean verificaCiclos()
    {
        return (
           ( (cicFec[1]>=0) && (cicFec[1]<=3)  ) &&
           ( (cicFec[2]>=0) && (cicFec[2]<=24) ) &&
           ( (cicFec[3]>=0) && (cicFec[3]<=3)  ) &&
           ( (cicFec[4]>=0) && (cicFec[4]<=11) ) &&
           ( (cicFec[5]>=0) &&
             (cicFec[5]<(bisiesto() ? diasMes2[cicFec[4]] : diasMes1[cicFec[4]]) )) &&
           ( (cicHor[0]==0) ) &&
           ( (cicHor[1]>=0) && (cicHor[1]<=23) ) &&
           ( (cicHor[2]>=0) && (cicHor[2]<=59) ) &&
           ( (cicHor[3]>=0) && (cicHor[3]<=59) ) &&
           ( (cicHor[4]>=0) && (cicHor[4]<=999) )
        );
    }

    public void setInstante( double instante )
    {
       this.instante = instante;
       ins2FecHor();
       fecha2Ciclos();
       hora2Ciclos();
    }

    public void setFecha( long fecha )
    {
       this.fecha = fecha;
       fecHor2Ins();
       fecha2Ciclos();
    }

    public void setDiaMesAnno( int dia, int mes, int anno )
    {
       short temp[] = new short[cicFec.length];
       int a = anno;
       short i;
       for(i=0; i<temp.length; i++) temp[i] = cicFec[i];
       a--;
       cicFec[0] = (short) (a/400); a %= 400;
       cicFec[1] = (short) (a/100); a %= 100;
       cicFec[2] = (short) (a/4);   a %= 4;
       cicFec[3] = (short) a;
       cicFec[4] = (short) (mes-1);
       cicFec[5] = (short) (dia-1);
       if ( !verificaCiclos() ) {
          for(i=0; i<cicFec.length; i++) {
            System.out.println("Ciclo "+i+" = "+cicFec[i]);
          }
          for(i=0; i<cicFec.length; i++) cicFec[i] = temp[i];
          throw new IllegalArgumentException();
       };
       ciclos2Fecha();
    }

    public void setHoraMinSeg( int horas, int mins, int segs )
    {
       short temp[] = new short[cicHor.length];
       short i;
       for(i=0; i<temp.length; i++) temp[i] = cicHor[i];
       cicHor[0] = 0;
       cicHor[1] = (short) horas;
       cicHor[2] = (short) mins;
       cicHor[3] = (short) segs;
       cicHor[4] = 0;
       if ( !verificaCiclos() ) {
          for(i=0; i<cicHor.length; i++) cicHor[i] = temp[i];
          throw new IllegalArgumentException();
       };
       ciclos2Hora();
    }

    public void setDia( short dia )
    {
       short temp = cicFec[5];
       cicFec[5] = (short) (dia-1);
       if ( !verificaCiclos() ) {
          cicFec[5] = temp;
          throw new IllegalArgumentException();
       };
       ciclos2Fecha();
    }

    public void setMes( short mes )
    {
       short temp = cicFec[4];
       cicFec[4] = (short) (mes-1);
       if ( !verificaCiclos() ) {
          cicFec[4] = temp;
          throw new IllegalArgumentException();
       };
       ciclos2Fecha();
    }

    public void setAnno( int anno )
    {
       short temp[] = {cicFec[0],cicFec[1],cicFec[2],cicFec[3]};
       anno--;
       cicFec[0] = (short) (anno/400); anno %= 400;
       cicFec[1] = (short) (anno/100); anno %= 100;
       cicFec[2] = (short) (anno/4);   anno %= 4;
       cicFec[3] = (short) anno;
       if ( !verificaCiclos() ) {
          cicFec[0] = temp[0];
          cicFec[1] = temp[1];
          cicFec[2] = temp[2];
          cicFec[3] = temp[3];
          throw new IllegalArgumentException();
       };
       ciclos2Fecha();
    }

    public void setDiaSemana( short diasem, boolean sig )
    {

    }

    public void setDiaAnno( short diaanno )
    {

    }

    // ------------------------
    // Conversion de/a cadena
    // ------------------------

    public String toString( )
    {
       String cad;
       int anno = cicFec[0]*400 + cicFec[1]*100 + cicFec[2]*4 + cicFec[3] + 1;

       switch( formato % 10 ) {
         case 0 : cad = (cicFec[5]+1)+"-"+(cicFec[4]+1);
                  break;
         case 1 : cad = (cicFec[5]+1)+"/"+(cicFec[4]+1)+"/"+(anno%100);
                  break;
         case 2 : cad = (cicFec[5]+1)+"-"+
                        nombreMes[cicFec[4]].substring(0,3)+"-"+anno;
                  break;
         default : cad = nombreDiaSem[getDiaSemana()]+", "+
                        (cicFec[5]+1)+" de "+
                        nombreMes[cicFec[4]]+" de "+anno;
       };
       if (formato>9) {
         cad = cad+" "+
               ((cicHor[1]<10) ? "0" : "")+
               cicHor[1]+":"+
               ((cicHor[2]<10) ? "0" : "")+
               cicHor[2];
         if (formato>19) cad = cad+":"+
                         ((cicHor[3]<10) ? "0" : "")+
                         cicHor[3];
       };

       return( cad );
    }

    public void traducir( String cad ) throws IllegalArgumentException
    {
       int n1 = cad.indexOf('/');
       if (n1==-1) throw new IllegalArgumentException();
       short dia = (short) Integer.valueOf(cad.substring(0,n1)).intValue();

       int n2 = cad.indexOf('/',n1+1);
       if (n2==-1) throw new IllegalArgumentException();
       short mes = (short) Integer.valueOf(cad.substring(n1+1,n2)).intValue();

       int n3 = cad.indexOf(' ',n2+1);
       if (n3==-1) {
         int anno = Integer.valueOf(cad.substring(n2+1)).intValue();
         if (anno<100) anno += 1900;
         setDiaMesAnno(dia,mes,anno);
         setHoraMinSeg(0,0,0);
       } else {
         int anno = Integer.valueOf(cad.substring(n2+1,n3)).intValue();
         if (anno<100) anno += 1900;
         setDiaMesAnno(dia,mes,anno);

         int n4 = cad.indexOf(':',n3+1);
         if (n4>-1) {
           short horas = (short) Integer.valueOf(cad.substring(n3+1,n4)).intValue();

           int n5 = cad.indexOf(':',n4+1);
           if (n5>-1) {
              short mins = (short) Integer.valueOf(cad.substring(n4+1,n5)).intValue();
              short segs = (short) Integer.valueOf(cad.substring(n5+1)).intValue();
              setHoraMinSeg(horas,mins,segs);
           } else {
              short mins = (short) Integer.valueOf(cad.substring(n4+1)).intValue();
              setHoraMinSeg(horas,mins,0);
           } 
         } else setHoraMinSeg(0,0,0);
       }
    }

}
