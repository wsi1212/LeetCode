fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val sortedCandidates = candidates.filter { it <= target }.sorted()

    fun backtrack(startIndex: Int, temp: MutableList<Int>, remain: Int) {
        if (remain == 0) {
            result.add(temp.toList())
            return
        }

        for (i in startIndex until sortedCandidates.size) {
            if (i > startIndex && sortedCandidates[i] == sortedCandidates[i - 1]) {
                continue
            }
            val candidate = sortedCandidates[i]
            if (candidate > remain) {
                break
            }
            temp.add(candidate)
            backtrack(i + 1, temp, remain - candidate)
            temp.removeAt(temp.size - 1)
        }
    }

    backtrack(0, mutableListOf(), target)
    return result
}

fun main() {
    println(
        combinationSum2(
            intArrayOf(
                10, 1, 2, 7, 6, 1, 5
            ), 8
        )
    )
}