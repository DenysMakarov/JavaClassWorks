package old.unitTests.RegExp.user.controller;

import old.unitTests.RegExp.user.model.User;

public class UserApp {

    public static void main(String[] args) {
        User user = new User("peter@gmail.com", "23b456Ab!");
        user.setPassword("2wekjk"); // почему покказывает ок???
        System.out.println(user.getPassword());


//        System.out.println(old.unitTests.RegExp.user.getEmail());
//        User user2 = new User("peter@mail.ru", "1233");
//        user2.setEmail("peter@mail.ru");
//        System.out.println(user2);
//       old.unitTests.RegExp.user.setPassword("123yiAjhjkl");

    }

}
