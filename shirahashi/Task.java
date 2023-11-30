package shirahashi;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

class Task {
    // 処理
    private String title;
    private LocalDateTime dueDate;

    public Task(List<Object> taskData) {
        if(!(taskData.size()==2)){
            throw new IllegalArgumentException();
        }
        for(int i=0; i<taskData.size();i++){
            if((Object)taskData.get(i) instanceof String){
                title = taskData.get(i).toString();
            }else if((Object)taskData.get(i) instanceof LocalDateTime){
                dueDate = (LocalDateTime)taskData.get(i);
            }else{
                throw new IllegalArgumentException();
            }
        }
    }

    public String showTask() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "タイトル: " + title + " 期限: " + dueDate.format(formatter);
    }
}