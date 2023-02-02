/*
Задание 2
Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
*/

public class sem2_3 {

    public static void main(String[] args) {
        String str = "abbbaacffdddwwddrwddtttssgggggdsdsdwww";
        StringBuilder sb = new StringBuilder(str.substring(0, 1));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1))
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}

