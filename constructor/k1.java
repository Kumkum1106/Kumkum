public class k1{
    public static void main(String[] args){
        String str = "Hello World";
        int n = str.length();
        int count = 0;
        int c = 0;
        for(int i = 0; i<n; i++){
            if(str.charAt[i]=="aeiouAEIOU"){
                count+=1;
                

            }
            else{
                c+=1;
                

            }

        }
        System.out.println("Vowels:" +count);
        System.out.println("Consonants:" +c);

        
    }
}

/*public class k1 {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}*/


    