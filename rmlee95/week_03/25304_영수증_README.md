[👉 3003번: 킹, 퀸, 룩, 비숍, 나이트, 폰](https://www.acmicpc.net/problem/25304)

## 문제 정의
<details><summary> 문제
</summary>

#### 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

영수증에 적힌,

구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
</details>

`input`
- 첫째 줄에는 영수증에 적힌 총 금액 $X$가 주어진다.
- 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 $N$이 주어진다.
- 이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.

`output`
- 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
- 일치하지 않는다면 No를 출력한다.

## 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        int a, b;
        
        for (int i = 0; i < N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            X -= a * b;
        }

        System.out.println(X == 0 ? "Yes" : "No");
    }
}
```

## 메모