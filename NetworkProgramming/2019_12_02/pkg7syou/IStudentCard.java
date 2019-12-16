package pkg7syou;
public class IStudentCard extends StudentsCard {
	String nationality;

    void printInfo()
    {
        super.printInfo();
        System.out.println("国籍" + this.nationality);
    }
}
