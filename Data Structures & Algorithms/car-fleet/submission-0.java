class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i ++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<Double>();
        for (double[] car: cars){
            double pos = car[0];
            double spee = car[1];
            double time = (target - pos) / spee;
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time); 
            }
        }
        return stack.size();

    }
}
