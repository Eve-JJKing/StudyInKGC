package HomeWork;

public class TestMathnum {
	public static void main(String[] args)
    {  
        int[] count=new int[10];
        int base=100000000;
        int b;
        for(int i=0;i<base;i++)
        { 
            //Éú³É[0,9]
            b=(int)(Math.random()*10);
            if(b<0)
                break;
            if (b>9)
            {
                break;
            }
            switch (b)
            {
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;
            }
        }
        for(int i=0;i<10;i++)
        {
            double eachPercent= ((double)count[i]/base)*100;
            System.out.println(i+": "+eachPercent+"%"+",");
        }
    }

}
