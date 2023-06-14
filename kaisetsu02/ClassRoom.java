import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    List<Member> members = new ArrayList<Member>();

    public void showMembers(){
        for(int i = 0; i < members.size(); i++){
            System.out.println("名前:" + members.get(i).name);
        }
    }
}
