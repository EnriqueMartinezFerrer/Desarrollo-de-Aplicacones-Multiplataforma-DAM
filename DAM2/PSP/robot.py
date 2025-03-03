class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """

        m = len(obstacleGrid)
        n = len(obstacleGrid[0])

        # Si la celda inicial tiene un obstáculo, entonces simplemente regrese ya que no habría caminos al destino.
        if obstacleGrid[0][0] == 1:
            return 0

        # Número de formas de llegar a la celda inicial = 1.
        obstacleGrid[0][0] = 1

        # Llenar los valores para la primera columna
        for i in range(1,m):
            obstacleGrid[i][0] = int(obstacleGrid[i][0] == 0 and obstacleGrid[i-1][0] == 1)

        # Llenar los valores para la primera fila    
        for j in range(1, n):
            obstacleGrid[0][j] = int(obstacleGrid[0][j] == 0 and obstacleGrid[0][j-1] == 1)

        #A partir de la celda (1,1) complete los valores Número de formas de llegar a la celda [i] [j] = celda [i - 1] [j] + celda [i] [j - 1] es decir, desde arriba y a la izquierda.
        for i in range(1,m):
            for j in range(1,n):
                if obstacleGrid[i][j] == 0:
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1]
                else:
                    obstacleGrid[i][j] = 0

        # Valor devuelto almacenado en la celda inferior más a la derecha. Ese es el destino.            
        return obstacleGrid[m-1][n-1]