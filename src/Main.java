import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main (String  [] args )
    {
        String Fname,Lname,Emailadd,website,lcn,gender,ln,degree,major,school,country ,state ,city,street ,pc,SP;
        int phone,YIP,year,b,startYear;

        DentistBuilder dentist1= new DentistImp();
        System.out.println("Personal Information:\na. First Name\n" + "b. Last Name\n" + "c. Email Address\n" + "d. Website\n" + "e. Phone Number");
        System.out.println("f. License Country Name\n" + "g. License Number\n" + "h. Years in Practice\n" + "i. Gender");


        Scanner input=new Scanner(System.in);
        Fname=input.next();
        Lname=input.next();
        Emailadd=input.next();
        website=input.next();
        phone=input.nextInt();
        lcn=input.next();
        ln=input.next();
        YIP=input.nextInt();
        gender=input.next();

        PInformaition person=new PInformaition(Fname,Lname,Emailadd,website,phone,ln,YIP,gender,lcn);

        dentist1.setpersonInfo(person);

        System.out.println("Enter you Education information :\n a. Degree\n" + "b. Major\n" + "c. School\n" + "d. Year");

        ArrayList<Education> edu=new ArrayList<Education>();
        b=1;
        while(b==1)
        {
            degree = input.next();
            major = input.next();
            school = input.next();
            year = input.nextInt();

            edu.add(new Education(degree, major, school, year));

            System.out.println(" Do You want to add more Education information:\n 1- Yes \n 2-NO \n");

            b = input.nextInt();

        }

        dentist1.setpersonedu(edu);

        System.out.println("Enter your information about your Address :\n" + "a. Country\n" + "b. State\n" + "c. City\n" + "d. Street\n" + "e. Postal Code");
        b=1;
        ArrayList<Address>ads=new ArrayList<Address>();

        while(b==1) {
            country = input.next();
            state = input.next();
            city = input.next();
            street = input.next();
            pc = input.next();

            ads.add(new Address(country, state, city, street, pc));

            System.out.println("Do you want to add more address : \n 1-Yes \n  2-NO \n");
            b=input.nextInt();
        }
         dentist1.setpersonaddress(ads);

        System.out.println(" Are you have an Areas of specialization: \n 1-Yes \n 2-No\n");
        b=input.nextInt();

        if(b==1)
        {
            System.out.println("What is your Area of specialization and the start year  ");

            ArrayList<specialization> sp=new ArrayList<specialization>();

            while(b==1)
            {
                SP=input.next();
                startYear=input.nextInt();
                sp.add(new specialization(SP,startYear));

                System.out.println("Do you want to add more specialization \n 1-Yse\n  2-NO \n");
                b=input.nextInt();
            }

            dentist1.setspecialization(sp);

        }

        DentistAccount DAccount= dentist1.build();

        System.out.println(DAccount.personInfo.getFname()+" "+ DAccount.personInfo.getLanme());
        System.out.println(DAccount.personInfo.getEmail()+" | "+ DAccount.personInfo.getPhone() +" | "+ DAccount.personInfo.getWebsite());
        System.out.println("Biography \n License Country Name"+ DAccount.personInfo.getLCN()+"\nLicense Number"+DAccount.personInfo.getLN()+"\nYears in Practice"+DAccount.personInfo.getYIP()+"\nGender"+DAccount.personInfo.getGender()+"\n");

        int i;
        for( i=0;i<DAccount.personEdu.size();i++)
        {
            System.out.println(DAccount.personEdu.get(i).toString()+"\n");
        }

        for(i=0;i<DAccount.personAddress.size();i++)
        {
            System.out.println(DAccount.personAddress.toString()+"\n");
        }








    }
}
