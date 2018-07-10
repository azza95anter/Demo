package com.example.android.blooddonationapp.Model;

public class DataDonor {
    private String DonorId;
    private String DonorName;
    private String DonorPhone;
    private String DonorAddress;
    private String DonorBloodType;

    public DataDonor() {

    }

    public DataDonor(String DonorId, String DonorName, String DonorPhone, String DonorAddress, String DonorBloodType)

    {
        this.DonorId = DonorId;
        this.DonorName = DonorName;
        this.DonorPhone = DonorPhone;
        this.DonorAddress = DonorAddress;
        this.DonorBloodType = DonorBloodType;
    }
//getter
    public String getDonorId() {
        return DonorId;
    }

    public String getDonorName() {
        return DonorName;
    }

    public String getDonorPhone() {
        return DonorPhone;
    }

    public String getDonorBloodType() {
        return DonorBloodType;
    }

    public String getDonorAddress() {
        return DonorAddress;
    }

    //setter
    public void setDonorId(String DonorId) {
        this.DonorId = DonorId;
    }

    public void setDonorName(String DonorName) {
        this.DonorName = DonorName;
    }

    public void setDonorAddress(String DonorAddress) {
        this.DonorAddress = DonorAddress;
    }

    public void setDonorPhone(String DonorPhone) {
        this.DonorPhone = DonorPhone;
    }

    public void setDonorBloodType(String DonorBloodType) {
        this.DonorBloodType = DonorBloodType;
    }
}
