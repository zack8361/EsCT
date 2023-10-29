package kakao;


import java.util.Arrays;

/**
 * 1	1S2D*3T	   : 1^1 * 2 + 2^2 * 2 + 3^3   : 37
 * 2	1D2S#10S   : 1^2 + 2^1 * (-1) + 10^1   : 9
 *  S = Single 1제곱
 *  D = Double 2제곱
 *  T = Triple 3제곱
 *
 */
public class 다트게임1차 {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";
        System.out.println(solution(dartResult));
    }

    private static int solution(String dartResult) {


        int[] score = new int[3];
        int idx = 0;

        int spot = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0'){
                score[idx] = 10;
                i++; // Skip '0
            }
            else if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
                score[idx] = Integer.parseInt(String.valueOf(dartResult.charAt(i)));
            }

            if(dartResult.charAt(i) == 'D'){
                score[idx] = (int) Math.pow(score[idx],2);
                try {
                    if (dartResult.charAt(i + 1) == '*') {
                        score[idx - 1] = score[idx - 1] * 2;
                        score[idx] *= 2;
                    } else if (dartResult.charAt(i + 1) == '#') {
                        score[idx] *= -1;
                    }
                }
                
                catch (Exception e){

                }
                    idx++;

            }
            else if(dartResult.charAt(i) =='T'){
                score[idx] = (int) Math.pow(score[idx],3);
                try {
                    if (dartResult.charAt(i + 1) == '*') {
                        score[idx - 1] = score[idx - 1] * 2;
                        score[idx] *= 2;
                    } else if (dartResult.charAt(i + 1) == '#') {
                        score[idx] *= -1;
                    }
                }
                catch (Exception e){

                }
                    idx++;

            }
            else if(dartResult.charAt(i) =='S'){
                try {
                    if (dartResult.charAt(i + 1) == '*') {
                        score[idx - 1] = score[idx - 1] * 2;
                        score[idx] *= 2;
                    } else if (dartResult.charAt(i + 1) == '#') {
                        score[idx] *= -1;
                    }
                }
                catch (Exception e){

                }
                    idx++;

            }
            System.out.println(dartResult.charAt(i));
            System.out.println(Arrays.toString(score));

        }
        int answer= 0;
        for (int i = 0; i < score.length; i++) {
            answer +=score[i];
        }

        return answer;
    }
}

// 1의 제곱 1