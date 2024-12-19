class employee{
    int id;
    String name;
    employee(){
        System.out.println("****");
        id=101;
        name="priyanka";
    }
    void display(){
        System.out.println(id+","+name);
    }
}
class main{
    public static void main(String[] args){
        employee e1=new employee();
        employee e2 = new employee();
        e1.display();
        e2.display();
    }
}