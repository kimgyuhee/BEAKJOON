
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj_1260 {

    static Point[] points;
    static boolean[] visited_dfs;
    static boolean[] visited_bfs;

    static int N;
    static int M;
    static int V;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // System.out.println(N + M + V);

        Map<Integer, Integer[]> map = new HashMap<>();

        points = new Point[N];
        visited_bfs = new boolean[N];
        visited_dfs = new boolean[N];

        for (int i = 0; i < N; i++) {
            points[i] = new Point(i + 1);
            points[i].String();
            visited_bfs[i] = false;
            visited_dfs[i] = false;
        }

        for (int i = 0; i < M; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            points[x - 1].values.add(y);
            points[y - 1].values.add(x);
        }

        for (int i = 0; i < N; i++) {
            points[i].String();
        }

        System.out.println(BFS(V));

    }

    public static String BFS(int v, Point[] points) {
        String bfs = "";
        Deque<Integer> queue = new ArrayDeque();
        queue.add(v);

        while (!queue.isEmpty()) {
            int p = queue.poll();
            bfs += p + " ";
            if (!visited_bfs[p - 1]) {
                visited_bfs[p - 1] = true;
                Deque<Integer> check = points[p - 1].values;
                while (!check.isEmpty()) {
                    int c = check.poll();
                    if (!visited_bfs[c - 1]) {
                        queue.add(c);
                    }
                }
            } else {
                continue;
            }
        }

        for (int i = 0; i < N; i++) {
            points[i].String();
        }
        return bfs;
    }

}

class Point {
    int key;
    Deque<Integer> values = new ArrayDeque();

    public Point(int p) {
        this.key = p;
    }

    public void String() {
        System.out.println("key(" + key + ") 의 values는 " + values + "입니다");
    }
}