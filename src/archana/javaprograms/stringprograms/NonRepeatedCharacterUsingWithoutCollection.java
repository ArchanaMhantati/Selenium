package archana.javaprograms.stringprograms;

public class NonRepeatedCharacterUsingWithoutCollection {
    public static void main(String[] args) {
        String string = "archana";
        for(int i = 0; i<string.length(); i++){
            boolean unique = true;
            for(int j = 0; j<string.length(); j++){
                if( i!=j &&  string.charAt(i)==string.charAt(j) ){
                    unique =false;
                    break;
                }
            }
            if(unique){
                System.out.println(string.charAt(i));

            }


        }



    }
}
