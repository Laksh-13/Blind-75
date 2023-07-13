//TC: O(N), SC: O(N)
class Solution {
    public int calPoints(String[] operations) {
        int output = 0;

        ArrayList<Integer> result = new ArrayList<Integer>();


        for (int i = 0; i < operations.length; i++){
            if (operations[i].equals("D")){
                result.add(2*result.get(result.size()-1));

            } else if(operations[i].equals("C")){
                result.remove(result.size()-1);

            } else if(operations.equals("+")){
                int sum = result.get(result.size()-1)+result.get(result.size()-2);
                result.add(sum);
            } else {
                result.add(Integer.parseInt(operations[i]));
            }
        }

        for (int i : result) {
      output += result.get(i);
    }

    return output;
        
    }
}
