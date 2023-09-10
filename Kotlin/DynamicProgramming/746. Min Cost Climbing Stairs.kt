package DynamicProgramming

import kotlin.math.min

fun minCostClimbingStairs(cost: IntArray): Int {
    for (i: Int in 2 until cost.size) {
        cost[i] += min(cost[i - 1], cost[i - 2])
    }
    return min(cost[cost.size - 1], cost[cost.size - 2])
}

fun main() {
    print(minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))
}