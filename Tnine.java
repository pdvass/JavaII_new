import java.util.Scanner;
public class Tnine {
    public static void main(String[] args) {
        changeFthong("����") ;
    }
    public static void changeFthong(String myWord) {
		Scanner input = new Scanner(System.in);
		String [] es = {"��", "��", "�", "�", "�"};
		String [] esTone = {"��", "��", "�", "�", "�"};
		String [] esCap = {"��", "��", "�", "�", "�"};
		String [] esCapTone = {"��", "��", "�", "�", "�"};
		StringBuffer myBuffer = new StringBuffer(myWord);
		try{
			for (int i = 0; i < myWord.length(); i++) {
				if (myWord.charAt(i) =='�') {
					if (i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<es.length; j++){
							String retWord=sendWordTwo(myWord, i, es[j]);
							System.out.println(retWord);
						}
					} else if (i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esTone[j]);
							System.out.println(retWord);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "�");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='�') {
					if (i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esCap.length; j++){
							String retWord=sendWordTwo(myWord, i, esCap[j]);
							System.out.println(retWord);
						}
					} else if (i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esCapTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esCapTone[j]);
							System.out.println(retWord);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "�");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='�') {
					String retWord=sendWordOne(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�') {
					String retWord=sendWordOne(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�') {
					String retWord=sendWordOne(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i) == '�') {
					String retWord=sendWordOne(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�') {
					String retWord=sendWordOne(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�') {
					String retWord=sendWordOne(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�') {
					if(i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<es.length; j++){
							String retWord=sendWordTwo(myWord, i, es[j]);
							System.out.println(retWord);
						}
					}else if(i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esTone[j]);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "��");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='�') {
					if(i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esCap.length; j++){
							String retWord=sendWordTwo(myWord, i, esCap[j]);
							System.out.println(retWord);
						}
					}else if(i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esCapTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esCapTone[j]);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "A�");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='�') {
					if(i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esCap.length; j++){
							String retWord=sendWordTwo(myWord, i, esCap[j]);
							System.out.println(retWord);
						}
					}else if(i+1!=myWord.length()&&myWord.charAt(i+1)=='�'){
						for (int j=0; j<esCapTone.length; j++){
							String retWord=sendWordTwo(myWord, i, esCapTone[j]);
						}
					} else {
						String retWord=sendWordOne(myWord, i, "��");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='�') {
					String retWord=sendWordOne(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='�'&&myWord.charAt(i+1)=='�'){
					String retWord=sendWordTwo(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='�'&&myWord.charAt(i+1)=='�'){
					String retWord=sendWordTwo(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='�'&&myWord.charAt(i+1)=='�'){
					String retWord=sendWordTwo(myWord, i, "�");
					System.out.println(retWord);
				} else if (myWord.charAt(i)=='�'&&myWord.charAt(i+1)=='�'){
					String retWord=sendWordTwo(myWord, i, "�");
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
				} else if (myWord.charAt(i)=='�'){
					if (myWord.charAt(i+1)=='�'){
						String retWord = sendWordTwo(myWord, i, "��");
						System.out.println(retWord);
					} else if (myWord.charAt(i+1)=='�'){
						String retWord = sendWordTwo(myWord, i, "��");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i)=='�'){
					if (myWord.charAt(i+1)=='�'){
						String retWord = sendWordTwo(myWord, i, "��");
						System.out.println(retWord);
					} else if (myWord.charAt(i+1)=='�'){
						String retWord = sendWordTwo(myWord, i, "��");
						System.out.println(retWord);
					}
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
				} else if (myWord.charAt(i) =='�'&&myWord.charAt(i+1) == '�') {
					String retWord=sendWordTwo(myWord, i, "��");
					System.out.println(retWord);
					retWord=sendWordTwo(myWord, i, "��");
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
		if (letter=='�'||letter=='�'||letter=='�') {
			return true;
		}
		return false;
	}
	public static boolean isECap(char letter) {
			if (letter=='�'||letter=='�'||letter=='�') {
				return true;
			}
			return false;
	}
	public static boolean isECapTone(char letter) {
			if (letter=='�'||letter=='�'||letter=='�') {
				return true;
			}
			return false;
	}
	public static boolean isETone(char letter) {
			if (letter=='�'||letter=='�'||letter=='�') {
				return true;
			}
			return false;
	}
	public static boolean notInFthong(char myLetter, String myWord, int pos ){
		if (myLetter=='�'||myLetter=='�'&&pos!=0){
			char [] letters = {'�', '�', '�', '�', '�', '�'};
			for (int i=0; i<letters.length; i++){
				if (myWord.charAt(pos-1)==letters[i])
					return false;
			}
		}
		if (myLetter=='�'||myLetter=='�'&&pos!=0){
			char [] letters = {'�', '�', '�', '�'};
			for (int i=0; i<letters.length; i++){
				if (myWord.charAt(pos-1)==letters[i])
					return false;
			}
		}
		return true;
	}
}