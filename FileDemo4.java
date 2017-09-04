/*
字符流 
输入		Reader
输出		Writer
*/
package java0420;

import java.io.*;

import java.util.*;

public class FileDemo4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("d://1.text");
		try {
			file.createNewFile();
			FileReader fr = new FileReader(file);
			char [] chars = new char[2];//缓冲区
			fr.read(chars);
			String s = "";
			int len = 0;
			while((len =fr.read(chars))!=-1){
				String ss = new String(chars,0,len);//检测读取个数获得数组偏移量 避免读多
				s+=ss;
			}
			System.out.println(s);
			/*输出
			File file = new File("d://1.text");
			FileWriter fw = new FileWriter(file);
			System.out.println("请输入");
			String s = sc.next();
			fw.write(s,0,s.length());
			fw.close();*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
