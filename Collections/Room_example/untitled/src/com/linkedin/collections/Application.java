package com.linkedin.collections;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main (String[] args) {
        Room cambridge = new Room("Cambridge", "Premiere room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.00);


        Collection<Room> rooms = new java.util.ArrayList<>(List.of(cambridge, manchester));
        rooms.add(piccadilly);
        rooms.add(oxford);
        double total = getPotentialRevenue(rooms);


//        Room[] rooms = new Room[2];
//        rooms[0] = cambridge;
//        rooms[1] = manchester;
//        rooms[2] = piccadilly;
//
//        Room[] moreRooms = new Room[4];
//        System.arraycopy(rooms, 0, moreRooms, 0, rooms.length);
//        moreRooms[moreRooms.length - 1] = oxford;
//
        System.out.println(total);
        }

        private static double getPotentialRevenue(Collection<Room> rooms) {
        return rooms.stream()
                .mapToDouble(r -> r.getRate())
                .sum();
    }
}
