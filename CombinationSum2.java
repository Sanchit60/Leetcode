class Solution {
    List<List<Integer>> main;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        main = new ArrayList<>();
        Arrays.sort(candidates);
        generateSubsets(candidates, 0, 0, target, new ArrayList<>());
        return main;

    }
    public void generateSubsets(int[] arr, int idx, int ssf, int tar, ArrayList<Integer> helper){
        if(idx == arr.length){
            if(tar == ssf){
                ArrayList<Integer> subset = new ArrayList<>(helper);
                main.add(subset);
            }
            return;
        }
        if(ssf > tar){
            return;
        }
        if(tar == ssf){
            ArrayList<Integer> subset = new ArrayList<>(helper);
            main.add(subset);
            return;
        }
        helper.add(arr[idx]);
        generateSubsets(arr, idx + 1, ssf + arr[idx], tar, helper);
        helper.remove(helper.size() - 1);

        int i = idx + 1;
        while(i < arr.length && arr[i] == arr[idx]){
            i++;
        }
        generateSubsets(arr, i, ssf, tar, helper);

    }
}
