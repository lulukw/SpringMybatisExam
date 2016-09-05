package com.hand;

import java.sql.Timestamp;
import java.util.Scanner;

import com.hand.AOP.TransactionTool;
import com.hand.Util.SpringBeanFactory;

import com.sakila.Entity.Film;
import com.sakila.Entity.Language;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TransactionTool tt=SpringBeanFactory.getBeanFactory().getBean("transactionTool",TransactionTool.class);
		
		Film aim = new Film();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("请输入 电影名称(title):");
		String input = sc.nextLine();
		aim.setTitle(input);
		
		System.out.println("请输入 电影描述(description):");
		input = sc.nextLine();
		aim.setDescription(input);
		
		
		
		boolean notRightlanguage_id = true;
		int addNum = 0;
		while (notRightlanguage_id) {
			try {
				System.out.println("请输入语言 language_id:");
				Integer in = sc.nextInt();
				in = sc.nextInt();
				addNum = in;
				if (tt.doLanguageGetCountByIdTransaction(addNum) > 0) {
					notRightlanguage_id = false;
				} else {
					System.out.println("你输入的language_id 已经存在,请重新输入:");
				}
			} catch (NumberFormatException ne) {
				System.out.println("数字格式不正确");
			}
		}
		aim.setLanguage_id(addNum);
		
		Timestamp now = new Timestamp(new java.util.Date().getTime());
		aim.setLast_update(now);
		
		tt.doFilmAddIdEntityTransaction(aim);
		aim=tt.doFilmGetLastFilmTransaction();
		System.out.println("已经保存的数据如下:");
		System.out.println("ID:" + aim.getID());
		System.out.println("Title:" + aim.getTitle());
		System.out.println("Description:" + aim.getDescription());
		System.out.println("Language_id:" + aim.getLanguage_id());
		System.out.print("Address:");

		
		
		
	}
}
