package ru.leshavasya.Generic;

import java.util.*;

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

        List<User> userLinkedList = new LinkedList<User>();
        userLinkedList.add(new User("1","First"));
        userLinkedList.add(new User("2","Second"));
        userLinkedList.add(new User("3","Third"));
        userLinkedList.add(new User("1","First"));

        Set<User> userHashSet = new HashSet<User>();
        userHashSet.add(new User("1","First"));
        userHashSet.add(new User("2","Second"));
        userHashSet.add(new User("3","Third"));
        userHashSet.add(new User("1","First"));


        //ArrayList includes internal iterator
        System.out.println("=================ArrayList=================");
        for (User user:userArrayList) {
            System.out.println(user);
            System.out.println("User "+user.getName()+" HashCode = "+user.hashCode());
        }
        System.out.println("======================================================");

        System.out.println("====================LinkedList================");
        //ArrayList includes internal iterator
        for (User user:userLinkedList) {
            System.out.println(user);
            System.out.println("User "+user.getName()+" HashCode = "+user.hashCode());
        }
        System.out.println("======================================================");

        System.out.println("====================HashSet================");
        //ArrayList includes internal iterator
        for (User user:userHashSet) {
            System.out.println(user);
            System.out.println("User "+user.getName()+" HashCode = "+user.hashCode());
        }
        System.out.println("======================================================");
    }
}
