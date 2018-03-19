package cn.edu.njupt.java.oop.orientedObject;

import java.awt.List;
import java.util.ArrayList;

public class AddTwo {
	
	public ListNode addTwoNumber(ListNode input1,ListNode input2){
		ListNode input1Buffer = input1;
		ListNode input2Buffer = input2;
		int buffer = ((int)input1.val+(int)input2.val) % 10;
		int flag = ((int)input1.val+(int)input2.val) / 10;
		ListNode result = new ListNode(buffer);
		ListNode p = result;
		while(true){
			input1Buffer = input1Buffer.next;
			input2Buffer = input2Buffer.next;
			if(input1Buffer ==null &&input2Buffer == null){
				if(flag != 0){
					ListNode bufferList = new ListNode(flag);
					p.next = bufferList;
					p = p.next;
				}
				return result;
			}
			if(input1Buffer == null){
				for(;input2Buffer != null;input2Buffer = input2Buffer.next){
					if(flag !=0){
						buffer=((int)input2Buffer.val+flag) % 10;
						flag = ((int)input2Buffer.val+flag) / 10;
						ListNode bufferList = new ListNode(buffer);
						p.next = bufferList;
						p = p.next;
					}else{
						ListNode bufferList = new ListNode(input2Buffer.val);
						p.next = bufferList;
						p = p.next;
					}
				}
				if(flag !=0){
					ListNode bufferList = new ListNode(flag);
					p.next = bufferList;
					p = p.next;
				}
				return result;
			}
			if(input2Buffer == null){
				for(;input1Buffer!=null;input1Buffer = input1Buffer.next){
					if(flag !=0){
						buffer=((int)input1Buffer.val+flag) % 10;
						flag = ((int)input1Buffer.val+flag) / 10;
						ListNode bufferList = new ListNode(buffer);
						p.next = bufferList;
						p = p.next;
					}else{
						ListNode bufferList = new ListNode(input1Buffer.val);
						p.next = bufferList;
						p = p.next;
					}
				}
				if(flag !=0){
					ListNode bufferList = new ListNode(flag);
					p.next = bufferList;
					p = p.next;
				}
				return result;
			}
			buffer = ((int)input1Buffer.val+(int)input2Buffer.val+flag) % 10;
			flag = ((int)input1Buffer.val+(int)input2Buffer.val+flag) / 10;
			ListNode bufferList = new ListNode(buffer);
			p.next = bufferList;
			p = p.next;
		}
//		for(ListNode input1Buffer = input1;input1Buffer!=null;input1Buffer=input1Buffer.next){
//			listInput1.add(input1Buffer.val);
//		}
//		for(ListNode input2Buffer = input2;input2Buffer!=null;input2Buffer=input2Buffer.next){
//			listInput2.add(input2Buffer.val);
//		}
//		
//		if(listInput2.size()< listInput1.size()){
//			for(int i=listInput2.size();i<listInput1.size();i++){
//				listInput2.add(0);
//			}
//		}else{
//			for(int i=listInput1.size();i<listInput2.size();i++){
//				listInput1.add(0);
//			}
//		}
//		int buffer = ((int)listInput1.get(0)+(int)listInput2.get(0)+flag) % 10;
//		result = new ListNode(buffer);
//		flag = ((int)listInput1.get(0)+(int)listInput2.get(0)+flag) / 10;
//		ListNode p = result;
//		for(int i=1;i<listInput1.size();i++){
//			buffer = ((int)listInput1.get(i)+(int)listInput2.get(i)+flag) % 10;
//			flag = ((int)listInput1.get(i)+(int)listInput2.get(i)+flag) / 10;
//			resultBuffer.add(buffer);
//			ListNode bufferList = new ListNode(buffer);
//			p.next = bufferList;
//			p = p.next;
//		}
//		if(flag!=0){
//			ListNode bufferList = new ListNode(flag);
//			p.next = bufferList;
//			p = p.next;
//		}
	}
	public static void main(String[] args) {
		ListNode input1 = new ListNode(1);
		ListNode p = input1;
		p.next = new ListNode(8);
		ListNode input2 = new ListNode(0);
		AddTwo addTwo = new AddTwo();
		ListNode result =addTwo.addTwoNumber(input1, input2);
		for(ListNode i = result;i!=null;i=i.next){
			System.out.println(i.val);
		}
	}
}
