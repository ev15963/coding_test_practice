from collections import deque

queue = deque()
queue.append(1)
queue.append(2)
queue.append(3)

print(queue) # deque([1,2,3])

print(queue.pop()) # 3
print(queue) # deque([1,2])