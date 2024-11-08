import java.util.*;

public class Strongly_Connected_Components {
    private int leader = 0;
    private int[] leader_node;
    private int[] explore;
    private int[] finishing_time_of_node;
    private int finishing_time = 1;
    private int number_of_nodes;
    private Stack<Integer> stack;
    private Map<Integer, Integer> finishing_time_map;

    public Strongly_Connected_Components(int number_of_nodes) {
        this.number_of_nodes = number_of_nodes;
        leader_node = new int[number_of_nodes + 1];
        explore = new int[number_of_nodes + 1];
        finishing_time_of_node = new int[number_of_nodes + 1];
        stack = new Stack<>();
        finishing_time_map = new HashMap<>();
    }

    public void strongConnectedComponent(int adjacency_matrix[][]) {
        for (int i = number_of_nodes; i > 0; i--) {
            if (explore[i] == 0) {
                dfs_1(adjacency_matrix, i);
            }
        }

        int[][] rev_matrix = new int[number_of_nodes + 1][number_of_nodes + 1];
        for (int i = 1; i <= number_of_nodes; i++) {
            for (int j = 1; j <= number_of_nodes; j++) {
                if (adjacency_matrix[i][j] == 1)
                    rev_matrix[finishing_time_of_node[j]][finishing_time_of_node[i]] = 1;
            }
        }

        Arrays.fill(explore, 0);
        Arrays.fill(leader_node, 0);

        for (int i = number_of_nodes; i > 0; i--) {
            if (explore[i] == 0) {
                leader = i;
                dfs_2(rev_matrix, i);
            }
        }
    }

    public void dfs_1(int adjacency_matrix[][], int source) {
        explore[source] = 1;
        stack.push(source);
        int i;
        int element = source;
        while (!stack.isEmpty()) {
            element = stack.peek();
            i = 1;
            boolean found = false;
            while (i <= number_of_nodes) {
                if (adjacency_matrix[element][i] == 1 && explore[i] == 0) {
                    stack.push(i);
                    explore[i] = 1;
                    element = i;
                    found = true;
                    break;
                }
                i++;
            }
            if (!found) {
                int popped = stack.pop();
                int time = finishing_time++;
                finishing_time_of_node[popped] = time;
                finishing_time_map.put(time, popped);
            }
        }
    }

    public void dfs_2(int rev_matrix[][], int source) {
        explore[source] = 1;
        leader_node[finishing_time_map.get(source)] = leader;
        stack.push(source);
        int i;
        int element = source;
        while (!stack.isEmpty()) {
            element = stack.peek();
            i = 1;
            boolean found = false;
            while (i <= number_of_nodes) {
                if (rev_matrix[element][i] == 1 && explore[i] == 0) {
                    if (leader_node[finishing_time_map.get(i)] == 0)
                        leader_node[finishing_time_map.get(i)] = leader;
                    stack.push(i);
                    explore[i] = 1;
                    element = i;
                    found = true;
                    break;
                }
                i++;
            }
            if (!found) {
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_nodes;

        try {
            System.out.println("Enter the number of nodes in the graph");
            number_of_nodes = scanner.nextInt();

            int adjacency_matrix[][] = new int[number_of_nodes + 1][number_of_nodes + 1];
            System.out.println("Enter the adjacency matrix");

            for (int i = 1; i <= number_of_nodes; i++)
                for (int j = 1; j <= number_of_nodes; j++)
                    adjacency_matrix[i][j] = scanner.nextInt();

            Strongly_Connected_Components strong = new Strongly_Connected_Components(number_of_nodes);
            strong.strongConnectedComponent(adjacency_matrix);

            System.out.println("The Strong Connected Components are");

            for (int i = 1; i < strong.leader_node.length; i++)
                System.out.println("Node " + i + " belongs to SCC " + strong.leader_node[i]);

        } catch (InputMismatchException inputMismatch) {
            System.out.println("Wrong Input Format");
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}