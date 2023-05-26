

public class Donor {
	private String donorId;
	private String donorName;
	private String phone;
	private String bloodGroup;
	
	public Donor(String donorId, String donorName, String phone, String bloodGroup) {
		this.donorId = donorId;
		this.donorName = donorName;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
	}
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
}
