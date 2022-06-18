public abstract class HogwartsStudent  {

    private String name; // имя волшебника
    public int magic; //сила магии
    public int transgression; // трансгресия


    public HogwartsStudent (String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }




    private int abilityHogwartsStudent (){
        return magic + transgression;
    }


    public void compareHogwartsStudents (HogwartsStudent hogwartsStudent ){ // Метод для сравнения
        int ability1 = abilityHogwartsStudent();
        int ability2 = hogwartsStudent.abilityHogwartsStudent();
        if (ability1 > ability2){
            System.out.printf("Студент Хогвартса %s лучше студента Хогвартса %s (%d VS %d)%n", name, hogwartsStudent.name, ability1, ability2);
        } else if (ability2 > ability1){
            System.out.printf("Студент Хогвартса %s лучше студента Хогвартса %s (%d VS %d)%n",  hogwartsStudent.name, name, ability2, ability1 );

        } else {
            System.out.printf("Студент Хогвартса %s точно таКой же, как студент Хогвартса %s (%d VS %d)%n",  hogwartsStudent.name, name, ability2, ability1 );
        }

    }

    @Override
    public String toString() {
        return String.format("Студент Хогвартса %s, сила магии - %d, сила трансгрессии - %d", name, magic, transgression);
    }

    public void print (){
        System.out.println(this);
    }
}


