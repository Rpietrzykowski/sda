package sda.obj;

//class Patient {
//
//    String name;
//    int age;
//    float height;
//    String[] compliance;
//}

public class PatientDemo {

    public static void main(String[] args) {

//        Patient tomasz = new Patient();
//
//        tomasz.name = "Tomasz";
//        tomasz.age = 30;
//        tomasz.height = 180.4f;
//        tomasz.compliance = new String[]{"Katar", "Kaszel", "Gorączka"};
//
//        System.out.println("Imię: " + tomasz.name + " Wiek: " + tomasz.age + " Wzrost: " + tomasz.height);
//
//        Patient justyna = new Patient();
//
//        justyna.name = "Justyna";
//        justyna.age = 22;
//        justyna.height = 165.4f;
//        justyna.compliance = new String[]{"Ból głowy", "Wymioty", "Biegunka"};
//
//        System.out.println(justyna.name + " " + justyna.age + " " + justyna.height);

        //PatientCon
        PatientCon aleks = new PatientCon("Aleks", 10);
        PatientCon michal = new PatientCon("Michał", 30);

        System.out.println(michal.name);
        System.out.println(michal.age);
        System.out.println(michal.height);
        michal.height = 180.0f;
        System.out.println(michal.height);
    }
}

class PatientCon {

    String name;
    int age;
    float height;

    public PatientCon(String patientName, int patientAge) {
        this.name = patientName;
        this.age = patientAge;
        this.height = 0;
    }
}

