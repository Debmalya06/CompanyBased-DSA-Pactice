public class Cognizant16 {

        public static int nextGreater(int n) {
            char[] digits = String.valueOf(n).toCharArray();

            // Step 1: Find the first decreasing digit from the right
            int i = digits.length - 2;
            while (i >= 0 && digits[i] >= digits[i + 1]) {
                i--;
            }

            // If no such digit exists, it's the highest permutation
            if (i < 0) return -1;

            // Step 2: Find the smallest digit on the right of i that is greater than digits[i]
            int j = digits.length - 1;
            while (digits[j] <= digits[i]) {
                j--;
            }

            // Step 3: Swap
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;

            // Step 4: Reverse the suffix
            reverse(digits, i + 1, digits.length - 1);

            // Step 5: Convert back to number
            long result = Long.parseLong(new String(digits));
            return (result <= Integer.MAX_VALUE) ? (int) result : -1;
        }

        private static void reverse(char[] arr, int start, int end) {
            while (start < end) {
                char temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }

        public static void main(String[] args) {
            int n = 12;
            System.out.println(nextGreater(n)); // Output: 21
        }
    }

