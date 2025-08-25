public class TcsQA4_24 {

    public static void main(String[] args) {
        int [] nums ={2,2,3,5};
        System.out.println(sumOfUnique(nums));
    }

        public static int sumOfUnique(int[] nums) {
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                boolean isUnique = true;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    sum += nums[i];
                }
            }

            return sum;
        }
    }
