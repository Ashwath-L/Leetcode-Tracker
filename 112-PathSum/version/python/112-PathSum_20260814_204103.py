# Last updated: 8/14/2026, 8:41:03 PM
1class Solution:
2    def getRow(self, rowIndex):
3        row = [1]
4        for i in range(rowIndex):
5            row = [1] + [row[j] + row[j+1] for j in range(len(row)-1)] + [1]
6        return row