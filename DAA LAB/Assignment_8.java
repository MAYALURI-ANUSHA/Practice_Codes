import java.util.*;

class Item implements Comparable<Item> {
    int weight, value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    // Sort items based on value per unit weight in descending order
    public int compareTo(Item other) {
        double ratio = (double) other.value / other.weight - (double) this.value / this.weight;
        if (ratio > 0) return 1;
        else if (ratio < 0) return -1;
        else return 0;
    }
}

public class Assignment_8 {
    public static int knapsackGreedy(int W, int[] wt, int[] val, int n) {
        // Create an array of items
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(wt[i], val[i]);
        }

        // Sort items based on value per unit weight
        Arrays.sort(items);

        int totalValue = 0;
        int remainingWeight = W;

        for (int i = 0; i < n; i++) {
            if (items[i].weight <= remainingWeight) {
                totalValue += items[i].value;
                remainingWeight -= items[i].weight;
            } else {
                // Fractional knapsack
                double fraction = (double) remainingWeight / items[i].weight;
                totalValue += items[i].value * fraction;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        System.out.println("Enter the values and weights of the items:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value of item " + (i+1) + ": ");
            val[i] = scanner.nextInt();
            System.out.print("Weight of item " + (i+1) + ": ");
            wt[i] = scanner.nextInt();
        }

        System.out.print("Enter the maximum weight of the knapsack: ");
        int W = scanner.nextInt();

        System.out.println("Maximum Profit achieved with this knapsack: " + knapsackGreedy(W, wt, val, n));

        scanner.close();
    }
}
