package cn.java_day04;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_01 {
	public static void main(String[] args) {
		List list = new  ArrayList();
		list.add("6");
		list.add("高兴");
		list.add('A');
		list.add(false);
		
			System.out.print("哈希遍历:");
			//哈希遍历
		 	Iterator it1 = list.iterator();
	        while(it1.hasNext()){
	            System.out.print(it1.next()+" ");
	        }
	        
	        System.out.println();
	        System.out.print("迭代器遍历:");
	        //方法2(迭代器遍历)
	        for(Iterator it2 = list.iterator();it2.hasNext();){
	             System.out.print(it2.next()+" ");
	        }
	        
	        System.out.println();
	        System.out.print("增强for循环:");
	        //方法3(增强for循环)
	        for(Object tmp:list){
	            System.out.print(tmp+" ");
	        }
	        
	        System.out.println();
	        System.out.print("普通遍历:");
	        //方法4(普通遍历）
	        for(int i = 0;i < list.size(); i ++){
	            System.out.print(list.get(i)+" ");
	        }
	}
}
