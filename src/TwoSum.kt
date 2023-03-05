package src

private fun main() = twoSum(intArrayOf(3,3), 6).forEach(::print)

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val indices = intArrayOf(0, 0)
    for(num in (nums.indices)) {
        for(num1 in ((num + 1) until (nums.size))) {
            if(nums[num] + nums[num1] == target)  {
                indices[0] = num
                indices[1] = num1
            }
        }
    }

    return indices
}