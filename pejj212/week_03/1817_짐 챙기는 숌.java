public class Main {
    public static void main(String[] args) {
        /*
         * 숌은 짐을 챙겨서 겨울캠프에서 집으로 가려고 한다. 근데 숌은 공부를 많이 하러 캠프에 온 것이기 때문에 책을 엄청나게 많이 가지고 왔다.
         * 숌은 이 책을 방에 탑처럼 쌓아 놨다.
         * 숌은 책을 박스에 차곡차곡 넣어서 택배로 미리 보내려고 한다. 책은 탑처럼 차곡차곡 쌓여있기 때문에, 차례대로 박스에 넣을 수밖에 없다.
         * 각각의 책은 무게가 있다. 그리고 박스는 최대 넣을수 있는 무게가 있다. 숌이 필요한 박스의 개수의 최솟값을 구하는 프로그램을 작성하시오.
         */

        /*
         * 1. 책 무게가 박스보다 작으면 박스가 꽉 찰 때까지 계속 집어넣기
         * 2. 박스에 들어있는 책 무게가 박스보다 커지면 다음 박스로 옮기고(박스 개수 +1)
         * 3. 다음 박스에 새 책을 집어넣고 이제 얘가 책 무게가 됨
         * 반복
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //책의 개수
        int M = sc.nextInt(); //박스의 최대 무게

        int count=0; //박스 개수

        int arr[] = new int[N];
        int book=0; //책 무게

        for(int i=0; i<N; i++) { //책 무게를 차례로 입력받아 배열에 집어넣기
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<N; i++) { //책 개수만큼 반복
            if(arr[i]+book > M) { //
                count++;
                book = arr[i];
            }
            else {
                book=arr[i]+book;
            }
        }

        if (book > 0)
            count++;

        System.out.println(count);
    }
}