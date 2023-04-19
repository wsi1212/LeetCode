def threeSum(self, nums: list[int]):
    res = set()
    n, p, z = [], [], []
    for num in nums:
        if num > 0:
            p.append(num)
        elif num < 0:
            n.append(num)
        else:
            z.append(num)

    N, P = set(n), set(p)

    #0 존재 경우
    if z:
        for num in P:
            if -1 * num in N:
                res.add((-1 * num, 0, num))

    # 0이 3개 넘을 경우
    if len(z) >= 3:
        res.add((0, 0, 0))

    # 양수 2개, 음수 1개
    for i in range(len(n)):
        for j in range(i + 1, len(n)):
            target = -1 * (n[i] + n[j])
            if target in P:
                res.add(tuple(sorted([n[i], n[j], target])))

    # 양수 1개, 음수 2개
    for i in range(len(p)):
        for j in range(i + 1, len(p)):
            target = -1 * (p[i] + p[j])
            if target in N:
                res.add(tuple(sorted([p[i], p[j], target])))

    return res
