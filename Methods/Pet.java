
import java.util.Scanner;

public class Pet {

    private double age, weight, height;
    private String name, breed;

    public Pet(String name, String breed, double age, double weight, double height) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String getPetName() {
        return name;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    public String getPetBreed() {
        return breed;
    }

    public void setPetBreed(String breed) {
        this.breed = breed;
    }

    public double getPetAge() {
        return age;
    }

    public void setPetAge(double age) {
        this.age = age;
    }

    public double getPetWeight() {
        return weight;
    }

    public void setPetWeight(double weight) {
        this.weight = weight;
    }

    public double getPetHeight() {
        return height;
    }

    public void setPetHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many pets do you want to enter?");
        int arraySize = reader.nextInt();
        reader.nextLine();

        Pet[] pets = new Pet[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("\nEnter details for pet #" + (i + 1));

            System.out.print("Name: ");
            String name = reader.nextLine();

            System.out.print("Breed: ");
            String breed = reader.nextLine();

            System.out.print("Age (years): ");
            double age = reader.nextDouble();

            System.out.print("Weight (kg): ");
            double weight = reader.nextDouble();

            System.out.print("Height (cm): ");
            double height = reader.nextDouble();

            reader.nextLine();

            pets[i] = new Pet(name, breed, age, weight, height);
        }

        System.out.println("\nAll Pets Information:");
        for (int i = 0; i < pets.length; i++) {
            System.out.println("\nPet #" + (i + 1) + ":");
            System.out.println("Name: " + pets[i].getPetName());
            System.out.println("Breed: " + pets[i].getPetBreed());
            System.out.println("Age: " + pets[i].getPetAge() + " years");
            System.out.println("Weight: " + pets[i].getPetWeight() + " kg");
            System.out.println("Height: " + pets[i].getPetHeight() + " cm");
            System.out.println("\n");

        }


        System.out.println("What pet would you like to know the information of? (Enter the pet name)");
        String petName = reader.nextLine();

        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getPetName().equals(petName)) {
                System.out.println("Pet #" + (i + 1) + ":");
                System.out.println("Name: " + pets[i].getPetName());
                System.out.println("Breed: " + pets[i].getPetBreed());
                System.out.println("Age: " + pets[i].getPetAge() + " years");
                System.out.println("Weight: " + pets[i].getPetWeight() + " kg");
                System.out.println("Height: " + pets[i].getPetHeight() + " cm");


            }
        }

        System.out.println("What pet would you like to change the information of? (Enter the pet name)");
        petName = reader.nextLine();

        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getPetName().equals(petName)) {
                System.out.println("Enter new details for pet #" + (i + 1));

                System.out.print("Name: ");
                String name = reader.nextLine();

                System.out.print("Breed: ");
                String breed = reader.nextLine();

                System.out.print("Age (years): ");
                double age = reader.nextDouble();

                System.out.print("Weight (kg): ");
                double weight = reader.nextDouble();

                System.out.print("Height (cm): ");
                double height = reader.nextDouble();

                reader.nextLine();

                pets[i].setPetName(name);
                pets[i].setPetBreed(breed);
                pets[i].setPetAge(age);
                pets[i].setPetWeight(weight);
                pets[i].setPetHeight(height);
            }
        }


        System.out.println("\nDo you want to remove a pet? (Enter the pet name)");
        petName = reader.nextLine();

        Pet[] Newarray = new Pet[pets.length - 1];

        for(int i = 0; i < pets.length; i++) {
            if(!(pets[i].getPetName().equals(petName))) {
                
                
            }
            
        }
    }
}
