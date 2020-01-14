package com.day10;


import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Users> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(new Users(i + 1));
        }
        System.out.println("未分组：");
        for (int i = 0; i < 50; i++) {
            list.get(i).show();
        }
        System.out.println();
        System.out.print("已分组：");
        peron p1 = new peron();
        peron p2 = new peron();
        peron p3 = new peron();

        p1.setF(new Filter() {
            @Override
            public void filterUsers(Users u) {
                if (u.getId() >= 10 && u.getId() <= 19) {
                    u.setType("v1");
                }
            }
        });
        p2.setF(new Filter() {
            @Override
            public void filterUsers(Users u) {
                if (u.getId() >= 20 && u.getId() <= 29) {
                    u.setType("v2");
                }
            }
        });
        for (int i = 0; i < list.size(); i++) {
            p1.recept(list.get(i));
            p2.recept(list.get(i));
            p3.recept(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {

            if (i % 9 == 0) {
                System.out.println();
            }
            list.get(i).show();
        }

    }
}

class Users {
    private String type;
    private int id;

    public Users(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show() {
        System.out.print(getId() + "-" + getType() + " , ");
    }
}

class peron {
    Filter f;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void recept(Users u) {
        if (u.getType() != null)
            return;
        if (f != null) {
            f.filterUsers(u);
            return;
        } else {
            u.setType("A");
        }
    }
}

interface Filter {
    public void filterUsers(Users u);
}
