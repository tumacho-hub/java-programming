package day_48_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Group {

    private String name;
    private List<String> members = new ArrayList<>();

    public Group(String name) {
        this.name = name;     /// this is a constructor
    }
    public void addMember(String newMember){
        members.add(newMember);
    }

    public void removeMemberName(String memberName){
        members.remove(memberName);
    }




    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
