package ru.leshavasya.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasyamfx on 11.02.2016.
 */
public class UserRunner {
    public static void main(String[] args){
        List<User> userArrayList = new ArrayList<User>();
        userArrayList.add(new User("1","First"));
        userArrayList.add(new User("2","Second"));
        userArrayList.add(new User("3","Third"));
        userArrayList.add(new User("1","First"));

        //ArrayList includes internal iterator
        for (User user:userArrayList) {
            System.out.println(user);
            System.out.println("User "+user.getName()+" HashCode = "+user.hashCode());
        }
    }
}
