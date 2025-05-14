from collections import deque

def solution(N, K):
    # todo 1. 방문 배열 만들기
    visited = [False] * 100001;

    # todo 2. 큐배열 선언
    queue = deque();
    
    queue.append(N);
    visited[N] = True;
    
    # todo 2-1. 시간 담는 배열
    time = [0] * 100001;
    
    return 0;

N = 5;
K = 17;

print(solution(N, K)); # 4
