package lab_2;
import java.util.*;

public class Collections {
    private final Set<Person> PersonHashSet = new HashSet<>();
    private final Set<BetterPerson> BetterPersonHashSet = new HashSet<>();

    private final Set<Person> PersonTreeSet = new TreeSet<>(new Tree_SetComparator());
    private final Set<BetterPerson> BetterPersonTreeSet = new TreeSet<>(new Tree_SetBetterComparator());

    private final List<Person> PersonArrayList = new ArrayList<>();
    private final List<BetterPerson> BetterPersonArrayList = new ArrayList<>();

    private final List<Person> PersonLinkedList = new LinkedList<>();
    private final List<BetterPerson> BetterPersonLinkedList = new LinkedList<>();

    private final Map<Integer, Person> PersonHashMap = new HashMap<>();
    private final Map<Integer, BetterPerson> BetterPersonHashMap = new HashMap<>();

    private final Map<Integer, Person> PersonTreeMap = new TreeMap<>();
    private final Map<Integer, BetterPerson> BetterPersonTreeMap = new TreeMap<>();

    void theLoop() {
        createCollections();
        int mainMenuChoice;
        int collectionsMenuChoice;
        Scanner scanner = new Scanner(System.in);
        do {
            mainMenu();
            mainMenuChoice = scanner.nextInt();
            if (mainMenuChoice == 1) {
                collectionsMenu();
                collectionsMenuChoice = scanner.nextInt();
                add(collectionsMenuChoice);
            }

            if (mainMenuChoice == 2) {
                collectionsMenu();
                collectionsMenuChoice = scanner.nextInt();
                display(collectionsMenuChoice);

            }

            if (mainMenuChoice == 3) {
                System.exit(0);
            }


        } while (mainMenuChoice != 4);
    }

    private void createCollections() {
        Person firstPerson = new Person("Anna", "Fiołkowska", 34, "Florystka");
        BetterPerson firstBetterPerson = new BetterPerson("Anna", "Fiołkowska", 34, "Florystka");

        PersonHashSet.add(firstPerson);
        BetterPersonHashSet.add(firstBetterPerson);
        PersonTreeSet.add(firstPerson);
        BetterPersonTreeSet.add(firstBetterPerson);
        PersonArrayList.add(firstPerson);
        BetterPersonArrayList.add(firstBetterPerson);
        PersonLinkedList.add(firstPerson);
        BetterPersonLinkedList.add(firstBetterPerson);
        PersonHashMap.put(1, firstPerson);
        BetterPersonHashMap.put(1, firstBetterPerson);
        PersonTreeMap.put(1, firstPerson);
        BetterPersonTreeMap.put(1, firstBetterPerson);

        Person secondPerson = new Person("Izydor", "Grochowski", 59, "Sklepikarz");
        BetterPerson secondBetterPerson = new BetterPerson("Izydor", "Grochowski", 59, "Sklepikarz");

        PersonHashSet.add(secondPerson);
        BetterPersonHashSet.add(secondBetterPerson);
        PersonTreeSet.add(secondPerson);
        BetterPersonTreeSet.add(secondBetterPerson);
        PersonArrayList.add(secondPerson);
        BetterPersonArrayList.add(secondBetterPerson);
        PersonLinkedList.add(secondPerson);
        BetterPersonLinkedList.add(secondBetterPerson);
        PersonHashMap.put(2, secondPerson);
        BetterPersonHashMap.put(2, secondBetterPerson);
        PersonTreeMap.put(2, secondPerson);
        BetterPersonTreeMap.put(2, secondBetterPerson);

        Person thirdPerson = new Person("Bartłomiej", "Kożuchowski", 22, "Kucharz");
        BetterPerson thirdBetterPerson = new BetterPerson("Bartłomiej", "Kożuchowski", 22, "Kucharz");

        PersonHashSet.add(thirdPerson);
        BetterPersonHashSet.add(thirdBetterPerson);
        PersonTreeSet.add(thirdPerson);
        BetterPersonTreeSet.add(thirdBetterPerson);
        PersonArrayList.add(thirdPerson);
        BetterPersonArrayList.add(thirdBetterPerson);
        PersonLinkedList.add(thirdPerson);
        BetterPersonLinkedList.add(thirdBetterPerson);
        PersonHashMap.put(3, thirdPerson);
        BetterPersonHashMap.put(3, thirdBetterPerson);
        PersonTreeMap.put(3, thirdPerson);
        BetterPersonTreeMap.put(3, thirdBetterPerson);

        Person fourthPerson = new Person("Zofia", "Kabelek", 63, "Elektryk");
        BetterPerson fourthBetterPerson = new BetterPerson("Zofia", "Kabelek", 63, "Elektryk");

        PersonHashSet.add(fourthPerson);
        BetterPersonHashSet.add(fourthBetterPerson);
        PersonTreeSet.add(fourthPerson);
        BetterPersonTreeSet.add(fourthBetterPerson);
        PersonArrayList.add(fourthPerson);
        BetterPersonArrayList.add(fourthBetterPerson);
        PersonLinkedList.add(fourthPerson);
        BetterPersonLinkedList.add(fourthBetterPerson);
        PersonHashMap.put(4, fourthPerson);
        BetterPersonHashMap.put(4, fourthBetterPerson);
        PersonTreeMap.put(4, fourthPerson);
        BetterPersonTreeMap.put(4, fourthBetterPerson);

    }

