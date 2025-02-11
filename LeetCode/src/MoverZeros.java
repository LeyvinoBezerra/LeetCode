import java.util.Arrays;

public class MoverZeros {

        private static void moveZeros(int[] nums) {
            int n = nums.length;
            int lastNonZeroFoundAt = 0;
            // Mover todos os elementos diferentes de zero para a frente do array
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[lastNonZeroFoundAt++] = nums[i];
                }
            }
            for (int i = lastNonZeroFoundAt; i < n; i++) {
                nums[i] = 0;
            }

        }
        public static void main(String[] args) {
            int[] nums1 = {0,2,0,4,5};
            moveZeros(nums1);
            System.out.println(Arrays.toString(nums1)); // Saída: [1, 3, 12, 0]

            int[] nums2 = {0};
            moveZeros(nums2);
            System.out.println(Arrays.toString(nums2));  // saída: [0]

        }


    }



