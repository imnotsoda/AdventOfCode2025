import java.io.*;

public class day2_pt1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/hyunjicho/IdeaProjects/AdventofCode2025/Day2/input.txt"));
        String[] input = br.readLine().split(",");
        long ans = 0;
        for (int i = 0; i < input.length; i++) {
            String[] range = input[i].split("-");
            long range1 = Long.parseLong(range[0]);
            long range2 = Long.parseLong(range[1]);
            for (long j = range1; j <= range2; j++) {
                String s = "" + j;
                if (s.length() % 2 == 0) {
                    int index = s.length() / 2;
                    if (s.substring(0, index).equals(s.substring(index))) {
                        ans += j;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
