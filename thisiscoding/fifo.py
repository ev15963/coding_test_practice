from collections import deque

queue = deque()
queue.append(1)
queue.append(2)
queue.append(3)

print(queue) # deque([1,2,3])

print(queue.pop()) # 3
print(queue) # deque([1,2])

print('-----------------------');

stack = []
    
stack.append(1)
stack.append(2)
stack.append(3)

print(stack) # [1,2,3]

print(stack.pop()) # 3
print(stack)  # [1,2]