

N = int(input())

paper = [[0] * N] * N
w = 0
b = 0

for i in range(N) :
    paper[i] = list(map(int, input().split()))

def divide(x, y, n):
    global b
    global w


    if n == 1:
        if paper[x][y] == 0:
            w += 1
        else:
            b += 1

        return
    color = paper[x][y]
    for i in range(int(n)):
        for j in range(int(n)):
            if color != paper[x + i][y + j]:
                divide(x, y, n//2)
                divide(x + n//2, y, n // 2)
                divide(x, y + n // 2, n // 2)
                divide(x + n // 2, y + n // 2, n // 2)
                return
    if color == 0:
        w += 1
    else:
        b += 1
                
    
    


divide(0, 0, N)

print(w)
print(b)