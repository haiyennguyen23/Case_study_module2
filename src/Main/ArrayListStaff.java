package Main;

import java.util.ArrayList;

public class ArrayListStaff {
    private ArrayList<Staff> arrayList;

   public ArrayListStaff(){
       this.arrayList =new ArrayList<>();
   }
    public ArrayListStaff(ArrayList<Staff> arrayList) {
        this.arrayList = arrayList;
    }
    public void addStaff(Staff St){
        this.arrayList.add(St);
    }

}
