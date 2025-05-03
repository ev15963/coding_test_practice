def solution(score):
    # 단위
    jellies = [100, 50, 5, 1];
    count = 0;
    for jelly in jellies:
        count += score // jelly;
        score = score % jelly;
    return count;

score = 156; # to be 4
# score = 319; # to be 10
# score = 551; # to be 7
# score = 1234; # to be 22
sol = solution(score);

print(sol);
