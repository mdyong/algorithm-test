package class01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pratice {

    public static void main(String[] args) {
        pratice p = new pratice();
//        p.q1();
        p.q2();
    }

    /**
     * 나이 맞히기 게임에서 A씨의 나이가 20살 이상 36살 미만인 각각의 경우에 대해 이진 탐색으로 나이를 맞힐 때까지의 흐름을 구하라
     */
    public void q1() {
        int age = 22;   // random (20이상 36미만)

        int min = 20;
        int max = 36;

        while (true) {
            int gap = (max - min) / 2;
            int candiAge = min + gap;
            if (candiAge < age) {
                min = min + gap;
            } else if (candiAge > age) {
                max = max - gap;
            } else {
                System.out.println("A의 나이는 : " + (candiAge));
                break;
            }

            System.out.println("range : " + min + " ~ " + max);
        }
    }

    /**
     * 나이 맞히기 게임에서 A씨의 나이 후보가 0세 이상 100세 미만으로 100개 있따고 하자. 예/아니오로 답할 수 있는 질문을 반복해서 나이를 맞힌다고 할 때
     * 확실하게 맞힐 수 있는 질문 횟수는 여섯번인가? 아니면 일곱 번인가?
     * note : 정답까지 포함해서 계산했을 때 8번이 나와서 당황했다. 질문에서 의도하는 것은 정답을 맞추는 횟수는 제외하고 질문 횟수만 계산하므로
     * 일곱 번이 맞다.
     */
    public void q2() {

        List<Integer> stepList = new ArrayList<>();

        for (int age = 0; age < 100; age++) {
            int min = 0;
            int max = 100;
            int step = 0;
            while (true) {

                int gap = (max - min) / 2;
                int candiAge = min + gap;
                if (candiAge < age) {
                    min = min + gap;
                } else if (candiAge > age) {
                    max = max - gap;
                } else {
                    stepList.add(step);
                    break;
                }
                step++;
            }
        }


        System.out.println("min : " + Collections.min(stepList));
        System.out.println("max : " + Collections.max(stepList));
    }

}
