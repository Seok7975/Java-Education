class SortAndPrint
{
    public static void main(String[] args)
    {
        char[] dest = new char[10];
        for(int i=0; i<dest.length; i++)
        {
            dest[i] = '0';
        }
        String temp = String.valueOf(dest);

        char[] src = {'1', '2', '3', '4'};


        System.out.println(String.valueOf(src) + temp.substring(0,6));

        System.out.println(temp.substring(0,6) + String.valueOf(src) );

        System.out.println(temp.substring(0,(dest.length - src.length)/2)
                + String.valueOf(src)
                + temp.substring((dest.length + src.length)/2));


    }
}