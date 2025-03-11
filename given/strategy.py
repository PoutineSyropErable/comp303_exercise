from abc import ABC, abstractmethod

class NPCMovementStrategy(ABC):
    @abstractmethod
    def move(self, npc: 'NPC') -> int:
        """Defines how the NPC should move."""
        pass

class WalkMovementStrategy(NPCMovementStrategy):
    def move(self, npc: 'NPC') -> int:
        print("NPC is walking.")
        # Return a value indicating the movement result (e.g., new position or movement cost)
        return 1

class NPC:
    def __init__(self, movement_strategy: NPCMovementStrategy):
        self.movement_strategy = movement_strategy

    def move(self) -> int:
        """Delegates movement to the assigned strategy."""
        return self.movement_strategy.move(self)

if __name__ == "__main__":
    walk_strategy = WalkMovementStrategy()
    npc = NPC(movement_strategy=walk_strategy)
    result = npc.move()  # Should print "NPC is walking." and return 1
    print("Movement result:", result)