package controller;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckInfo {
	/*
	 * ��½ʱ����û���Ϣ
	 */

	public int isMember(String table, String id, String passwd) {
		
		// String file = "D://test//".concat(table.concat(".txt"));
		String file = System.getProperty("user.dir")+"/data".concat("/").concat(table).concat(".txt");
		 //StringBuilder result = new StringBuilder();
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
	            String s = null;
	            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
	            	String[] result = s.split(" ");
	            	if(result[0].equals(id) && result[1].equals(passwd)){
	            		return 1;
	            	}
	            	if(result[0].equals(id)){
	            		return 2;
	            	}
	            	
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }

		return 0;
	}
}