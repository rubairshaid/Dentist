public class PInformaition {

    private String Fname;
    private String Lanme;
    private String Email;
    private String website;
    private int Phone;
    private String LN;
    private int YIP;
    private String gender;
    private String LCN;

    public PInformaition(String fname, String lanme, String email, String website, int phone, String LN, int YIP, String gender, String LCN) {
        Fname = fname;
        Lanme = lanme;
        Email = email;
        this.website = website;
        Phone = phone;
        this.LN = LN;
        this.YIP = YIP;
        this.gender = gender;
        this.LCN = LCN;
    }

    public int getYIP() {
        return YIP;
    }

    public void setYIP(int YIP) {
        this.YIP = YIP;
    }

    public String getLCN() {
        return LCN;
    }

    public void setLCN(String LCN) {
        this.LCN = LCN;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getLN() {
        return LN;
    }

    public void setLN(String LN) {
        this.LN = LN;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getLanme() {
        return Lanme;
    }

    public void setLanme(String lanme) {
        Lanme = lanme;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
