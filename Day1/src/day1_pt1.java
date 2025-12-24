import java.io.*;

public class day1_pt1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/hyunjicho/IdeaProjects/AdventofCode2025/Day1/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int place = 50;
        long count = 0;
        int lineCount = 0;

        while ((line = br.readLine()) != null) {
            int num = Integer.parseInt(line.substring(1));
            if (line.charAt(0) == 'L') {
                place -= num;
                while (place < 0) {
                    place += 100;
                }
            }
            else if (line.charAt(0) == 'R') {
                place += num;
                place %= 100;
            }
            else {
                System.out.println("Parsing went wrong at line " + lineCount + "...");
            }

            if (place == 0) {
                count++;
            }

            lineCount++;
        }
        System.out.println(count);
    }
}
