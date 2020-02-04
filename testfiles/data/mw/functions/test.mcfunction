#Generated with https://github.com/cowslayer7890/mcfunction_lambdas

scoreboard players set @a money 0
execute if score @s money matches 1.. run mcFunction mw:something

other command

mcFunction mw:lambda_example

mcFunction mw:test_3 10s

say what's up

say 0
summon armor_stand ~ ~ ~ { Invisible:1b, CustomName:"\"lol\"" }
scoreboard players set @e[type=armor_stand,limit=1,sort=nearest,distance=..0.1] energy 1

say 1
summon armor_stand ~ ~ ~ { Invisible:1b, CustomName:"\"lol\"" }
scoreboard players set @e[type=armor_stand,limit=1,sort=nearest,distance=..0.1] energy 2

say 2
summon armor_stand ~ ~ ~ { Invisible:1b, CustomName:"\"lol\"" }
scoreboard players set @e[type=armor_stand,limit=1,sort=nearest,distance=..0.1] energy 3

say 3
summon armor_stand ~ ~ ~ { Invisible:1b, CustomName:"\"lol\"" }
scoreboard players set @e[type=armor_stand,limit=1,sort=nearest,distance=..0.1] energy 4

say 4
summon armor_stand ~ ~ ~ { Invisible:1b, CustomName:"\"lol\"" }
scoreboard players set @e[type=armor_stand,limit=1,sort=nearest,distance=..0.1] energy 5

/hello

say 6 4
execute if whatever

say 4 4
execute if whatever

say 2 4
execute if whatever

tellraw @a "name 4"
