public class Main {
    public static void main(String[] args) {
        /*
         * 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램을 작성하시오.\
         * 예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 이들 중 홀수는 77, 41, 53, 85이므로
         * 그 합은 77 + 41 + 53 + 85 = 256이 되고,
         * 41 < 53 < 77 < 85 이므로 홀수들 중 최솟값은 41이 된다.
         */

        Scanner sc =new Scanner(System.in);

        ArrayList list = new ArrayList();
        int sum=0;

        for(int i=0; i<7; i++) {
            int a=sc.nextInt();
            if((a % 2) == 1) {
                list.add(a);
            }
        }

        if(list.isEmpty())
            System.out.println(-1);
        else {
            for(int i=0; i<list.size(); i++) {
                sum += (int)list.get(i);
            }
            Collections.sort(list);

            int min = (int) list.get(0);
            System.out.println(sum);
            System.out.println(min);
        }
    }
}

