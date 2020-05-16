package Game;

import Field.Field;

import java.util.*;

import Item.*;
import java.lang.Math;
import Field.*;
import views.*;

/**
 * Inicializalja a jegtablakat. Inicializalja a jatekot, majd szamontartja, hogy eppen melyik jatekos lep.
 * Hoviharokat general a jatekosok lepesei kozott.
 */
public final class Game {


    View view;
    private static boolean gameWon = false;
    private static boolean gameLost = false;

    public static ArrayList<Field> getFields() {
        return fields;
    }

    /**
     * A jatekteren talalhato osszes mezo
     */
    private static ArrayList<Field> fields;
    /**
     * a statikus valtozo amin hivjuk a fuggvenyeket
     */
    private static Game INSTANCE;
    public static void Reset(){
        gameWon = false;
        gameLost = false;
    }
    /**
     * @return visszakuldi a statikus valtozot ha nem ures, amugy pedig peldanyosit
     */
    public static Game getInstance(){
        // Ha meg egyszer sem keszitettunk el Game objektumot akkor most lesz elkeszitve
        if(INSTANCE == null)
            INSTANCE = new Game();

        return INSTANCE;
    }

    /**
     * Megnyert-e a jatek
     * @return
     */
    public static boolean isGameWon(){ return gameWon; }

    /**
     * Elvesztett-e a jatek
     * @return
     */
    public static boolean isGameLost(){ return gameLost; }

    /**
     * Ha privat a konstruktor senki sem tudja osszekeverni a dolgokat
     * es mindenki helyesen a getInstance fuggvenyt fogja hasznali
     */
    private Game(){};
    /**
     * elinditja a jatekot
     */
    public void StartGame(){
        InitMap();
        view = new View();
        view.Init();
        Manager.Start();
    }

    /**
     * inicializalja a jatekteret, vagyis beallitja a jegtablak es targyak elhelyezkedeset
     */
    /**public List<Object> InitMap(){
        List<Object> newObjects = new ArrayList<>();
        Random random = new Random(1);
        double P_IceField = 0.80;
        int Snow_Thickness = 4;
        int Number_Of_Fields = 20;
        int Max_Capacity = 4;
        int Width = 100;
        int Height = 100;
        int Min_Dist = 20;
        int Max_Dist = 50;
        while(fields.size() != Number_Of_Fields){
            int randomX = random.nextInt(Width);
            int randomY = random.nextInt(Height);
            if (fields.size() == 0){
                Hole H = new Hole();
                H.X = randomX;
                H.Y = randomY;
                fields.add( H);
            }
            boolean good = true;
            for (Field f : fields){
                int X_Dist = randomX - f.X;
                int Y_Dist = randomY - f.Y;

                int dist = (int)Math.sqrt(X_Dist*X_Dist+Y_Dist*Y_Dist);
                if (dist < Min_Dist){
                    good = false;
                    break;
                }
            }
            if (good) {
                double prob = random.nextDouble();
                if (prob > P_IceField){
                    Hole H = new Hole();
                    H.X = randomX;
                    H.Y = randomY;
                    fields.add( H);
                }
                else {
                    IceBlock iceblock = new IceBlock();
                    int thickness = random.nextInt(Snow_Thickness);
                    int capacity = random.nextInt(Max_Capacity + 1);
                    if (capacity >= Max_Capacity) {
                        iceblock.setCapacity(-1);
                    } else {
                        iceblock.setCapacity(capacity + 1);
                    }
                    iceblock.setLayerOfSnow(thickness);
                    iceblock.X = randomX;
                    iceblock.Y = randomY;
                    fields.add(iceblock);
                }
            }
        }
        for (Field i: fields){
            for(Field j: fields){
                if (i == j)
                    continue;
                int X_Dist = i.X- j.X;
                int Y_Dist = i.Y- j.Y;

                int dist = (int)Math.sqrt(X_Dist*X_Dist+Y_Dist*Y_Dist);
                if (dist < Max_Dist){
                    i.AddNeighbour(j);
                }
            }
        }
        ArrayList<Item> items = new ArrayList<Item>();
        fields.get(0).setItem(new WinningItem());
        fields.get(1).setItem(new WinningItem());
        fields.get(2).setItem(new WinningItem());
        // Tent
        for (int i = 0; i < Number_Of_Fields /10; i++ )
            items.add(new Tent());
        // Swimsuit
        for (int i = 0; i < Number_Of_Fields /15; i++ )
            items.add(new Swimsuit());
        // Spade
        for (int i = 0; i < Number_Of_Fields /5; i++ )
            items.add(new Spade(3));
        // Rope
        for (int i = 0; i < Number_Of_Fields /8; i++ )
            items.add(new Rope());
        // Food
        for (int i = 0; i < Number_Of_Fields /4; i++ )
            items.add(new Food());
        for (Item i : items){
            int randomField = random.nextInt(fields.size());
            fields.get(randomField).setItem(i);
        }
        for (Field f:fields)
        {
            newObjects.add(f);
            if (f.getItem() != null)
                newObjects.add(f.getItem());
        }
        return newObjects;
    }
*/

