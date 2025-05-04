from collections import Counter

def solution(pouches):

    max_count = 0;
    # todo 1. 낱말을 abcde 문자열로 순회하며 진행
    for flavor in 'abcde':
        # todo 2. contributions 기여도 구하기
        contributions = [];
        for pouch in pouches:
            counter = Counter(pouch)
            this = counter[flavor];
            etc = sum(counter.values()) - this;
            contribution = this - etc;
            contributions.append(contribution);
            contributions.sort(reverse=True);
            
        max_count = max(max_count, count);
            
    return max_count;

pouches = ["cab", "adaaa", "e"] #3 
# pouches = ["aabb", "baba"] #0 
# pouches = ["d", "a", "e", "d", "abdcc"] #3
# pouches = ["a"] #1
ans = solution(pouches)
print(ans)
