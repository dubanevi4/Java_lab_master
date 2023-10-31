package com.epam.learn.entity;

public class Bus {
    private int id = 1;
    final static int COUNTER;
    {
        ++id;
        System.out.println(id);
    }
    static {
        COUNTER = Integer.parseInt("177");
        System.out.println("Static block " + COUNTER);

    }

    public Bus(int id) {
        this.id = id;
    }

    public Bus() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
