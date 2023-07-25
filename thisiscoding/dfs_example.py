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

print(stack) # > [1, 2, 7, 6, 8, 3, 4, 5]

def dfs(
    node: int,
    visited_info: List[bool],
    stack: List[int],
    graph: List[List[int]],
):
    print(visited_info, "visited_info");
    visited_info[node] = True
    print(stack, "stack");
    stack.append(node)
    print(stack, "stack");

    adjacent_nodes: List[int] = graph[node]
    print(adjacent_nodes, "adjacent_nodes");
    for adjacent_node in adjacent_nodes:
        print(adjacent_node, "adjacent_node");
        if not visited_info[adjacent_node]:
            print(visited_info[adjacent_node], "visited_info[adjacent_node]")
            dfs(
                node=adjacent_node,
                visited_info=visited_info,
                stack=stack,
                graph=graph,
            )
            

dfs(node=1, visited_info=visited_info, stack=stack, graph=graph)