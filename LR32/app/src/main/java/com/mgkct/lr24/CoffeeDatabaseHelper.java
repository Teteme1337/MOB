package com.mgkct.lr24;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class CoffeeDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "coffee";
    private static final int DB_VERSION = 1;

    CoffeeDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE DRINK (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + "NAME TEXT, "
                    + "TYPE TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "IMAGE_RESOURCE_ID INTEGER);");
            insertDrink(db, "Латте", "Кофе", "Кофейный напиток, на основе молока, представляющий собой трёхслойную смесь из пены, молока и кофе эспрессо", R.drawable.latte);
            insertDrink(db,"Латте", "Кофе", "Кофейный напиток, на основе молока, представляющий собой трёхслойную смесь из пены, молока и кофе эспрессо", R.drawable.latte);
            insertDrink(db,"Капучино", "Кофе", "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока", R.drawable.cappuccino);
            insertDrink(db,"Раф", "Кофе", "Кофейный напиток, готовится путём добавления нагретых паром сливок с небольшим количеством пены в одиночную порцию эспрессо", R.drawable.raf);
            insertDrink(db,"Американо", "Кофе", "Кофейный напиток, приготовленный путем добавления горячей воды к порции эспрессо, что делает его более мягким", R.drawable.americano);
            insertDrink(db,"Мокко", "Кофе", "Кофейный напиток с шоколадным вкусом, состоит из эспрессо, шоколада и молока, часто украшается взбитыми сливками", R.drawable.mocha);
            insertDrink(db,"Эспрессо", "Кофе", "Классический кофейный напиток, представляет собой концентрированный кофе, приготовленный путем пропускания горячей воды через молотые кофейные зерна", R.drawable.espresso);
            insertDrink(db,"Флет уайт", "Кофе", "Кофейный напиток, похожий на капучино, но с меньшим количеством пены и большим количеством молока", R.drawable.flat_white);
            insertDrink(db,"Макиато", "Кофе", "Эспрессо с небольшим количеством вспененного молока сверху, что делает его крепким и насыщенным", R.drawable.macchiato);
            insertDrink(db,"Айс Латте", "Кофе", "Охлажденный кофейный напиток на основе эспрессо с добавлением холодного молока и льда", R.drawable.iced_latte);
            insertDrink(db,"Кортадо", "Кофе", "Напиток из равных частей эспрессо и теплого молока, который сбалансирован по крепости и мягкости", R.drawable.cortado);

           insertDrink(db, "Эклер", "Пирожные", "Длинное заварное пирожное с кремовой начинкой и покрытое глазурью, часто шоколадной", R.drawable.eclair);
           insertDrink(db, "Макарон", "Пирожные", "Французское пирожное в виде двух миндальных печений с начинкой из крема или варенья между ними", R.drawable.macaroon);
           insertDrink(db, "Тирамису", "Пирожные", "Итальянский десерт, состоящий из слоев бисквитного печенья, пропитанного кофе, и крема на основе сыра маскарпоне", R.drawable.tiramisu);
           insertDrink(db, "Павлова", "Пирожные", "Воздушное пирожное из безе, с хрустящей корочкой снаружи и мягкой сердцевиной, украшенное фруктами и взбитыми сливками", R.drawable.pavlova);
           insertDrink(db, "Медовик", "Пирожные", "Слоеный торт с медовыми коржами и нежным кремом из сметаны или вареной сгущенки", R.drawable.medovik);
           insertDrink(db, "Тарталетка", "Пирожные", "Маленькое пирожное с открытым верхом, которое может быть наполнено кремом, фруктами или орехами", R.drawable.tart);
           insertDrink(db, "Канноли", "Пирожные", "Итальянское пирожное в виде хрустящей трубочки, наполненной сладкой рикоттой с добавлением шоколада или фруктов", R.drawable.cannoli);
           insertDrink(db, "Чизкейк", "Пирожные", "Кремовый десерт на основе сыра, часто с коржом из печенья или песочного теста и различными топпингами, такими как фрукты или шоколад", R.drawable.cheesecake);
           insertDrink(db, "Кекс", "Пирожные", "Небольшое порционное пирожное, выпекаемое в формах, часто с добавлением изюма, шоколадных капель или орехов", R.drawable.cupcake);
           insertDrink(db, "Брауни", "Пирожные", "Шоколадное пирожное, которое отличается плотной текстурой и насыщенным вкусом шоколада", R.drawable.brownie);

           insertDrink(db, "ул.Север д.23", "Кофейни", "9:00 - 21:00", R.drawable.north);
           insertDrink(db, "ул.Юг д.2", "Кофейни", "8:00 - 21:00", R.drawable.south);
           insertDrink(db, "ул.Запад д.15", "Кофейни", "9:00 - 22:00", R.drawable.west);
           insertDrink(db, "ул.Восток д.8", "Кофейни", "8:00 - 20:00", R.drawable.east);
        }
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE DRINK ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    private static void insertDrink(SQLiteDatabase db, String name, String type, String description, int resourceId) {
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", name);
        drinkValues.put("TYPE", type);
        drinkValues.put("DESCRIPTION", description);
        drinkValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("DRINK", null, drinkValues);
    }
}