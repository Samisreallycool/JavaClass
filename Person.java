public class Person
{
   /** public static String getClassAuthor;
    public String getFullName;
    public String getDOB;
    public String getAddress;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private int hourOfBirth;
    private String address;

    public Person()
    {
    System.out.println("Default constructor called");
    firstName = "";
    lastName = "";
    yearOfBirth = 2000;
    monthOfBirth = 1;
    dayOfBirth = 1;
    hourOfBirth = 0;
    address = "";
    }


    public Person(String first, String lastName)
    {
        this();
        System.out.println("Paramaterized constructor called");
        firstName = first;
       this.lastName = lastName;

    }

    public String getFullName()
    {
        String fullName = firstName + " " + lastName;

        return fullName;
    }

    public String getDOB()
    {
        String DOB = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
        return DOB;
    }

    public String getAddress()
    {
        return address;
    }

    public void setFullName(String first, String last)
    {
        firstName = first;
        lastName = last;
    }
    public void setDateOfBirth(int day, int month, int year)
    {
        if (month <= 0) {
            (month > 12)
        throw (new IllegalArgumentException("Month can only be between 1 - 12"));
        if (day <= 0) day > 31) throw (new IllegalArgumentException("Day can only be between 1 - 31"));
        monthOfBirth = month;
        dayOfBirth = day;
        yearOfBirth = year;
    }


    public void setAddress (String Address)
    {
        this.address = address;
    }

    public static String getClassAuthor()
    {
        return"Sam";
    }
      public static void main(String[])
            {
                System.out.println("")
    }
    */
   public static void main(String[] args)
   {
       System.out.println("Hi String".getClass());
       String greeting = null;
       System.out.println("Greeting: " + greeting);
       greeting = new String("Hi");
       System.out.println("Greeting: " + greeting);

       greeting = "Hello using literal";
       System.out.println("Greeting: "+ greeting);

       boolean flag = true;
       int radius = 20;
       double PI = 3.142;
       String subject = "World";

       String strConcat = greeting + subject;
       String boolConcat = "state of flag: " + flag;
       String intConcat = "Radius of circle: " + radius;
       String doubleConcat = "Value of PI: " + PI;
       String area = "Area of circle: " + (PI * radius * radius);
       String concatCatch = "The catch is: " + 12 +3 +5;

       System.out.println(strConcat);
       System.out.println(boolConcat);
       System.out.println(intConcat);
       System.out.println(strConcat);
       System.out.println(doubleConcat);
       System.out.println(area);
       System.out.println(concatCatch);

       String strQuote = "\"First, solve the problem.";
       System.out.println(strQuote);

       String strNewLine = "First line\n Second line\n Third line";
       System.out.println(strNewLine);

       String strSpace = "This String" + " " + "is" + " " + "with";
       System.out.println(strSpace);

       System.out.println("This\tApart");

       //String strEscape = "How many" + "\"";
       System.out.println("");
   }
}