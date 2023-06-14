public class Question01 {
    public static void main(String[] args) {
        Member member = new Member();
        ClassRoom classroom = new ClassRoom();
        member.name = "山田太郎";
        classroom.members.add(member); // 山田太郎さんを追加
        // classroom.showMembers();
        member = new Member();
        member.name = "鈴木一郎";
        classroom.members.add(member); // 鈴木一郎さんを追加

        classroom.showMembers();

    }
}
