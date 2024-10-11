public class Latinskiy
{
    public int countLatinskiy(String sentence)
    {
        String[] words = sentence.split(" ");
        int latinskiyCount = 0;

        for (String word : words)
        {
            if (LatinskiyWord(word))
            {
                latinskiyCount++;
            }
        }

        return latinskiyCount;
    }

    private boolean LatinskiyWord(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (!Character.isLetter(c) || (c < 'A' || (c > 'Z' && c < 'a') || c > 'z'))
            {
                return false;
            }
        }
        return true;
    }
}