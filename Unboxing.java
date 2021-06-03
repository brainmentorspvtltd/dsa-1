import java.util.ArrayList;

class Unboxing {
    public static void main(String[] args) {
        Character character = 'z'; // Wrapper Class

        //Unboxing - Character to char
        char ch = character;

        System.out.println(ch);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(120);

        //Unboxing- object(Integer) to primitive type (int)
        int n = arrayList.get(0);

        System.out.println(n);
    }    
}