    public List<Object> InitMap(){
        double P_ICEFIELD = 0.80;
        int WIDTH = 10;
        int HEIGHT = 10;
        int NUMBER_OF_FIELDS = WIDTH * HEIGHT;
        int MAX_SNOW_THICKNESS = 4;
        int MAX_CAPACITY = 4;
        
        List<Object> newObjects = new ArrayList<>();
        Random random = new Random(1);

        for (int i = 0; i<WIDTH; i++){
            for (int j = 0; j < HEIGHT; j++){
                double prob = random.nextDouble();
                if (prob > P_ICEFIELD){
                    Hole hole = new Hole();
                    hole.X = i;
                    hole.Y = j;
                    fields.add(hole);
                    view.AddView(new HoleView(hole));
                }
                else {
                    IceBlock iceblock = new IceBlock();
                    int thickness = random.nextInt(MAX_SNOW_THICKNESS);
                    int capacity = random.nextInt(MAX_CAPACITY + 1);
                    if (capacity >= MAX_CAPACITY) {
                        iceblock.setCapacity(-1);
                    } else {
                        iceblock.setCapacity(capacity + 1);
                    }
                    iceblock.setLayerOfSnow(thickness);
                    iceblock.X = i;
                    iceblock.Y = j;
                    fields.add(iceblock);
                    view.AddView(new IceBlockView(iceblock));
                }
            }
        }

        ArrayList<Item> items = new ArrayList<Item>();
        int cnt = 0;
        while (cnt < 3){
            Field field = fields.get(random.nextInt(NUMBER_OF_FIELDS));
            if (field.getItem() == null && field instanceof IceBlock ){
                field.setItem(new WinningItem());
                cnt++;
            }
        }
        // Tent
        for (int i = 0; i < NUMBER_OF_FIELDS /10; i++ ){
            int randomField = random.nextInt(fields.size());
            Field field = fields.get(randomField);
            if (field.getItem() == null && field instanceof IceBlock ){
                Tent tent = new Tent();
                field.setItem(tent);
                view.AddView(new TentView(tent));
            }
        }

        // Swimsuit
        for (int i = 0; i < NUMBER_OF_FIELDS /15; i++ ) {
            int randomField = random.nextInt(fields.size());
            Field field = fields.get(randomField);
            if (field.getItem() == null && field instanceof IceBlock) {
                Swimsuit swimsuit = new Swimsuit();
                field.setItem(swimsuit);
                view.AddView(new SwimsuitView(swimsuit));
            }
        }
            // Spade
        for (int i = 0; i < NUMBER_OF_FIELDS /5; i++ ){
            int randomField = random.nextInt(fields.size());
            Field field = fields.get(randomField);
            if (field.getItem() == null && field instanceof IceBlock) {
                Spade spade = new Spade(3);
                field.setItem(spade);
                view.AddView(new SpadeView(spade));
            }
        }
        // Rope
        for (int i = 0; i < NUMBER_OF_FIELDS /8; i++ ){
            int randomField = random.nextInt(fields.size());
            Field field = fields.get(randomField);
            if (field.getItem() == null && field instanceof IceBlock) {
                Rope rope = new Rope();
                field.setItem(rope);
                view.AddView(new RopeView(rope));
            }
        }
        // Food
        for (int i = 0; i < NUMBER_OF_FIELDS /4; i++ ){
            int randomField = random.nextInt(fields.size());
            Field field = fields.get(randomField);
            if (field.getItem() == null && field instanceof IceBlock) {
                Food food = new Food();
                field.setItem(food);
                view.AddView(new FoodView(food));
            }
        }

        for (Field f:fields)
        {
            newObjects.add(f);
            if (f.getItem() != null){
                newObjects.add(f.getItem());
            }
        }
        return newObjects;

    }

    /**
     * Jatek megnyerese
     */
    public void Win(){ gameWon = true; }

    /**
     * Jatek elvesztese
     */
    public void Lose(){ gameLost = true; }

    public View getView() {
        return view;
    }
}
