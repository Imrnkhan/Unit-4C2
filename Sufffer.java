public class Sufffer {
    public static void main(String[] args) {
        
        String str = "Helllo";
        StringBuffer sbr  = new StringBuffer(str);

        sbr.reverse();

        System.out.println(sbr);


        StringBuffer sbt = new StringBuffer(str);

        sbt.append("HiiHello");


        System.out.println(sbt);
    }
    
}


/*
String --- immutable  no chnage hard core

string buffer and string builder --- mutable chnageble soft

string buffer takes more time to implement .
string builder take less time to implement
*/