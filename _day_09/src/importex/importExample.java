package importex;
import fruit.Apple;
import fruit.Orange;

import java.util.Scanner;

/*
    같은 프로젝트 내의 코드끼리나 혹은 자바에서 기본으로 제공하는 클래스파일은
    언제든 가져다가 사용할 수 있습니다.
    다만 다른 패키지에 있는 클래스를 사용하라면 반드시 package 선언부 아래(1번 라인 아래)
    import 선언을 통해 도입하고 싶은 클래스의 경로(패키지명과 클래스명)을 적어야 합니다.
*/
public class importExample {
    public static void main(String[] args) {
        Apple a = new Apple();
        // 나머지 과일 하나랑 hello.hi, hello.bye 패키지 내부 클래스도 위와 같이 작성해주세요.

        Hi hi = new Hi();
        Bye bye = new Bye();

        Orange orange = new Orange();

        Scanner scanner = new Scanner(System.in);

        // 같은 패키지인 경우 import 없이 사용 가능
        Test test = new Test();
    }

    private static class Bye {
    }

    private static class Hi {
    }
}
