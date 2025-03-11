class Card:

    def __init__(self, card: int):
        self.__aCard: list[int] = [card // 13, card % 13]
    
    def getSuit(self) -> int:
        return self.__aCard[0]
    
    def getRank(self) -> int:
        return self.__aCard[1]

if __name__ == "__main__":
    # this code will run
    card : Card = Card(13)
    print(card.getRank())