package Person;

class Employee extends Person{
	String space;
		double salary;
			java.util.Date myDate;
				
					public String getSpace(){
							return space;
								}
									
										public void setSpace(String space){
												this.space=space;
													}
														
															public double getSalary(){
																	return salary;
																		}
																			
																				public void setSalary(double salary){
																						this.salary=salary;
																							}
																								
																									public void setMyDate(){
																										myDate=new java.util.Date();
																											}
																											}


package Person;

public class Faculty  extends Employee{
	String worktime;
		String rank;
			String title;
				
					public String getWorktime(){
							return worktime;
								}
									
										public void setWorktime(String worktime){
												this.worktime=worktime;
													}
														
															public String getRank(){
																	return rank;
																		}
																			
																				public void setRank(String rank){
																						this.rank=rank;
																							}
																							}

package Person;

public class Person {
	String name;
		String address;
			String telephone;
				String teleaddress;
					
						public void person(){
							}
								
									public String getType(String type){
											return type;
												}
													
														public String getName(){
																return name;
																	}
																		
																			public void setName(String name){
																					this.name=name;
																						}
																							
																								public String getAddress(){
																										return address;
																											}
																												
																													public void setAddress(String address){
																															this.address=address;
																																}
																																	
																																		public String getTelephone(){
																																				return telephone;
																																					}
																																						
																																							public void setTelephone(String telephone){
																																									this.telephone=telephone;
																																										}
																																											
																																												public String getTeleaddress(){
																																														return telephone;
																																															}
																																																
																																																	public void setTeleaddress(String telephone){
																																																			this.telephone=telephone;
																																																				}
																																																					
																																																						public String toString(String s){
																																																								return "Type: "+getType(s)+";"+"name"+":"+name;
																																																									}
																																																									}


package Person;

public class Title {
	String title;
		
			public String getTitle(){
					return title;
						}
							
								public void setTitle(String title){
										this.title=title;
											}
											}


package Person;

public class Title {
	String title;
		
			public String getTitle(){
					return title;
						}
							
								public void setTitle(String title){
										this.title=title;
											}
											}


package Person;

public class TestPerson {
	public static void main(String[] args){
			student student1=new student();
					
							student1.setName("黎明");
									student1.setAddress("Fu Shi Lu");
											student1.setTelephone("158*******");
													student1.setTeleaddress("1766***@qq.com");
															
																	System.out.println("The student:"+student1.status2+";\n"+student1.toString("student"));
																			System.out.println("Address:"+student1.getAddress());
																					System.out.println("Telephone:"+student1.getTelephone());
																							System.out.println("Teleaddress:"+student1.getTeleaddress());
																									
																											System.out.printf("\n");

																													Faculty faculty=new Faculty();
																															faculty.setSpace("Classroom");
																																	faculty.setName("小明");
																																			faculty.setAddress("Fu Shi Lu");
																																					faculty.setTelephone("158*******");
																																							faculty.setTeleaddress("1766***@qq.com");
																																									faculty.setWorktime("8:00~12:00\n"
																																															+ "\t14:30~18:20");
																																																	faculty.setRank("Professor");
																																																			faculty.setSalary(5000.0);
																																																					faculty.setMyDate();

																																																							System.out.println("The faculty:"+faculty.toString("faculty"));
																																																									System.out.println("Address:"+faculty.getAddress());
																																																											System.out.println("Telephone:"+faculty.getTelephone());
																																																													System.out.println("Teleaddress:"+faculty.getTeleaddress());
																																																															System.out.println("WorkTime:"+faculty.getWorktime());
																																																																	System.out.println("Rank:"+faculty.getRank());
																																																																			System.out.println("WorkSpace:"+faculty.getSpace());
																																																																					System.out.println("Salary:"+faculty.getSalary());
																																																																							System.out.println("MyDate:"+faculty.myDate);

																																																																									System.out.printf("\n");
																																																																											Title title=new Title();
																																																																													faculty.setName("李红");
																																																																															faculty.setAddress("Fu Shi Lu");
																																																																																	faculty.setTelephone("158*******");
																																																																																			faculty.setTeleaddress("1766***@qq.com");
																																																																																					title.setTitle("Cleaner");
																																																																																							
																																																																																									System.out.println("The faculty:"+faculty.toString("faculty"));
																																																																																											System.out.println("Address:"+faculty.getAddress());
																																																																																													System.out.println("Telephone:"+faculty.getTelephone());
																																																																																															System.out.println("Teleaddress:"+faculty.getTeleaddress());
																																																																																																	System.out.println("WorkTime:"+faculty.getWorktime());
																																																																																																			System.out.println("Title:"+title.getTitle());
																																																																																																					
																																																																																																							
																																																																																																								}
																																																																																																								}

