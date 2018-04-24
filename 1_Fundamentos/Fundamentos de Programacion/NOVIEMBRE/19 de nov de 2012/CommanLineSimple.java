import javax.swing.*;
public class CommanLineSimple{
public static void main (String[] args){

String [][] dogs={{"terry","brown"},
                  {"kristin","white"},
					   {"toby","gray"},
						{"fido","black"},
						};


for(int i=0; i<4; i++)
JOptionPane.showMessageDialog(null,dogs[i]);
}
}

