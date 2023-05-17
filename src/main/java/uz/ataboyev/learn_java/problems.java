package uz.ataboyev.learn_java;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class problems {
    public static void main(String[] args) {
//        System.out.println(maxVowels("rexcvjbkajshdeeeeauusdsbuuugsahbj", 4));
//        System.out.println(Arrays.deepToString(generateMatrix(6)));
        int[][] res = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(res));
        System.out.println(spiralOrder(res2));
    }

    public static List<Integer> adas(List<String> dictionary, List<String> query) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String value : dictionary) {
            String s = sort(value);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (String s : query) {
            String str = sort(s);
            res.add(map.getOrDefault(str, 0));
        }
        return res;


    }

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


    public static int max(List<Integer> cost, List<String> labels, int dailyCount) {
        int max = 0, helper = 0, count = 0;
        for (int i = 0; i < cost.size(); i++) {
            helper += cost.get(i);
            if (labels.get(i).equals("legal")) {
                count++;
                if (count == dailyCount) {
                    max = Math.max(max, helper);
                    count = 0;
                    helper = 0;
                }
            }
        }
        return max;
    }

    public static long maxS(List<Integer> arr) {
        long t = 0, j = 0, sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) j += arr.get(i);
            else t += arr.get(i);
        }
        return (t - j) * (t - j);
    }

    public static int sortedSum(List<Integer> a) {
        List<Integer> list = a.stream().sorted().collect(Collectors.toList());
        System.out.println(list.toString());
        int f = 0, res = 0;
        for (int i = 1; i <= a.size(); i++) {
            f += i;
            res += f * a.get(i - 1);
        }
        return res;

    }

    public static int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int max = 0, count = 0;
        int j = 0;
        while (j < k) {
            if (isVowel(chars[j])) max++;
            j++;
        }
        count = max;
        System.out.println(max);
        for (int i = k; i < s.length(); i++) {
            if (!isVowel(chars[i])) {
                if (isVowel(chars[i - k]) && count > 0)
                    count--;
            } else if (isVowel(chars[i])) {
                if (!isVowel(chars[i - k])) {
                    count++;
                    max = Math.max(count, max);
                    if (max == k) return k;
                }
            }
        }
        return max;
    }

    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }


    public static int[][] generateMatrix(int n) {

        Integer left = 0, right = n, down = n, up = 0, helper = 1;
        int[][] res = new int[n][n];

        while (helper <= n * n) {
            for (int i = left; i < right; i++) {
                res[left][i] = helper++;
            }
            up++;
            for (int i = up; i < down; i++) {//
                res[i][down - 1] = helper++;
            }
            right--;
            for (int i = right; i > left; i--) {
                res[right][i - 1] = helper++;
            }
            down--;
            for (int i = down; i > up; i--) {
                res[i - 1][up - 1] = helper++;
            }
            left++;
        }

        return res;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        Integer left = 0, right = matrix[0].length - 1, down = matrix.length - 1, up = 0, helper = 1;
        List<Integer> res = new ArrayList<>();
        int size = matrix.length * matrix[0].length;

        while (res.size() < size) {
            for (int i = left; i <= right && res.size() < size; i++) {
                res.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down && res.size() < size; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && res.size() < size; i--) {
                res.add(matrix[down][i]);
            }
            down--;
            for (int i = down; i >= up && res.size() < size; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }

    public static long mostPoints(int[][] questions) {

        Long max = 0l, sum = 0l;

        int l = questions.length;

        for (int i = 0; i < l; i++) {
            sum += questions[i][0];
        }

        for (int i = 1; i < l-1; i++) {
            max = Math.max(sum-(questions[i][0]+questions[i+1][0]),max);
        }
            max = Math.max(sum-(questions[l-1][0]),max);
        return max;
    }
}