package forEach;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] vetNumeros = new int[]{1,2,3,4,5,6,7,8,9,10};
	System.out.println("Varrendo sem forEach");
	//VARRENDO VETOR SEM FOR EACH
for(int i =0; i<vetNumeros.length;i++) {
	System.out.println("Numero : " + vetNumeros[i]);
}
	
System.out.println("Com o for each");
for (int listaNumeros : vetNumeros) {
	System.out.println("Numero : " + listaNumeros);
}
	}

}
