import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {

        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        GryffindorStudent germiona = generateGryffindorStudent("Гермиона Грейнжер");

        RavenclawStudent padma = generateRavenclawStudent("Падма Патил"); //когтевран
        RavenclawStudent chang = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent markus = generateRavenclawStudent("Маркус Белби");

        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grehem = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");


        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори"); //Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
        HufflepuffStudent zahariya = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent dzhastin = generateHufflepuffStudent("Джастин Финч-Флетчли");



        harry.print();
        ron.print();
        germiona.print();

        padma.print();
        chang.print();
        markus.print();

        draco.print();
        grehem.print();
        gregory.print();

        cedric.print();
        zahariya.print();
        dzhastin.print();

        harry.compareGriffindorStudents(ron);
        harry.compareHogwartsStudents(draco);

        padma.compareHogwartsStudents(ron);
        gregory.compareSlytherinStudents(draco);
        zahariya.compareHogwartsStudents(harry);

            }

    private static GryffindorStudent generateGryffindorStudent (String name){
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static RavenclawStudent generateRavenclawStudent (String name){
        return new RavenclawStudent (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
            );
    }
    private static HufflepuffStudent generateHufflepuffStudent  (String name){
        return new HufflepuffStudent  (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudent generateSlytherinStudent  (String name){
        return new SlytherinStudent  (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}

