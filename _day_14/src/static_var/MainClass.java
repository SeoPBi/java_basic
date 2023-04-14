package static_var;

public class MainClass {
    public static void main(String[] args) {
        // 인스턴스 생성 전부터 이미 조회 가능한 팀점수
        System.out.println(Asean.presentationScore);

        // 학생 4명 만들어보기
        Asean a1 = new Asean("채종훈", 20, 43);
        Asean a2 = new Asean("서은영", 20, 43);
        Asean a3 = new Asean("장재인", 20, 43);
        Asean a4 = new Asean("정일윤", 14, 43);

        a1.showStudentScore();
        a2.showStudentScore();
        a3.showStudentScore();
        a4.showStudentScore();

        System.out.println(a1.presentationScore);
    }
}
