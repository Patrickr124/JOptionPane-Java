package exercicioderepeticao3;

import javax.swing.JOptionPane;

public class ExercicioJOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,s=0,tot=0,totimpar=0,totpar=0,mcem=0,m;
		
		 
		do {
			n=Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(O valor 0 interrompe)</em></html> "));

			 s+=n;
			 
			 while(s!=tot) { 
				 tot++;
			 }
			 
			 
			 if(n>=100){
			mcem++;	 
			 }
			 
		    if(n%2==0) {
		    totpar++;	
		    }
		    else {
		    totimpar++;	
		    }
		    }while(n!=0);
		    	m=s/tot;
		    	
		  JOptionPane.showMessageDialog(null, "<html>Resultado: <br>-----------------"
		    			
		    	+"<br>Total de Valores: " + tot		
		    	+"<br>Total de Pares: " + totpar
		        +"<br>Total de Impares: " + totimpar
		    	+"<br>Acima de Cem: " + mcem
		        +"<br>Média dos Valores: " + m
		    	+"</html>",
		        "Resultado Final ",JOptionPane.WARNING_MESSAGE);
		    
			 

		
		

	        
		
		

	
			
			
		
			
			
			                             
	
} }
