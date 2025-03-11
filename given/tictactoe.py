from enum import Enum

class Mark(Enum):
    X = "X"
    O = "O"
    EMPTY = " "

class Board:
    def __init__(self):
        self.__board : list[list[Mark]] = []
        for i in range(3): # for (int i = 0; i < 3; i ++)
            new_row : list[Mark] = []
            for j in range(3):
                new_row.append(Mark.EMPTY)
            self.__board.append(new_row)
    
    def place_mark(self, mark: Mark, row: int, col: int) -> None:
        # TODO: input validation
        self.__board[row][col] = mark
    
    def has_winner(self) -> bool:
        # TODO
        return False
        

class Player:
    def __init__(self, mark: Mark):
        self.__mark = mark
    
    def get_move(self):
        # ask for user input
        pass

class Game:
    def __init__(self):
        self.__board = Board()
        self.__playerX = Player(Mark.X)
        self.__playerO = Player(Mark.O)
    
    def play(self):
