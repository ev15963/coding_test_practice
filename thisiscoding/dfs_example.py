# from typing import list
from typing import List

graph: List[List[int]] = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

stack: List[int] = []
visited_info: List[bool] = [False] * 9
dfs(node=1, visited_info=visited_info, stack=stack, graph=graph)

print(stack) # > [1, 2, 7, 6, 8, 3, 4, 5]

