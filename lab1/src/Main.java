public class Main
{
    public static void main(String[] args)
    {


        Average average = new Average();
        System.out.println(average.getAverage("string"));
        System.out.println(average.getAverage("code"));
        System.out.println(average.getAverage("Practice"));
        System.out.println("_____________");

        Symbols minimalWordFinder = new Symbols();
        String sentence0 = "abcd fgg fff jj";
        String result0 = minimalWordFinder.findSymbols(sentence0);
        System.out.println("Минимальное количество символов: " + result0);
        System.out.println("_____________");

        Latinskiy counter = new Latinskiy();
        String sentence1 = "One two three раз два три one1 two2 123";
        int result1 = counter.countLatinskiy(sentence1);
        System.out.println("Минимальное количество слов с латинскими буквами: " + result1);
        System.out.println("_____________");
    }


}