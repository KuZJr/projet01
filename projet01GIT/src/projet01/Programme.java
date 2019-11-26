package projet01;

import java.util.Arrays;
import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programme op = new Programme();
		op.atelier11();
	}
	
	public void atelier2() {
		boolean bool = true;
		System.out.println(bool);
		int i = 58;
		System.out.println(i);
		float f = -0.5f;
		System.out.println(f);
		double d = 1.8;
		System.out.println(d);
		char c = 'c';
		System.out.println(c);
		String s = "Coucou";
		System.out.println(s);
	}
	
	public void atelier3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre nom ?");
		String nom = sc.nextLine();
		System.out.println("Quel est votre prénom ?");
		String prenom = sc.nextLine();
		System.out.println("Quel âge avez-vous ?");
		int age = sc.nextInt();
		System.out.println("Bienvenue, "+nom+" "+prenom+", âgé de "+age+" an(s)");
	}
	
	public void atelier4( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un entier :");
		int a = sc.nextInt();
		System.out.println("Donnez un 2è entier");
		int b = sc.nextInt();
		System.out.println("Tapez 'true' ou 'false'");
		boolean c = sc.nextBoolean();
		System.out.println("Tapez 'true' ou 'false'");
		boolean d = sc.nextBoolean();
		
		System.out.println("Voici plusieurs résultats :");
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		if (b != 0) { 
			System.out.println(a+" / "+b+" = "+(a/b));
			System.out.println(a+" % "+b+" = "+(a%b));
			System.out.println(a+" + "+b+" - "+"("+a+" / "+b+") = "+(a+b-(a/b)));
			System.out.println(a+" + ("+b+" - "+a+") / "+b+" = "+(a+(b-a)/b));
		}
		else
			System.out.println("Division par 0 impossible !");
			
		System.out.println(a+" == "+b+" = "+(a==b));
		System.out.println(a+" != "+b+" = "+(a!=b));
		System.out.println(a+" > "+b+" = "+(a>b));
		System.out.println(a+" >= "+b+" = "+(a>=b));
		System.out.println(a+" < "+b+" = "+(a<b));
		System.out.println(a+" <= "+b+" = "+(a<=b));
		System.out.println(c+" && "+d+" = "+(c&&d));
		System.out.println(c+" || "+d+" = "+(c||d));
		System.out.println("!"+c+" = "+(!c));
	}
	
	public void atelier5() {
		byte a = 127;
		short b = 32767;
		System.out.println("a = "+a+", b = "+b);
		b=a;
		//a=b --> impossible de transtyper
		System.out.println("a = "+a+", b = "+b);
	}
	
	public void atelier6() {
		String s = "Chaîne de caractère";
		String s2 = "Une autre chaîne de caractère";
		String s3 = "Une chaîne de caractère";
		String s4 = "Chaîne de caractère";
		
		System.out.println(s+" == "+s2+" = "+(s==s2));
		System.out.println(s+" == "+s3+" = "+(s==s3));
		System.out.println(s+" == "+s4+" = "+(s==s4));
		
		System.out.println("Avec la méthode equals : "+s+" == "+s2+" = "+s.equals(s2));
		System.out.println("Avec la méthode equals : "+s+" == "+s2+" = "+s.equals(s3));
		System.out.println("Avec la méthode equals : "+s+" == "+s2+" = "+s.equals(s4));
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf('a'));
	}
	
	public void atelier7() {
		System.out.println(Math.abs(198));
		System.out.println(Math.min(1651.51456, 4894.298));
		System.out.println(Math.max(1651.51456, 4894.298));
		System.out.println(Math.random());
	}
	
	public void atelier8() {
		boolean a = true;
		boolean b = false;
		byte c = 1;
		byte d = 2;
		
		if (a)
			System.out.println("Test a");
		
		if (b)
			System.out.println("Test b");
		
		if (c==d)
			System.out.println("Test c et d");
		else {
			if (c==1)
				System.out.println("Test c");
			if (d==2)
				System.out.println("Test d");
		}
		
		if (c!=d)
			System.out.println("c et d différent");
		
		if (c>d)
			System.out.println("c>d");
		else
			System.out.println("c<d");
		
		int x = 5;
		
		switch (x) {
		case 1:
			System.out.println("x=1");
			break;
			
		case 5:
			System.out.println("x=5");
			break;

		default:
			break;
		}
	}
	
	public void atelier9() {
		int i = 1;
		while (i<6) {
			System.out.println(i);
			i++;
		}
		
		boolean b = true;
		do {
			b = false;
			System.out.println("Message unique do...while");
		} while (b);
		
		for (int i2=0;i2<1;i2++) {
			System.out.println("Message unique for");
		}
	}
	
	public void atelier10() {
		String[] tab = {"Pikachu", "Salamèche", "Bulbizarre", "Carapuce", "Racaillou"};
		Arrays.sort(tab);
		for (int i=0;i<tab.length;i++)
			System.out.println(tab[i]);
		
		String[] evo1 = {"Pikachu", "Raichu"};
		String[] evo2 = {"Salamèche", "Reptincel", "Dracaufeu"};
		String[] evo3 = {"Bulbizarre", "Herbizarre", "Florizarre"};
		String[] evo4 = {"Carapuce", "Carabaffe", "Tortank"};
		String[] evo5 = {"Racaillou", "Gravalanch", "Grolem"};
		String[][] tab2 = {evo1, evo2, evo3, evo4, evo5};
		
		for (int i=0;i<tab2.length;i++) {
			System.out.println("--------------------------------");
			System.out.println("Liste d'évolutions "+i);
			for (int j=0;j<tab2[i].length;j++) {
				System.out.println(tab2[i][j]+" ");
			}
		}
	}
	
	public void atelier11() {
		System.out.println("*****************************************");
		System.out.println("* Bienvenue dans le jeu \"Hidden number\" *");
		System.out.println("*****************************************");
		System.out.println("\nRègles :");
		System.out.println("	1. Un nombre entre 1 et 10 va être généré aléatoirement");
		System.out.println("	2. Vous avez 5 chances pour retrouver ce nombre");
		System.out.println("Veuillez entrer votre pseudo :");
		Scanner sc = new Scanner(System.in);
		String nom = sc.nextLine();
		
		int nbmystere = (int) (Math.random()*(10-1));
		
		System.out.println("*****************************************");
		boolean fin = false;
		int chances = 5;
		int coups = 0;
		while (!fin) {
			System.out.println("Il vous reste "+chances+" chance(s)");
			int proposition = sc.nextInt();
			
			if (proposition == nbmystere) {
				coups += 1;
				fin = true;
			}
			else {
				chances -= 1;
				coups += 1;
			}
		
			if (coups == 5)
				fin = true;
		}
		
		if (coups == 5)
			System.out.println("Dommage ! Essayez encore !");
		else
			System.out.println("Félicitations "+nom+" ! Vous avez réussi en "+coups+" coup(s) !");
	}
}
