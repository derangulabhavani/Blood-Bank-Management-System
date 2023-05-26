

import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;



public class MainApp {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bloodbank id:");
		String bankId = sc.next();
		System.out.println("Enter bloodbank name:");
		String bankName = sc.next();
		BloodBank b = new BloodBank(bankId, bankName);
		boolean turn = true;
		while(turn) {
			System.out.println("1 for add new donor, "
					+ "2 for display donors, 3 for update donor "
					+"4 for exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter donorid:");
					String id = sc.next();
					System.out.println("Enter donorname:");
					String name = sc.next();
					System.out.println("Enter donorphone:");
					String phone = sc.next();
					System.out.println("Enter donorbloodgruop:");
					String bloodgroup = sc.next();
					Donor d = new Donor(id, name, phone, bloodgroup);
					try {
						b.addNewDonor(d);
						System.out.println("Donor added\n\n\n");
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					System.out.println("Enter the blood group: ");
					String bGroup = sc.next();
					try {
						Set<Donor> donor = b.getDonors(bGroup);
						System.out.println("Id"+"\tName\tPhone\t\tBlood Group");
						
						Object[] array = donor.toArray();
						for(int i=0; i<array.length; i++) {
								System.out.println(((Donor) array[i]).getBloodGroup()+"\t"+
										((Donor) array[i]).getDonorName()+"\t"+
										((Donor) array[i]).getPhone()+"\t"+
										((Donor) array[i]).getBloodGroup());
							}
						
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter donorid:");
					String dId = sc.next();
					System.out.println("Enter donorname:");
					String dName = sc.next();
					System.out.println("Enter donorphone:");
					String dPhone = sc.next();
					System.out.println("Enter donorbloodgruop:");
					String dBloodgroup = sc.next();
					Donor dd = new Donor(dId, dName, dPhone, dBloodgroup);
					try {
						b.updateDonor(dd);
						System.out.println("Donor updated\n\n\n");
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("Thanks!!!!\n\n\n");
					turn = false;
					
			}
		}
		sc.close();
		
	}

}
