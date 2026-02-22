package com.inheritance.hierarchichal;

class HeadMaster{
    public void headOfTheSchool(){
        System.out.println("hi i am the head of the school");
    }
}



class Physics extends HeadMaster{
    public void sayLecture(){
        System.out.println("teaching the subject and taking salary from HM");
    }
}


class Maths extends HeadMaster{
    public void sayLecture(){
        System.out.println("teaching maths and taking salary from HM");
    }
}

class Social extends HeadMaster {
    public void sayLecture(){
        System.out.println("Teaching social and taking salary from HM");
    }
}

public class Example3 {
    public static void main(String[] args) {
        Physics physics = new Physics();
        physics.sayLecture();
        physics.headOfTheSchool();
    }
}
