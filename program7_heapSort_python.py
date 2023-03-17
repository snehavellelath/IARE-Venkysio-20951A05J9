def heap_sort(arr):
    n = len(arr)
 
    # Build a max-heap
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)
 
    # Extract elements one by one
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  # swap
        heapify(arr, i, 0)
 
def heapify(arr, n, i):
    largest = i  
    l = 2 * i + 1     
    r = 2 * i + 2     
 
    # Check if left child of root exists and is greater than root
    if l < n and arr[i] < arr[l]:
        largest = l
 
    # Check if right child of root exists and is greater than root
    if r < n and arr[largest] < arr[r]:
        largest = r
 
    # Swap root, if needed
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]  # swap
 
        # Heapify the root.
        heapify(arr, n, largest)


arr = [4, 2, 8, 5, 1, 3, 6]
heap_sort(arr)
print(arr)  # Output: [1, 2, 3, 4, 5, 6, 8]
