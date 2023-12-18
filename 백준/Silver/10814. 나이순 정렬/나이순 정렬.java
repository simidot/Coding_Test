import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 나이순 정렬 실버5
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Person[] people = new Person[N];
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력을 받으면
            int age = Integer.parseInt(st.nextToken()); // 나이와
            String name = st.nextToken(); // 이름으로 분류하여
            people[i] = new Person(age, name); // Person 객체를 만들어 배열에 넣는다.
        }

        // 정렬과정
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                    return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(people[i]);
        }
        System.out.println(sb);

    }

    // 배열을 사용하지 않고 클래스 객체를 만들어 배열처럼 사용 가능.
    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age+" "+name+"\n";
        } // 반환시 형태를 정해줄 수 있다.
    }
}
