class LL{
    Node head;

    private int size;

    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String d)
        {
            data=d;
            next=null;
            size++;
        }
    }
    //insert at first
    public void insertinFirst(String d)
    {
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    
    }
    //insert at last
    public void insertatLast(String d)
    {
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newnode;
        
    }

    //insert at specific position
  /*  public void insertPosition(int pos,String d)
    {
        if(pos>size)
        {
            System.out.println("position not present");
            return;
        }
        Node newnode=new Node(d);
        while()
    }*/
    //print the list
    public void show()
    {
        if(head==null){
            System.out.println("NULL");
        }
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"-->");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete from last
    public void delfromLast(){
        if(head==null){
            System.out.println("list is null");
            return;
        }

        size--;
        //list contain only one element
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //size decl
    public void getsize(){
        System.out.println("size of list "+size);
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.insertatLast(" good");
        list.show();
        list.insertatLast(" girl");
        list.show();
        list.insertinFirst(" am");
        list.show();
        list.insertinFirst("I");
        list.show();
        list.deleteFirst();
        list.show();
        list.delfromLast();
        list.show();

        list.getsize();
    }
}