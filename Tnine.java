import java.util.Scanner;
public class Tnine {
    public static void main(String[] args) {
        changeFthong("Ευγε") ;
    }
    public static void changeFthong(String myWord) {
		Scanner input = new Scanner(System.in);
		String [] es = {"ει", "οι", "η", "ι", "υ"};
		String [] esTone = {"εί", "οί", "ή", "ί", "ύ"};
		String [] esCap = {"Ει", "Οι", "Η", "Ι", "Υ"};
		String [] esCapTone = {"Εί", "Οί", "Ή", "Ί", "Ύ"};
		StringBuffer myBuffer = new StringBuffer(myWord);
		try{
			for (int i = 0; i < myWord.length(); i++) {
				if (myWord.charAt(i) =='ο') {
					if (i+1!=myWord.length()&&myWord.charAt(i+1)=='ι'){
						for (int j=0; j<es.length; j++){
							String retWord=sendWordTwo(myWord, i, es[j]);
							System.out.println(retWord);
						}
					} else if (i+1!=myWord.length()&&myWord.charAt(i+1)=='ί'){
						for (int j=0; j<esTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esTone[j]);
							System.out.println(retWord);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "ω");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='Ο') {
					if (i+1!=myWord.length()&&myWord.charAt(i+1)=='ι'){
						for (int j=0; j<esCap.length; j++){
							String retWord=sendWordTwo(myWord, i, esCap[j]);
							System.out.println(retWord);
						}
					} else if (i+1!=myWord.length()&&myWord.charAt(i+1)=='ί'){
						for (int j=0; j<esCapTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esCapTone[j]);
							System.out.println(retWord);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "Ω");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='ό') {
					String retWord=sendWordOne(myWord, i, "ώ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ό') {
					String retWord=sendWordOne(myWord, i, "Ώ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='ω') {
					String retWord=sendWordOne(myWord, i, "ο");
					System.out.println(retWord);
				} else if (myWord.charAt(i) == 'ώ') {
					String retWord=sendWordOne(myWord, i, "ό");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ω') {
					String retWord=sendWordOne(myWord, i, "Ο");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ώ') {
					String retWord=sendWordOne(myWord, i, "Ό");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='ε'&&myWord.charAt(i+1) == 'υ') {
					String retWord=sendWordTwo(myWord, i, "εβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "εφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='ε'&&myWord.charAt(i+1) == 'ύ') {
					String retWord=sendWordTwo(myWord, i, "έβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "έφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ε'&&myWord.charAt(i+1) == 'υ') {
					String retWord=sendWordTwo(myWord, i, "Εβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "Εφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ε'&&myWord.charAt(i+1) == 'ύ') {
					String retWord=sendWordTwo(myWord, i, "Έβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "Έφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='ε') {
					if(i+1!=myWord.length()&&myWord.charAt(i+1)=='ι'){
						for (int j=0; j<es.length; j++){
							String retWord=sendWordTwo(myWord, i, es[j]);
							System.out.println(retWord);
						}
					}else if(i+1!=myWord.length()&&myWord.charAt(i+1)=='ί'){
						for (int j=0; j<esTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esTone[j]);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "αι");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='Ε') {
					if(i+1!=myWord.length()&&myWord.charAt(i+1)=='ι'){
						for (int j=0; j<esCap.length; j++){
							String retWord=sendWordTwo(myWord, i, esCap[j]);
							System.out.println(retWord);
						}
					}else if(i+1!=myWord.length()&&myWord.charAt(i+1)=='ί'){
						for (int j=0; j<esCapTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esCapTone[j]);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "Aι");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='Έ') {
					if(i+1!=myWord.length()&&myWord.charAt(i+1)=='ι'){
						for (int j=0; j<esCap.length; j++){
							String retWord=sendWordTwo(myWord, i, esCap[j]);
							System.out.println(retWord);
						}
					}else if(i+1!=myWord.length()&&myWord.charAt(i+1)=='ί'){
						for (int j=0; j<esCapTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esCapTone[j]);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "Αί");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='έ') {
					String retWord=sendWordOne(myWord, i, "αί");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='α'&&myWord.charAt(i+1)=='ι'){
					String retWord=sendWordTwo(myWord, i, "ε");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='Α'&&myWord.charAt(i+1)=='ι'){
					String retWord=sendWordTwo(myWord, i, "Ε");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='α'&&myWord.charAt(i+1)=='ί'){
					String retWord=sendWordTwo(myWord, i, "έ");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='Α'&&myWord.charAt(i+1)=='ί'){
					String retWord=sendWordTwo(myWord, i, "Έ");
					System.out.println(retWord);
				} else if (isE(myWord.charAt(i))&&notInFthong(myWord.charAt(i), myWord, i)) {
					for (int j=0; j<es.length; j++){
						String retWord= sendWordOne(myWord, i, es[j]);
						System.out.println(retWord);
					}
				} else if (isETone(myWord.charAt(i))&&notInFthong(myWord.charAt(i), myWord, i)) {
					for (int j=0; j<esTone.length; j++){
						String retWord= sendWordOne(myWord, i, esTone[j]);
						System.out.println(retWord);
					}
				} else if (isECap(myWord.charAt(i))&&notInFthong(myWord.charAt(i), myWord, i)) {
					for (int j=0; j<esCap.length; j++){
						String retWord= sendWordOne(myWord, i, esCap[j]);
						System.out.println(retWord);
					}
				} else if (isECapTone(myWord.charAt(i))&&notInFthong(myWord.charAt(i), myWord, i)) {
					for (int j=0; j<esCapTone.length; j++){
						String retWord= sendWordOne(myWord, i, esCapTone[j]);
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i)=='γ'){
					if (myWord.charAt(i+1)=='κ'){
						String retWord = sendWordTwo(myWord, i, "γγ");
						System.out.println(retWord);
					} else if (myWord.charAt(i+1)=='γ'){
						String retWord = sendWordTwo(myWord, i, "γκ");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i)=='Γ'){
					if (myWord.charAt(i+1)=='κ'){
						String retWord = sendWordTwo(myWord, i, "Γγ");
						System.out.println(retWord);
					} else if (myWord.charAt(i+1)=='γ'){
						String retWord = sendWordTwo(myWord, i, "Γκ");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='α'&&myWord.charAt(i+1) == 'υ') {
					String retWord=sendWordTwo(myWord, i, "αβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "αφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='α'&&myWord.charAt(i+1) == 'ύ') {
					String retWord=sendWordTwo(myWord, i, "άβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "άφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Α'&&myWord.charAt(i+1) == 'υ') {
					String retWord=sendWordTwo(myWord, i, "Αβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "Αφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Α'&&myWord.charAt(i+1) == 'ύ') {
					String retWord=sendWordTwo(myWord, i, "’β");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "’φ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='ε'&&myWord.charAt(i+1) == 'υ') {
					String retWord=sendWordTwo(myWord, i, "εβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "εφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='ε'&&myWord.charAt(i+1) == 'ύ') {
					String retWord=sendWordTwo(myWord, i, "έβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "έφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ε'&&myWord.charAt(i+1) == 'υ') {
					String retWord=sendWordTwo(myWord, i, "Εβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "Εφ");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='Ε'&&myWord.charAt(i+1) == 'ύ') {
					String retWord=sendWordTwo(myWord, i, "Έβ");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "Έφ");
					System.out.println(retWord);
				}
			}
		} catch(StringIndexOutOfBoundsException e){}
		/*System.out.println("Would you like to add the word "+myWord+" to the dictionary?");
		String answer = input.nextLine();
		if (answer == "yes")
			System.out.print("");
			//pdvass method to add the word to db*/
	}
	public static String sendWordOne(String myWord, int i, String letter){
		StringBuffer myBuffer = new StringBuffer(myWord);
		myBuffer.replace(i, i+1, letter);
		String retWord = myBuffer.toString();
		/*if (retWord.isEqaul(myWord)!=true){
			boolean find = pdvass(retWord);
			if (find == true) {
				System.out.println(retWord);
				break;
			}
		}*/
		return retWord;
	}
	public static String sendWordTwo(String myWord, int i, String fthong){
		StringBuffer myBuffer = new StringBuffer(myWord);
		myBuffer.replace(i, i+2, fthong);
		String retWord=myBuffer.toString();
		/*if (retWord.isEqaul(myWord)!=true){
			boolean find = pdvass(retWord);
			if (find == true) {
				System.out.println(retWord);
				break;
			}
		}*/
		return retWord;
	}
	public static boolean isE(char letter) {
		if (letter=='η'||letter=='υ'||letter=='ι') {
			return true;
		}
		return false;
	}
	public static boolean isECap(char letter) {
			if (letter=='Η'||letter=='Υ'||letter=='Ι') {
				return true;
			}
			return false;
	}
	public static boolean isECapTone(char letter) {
			if (letter=='Ή'||letter=='Ύ'||letter=='Ί') {
				return true;
			}
			return false;
	}
	public static boolean isETone(char letter) {
			if (letter=='ή'||letter=='ύ'||letter=='ί') {
				return true;
			}
			return false;
	}
	public static boolean notInFthong(char myLetter, String myWord, int pos ){
		if (myLetter=='ι'||myLetter=='ί'&&pos!=0){
			char [] letters = {'ε', 'α', 'ο', 'Ε', 'Α', 'Ο'};
			for (int i=0; i<letters.length; i++){
				if (myWord.charAt(pos-1)==letters[i])
					return false;
			}
		}
		if (myLetter=='υ'||myLetter=='ύ'&&pos!=0){
			char [] letters = {'ε', 'α', 'Ε', 'Α'};
			for (int i=0; i<letters.length; i++){
				if (myWord.charAt(pos-1)==letters[i])
					return false;
			}
		}
		return true;
	}
}