    private void collectionsMenu() {
        System.out.println("\n Collections Menu:\n" +
                "1. Hash Set\n" +
                "2. Tree Set\n" +
                "3. Array List\n" +
                "4. Linked List\n" +
                "5. Hash Map\n" +
                "6. Tree Map\n");
    }

    private void mainMenu() {
        System.out.println("\n Main Menu:\n" +
                "1. Add an element\n" +
                "2. Display\n" +
                "3. Exit\n");
    }

    private void add(int a) {
        Scanner scanner = new Scanner(System.in);
        String addedFirstName;
        String addedLastName;
        int addedAge;
        String addedJob;

        System.out.println("First name:");
        addedFirstName = scanner.nextLine();
        System.out.println("Last name:");
        addedLastName = scanner.nextLine();
        System.out.println("Job:");
        addedJob = scanner.nextLine();
        System.out.println("Age:");
        addedAge = scanner.nextInt();


        Person addedPerson = new Person(addedFirstName, addedLastName, addedAge, addedJob);
        BetterPerson addedBetterPerson = new BetterPerson(addedFirstName, addedLastName, addedAge, addedJob);

        switch (a) {
            case 1:
                PersonHashSet.add(addedPerson);
                BetterPersonHashSet.add(addedBetterPerson);
                break;
            case 2:
                PersonTreeSet.add(addedPerson);
                BetterPersonTreeSet.add(addedBetterPerson);
                break;
            case 3:
                PersonArrayList.add(addedPerson);
                BetterPersonArrayList.add(addedBetterPerson);
                break;
            case 4:
                PersonLinkedList.add(addedPerson);
                BetterPersonLinkedList.add(addedBetterPerson);
                break;
            case 5:
                PersonHashMap.put(PersonHashMap.size()+1, addedPerson);
                BetterPersonHashMap.put(BetterPersonHashMap.size()+1, addedBetterPerson);
                break;
            case 6:
                PersonTreeMap.put((PersonTreeMap.size()+1), addedPerson);
                BetterPersonTreeMap.put((PersonTreeMap.size()+1), addedBetterPerson);

        }
    }


    private void display(int a) {
        String titleLine = String.format("%10s|%15s|%10s|%10s", "First Name", "Last Name", "Age", "Job");
        String horizontalLine = "------------------------------------------------";

        switch (a) {
            case 1:
                System.out.println("\nPerson Hash Set");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: PersonHashSet){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }


                System.out.println("\nBetter Person Hash Set");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: BetterPersonHashSet){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 2:
                System.out.println("\nPerson Tree Set");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: PersonTreeSet){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\nBetter Person Tree Set");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: BetterPersonTreeSet){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 3:
                System.out.println("\nPerson Array List");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: PersonArrayList){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\nBetter Person Array List");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: BetterPersonArrayList){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 4:
                System.out.println("\nPerson Linked List");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: PersonLinkedList){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\nBetter Person Linked List");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for(var person: BetterPersonLinkedList){
                    String output = String.format("%10s|%15s|%10s|%10s", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 5:
                System.out.println("\nPerson Hash Map");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for (int i = 1; i <= PersonHashMap.size(); i++) {
                    String output = String.format("%10s|%15s|%10d|%10s", PersonHashMap.get(i).getFirstName(), PersonHashMap.get(i).getLastName(), PersonHashMap.get(i).getAge(), PersonHashMap.get(i).getJob());
                    System.out.println(output);
                }

                System.out.println("\nBetter Person Hash Map");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for (int i = 1; i <= BetterPersonHashMap.size(); i++) {
                    String output = String.format("%10s|%15s|%10d|%10s", BetterPersonHashMap.get(i).getFirstName(), BetterPersonHashMap.get(i).getLastName(), BetterPersonHashMap.get(i).getAge(), BetterPersonHashMap.get(i).getJob());
                    System.out.println(output);
                }
                break;

            case 6:
                System.out.println("\nPerson Tree Map");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for (int i = 1; i <= PersonTreeMap.size(); i++) {
                    String output = String.format("%10s|%15s|%10d|%10s", PersonTreeMap.get(i).getFirstName(), PersonTreeMap.get(i).getLastName(), PersonTreeMap.get(i).getAge(), PersonTreeMap.get(i).getJob());
                    System.out.println(output);
                }

                System.out.println("\nBetter Person Tree Map");
                System.out.println(titleLine);
                System.out.println(horizontalLine);

                for (int i = 1; i <= BetterPersonTreeMap.size(); i++) {
                    String output = String.format("%10s|%15s|%10d|%10s", BetterPersonTreeMap.get(i).getFirstName(), BetterPersonTreeMap.get(i).getLastName(), BetterPersonTreeMap.get(i).getAge(), BetterPersonTreeMap.get(i).getJob());
                    System.out.println(output);
                }
                break;
        }
    }

    private static class Tree_SetComparator implements Comparator<Person>
    {
        public int compare(Person p1, Person p2)
        {
            return 1;
        }
    }

    private static class Tree_SetBetterComparator implements Comparator<BetterPerson>
    {
        public int compare(BetterPerson p1, BetterPerson p2)
        {
            return 1;
        }
    }
}

