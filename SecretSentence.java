
public class SecretSentence {

    public static void main (String[] args){

       String sentence =  writeSecretSentence("le papillon", "la lune");

       System.out.println(sentence);

    }

    public static String writeSecretSentence (String str1, String str2) {

        return str1 + " s'incline face à " + str2;
    }

}