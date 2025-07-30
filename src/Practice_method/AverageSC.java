    package Practice_method;
    import Ch04_create_class_package.Dataset;

    import java.util.*;
    public class AverageSC {
        public static void main(String[] args) {
            List<student> ac = DATASET.STU();
            int i=0, sum =0, Max=0, Min=100;
            for (student  s: ac){
                sum +=s.score;
                if (Max<s.score){ Max = s.score; }
                if (Min>s.score){ Min=s.score;   }
                i++;
            }
            int mean = sum/i;

            System.out.println(mean);
            System.out.println(Max);
            System.out.println(Min);
        }
    }
    class student{
        String name;
        int score,a;
        public student(String name,int score) {
            this.name = name;
            this.score = score;
        }
        }
    class  DATASET{
        public static List <student> STU(){
            List<student> st = new ArrayList<>();
            st.add(new student("김진성",87));
            st.add(new student("김두식",76));
            st.add(new student("김상상",56));
            st.add(new student("이두나",91));
            st.add(new student("김독자",78));
            st.add(new student("이현성",22));
            return st;
    }
    }