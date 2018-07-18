
public class cuisine {

	public static String tasse;
	public static String methodeCafe(String arg1, String arg2) {
		return "cafe";
	}
	
	public static boolean cuisson;
	public static boolean bouffeOk(String arg1, String arg2, int arg3) {
		if((arg1.equals("haricots verts")) && (arg2.equals("blé")) && (arg3 >= 30)) {
			return true;
		}
		return false;
	}
	
	public static String plat;
	public static String platServi(String arg1, String arg2, int arg3) {
		if((arg1 == "haricots verts") && (arg2 == "blé") && (arg3 >= 30)) {
			return "plat servi";
		}
		return "plat non servi";
	}
	
	public static void main(String[] args) {
		tasse = methodeCafe("eau", "grains");
		System.out.println(tasse);
		
		cuisson = bouffeOk("haricots verts", "blé", 30);
		if(cuisson == true) {
			System.out.println("Pret");
		}
		else {
			System.out.println("Pas pret");
		}
		
		plat = platServi("haricots verts", "blé", 25);
		System.out.println(plat);
	}

}
