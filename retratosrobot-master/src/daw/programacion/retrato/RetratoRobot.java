package daw.programacion.retrato;

import java.awt.Color;
import java.util.Random;

public class RetratoRobot {

	private static Random r = new Random();
	
	private static String [][] rasgos = {
			{"pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
			{"ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |"},
			{"nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
			{"boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
			{"barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	private String [] facciones = new String[5];
	
	private Color color;
	
	public RetratoRobot() {
		facciones[0] = rasgos[0][r.nextInt(rasgos[0].length - 1) + 1];
		facciones[1] = rasgos[1][r.nextInt(rasgos[1].length - 1) + 1];
		facciones[2] = rasgos[2][r.nextInt(rasgos[2].length - 1) + 1];
		facciones[3] = rasgos[3][r.nextInt(rasgos[3].length - 1) + 1];
		facciones[4] = rasgos[4][r.nextInt(rasgos[4].length - 1) + 1];
	}
	
	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla) {
		this(pelo, ojos, nariz, boca, barbilla, Color.WHITE);
	}

	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla, Color color) {
		facciones[0] = rasgos[0][pelo];
		facciones[1] = rasgos[1][ojos];
		facciones[2] = rasgos[2][nariz];
		facciones[3] = rasgos[3][boca];
		facciones[4] = rasgos[4][barbilla];
		this.color = color;
	}
	 
	@Override
	public String toString() {
		return facciones[0] + System.getProperty("line.separator") +
				facciones[1] + System.getProperty("line.separator") +
				facciones[2] + System.getProperty("line.separator") +
				facciones[3] + System.getProperty("line.separator") +
				facciones[4];
	}
	
	public void setRasgo(int faccion, int rasgo) {
		facciones[faccion] = rasgos[faccion][rasgo];
	}
	
	public void setPelo(int rasgo) {
		facciones[0] = rasgos[0][rasgo];
	}
	
	public void setOjos(int rasgo) {
		facciones[1] = rasgos[1][rasgo];
	}
	
	public void setNariz(int rasgo) {
		facciones[2] = rasgos[2][rasgo];
	}
	
	public void setBoca(int rasgo) {
		facciones[3] = rasgos[3][rasgo];
	}
	
	public void setBarbilla(int rasgo) {
		facciones[4] = rasgos[3][rasgo];
	}
	
	public String getRasgo(int faccion) {
		return facciones[faccion];
	}
	
	public String getPelo() {
		return facciones[0];
	}
	
	public String getOjos() {
		return facciones[1];
	}
	
	public String getNariz() {
		return facciones[2];
	}
	
	public String getBoca() {
		return facciones[3];
	}
	
	public String getBarbilla() {
		return facciones[4];
	}
	
	public static String [] getRasgos(int faccion) {
		return rasgos[faccion];
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
