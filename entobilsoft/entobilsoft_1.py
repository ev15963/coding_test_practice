def solution(A, idx):
    # todo 1. 누적합 구하기

    # 누적합을 담을 배열
    prefix_sum = [0] * 8;
    
    for i in range(8):
        for j in range(i+1):
            prefix_sum[i] += A[j];
    
    print(prefix_sum);

    # todo 2. 배열의 총 합계
    sum = 0;
    for i in range(8):
        sum += A[i];

    print(sum);

    # todo 3. 동치 인덱스 전까지 합 구하기
    before_sum = prefix_sum[idx-1];
    # todo 4. 동치 인덱스 이후 합 구하기
    after_sum = sum - prefix_sum[idx];

    if(before_sum == after_sum):
        return 1;
    else:
        return 0;


A = [-1, 3, -4, 5, 1, -6, 2, 1];

solution(A, 3);
