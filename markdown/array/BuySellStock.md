To solve the problem of finding the best time to buy and sell stock to maximize profit, you can use the following hint:

1. **Track the minimum price**: As you iterate through the array, keep track of the minimum price encountered so far.

2. **Calculate potential profit**: For each price in the array, calculate the potential profit if you were to sell at the current price (i.e., current price - minimum price).

3. **Update maximum profit**: Keep track of the maximum profit encountered during the iteration.

This approach ensures that you only need to traverse the array once, resulting in an efficient solution.
