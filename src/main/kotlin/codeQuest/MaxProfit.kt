package org.example.codeQuest

class MaxProfit {
    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
     */
    companion object {
        fun maxProfitBruteForce(prices: IntArray): Int {
            var maxProfit = Integer.MIN_VALUE

            for (buyIndex in 0 until prices.size - 1) {
                for (sellIndex in buyIndex + 1 until prices.size) {
                    val buyPrice = prices[buyIndex]
                    val sellPrice = prices[sellIndex]

                    val currentProfit = sellPrice - buyPrice

                    if (currentProfit > maxProfit) {
                        maxProfit = currentProfit
                    }
                }
            }

            return if (maxProfit < 0) 0 else maxProfit
        }

        fun maxProfit(prices: IntArray): Int {
            // Initialize the minimum price seen so far as the maximum possible value
            var minPrice = Integer.MAX_VALUE
            // Initialize the maximum profit seen so far as 0
            var maxProfit = 0

            for (currentPrice in prices) {
                // Update the minimum price seen so far
                if (currentPrice < minPrice) {
                    minPrice = currentPrice
                } else {
                    /**
                     * If the current price is not less than the minimum price seen so far, it means that the current price could potentially be a selling opportunity.
                     * Here, we calculate the potential profit (potentialProfit) if we were to sell at the current price (currentPrice) after buying at the minimum price seen so far (minPrice).
                     * We then compare this potential profit with the maximum profit seen so far (maxProfit).
                     * If the potential profit is greater than the maximum profit seen so far, we update the maximum profit (maxProfit) to be the potential profit.
                     */
                    val potentialProfit = currentPrice - minPrice
                    if (potentialProfit > maxProfit) {
                        maxProfit = potentialProfit
                    }
                }
            }

            return maxProfit
        }

    }

}