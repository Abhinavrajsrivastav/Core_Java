package Strings;

class One{
    public static void main(String[] sar){
System.out.println("************************---->String class object immutable<----------*****************************");
System.out.println("---------------->With using new Keword<------------------");
        String str = "Abhinav";
        String str1 = "Abhinav";
        String str2= "Abhinav";
        String str3 = "Abhinav";
        

        System.out.println("Address of str Abhinav: "+str.hashCode());
        System.out.println("Address of srt1 Abhinav: "+str1.hashCode());
        System.out.println("Address of srt2 Abhinav: "+str2.hashCode());
        System.out.println("Address of srt3 Abhinav: "+str3.hashCode());

        str3 = "Anshika";
        System.out.println("Address of srt3 Anshika, after Changing **Imutable **new object: "+str3.hashCode());


System.out.println("----------------> With new keyword<----------------------");
        String a = new String("Radha");
        System.out.println("address of string a"+a.hashCode());
        System.out.println("address of unrefferenced updated String"+a.concat("Krishna").hashCode());

System.out.println("---------------->StringBuffer and StringBuilder<----------");
System.out.println("StringBuffer: ");
        StringBuffer str4 = new StringBuffer("Sita");
        System.out.println(str4.hashCode());
        System.out.println("String capacity at Sita: "+str4.capacity());
        str4 = str4.append("Ram");
        System.out.println("String capacity at SitaRam: "+str4.capacity());
        System.out.println(str4.hashCode());

System.out.println("StringBuilder: ");
        StringBuilder str5 = new StringBuilder("Anshika");
        System.out.println(str5.hashCode());
        System.out.println("String capacity at Ansika: "+str4.capacity());
        str5 = str5.append("Archit");
        System.out.println(str5.hashCode());
        System.out.println("String capacity at SitaArchit: "+str4.capacity());



    }
}
