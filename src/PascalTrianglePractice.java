import java.util.ArrayList;
import java.util.List;

public class PascalTrianglePractice {

	public static void main(String[] args) {
	int n = 7;
        List<List<Integer>> temp = new ArrayList<>();


        //1
        //1 1
        //1 2 1
        //1 3 3 1
        //1 4 6 4 1
        //1 5 10 10 5 1
        //1 6 15 20 15 6 1

        for(int i = 0; i< n ; i++)
        {
            List<Integer> tempReset = new ArrayList<Integer>();
            for(int j = 0 ; j < i+1 ; j++)
            {
                int num = 1;
                if(i >= 2)
                {
                   if(j >= 1 && j < i)
                   {
                       num = temp.get(i-1).get(j-1) + temp.get(i-1).get(j);
                       System.out.print(num);
                       tempReset.add(num);
                   }
                   else
                   {
                       System.out.print(num);
                       tempReset.add(num);
                   }
                }

                else {
                    System.out.print(num);
                    tempReset.add(num);
                }
            }
            temp.add(tempReset);
            System.out.println("");
        }

        System.out.println(temp);

	}

}
