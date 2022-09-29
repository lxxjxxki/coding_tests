import sys


def quadrant(q_x, q_y):
    if (q_x > 0) and (q_y > 0):
        print("1")
    elif (q_x < 0) and (q_y > 0):
        print("2")
    elif (q_x < 0) and (q_y < 0):
        print("3")
    else:
        print("4")


x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
quadrant(x, y)
