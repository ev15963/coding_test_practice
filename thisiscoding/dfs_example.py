# from typing import list
from typing import List

def dfs(
    node: int,
    visited_info: List[bool],
    stack: List[int],
    graph: List[List[int]],
):
    visited_info[node] = True
    stack.append(node)

    adjacent_nodes: List[int] = graph[node]
    for adjacent_node in adjacent_nodes:
        if not visited_info[adjacent_node]:
            dfs(
                node=adjacent_node,
                visited_info=visited_info,
                stack=stack,
                graph=graph,
            )


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