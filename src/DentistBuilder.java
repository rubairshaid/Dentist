import java.util.ArrayList;

public interface DentistBuilder {

    DentistAccount build();

    DentistBuilder setpersonInfo(PInformaition pinfo);
    DentistBuilder setpersonedu(ArrayList<Education> personedu);
    DentistBuilder setpersonaddress(ArrayList<Address> address);
    DentistBuilder setspecialization(ArrayList<specialization> sp);

}
