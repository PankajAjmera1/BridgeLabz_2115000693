class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    //constructor
    public Student(int rollNumber,String name,int age,char grade){
        this.rollNumber=rollNumber;
        this.name =name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}

class StudentLinkedList{
    private Student head;
    private Student tail;

    //method to add studen at first
    public void addAtBeginning(int rollNumber,String name,int age,char grade){
        Student newStudent  =new Student(rollNumber, name, age, grade);
        if(head ==null){
            head =tail =newStudent;
        }

        newStudent.next =head;
        newStudent.next =head;
        head =newStudent;

    }
    public void addAtLast(int rollNumber,String name,int age,char grade){
        Student newStudent =new Student(rollNumber, name, age, grade);
        if(head ==null){
            head =tail =newStudent;
        }
        tail.next =newStudent;
        tail =newStudent;

    }
    public void addAtIndex(int index, int rollNumber,String name,int age,char grade){
      
        if(index ==0){
            addAtBeginning(rollNumber, name, age, grade);
        }
        Student newStudent =new Student(rollNumber, name, age, grade);
        Student temp =head;
        for(int i=0;i<index-1;i++){
            temp =temp.next;
        }
        newStudent.next =temp.next;
        temp.next =newStudent;
    }
}
