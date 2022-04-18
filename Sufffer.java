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
