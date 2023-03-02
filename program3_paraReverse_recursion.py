def reverse(para):
  if len(para) == 0:
    return para
  else:
    return reverse(para[1:]) + para[0]

  
para = input("Enter the paragraph to be reversed:")
reversed_para = reverse(para)
print(reversed_para)
