import java.util.Scanner;

import daw.programacion.retrato.RetratoRobot;

public class Demo1 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int pelo = elegirRasgo(RetratoRobot.getRasgos(0));
		int ojos = elegirRasgo(RetratoRobot.getRasgos(1));
		int nariz = elegirRasgo(RetratoRobot.getRasgos(2));
		int boca = elegirRasgo(RetratoRobot.getRasgos(3));
		int barbilla = elegirRasgo(RetratoRobot.getRasgos(4));
		RetratoRobot retrato = new RetratoRobot(pelo, ojos, nariz, boca, barbilla);
		System.out.println(retrato);
	}
	
	public static int elegirRasgo(String [] rasgos) {
		System.out.println("Elige un rasgo para " + rasgos[0] + ": (1 - " + (rasgos.length - 1) + ")");
		for (int i=1; i<rasgos.length; i++)
			System.out.println(i + " - " + rasgos[i]);
		int rasgo = in.nextInt();
		return rasgo;
	}
	
}
