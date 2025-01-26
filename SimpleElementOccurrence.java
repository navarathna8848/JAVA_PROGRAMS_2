public class SimpleElementOccurrence {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        boolean[] visited = new boolean[array.length];

        System.out.println("Element Occurrences:");
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println("Element: " + array[i] + ", Occurrences: " + count);
            }
        }
    }
}
