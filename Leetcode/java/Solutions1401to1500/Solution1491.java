package Solutions1401to1500;

class Approach1 {
    public double average(int[] salary) {
        double max = salary[0];
        double min = salary[0];

        for (int i = 0; i < salary.length; i++) {
            if(salary[i] > max) max = salary[i];
            if(salary[i] < min) min = salary[i];
        }

        double avg = 0;
        int count = 0;
        for (int i = 0; i < salary.length; i++){
            if(salary[i] != max && salary[i] != min) {
                avg += salary[i];
                count += 1;
            }
        }
        return avg / count;
    }
}

// Time Complexity = O(N+N) = O(2N) = O(N)
// Space Complexity = O(1)

class Approach2 {
    public double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        int sum = 0;
        for(int i : salary) {
            sum += i;
            maxSalary = Math.max(maxSalary, i);
            minSalary = Math.min(minSalary, i);
        }
        return (double) (sum - maxSalary - minSalary) / (double) (salary.length - 2);
    }
}

// Time Complexity = O(N)
// Space Complexity = O(1)

public class Solution1491 {
    public static void main(String[] args) {
        Approach1 approach1 = new Approach1();

        int[] salary = {1000, 2000, 3000, 4000};
        int[] salary1 = {1000, 2000, 3000};

        System.out.println(approach1.average(salary));
        System.out.println(approach1.average(salary1));

        Approach2 approach2 = new Approach2();
        System.out.println(approach2.average(salary));
        System.out.println(approach2.average(salary1));


    }
}
