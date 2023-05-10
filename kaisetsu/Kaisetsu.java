package kaisetsu;



    public Homework createHomework(String title) {
           try {
             if (title.equals("動画作成課題")) {
               throw new SpecException("容量が足りません。");
              }
            } catch (SpecException e) {
             return null;
            }
Homework hw = new Homework(title);
           return hw;
          }

        public class Homework {
             private String content = "";

             public Homework() {}

             public Homework(String content) {
               this.content = content;
              }

             public String getContent() {
               return this.content;
              }
           }

           public class Student {
             public Homework doHomework(String title) {
               NotePc pc = new NotePc();
               Homework homework = pc.createHomework(title);
               return homework;
              }
           }