package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds= 0;
        while(seconds<=117){
            System.out.println("Watching YoutUbe videos: second" + seconds);
            seconds++;
            //Thread.sleep(1);
        }
        System.out.println("Finished Cat Videos, lets start another one");
        int count=5;
        while(count<=0){
            System.out.println("count: "+count);
            count--;
        }
        int unReadSMS=10;
        while(unReadSMS>0){
            System.out.println("I have total: "+unReadSMS+ " unread SMS");
            unReadSMS--;
        }
        System.out.println("You all read your  SMS messages");
    }
}
