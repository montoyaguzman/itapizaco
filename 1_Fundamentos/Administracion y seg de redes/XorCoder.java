import java.net.*;
 import java.io.*;
public class XorCoder
{
public static String cifra(String Pass, String clave){
	String Codigo, CAR;
	int i;
	//String clave = new String("%�&/@#$A");
	String Pass2 = new String("");
	char codigo[],car[];
		for(i=1;i<= Pass.length();i++){
	    	CAR = Mid(Pass,i, 1);
			car= CAR.toCharArray();
			Codigo = Mid(clave, ((i - 1) % clave.length()) + 1, 1);
			codigo= Codigo.toCharArray();
			Pass2 = Pass2 + Right("0" + Integer.toHexString((int)codigo[0] ^ (int)car[0]), 2);
 
		}
 
       return Pass2;
	}
	public static String descifra(String Pass,String clave){
	String Codigo, CAR;
	int i,j=1;
	//String clave = new String("%�&/@#$A");
	String Pass2 = new String("");
	char codigo[],car[],hex[];
		for(i=1;i<= Pass.length();i=i+2){
			CAR =Mid(Pass, i, 2);
			car= CAR.toCharArray();
			Codigo = Mid(clave, ((j - 1) % clave.length()) + 1, 1);
			codigo= Codigo.toCharArray();
			Pass2 = Pass2 + (char)((int)codigo[0] ^ Integer.parseInt(CAR, 16));
			j++;
		}
		return Pass2;
	}
 
	public static String Mid(String cad,int a, int b){
		cad = cad.substring(a-1,a + b -1);
		return cad;
	}
 
	public static String Right(String cad,int a){
 
        cad = reverse(cad);
		cad = cad.substring(0,a);
        cad = reverse(cad);
        return cad;
	}
 
	public static String reverse(String source) {
        int i, len = source.length();
        StringBuffer dest = new StringBuffer(len);
 
        for (i = (len - 1); i >= 0; i--) {
            dest.append(source.charAt(i));
        }
        return dest.toString();
    }
 
 }