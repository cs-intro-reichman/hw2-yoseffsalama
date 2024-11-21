public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes2= Integer.parseInt(args[1]);

        int totalminutes= (hours*60)+ minutes +minutes2 ;
        int totalhours= totalminutes/60;
        int hours2= totalhours%24;
        int minutes3= totalminutes-(totalhours*60);

        if(minutes3<10 & hours2<10){
            System.out.println("0"+ hours2+":0"+minutes3);
        } else if( minutes3<10 & hours2>10 ) {
            System.out.println( hours2+":0"+minutes3);
        }else if( minutes3>10 & hours2<10 ){
            System.out.println("0"+ hours2+":"+minutes3);  
        } else{
         
        System.out.println(hours2+":"+minutes3);
        }       
    }
}
