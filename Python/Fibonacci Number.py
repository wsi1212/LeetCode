class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        Fibonacci = [0] * (n + 1)
        Fibonacci[0] = 0
        Fibonacci[1] = 1
        for i in range(2, n + 1):
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2]
        return Fibonacci[n]


a = Solution
print(a.fib("", 2))