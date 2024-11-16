package com.mgkct.lr24;

public class ObjectClass {

    private int id;
    private String name;
    private String type;
    private String description;
    private int imageResourceId;

    public static final ObjectClass[] objects = {

            new ObjectClass(0, "Латте", "Кофе", "Кофейный напиток, на основе молока, представляющий собой трёхслойную смесь из пены, молока и кофе эспрессо", R.drawable.latte),
            new ObjectClass(1, "Капучино", "Кофе", "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока", R.drawable.cappuccino),
            new ObjectClass(2, "Раф", "Кофе", "Кофейный напиток, готовится путём добавления нагретых паром сливок с небольшим количеством пены в одиночную порцию эспрессо", R.drawable.raf),
            new ObjectClass(3, "Американо", "Кофе", "Кофейный напиток, приготовленный путем добавления горячей воды к порции эспрессо, что делает его более мягким", R.drawable.americano),
            new ObjectClass(4, "Мокко", "Кофе", "Кофейный напиток с шоколадным вкусом, состоит из эспрессо, шоколада и молока, часто украшается взбитыми сливками", R.drawable.mocha),
            new ObjectClass(5, "Эспрессо", "Кофе", "Классический кофейный напиток, представляет собой концентрированный кофе, приготовленный путем пропускания горячей воды через молотые кофейные зерна", R.drawable.espresso),
            new ObjectClass(6, "Флет уайт", "Кофе", "Кофейный напиток, похожий на капучино, но с меньшим количеством пены и большим количеством молока", R.drawable.flat_white),
            new ObjectClass(7, "Макиато", "Кофе", "Эспрессо с небольшим количеством вспененного молока сверху, что делает его крепким и насыщенным", R.drawable.macchiato),
            new ObjectClass(8, "Айс Латте", "Кофе", "Охлажденный кофейный напиток на основе эспрессо с добавлением холодного молока и льда", R.drawable.iced_latte),
            new ObjectClass(9, "Кортадо", "Кофе", "Напиток из равных частей эспрессо и теплого молока, который сбалансирован по крепости и мягкости", R.drawable.cortado),

            new ObjectClass(10, "Эклер", "Пирожные", "Длинное заварное пирожное с кремовой начинкой и покрытое глазурью, часто шоколадной", R.drawable.eclair),
            new ObjectClass(11, "Макарон", "Пирожные", "Французское пирожное в виде двух миндальных печений с начинкой из крема или варенья между ними", R.drawable.macaroon),
            new ObjectClass(12, "Тирамису", "Пирожные", "Итальянский десерт, состоящий из слоев бисквитного печенья, пропитанного кофе, и крема на основе сыра маскарпоне", R.drawable.tiramisu),
            new ObjectClass(13, "Павлова", "Пирожные", "Воздушное пирожное из безе, с хрустящей корочкой снаружи и мягкой сердцевиной, украшенное фруктами и взбитыми сливками", R.drawable.pavlova),
            new ObjectClass(14, "Медовик", "Пирожные", "Слоеный торт с медовыми коржами и нежным кремом из сметаны или вареной сгущенки", R.drawable.medovik),
            new ObjectClass(15, "Тарталетка", "Пирожные", "Маленькое пирожное с открытым верхом, которое может быть наполнено кремом, фруктами или орехами", R.drawable.tart),
            new ObjectClass(16, "Канноли", "Пирожные", "Итальянское пирожное в виде хрустящей трубочки, наполненной сладкой рикоттой с добавлением шоколада или фруктов", R.drawable.cannoli),
            new ObjectClass(17, "Чизкейк", "Пирожные", "Кремовый десерт на основе сыра, часто с коржом из печенья или песочного теста и различными топпингами, такими как фрукты или шоколад", R.drawable.cheesecake),
            new ObjectClass(18, "Кекс", "Пирожные", "Небольшое порционное пирожное, выпекаемое в формах, часто с добавлением изюма, шоколадных капель или орехов", R.drawable.cupcake),
            new ObjectClass(19, "Брауни", "Пирожные", "Шоколадное пирожное, которое отличается плотной текстурой и насыщенным вкусом шоколада", R.drawable.brownie),

            new ObjectClass(20, "ул.Север д.23", "Кофейни", "9:00 - 21:00", R.drawable.north),
            new ObjectClass(21, "ул.Юг д.2", "Кофейни", "8:00 - 21:00", R.drawable.south),
            new ObjectClass(22, "ул.Запад д.15", "Кофейни", "9:00 - 22:00", R.drawable.west),
            new ObjectClass(23, "ул.Восток д.8", "Кофейни", "8:00 - 20:00", R.drawable.east),

    };

    private ObjectClass(int id, String name, String type, String description, int imageResourceId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
