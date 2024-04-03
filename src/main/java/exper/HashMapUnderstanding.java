package exper;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author E.Parominsky 03/04/2024 12:35
 */
public class HashMapUnderstanding {

    public static void main(String[] args) {


        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("KING", 100);
        testMap.put("BLAKE", 10);



        HashMap<User,Integer> map = new HashMap<>();
        User user = new User();
        user.setNumber(100);
        map.put(user, 1000);
        System.out.println(map.get(user));
        user.setNumber(50);
        System.out.println(map.get(user));

    }

    public static class User {
        private int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return number == user.number;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }
    }
}
