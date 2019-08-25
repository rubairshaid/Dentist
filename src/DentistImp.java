public class DentistImp implements DentistBuilder {

    DentistAccount d;

    public DentistImp() {
        d=new DentistAccount();

    }

    @Override
    public DentistAccount build() {
        return this.d;
    }

    @Override
    public DentistBuilder setpersonInfo(PInformaition pinfo) {
        d.personInfo=pinfo;
        return this;
    }

    @Override
    public DentistBuilder setpersonedu(Education personedu) {
        d.personEdu=personedu;
        return this;
    }

    @Override
    public DentistBuilder setpersonaddress(Address address) {
        d.personAddress=address;
        return this;
    }

    @Override
    public DentistBuilder setspecialization(specialization sp) {
        d.personSp=sp;
        return this;
    }
}
