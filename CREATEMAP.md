# Create your map
- Okay so I create the code for being pretty useful to use and create your map
- This is a doc for how to make it 

## Configure the map 
- First, you have to configure the map by creating a new class and add it to the MapSelector I will show you later

#### Create the class Map 
- Go in the package Game where is all the other Map create just stand by with the other 
*Map .java a name like "MyMap" etc... doesn't matter 
  
  #### The contents 
    - So first the class have to extends WindowInitializer create a constructor empty
    - And then you have to override 3 methods  in the super they will be call in this order 
      - **protected void setWall()**
      - **protected void setShop()**
      - **protected void setObject()**
    - You don't have to fill them for the moment 
    
    #### link with the MapSelector 
    - Go to the java MapSelector who is in the same package as your map 
    I have make // comment where you have to put code in the selectionValue String[] 
      put a String that will describe your map to the player
    - Then go to the end of the class you should see other // comment here put the case of your map with the same 
    String you put in the selectionValue and then make a new (name of your map) and break 
    - you can look at the other case above if you don't succeed
    - **For try if the link is good, try to launch the main and select your map you should have a void map**
    

## fill the map
- **Warning** i do not recommend to put several enemy or shop or if it's a wall in the same case and just add one player and one king 
### setWall()
- Okay so the first statement will be to create a Player ```player = new Player(this, new Coord(x,y));``` x,y is the coord
- Then you free to put wall like you want with ```board[i][j].setWall(wallIcon);``` wallIcon 
  is the default icon of the wall but if you don't like it you can change by load one of your icon but the icon must be and it applies to all **35x35px, .png**
  
### setShop()  
- **Warning** put a shield in the shop is ```new ShieldBuy()```
- first you create your pnj with ```PnjMerchand pnj1 = new PnjMerchand();```
- then you add to him item to sell like :
    - ```pnj1.addItemToSell(new ViewHidden(this));```
    - ```pnj1.addItemToSell(new Potion(40));```
- You can put everything you want if is extends ObjectBuy so all the java in package item and  package buy     
- one your pnj has all you want use to put in the game ```putPnj(new Coord(x, y), pnj1, pnjIcon);``` you can change pnjIcon if you want

### setObject()
- here you put all the Enemy or shield on the map 
- you just only need ```putPnj(new Coord(x, y), new PnjKnight(), knight);``` 
  here in the new you can put every mob of the package enemy, and after is the icon 
I advise you to use the same for all the same type of enemy
- if you want random enemy you have the methods ```putEnemyRandom(int maxShield)``` who in all the board put enemy randomly
- **warning** for put a shield you have to do : ```board[x][y].putShield(shieldIcon);```
I hope you like this program if you have advice for upgrade it or make the create map easier tell me 