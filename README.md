![Image of Game of Life](https://tobotis.com/images/game-of-life.png)
# GameOfLife
Conway's Game of Life in Java
---
Conway's Game of Life is a zero player game based on a grid containing cells.  
Each cell has to possible states: `alive (1)` or `dead (0)`.  
There are multiple iterations, which simulate the life of all the cells. After each iterations there is a evaluation based on different rules, which determine the state of the cell in the next generation:  
- a cell is alive in the next generation if it has 2 or 3 alive neighbors
- a cell is dead in the next generation in all other cases  

Based on these rules, it is possible to simulate a random noise of alive cells.
There are many collections of creatures, which reproduce theirselves or move in the grid.
