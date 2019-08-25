public interface DentistBuilder {

    DentistAccount build();

    DentistBuilder setpersonInfo(PInformaition pinfo);
    DentistBuilder setpersonedu(Education personedu);
    DentistBuilder setpersonaddress(Address address);
    DentistBuilder setspecialization(specialization sp);

}
