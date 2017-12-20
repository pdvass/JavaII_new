import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Spellchecker {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the file name:");
		String fileName = input.nextLine();
		File textFile = new File (fileName);
		breakWords(textFile);
	}
	public static void breakWords(File file) {
		try{
			Scanner readFile = new Scanner(file, "UTF-8");
			String n = "";
			while (readFile.hasNextLine()){
				n+=readFile.nextLine();
			}
			n=n.substring(1);
			breakWords(n);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public static void breakWords(String text) {
		String word = "";
				for (int i = 0; i < text.length(); i++) {
					if (text.charAt(i) == ','||text.charAt(i) == ' ' ||text.charAt(i) == '.'||text.charAt(i)=='?'||text.charAt(i)=='!'||text.charAt(i)==';'){
						if (word!=""){
							try{
								//pdvass method to search the word
							} catch (WordNotFoundException e){
								//Exception for suggestion of words
							}
						}
						word="";
					} else
						word= word + text.charAt(i);
				}
	}
}