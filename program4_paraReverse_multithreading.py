import threading

def reverse(para):
  reversed_para = para[::-1]
  return reversed_para


para = input("Enter the paragraph to be reversed:")

thread = threading.Thread( target = reverse, args = (para,))
thread.start()

# wait for the thread to complete before exiting the program

thread.join()
