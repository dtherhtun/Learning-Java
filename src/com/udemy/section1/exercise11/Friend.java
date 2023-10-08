package com.udemy.section1.exercise11;

public class Friend {
    public static final String[] friendFirstName = {"waiYan", "phyoMin", "dTher"};

    public String[] getFriendFirstName() {
        return Friend.friendFirstName;
    }

    public static void main(String[] args) {
        Friend a = new Friend();
        Friend b = new Friend();

        System.out.println(a.getFriendFirstName()[0]);
        System.out.println(a.getFriendFirstName()[1]);
        System.out.println(a.getFriendFirstName()[2]);

        System.out.println(b.getFriendFirstName()[0]);
        System.out.println(b.getFriendFirstName()[1]);
        System.out.println(b.getFriendFirstName()[2]);
    }
}
