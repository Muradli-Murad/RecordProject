public class Main {
    public static void main(String[] args) {

        for (int i=1;i<=5; i++){
            Student s=new Student(
                    "Number0"+i,
                    (i==1?"Marry":(i==2?"Murad":(i==3)?"Kenan":(i==4)?"Zaur":(i==5)?"Tim":"Unknown")),
                    "28.11.1996",
                    "Java Course");
            s.setClassList(s.getClassList()+" Exam");
            System.out.println(s.getName()+" is taking "+s.getClassList());
            System.out.println(s);
        }



    }
}