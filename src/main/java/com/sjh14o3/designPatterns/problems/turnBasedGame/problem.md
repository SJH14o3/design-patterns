**Solve this problem using Builder, Strategy, State and Decorator patterns.**

Consider a role-playing game with a turn-based combat system similar to Dungeons & Dragons.
Players can create their own character from three races: Dwarf, Elf, and Human,
each with their own unique values for Strength, Health, Wisdom, and Armor.
During combat, each playable and non-playable character has the following states:
- Normal
- Stunned: The player's turn is skipped and resistance to enemy damage is halved.
- Slowed: The player movement is halved.
- Rage: With a chance, the character may enter this state at the beginning of their turn,
where movement and damage are doubled.
- Dead: The character is defeated and removed from combat.

After the character's turn ends, the character returns to Normal state.  


In addition to the state, they can be affected by the following positive and negative effects:
- Resistance: A percentage of attacks are completely ignored and no effects or state changes can be
afflicted to the character.
- Damage Boost: When attacking, damage will be multiplied by a modifier.
- Poison: The character loses some of their HP at the beginning of the round and
deals lower damage
- Bleeding: The character loses some of their HP at the beginning of the round and
their movement is reduced

Whenever it is the character's turn, their action is carried out according to the chosen strategy.
The player can change their strategy, but their turn ends:
- Ordinary: Normal mode, the ability to move and attack
- Nimble: The ability to move twice and not attack
- Consume: The ability to consume an item such as potions, the ability to not move and not attack

The amount of damage is calculated from the character's strength. In addition,
weapons may take on special properties according to the upgrades received. These features include:
- Stealing HP with a percentage of damage dealt
- Increased damage to a specific race
- Critical hit with a chance
- Afflicting slowed status
- Afflicting poison effect
- Afflicting bleeding effect
- Afflicting stunned status

Note that the order of damage calculation and effects must be followed from bottom to top of this list,
for example, if the damage was critical and the weapon has the ability to steal HP,
much more HP will be stolen. Also, only one effect or status change can be afflicted on the
target character per hit. There is no possibility of duplicate upgrades on a weapon,
but the character can remove an upgrade from his weapon. To calculate the final damage,
follow the following sequence:
Damage amount and weapon effects → Attacker effects → Attacker mode → Target mode → Target effects →
Calculate final damage based on Target armor  

Create a class diagram for this problem. Bear in mind that there is a possibility of adding new races,
new modes, new strategies, etc. Use object-oriented principles and achieve loose coupling
as much as possible.