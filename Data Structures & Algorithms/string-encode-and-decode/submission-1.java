class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for (String str : strs){
            encoded_string.append(str.length()).append("@").append(str);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> decoded_strs = new ArrayList<>();

        while (!str.isEmpty()){
            int i = 0;
            while(str.charAt(i) != '@'){
                i++;
            }
            int length = Integer.parseInt(str.substring(0, i));
            int start = i + 1;
            int end = start + length;

            String decoded_str = str.substring(start, end);
            decoded_strs.add(decoded_str);

            str = str.substring(end);
        }

        return decoded_strs;
    }
}


