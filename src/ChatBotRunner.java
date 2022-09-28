public class ChatBotRunner {
    public static void main (String[] args){
        ChatBot bot1 = new ChatBot("debbie", 5);
        bot1.greeting("Wei");
        bot1.weather();
        System.out.println("You walked 100 ft today, that would be " + bot1.convertFeetToMeters(100) + " meters" );
        bot1.favoriteNumber(10);
        System.out.println("If you add 10, 20, and 30, you would get " + bot1.addNumbers(10,20,30));
        System.out.println(bot1.goodbye());
        bot1.birthMonth(5, 2);
        System.out.println("If you multiply 10, 20, and 30 you get " + bot1.multiplyNumbers(10, 20, 30));

    }
}
