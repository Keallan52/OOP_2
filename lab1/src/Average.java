public class Average
{
    public String getAverage(String str)
    {
        int length = str.length();
        int averageStart = (length / 2) - 1;
        return str.substring(averageStart, averageStart + 2);
    }
}