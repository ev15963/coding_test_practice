from collections import deque

def solution(N, K):
    # todo 1. 방문 배열 만들기
    visited = [False] * 100001;
    
    # todo 2-1. 시간 담는 배열
    time = [0] * 100001;

    # todo 2. 큐배열 선언
    queue = deque();
    
    queue.append(N);
    seconds = 0;
    
    # todo 3. 큐에 해당 값이 추가되면 방문 배열에 true로 전환
    visited[N] = True;
    time[N] = seconds;

    # todo 4. queue가 계속 있는 동안 진행
    while (queue):
        position = queue.popleft();
        depth = ++seconds;
        
        # todo 5. 만약 도착지점과 같다면 시간(깊이) 반환
        if (position == K):
            return depth;

        # todo 6. 이동 or 순간이동 하면서 방문 하지 않은 곳만 찾아가기
        nextSteps = [ position-1, position+1, position*2 ];

        for nextStep in nextSteps:
            if nextStep >= 0 and nextStep < len(visited) and not visited[nextStep]:
                visited[nextStep] = True;
                queue.insert(nextStep);
    
    return depth;

N = 5;
K = 17;

print(solution(N, K)); # 4
