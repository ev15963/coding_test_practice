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
            
        # todo 3. 기여도의 누적합을 구하기
        length = len(contributions);
        print(f'length: {length}');
        count = 0;
        current = 0;
        # 0보다 큰 경우 까지 count +1
        for i in contributions:
            current += i;
            if(current > 0):
                count += 1;
            else:
                break;
        
        max_count = max(max_count, count);
            
    return max_count;

pouches = ["cab", "adaaa", "e"] #3 
# pouches = ["aabb", "baba"] #0 
# pouches = ["d", "a", "e", "d", "abdcc"] #3
# pouches = ["a"] #1
ans = solution(pouches)
print(ans)
