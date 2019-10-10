package com.model;

//import java.util.ArrayList;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		MentorSkills m1 = new MentorSkills("Spring", "Spring core, Spring MVC, Spring Security", "Java",5L);
		MentorSkills m2 = new MentorSkills("Hibernate",
				"Entity Mapping, Id Mapping, Column Mapping, Inheritance Mapping", "Java",5L);
		MentorSkills m3 = new MentorSkills("Springboot", "Springboot Properties", "Spring, Java",5L);
		
//		List<MentorSkills> skills1 = new ArrayList<MentorSkills>();
//		skills1.add(m1);
//		skills1.add(m3);
//		List<MentorSkills> skills2 = new ArrayList<MentorSkills>();
//		skills2.add(m2);

		Payment p1 = new Payment(501L, "Shirley", 5001L, 5000F, 5000F);
		Payment p2 = new Payment(502L, "Steve", 5002L, 8000F, 2000F);

		Training td1 = new Training(5001L, "Ongoing", 50, 5000F, 7, 8.3F, "2019-09-15", "2019-09-30", "16:00:00",
				"18:00:00", 5000F, 10000F, 101L, "Nell", 501L, "Shirley", 10001L, "Spring", p1);
		Training td2 = new Training(5002L, "Ongoing", 75, 5000F, 8, 8.8F, "2019-09-16", "2019-09-30", "19:00:00",
				"21:00:00", 8000F, 10000F, 102L, "Luke", 502L, "Steve", 10002L, "Hibernate", p2); 

//		List<Training> tr1 = new ArrayList<Training>();
//		tr1.add(td1);
//
//		List<Training> tr2 = new ArrayList<Training>();
//		tr2.add(td2);

		MentorCalendar mc1 = new MentorCalendar(1001L, "2019-09-15", "16:00:00", "18:00:00");
		MentorCalendar mc2 = new MentorCalendar(1002L, "2019-09-15", "19:00:00", "21:00:00");
		MentorCalendar mc3 = new MentorCalendar(1003L, "2019-09-16", "16:00:00", "18:00:00");
		MentorCalendar mc4 = new MentorCalendar(1004L, "2019-09-16", "19:00:00", "21:00:00"); 
		
//		List<MentorCalendar> mca1 = new ArrayList<MentorCalendar>();
//		mca1.add(mc1);
//		mca1.add(mc2);
//		List<MentorCalendar> mca2 = new ArrayList<MentorCalendar>();
//		mca2.add(mc3);
//		mca2.add(mc4);

//		Users u1 = new Users(101L, "Nell", "nell1234", "NELL", "CRAINE", 9876543210L, "U101", "User", "nell@linkedin.com",
//				null, true, true, "2019-09-03", false, null,  null);
//		Users u2 = new Users(102L, "Luke", "luke12", "LUKE", "MATHEW", 9876555210L, "U102", "User", "luke12@linkedin.com",
//				null, true, true, "2019-09-09", false, null,  null);
//		Users u3 = new Users(103L, "Susan", "susa1998", "SUSAN", "THOMAS", 9800543510L, "U103", "User",
//				"susan98@linkedin.com", null, true, true, "2019-08-30", false, null, null);
//
//		Users u4 = new Users(501L, "Shirley", "1234", "SHIRLEY", "ABRAHAM", 9123543510L, "T501", "Trainer",
//				"shirley@linkedin.com", 5F, true, true, "2019-08-19", false, skills1,  mca1);
//		Users u5 = new Users(502L, "Steve", "stevie05", "STEVE", "K", 9096435102L, "T502", "Trainer",
//				"steviek@linkedin.com", 7F, true, true, "2019-08-10", false, skills2,  mca2);
		
		Users u1 = new Users("admin@gmail.com", "admin", null, null, null,  "Admin",
				null, true);
		Users u2 = new Users("athirashiby@gmail.com", "pass", "ATHIRA", "SHIBY", 9876543210L,  "User",
				null, true);
		Users u3 = new Users("luke12@gmail.com", "luke12", "LUKE", "MATHEW", 9876555210L, "User",
				null, true);
		Users u4 = new Users("susan98@gmail.com",  "susa1998", "SUSAN", "THOMAS", 9800543510L,  "User",
				null, true);

		Users u5 = new Users("shirleyab@gmail.com", "1234", "SHIRLEY", "ABRAHAM", 9123543510L,  "Trainer",
				5F, true);
		Users u6 = new Users("steviek@gmail.com", "stevie05", "STEVE", "K", 9096435102L, "Trainer",
				 7F, true);
		

		Technology tech1 = new Technology("Spring", "Spring core, Spring MVC, Spring Security", "Java","2 months",15000L);
		Technology tech2 = new Technology("Hibernate",
				"Entity Mapping, Id Mapping, Column Mapping, Inheritance Mapping", "Java","2 months",15000L);
		Technology tech3 = new Technology("Springboot", "Springboot Properties", "Spring, Java","2 months",15000L);  
		
		Course c1 = new Course("Java", "4pm-6pm",5L,8F);
		Course c2 = new Course("Java", "6pm-8pm",6L,7.6F);
		Course c3 = new Course("Spring", "4pm-6pm",6L,7.6F);

		Configuration cfg = new Configuration();
		cfg.configure("mod.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		t.begin();

		s.save(td1);
		s.save(td2);

		s.save(u1);
		s.save(u2);
		s.save(u3);
		s.save(u4);
		s.save(u5);
		s.save(u6);

		s.save(tech1);
		s.save(tech2);
		s.save(tech3);

		s.save(m1);
		s.save(m2);
		s.save(m3);

		s.save(mc1);
		s.save(mc2);
		s.save(mc3);
		s.save(mc4);

		s.save(p1);
		s.save(p2); 
		
		s.save(c1);
		s.save(c2);
		s.save(c3);

		t.commit();
		s.close();
		sf.close();
	}

}
