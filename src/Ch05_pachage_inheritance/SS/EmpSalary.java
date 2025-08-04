package Ch05_pachage_inheritance.SS;

public class EmpSalary {
    public static void main(String[] args) {
        System.out.println("대표 이사 이름 : " + "강감찬");
        Salary hong = new Salary("홍길동", 10000, "영업") ;
        hong.display();
        Salary hee = new Salary("박영희", 10000, "구매") ;
        hee.display();
        Salary soo = new Salary("김철수", "광고") ;
        soo.display();
        System.out.println("총 직원 수 : " + Employee.i + "명");
    }
}
