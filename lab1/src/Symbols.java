public class Symbols
{
    public String findSymbols(String sentence)
    {
        String[] words = sentence.split(" ");
        String result = null;
        int minSymbols = Integer.MAX_VALUE;

        for (String word : words)
        {
            int symbolsCount = countSymbols(word);
            if (symbolsCount < minSymbols)
            {
                minSymbols = symbolsCount;
                result = word;
            }
        }
        return result;
    }

    private int countSymbols(String word)
    {
        boolean[] charPresence = new boolean[256];
        int uniqCount = 0;
        for (int i = 0; i < word.length(); i++)
        {
            char current = word.charAt(i);

            if (!charPresence[current])
            {
                charPresence[current] = true;
                uniqCount++;
            }
        }
        return uniqCount;
    }
}