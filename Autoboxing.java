import java.util.ArrayList;

class Autoboxing {
    public static void main(String[] args) {
        char ch = 'z'; // primitive data type

        //Autoboxing- char to Character
        Character character = ch;
        System.out.println(character);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(10);
        arrayList.add(60);

        System.out.println(arrayList.get(1));

    }    
}
