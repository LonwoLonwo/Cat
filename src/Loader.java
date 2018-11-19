
public class Loader
{
    public static void main(String[] args)
    {
        Cat dieKatze = new Cat(1052.66);
        Cat goldenEye = new Cat();
        Cat gingerCatHaveNoSoul = new Cat();
        Cat black = new Cat();
        Cat nekoBus = new Cat();
        Cat felisSilvestrisCatus = new Cat();

        System.out.println("Сколько кошек в чёрной комнате: " + Cat.getCount());

        //Немцу спать
        System.out.println(dieKatze.getStatus());
        System.out.println(dieKatze.getWeight());
        dieKatze.feed(154.5);
        System.out.println(dieKatze.getStatus());
        System.out.println(dieKatze.getWeight());

        System.out.println();

        //Поим Котобус
        System.out.println(nekoBus.getWeight());
        nekoBus.drink(10.1);
        System.out.println(nekoBus.getWeight());

        System.out.println();

        //Кормим Золотоглазку
        System.out.println(goldenEye.getWeight());
        goldenEye.feed(1.5);
        System.out.println(goldenEye.getWeight());
        System.out.println(goldenEye.getStatus());

        System.out.println();

        //Перекармливаем Рыжего
        int i = 5;
        while (i >= 0)
        {
            gingerCatHaveNoSoul.feed(1500.78);
            System.out.println(gingerCatHaveNoSoul.getWeight());
            if (gingerCatHaveNoSoul.getWeight() >= gingerCatHaveNoSoul.getMaxWeight()) break;
            i--;
        }
        System.out.println(gingerCatHaveNoSoul.getStatus());

        System.out.println();

        //Замяукиваем Латиноса
        System.out.println(felisSilvestrisCatus.getWeight());
        int j = 0;
        while (j < 300)
        {
            felisSilvestrisCatus.meow();
            if (felisSilvestrisCatus.getWeight() <= felisSilvestrisCatus.getMinWeight()) break;
            j++;
        }
        System.out.println(felisSilvestrisCatus.getWeight());
        System.out.println(felisSilvestrisCatus.getStatus());

        System.out.println();

        //Врзвращаем массу съеденной еды
        System.out.println(black.getWeight());
        black.feed(150.87);
        System.out.println(black.getWeight());
        System.out.println("Съедено: " + black.getFeedAmount());

        System.out.println();

        //Куда идём мы с Пятачком? Большой-большой секрет
        System.out.println("Вес до: " + nekoBus.getWeight());
        nekoBus.poops();
        System.out.println("Вес после: " + nekoBus.getWeight());

        System.out.println();

        //Сколько кошек?
        System.out.println("Сколько кошек в чёрной комнате: " + Cat.getCount());

        System.out.println("Чёрный весит: " + black.getWeight());

        System.out.println("Брат-близнец Чёрного весит: " + black.makeTwin().getWeight());

        System.out.println("Котёнок: " + getKitten());

        System.out.println("Сколько кошек в чёрной комнате: " + Cat.getCount());

    }

    public static Double getKitten()
    {
        Double weight = 100 + 100*Math.random();
        return weight;
    }

}


