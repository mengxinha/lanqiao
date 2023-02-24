
//问题描述
//        小蓝有一个n行m列的白色棋盘, 棋盘的每一个方格都可以被染成彩色。
//        每个方格有一个染色时间Tij, 不同方格的染色时间可能不同。如果一个方 格被触发了染色, 这个方格就会在
//        Tij秒之后变成彩色, 然后将自己上下左右四 个方向相邻的方格触发染色。每个方格只能被触发染色一次, 第一次触发之后 的触发为无效触发。给定每个方格的染色时间,
//        在时刻0触发第一行第一列的方格染色, 请问 多长时间后整个棋盘完成染色。
//        输入格式
//        输入的第一行包含两个整数n,m, 分别表示棋盘的行数和列数。
//        接下来n行, 每行m个正整数, 相邻的整数之间用一个空格分隔, 表示每 个方格的染色时间。该部分的第i行第j个整数表示Tij, 即第i行第j列的方格的染色时间。
//        输出格式
//        输出一行包含一个整数, 表示整个棋盘完成染色的时间。

import java.io .*;
import java.util .*;
public class 棋盘染色 {

        static class Po implements Comparable<Po> {
            int x, y, t;

            public Po(int x, int y, int t) {
                this.x = x;
                this.y = y;
                this.t = t;
            }

            @Override
            public int compareTo(Po p) {
                return this.t - p.t;
            }
        }

        static int N = 510;
        static int g[][] = new int[N][N];
        static boolean st[][] = new boolean[N][N];
        static int n, m;
        static int dx[] = {-1, 0, 1, 0}, dy[] = {0, 1, 0, -1};

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer strInput = new StringTokenizer(br.readLine());
            n = Integer.parseInt(strInput.nextToken());
            m = Integer.parseInt(strInput.nextToken());
            for (int i = 0; i < n; i++) {
                strInput = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    g[i][j] = Integer.parseInt(strInput.nextToken());
                }
            }
            System.out.println(bfs());
            br.close();
        }

        public static int bfs() {
            PriorityQueue<Po> q = new PriorityQueue<>();
            q.offer(new Po(0, 0, g[0][0]));
            st[0][0] = true;

            int ans = 0;
            while (!q.isEmpty()) {
                Po t = q.poll();
                if (t.t > ans) ans = t.t;

                for (int i = 0; i < 4; i++) {
                    int x = t.x + dx[i], y = t.y + dy[i];
                    if (x >= 0 && x < n && y >= 0 && y < m && !st[x][y]) {
                        st[x][y] = true;
                        q.offer(new Po(x, y, g[x][y] + t.t));
                    }
                }
            }
            return ans;
        }
    }
