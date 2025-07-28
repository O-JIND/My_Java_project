package Practice_myself;

import Ch01_variable_operator.Practice;

class sounds {
        String msg = "chop chop";
        public String Getmsg() {
            return msg;
        }
}

class chips extends sounds{
    String msg = "Stop Stop";
    public String Getmsg(){
        return msg;
    }

}


public class eat {
    public static void main(String[] args) {
        sounds et = new sounds();
        System.out.println(et.Getmsg());
        chips ch = new chips();
        System.out.println(ch.Getmsg());


    }
}

