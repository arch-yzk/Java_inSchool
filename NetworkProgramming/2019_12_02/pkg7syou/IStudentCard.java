package pkg7syou;
public class IStudentCard extends StudentsCard {
	String nationality;

    void printInfo()
    {
        super.printInfo();
        System.out.printl("国籍" + this.nationality);
    }
}
