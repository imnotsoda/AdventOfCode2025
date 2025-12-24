import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day2_pt2 {
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
                for (int k = 1; k < s.length(); k++) {
                    if (s.length() % k != 0) {
                        continue;
                    }
                    boolean matches = true;
                    for (int l = 0; l <= (s.length() - 2 * k); l += k) {
                        if (!s.substring(l, l + k).equals(s.substring(l + k, l + 2 * k))) {
                            matches = false;
                        }
                    }
                    if (matches) {
                        ans += j;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
