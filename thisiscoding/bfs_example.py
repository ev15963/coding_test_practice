from collections import deque
from typing import List

def bfs(
    node: int,
    visited_info: List[int],
    queue: List[int],
    result: List[int],
    graph: List[List[int]],
) -> None:
    visited_info[node] = True
    while queue:
        current_node: int = queue.popleft()
        result.append(current_node)
        for adjacent_node in graph[current_node]:
            if not visited_info[adjacent_node]:
                queue.append(adjacent_node)
                visited_info[adjacent_node] = True


graph: List[List[int]] = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7],
]
visited_info: List[bool] = [False] * 9
result: List[int] = []
queue: deque = deque([1])

bfs(
    node=1,
    visited_info=visited_info,
    queue=queue,
    result=result,
    graph=graph
)
print(result)