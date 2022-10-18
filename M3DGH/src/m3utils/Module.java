package m3utils;

public class Module {
	/**
	 * Classe per treballar amb els mòduls ------------------------------------
	 */
	public static String getModulCurt(int Codi) {
		String sModul = "";
		switch (Codi) {
		case 1:
			sModul = "Xarxes";
			break;
		case 2:
			sModul = "Hardware";
			break;
		// ...
		default:
			sModul = "Error. Codi invàlid";
			break;
		}
		return sModul;
	}
}