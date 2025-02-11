public class NumerosFaltando {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Soma dos primeiros n números naturais
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num; // Soma dos elementos no array
        }

        return totalSum - arraySum; // O número que falta
    }

    public static void main(String[] args) {
        {
            int[] nums1 = {3, 0, 1};
            System.out.println(missingNumber(nums1)); // Saída: 2

            int[] nums2 = {0, 1};
            System.out.println(missingNumber(nums2)); // Saída: 2

            int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
            System.out.println(missingNumber(nums3)); // Saída: 8
        }
    }
}