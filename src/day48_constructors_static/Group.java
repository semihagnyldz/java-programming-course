package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<String> members=new ArrayList<>();

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", members=" + members +
                '}';
    }

    public void addMember (String newMember){
        members.add(newMember);
    }
    public void removeMember (String removeMember){
        members.remove(removeMember);

    }

    public Group(String groupName){
        this.groupName=groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
