public class mutable_str {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// hence it give mutlale cpacity of 16 lcharacter

        StringBuffer sb1 = new StringBuffer("Tanish");
        System.out.println(sb1.capacity());// here it will increase the memory 16 more to my name
        // to avoid any future space emptiness may occur due to heap full
        System.out.println(sb1.length());

        // append
        System.out.println(sb1.append(" Singh"));

        // convert back to string
        String str = sb1.toString();
        System.out.println(str);

        // delete a char
        System.out.println(sb1.deleteCharAt(4));

        // insert
        System.out.println(sb1.insert(0, "Java"));

    }
}
