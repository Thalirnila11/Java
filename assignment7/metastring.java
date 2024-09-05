package assignment7;
class metastring
{
    public static void main(String[] args) {
        String str="nila";
        String str1="lina";
        StringBuffer s1=new StringBuffer(str);
        StringBuffer s2=new StringBuffer(str1);
        char temp=s2.charAt(0);
        s2.setCharAt(0, s2.charAt(2));
        s2.setCharAt(2, temp);
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");   
        }
    }
}