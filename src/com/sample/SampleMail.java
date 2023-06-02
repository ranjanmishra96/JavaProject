//package com.sample;
//
//
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import java.text.Format;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class SampleMail {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 sendEmail("uhgind.payrollhelpdesk@allsectech.com","ranjan_mishra@optum.com","","Resignation Request - Submitted - 001320583",null);
//	}
//
//	 public static void sendEmail(String fromEmail,String emailTo, String ccEmailID, String emailSubject, String emailBody) {
//	        emailBody = "<p>Dear RANJAN MISHRA (001320583),</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>This is to acknowledge and formally notified that your resignation dated on 03 FEB 2023 has been submitted.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Consistent with our exit policy and as a result of your resignation, we wish to remind you the following:</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>1. Please surrender all company assets, documents and property in your possession and custody, such as laptops, VPN tokens, WIFI tokens, and similar assets, if any. 2. Please secure application for employee clearance from the Human Capital which you need to finish and route on your last working day. 3. You are still subject to the terms and conditions of your employment contract on confidentiality agreement. 4. Your remaining salary shall be included in your final pay, which shall be released to you upon the submission of your duly accomplished clearance.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Furthermore, this letter serves as a reminder of your employment contract clause stating that, to wit:</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>For three (3) months after the date of the termination of your employment you must not and must not prepare to, within the India: participate in; assist with; or otherwise be directly or indirectly involved as a member, shareholder (other than a shareholding of less than five per cent (5%) in a company listed on any recognized stock exchange), unit holder, director, consultant, adviser, contractor, principal, agent, manager, employee, beneficiary, partner, associate, trustee or financier of, any business or activity: 1) that is the same or similar to a part or parts of a business: (A) carried on by a member or members of the UnitedHealth Group; and (B) in which you worked at any time during the 12 months prior to the date of the termination of your employment; or 2) for any person, company or other entity that competes with any member of the UnitedHealth Group.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>During and for twelve (12) months after your employment with the Company ends, regardless of the reason that it ends, you must not solicit, canvass, approach or accept any approach from directly or indirectly, either alone or in concert with others: 1) any existing or potential customer, client, supplier, vendor, or contractor of the Company or any other member of the UnitedHealth Group with whom you worked, had material dealings, or gained knowledge of within the twelve (12) months prior to the termination of your employment; or 2) any employee of the Company or any other member of the UnitedHealth Group who is employed in a senior, managerial, technical, supervisory, sales or marketing capacity.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>You agree that any breach, violation or evasion of this provision will result in immediate and irreparable injuries and harm to the UnitedHealth Group, and you agree that the UnitedHealth Group member seeking to enforce this agreement will have recourse to the remedies of injunction and specific performance, or either of such remedies, as well  as all other legal or equitable remedies to which such company may be entitled.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Should you have questions, please approach your immediate superior for proper advise.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>We wish you luck in your future endeavors.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Very truly yours,</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Team Payroll</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Date : 03 Feb 2023</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>This is computer generated report hence no need for signature.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>We would like to stay connected with you - please visit The Network with Us website that will help you to stay informed about UnitedHealth Group career-related news and information.</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Thanks</p>\r\n" +
//	        		"\r\n" +
//	        		"<p>Team Payroll</p>";
//	        Properties props = System.getProperties();
//	        props.put("mail.smtp.host", "emls-prd.uhc.com");
//	           try {
//	            Session session2 = Session.getDefaultInstance(props);
//	            MimeMessage message = new MimeMessage(session2);
//	            message.setFrom(new InternetAddress(fromEmail));
//	            // System.out.println(emailTo);
//	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo, false));
//	            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccEmailID, false));
//	            message.setSubject(emailSubject);
//	            MimeBodyPart messageBodyText = new MimeBodyPart();
//	            messageBodyText.setContent(emailBody, "text/html;charset=ISO-8859-1");
//	            Multipart multipart = new MimeMultipart();
//	            multipart.addBodyPart(messageBodyText);
//	            MimeBodyPart messageBodyPart = null;
//	            Format formatter = new SimpleDateFormat("MMddyyyy_HH24mmss");
//	            Calendar cal = Calendar.getInstance();
//
//	            message.setContent(multipart);
//	            Transport.send(message);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//
//	    }
//
//}
