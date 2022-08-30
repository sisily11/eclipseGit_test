

import java.util.HashMap;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	      
	      String name;
	      String phoneNum;
	      String nameSearch;
	      
	      Scanner sc = new Scanner(System.in);
	      boolean run = true;
	      
	      System.out.println("[전화번호 저장하기]");
	      System.out.println("사용자 수 입력 : ");
	      int nameNum = sc.nextInt();
	      
	      HashMap<String, String> hashMap = new HashMap<String, String>();
	      
	      for(int i=0;i<nameNum;i++) {
	         System.out.println("1. 이름입력 : ");
	         name = sc.next();
	         System.out.println("2. 번호입력 : ");
	         phoneNum = sc.next();
	         hashMap.put(name, phoneNum);         
	      }
	      System.out.println("저장 완료!!!");
	      
	      System.out.println("[검색 하기]");
	      while(run) {
	         System.out.println("검색할 이름 입력 : ");
	         nameSearch = sc.next();
	         
	         if(hashMap.get(nameSearch) != null) {
	            phoneNum = hashMap.get(nameSearch);
	            System.out.println(nameSearch + "씨의 번호는 " + phoneNum + "입니다.");         
	         }else {
	            System.out.println("입력하신 이름은 존재하지 않습니다.");
	         }
	         
	         if(nameSearch.equals("stop")) {
	            System.out.println("프로그램을 종료합니다.");
	            run = false;
	            break;
	         }         
	      }
	   }

}