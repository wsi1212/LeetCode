fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = emptyList<List<Int>>()
    return findSum(candidates, target, result.toMutableList(), temp = mutableListOf())
}

fun findSum(candidates: IntArray, target: Int, result: MutableList<List<Int>>, temp: MutableList<Int>):List<List<Int>> {
    if (temp.sum() < target) {
        candidates.forEach { candidate ->
            findSum(candidates, target, result, temp.plus(candidate).toMutableList())
        }
        candidates.forEach { candidate ->
            if (temp.sum() + candidate == target) {
                temp.add(candidate)
                result.forEach { result ->
                    if (temp.sorted() == result.sorted()) {
                        return emptyList()
                    }
                }
                if (!result.contains(temp)) {
                    result.add(temp)
                }
            }
        }
    }
    return result
}