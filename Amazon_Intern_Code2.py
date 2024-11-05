def countFailedProcesses(processOrder,executionOrder):
    removed_list=[]
    count=0
    while executionOrder:
        if processOrder[0]==executionOrder[0]:
            processOrder.pop(0)
            executionOrder.pop(0)
        else:
            count+=1
            print(executionOrder[0])
            removed_list.append(executionOrder.pop(0))
            while processOrder and processOrder[0] in removed_list:
                removed_list.remove(processOrder.pop(0))
    return count
print(countFailedProcesses([2,3,5,1,4],[5,2,3,4,1]))
print(countFailedProcesses([2,3,5,1,4],[2,5,3,4,1]))


def countF(processOrder,executionOrder):
    count=0
    n=len(executionOrder)
    for k in range(n):
        i=executionOrder[k]
        a=processOrder.index(i)
        b=k
        for j in processOrder[:a]:
            if j not in executionOrder[:b]:
                count+=1
                print(i)
                break
    return count
print(countF([2,3,5,1,4],[5,2,3,4,1]))
print(countF([2,3,5,1,4],[2,5,3,4,1]))



n = 5 
ProcessOrder= [2, 3, 5, 1, 4] 
ExecutionOrder= [5,2,3, 4, 1]
ans=0
done=set()
for i in range(n):
    for j in range(n):
        if ProcessOrder[j]!=ExecutionOrder[i]:
            if ProcessOrder[j] not in done:
                ans+=1 
                break 
            
        else:
            break 
    done.add(ExecutionOrder[i])
print(ans)


def countFailed(processOrder,executionOrder):
    print("new method")
    count=0
    n=len(executionOrder)
    for k in range(n):
        i=executionOrder[k]
        a=processOrder.index(i)
        if(a>k):
            count+=1
            print(i)

    return count
print(countFailed([2,3,5,1,4],[5,2,3,4,1]))
print(countFailed([2,3,5,1,4],[2,5,3,4,1]))

def count_failing_processes(processOrder, executionOrder):
    # Map each process to its correct position in processOrder
    position_map = {process: i for i, process in enumerate(processOrder)}
    
    # Track the maximum index seen so far in terms of correct order
    max_index_seen = -1
    failing_count = 0
    
    # Traverse the execution order to identify failing processes
    for process in executionOrder:
        correct_position = position_map[process]
        
        # If the correct position of this process is earlier than max_index_seen,
        # it means it was executed after another process that should've been later
        if correct_position > max_index_seen:
            failing_count += 1

    
    return failing_count
print(count_failing_processes([2,3,5,1,4],[5,2,3,4,1]))
print(count_failing_processes([2,3,5,1,4],[2,5,3,4,1]))



class FenwickTree:
    def __init__(self, size):
        self.size = size
        self.tree = [0] * (size + 1)

    def update(self, index, delta=1):
        while index <= self.size:
            self.tree[index] += delta
            index += index & -index

    def query(self, index):
        result = 0
        while index > 0:
            result += self.tree[index]
            index -= index & -index
        return result

def get_inaccurate_processes(process_order, execution_order):
    print("final")
    n = len(process_order)
    pid = {process_order[i]: i for i in range(n)}
    fenwick = FenwickTree(n)
    inaccurate = 0
    for process in execution_order:
        index = pid[process]
        fti = index + 1
        count = fenwick.query(fti - 1)
        if count != index:
            inaccurate += 1
        fenwick.update(fti)
    return inaccurate

print(get_inaccurate_processes([2,3,5,1,4],[5,2,3,4,1]))
print(get_inaccurate_processes([2,3,5,1,4],[2,5,3,4,1]))