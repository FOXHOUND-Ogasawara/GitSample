package task;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.List;

class Task {
    private String title;
    private LocalDateTime dueDate;

    public Task(List<Object> taskData) throws IllegalArgumentException{
        //処理
        for(int i = 0; i < taskData.size(); i++){
            if(taskData.size() == 2){
                if(taskData.get(i) instanceof String == true){
                    title = (String)(taskData.get(i));

                }else if(taskData.get(i) instanceof LocalDateTime == true){
                    dueDate = (LocalDateTime)(taskData.get(i));
                }
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
