
class Solution {
               public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            // Count occurrences
            for (int currentNumber : nums) {
                frequencyMap.put(currentNumber,    frequencyMap.getOrDefault(currentNumber, 0) + 1);
            }

// Bucket array

            List<Integer>[] frequencyBuckets = new ArrayList[nums.length + 1];

            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

                int number = entry.getKey();

                int frequency = entry.getValue();

                if (frequencyBuckets[frequency] == null) {

                    frequencyBuckets[frequency] = new ArrayList<>();

                }

                frequencyBuckets[frequency].add(number);

            }

            List<Integer> result = new ArrayList<>();

// Traverse from highest frequency

            for (int frequency = frequencyBuckets.length - 1;

                 frequency >= 0 && result.size() < k;
                 frequency--) {

                if (frequencyBuckets[frequency] != null) {

                    for (int number : frequencyBuckets[frequency]) {
                        result.add(number);

                        if (result.size() == k) {

                            break;

                        }

                    }

                }

            }
            return result.stream()
                        .mapToInt(Integer::intValue)
                         .toArray();
        }
    }
