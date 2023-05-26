

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BloodBank {
	private String bloodBankID;
	private String bloodBankName;
	private Set<Donor> Donors;
	
	public BloodBank(String bloodBankID, String bloodBankName) {
		this.bloodBankID = bloodBankID;
		this.bloodBankName = bloodBankName;
		this.Donors = new HashSet<Donor>();
	}
	public boolean addNewDonor(Donor newDonor) {
		Donors.add(newDonor);
		return true;
	};
	public Donor getDonorDetails(String donorID)throws InvalidDonorIDException{
		Donor[] array = (Donor[]) Donors.toArray();
		for(int i=0; i<array.length; i++) {
			if(array[i].getDonorId().equals(donorID)) {
				return array[i];
			}
		}
		throw new InvalidDonorIDException("No such donorId");
	};
	
	public boolean updateDonor(Donor updatedDonor) throws InvalidDonorIDException{
		Object[] array = Donors.toArray();
		for(int i=0; i<array.length; i++) {
			if(((Donor) array[i]).getDonorId().equals(updatedDonor.getDonorId())){
				Donors.remove(((Donor) array[i]));
				Donors.add(updatedDonor);
				return true;
			}
		}
		throw new InvalidDonorIDException("No such donorId");
	};
	
	public boolean deleteDonor(String donorID) throws InvalidDonorIDException{
		Donor[] array = (Donor[]) Donors.toArray();
		for(int i=0; i<array.length; i++) {
			if(array[i].getDonorId().equals(donorID)) {
				Donors.remove(array[i]);
				return true;
			}
		}
		throw new InvalidDonorIDException("No such donorId");
	};
	public Set<Donor> getDonors(String bloodGroup)throws InvalidBloodGroupException{
		Set<Donor> d = new HashSet<Donor>();
		Object[] array = Donors.toArray();
		for(int i=0; i<array.length; i++) {
			if(((Donor) array[i]).getBloodGroup().equals(bloodGroup)) {
				d.add((Donor) array[i]);
			}
		}
		if(d.size() < 1) {
			throw new InvalidBloodGroupException("no donor found for this bloodgroup");
		}
		return d;
	};
}
