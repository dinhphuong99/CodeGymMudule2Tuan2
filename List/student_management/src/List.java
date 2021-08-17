import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    static ArrayList<Student> listSt = new ArrayList();
    public static void main(String[] args) {
        createFile("listStudent.txt");
        readFile("listStudent.txt");

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. View the list");
            System.out.println("2. Add students");
            System.out.println("3. Edit student information");
            System.out.println("4. Delete a student");
            System.out.println("5. Enter student scores");
            System.out.println("6. Edit student grades");
            System.out.println("7. Student rank");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("View the list");
                    System.out.println("ID\tName\t\t Score 1 | Score 2 | Score 3 | Score 4\n");
                    for (int i = 0; i < listSt.size(); i++) {
                        System.out.println(listSt.get(i).getAllInfo());
                    }
                    break;
                case 2:
                    String name;
                    System.out.println("Add students");
                    Student student = new Student();

                    int IDNewAdd = -1;

                    if (listSt.size() == 0)
                        IDNewAdd = 0;
                    else {
                        for (int i = 0; IDNewAdd == -1; i++) {
                            for (int j = 0; j < listSt.size(); j++) {
                                if (i != listSt.get(j).getID()){
                                    IDNewAdd = i;
                                }

                                if (i == listSt.get(j).getID()){
                                    IDNewAdd = -1;
                                    break;
                                }
                            }
                        }
                    }

                    System.out.println(IDNewAdd);

                    System.out.println("Add name student: ");
                    name = new Scanner(System.in).nextLine();
                    listSt.add(0, student);
                    listSt.get(0).setID(IDNewAdd);
                    listSt.get(0).setNameStudent(name);

                    saveFile("listStudent.txt");
                    System.out.println("Successfully added a student");
                    break;
                case 3:
                    System.out.println("Edit student information");
                    System.out.println("Enter student ID: ");
                    int checkIdInfo = scanner.nextInt();
                    for (int i = 0; i < listSt.size(); i++) {
                        if (listSt.get(i).getID() == checkIdInfo) {
                            int choiceEditInfo = -1;
                            while (true) {
                                System.out.println("1. Edit Name");
                                System.out.println("0. Exit");
                                System.out.println("Old ID: " + listSt.get(i).getID() + "\n"
                                        + "Old name: " + listSt.get(i).getNameStudent() + "\n");

                                System.out.println("Enter your choice: ");
                                choiceEditInfo = scanner.nextInt();
                                if (choiceEditInfo == 0) {
                                    saveFile("listStudent.txt");
                                    break;
                                }

                                switch (choiceEditInfo) {
                                    case 1:
                                        System.out.println("Enter new name: ");
                                        String newName = scanner.next();
                                        listSt.get(i).setNameStudent(newName);
                                        break;
                                    default:
                                        System.out.println("No choice!");
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Delete a student");
                    System.out.println("Enter the ID: ");
                    int removeID = scanner.nextInt();
                    int temp = -1;
                    for (int i = 0; i < listSt.size(); i++) {
                        if (listSt.get(i).getID() == removeID) {
                            temp = i;
                            break;
                        }
                    }

                    if (temp == -1) {
                        System.out.println("This ID is not available");
                    } else
                        listSt.remove(temp);

                    saveFile("listStudent.txt");
                    System.out.println("Remove successfully");
                    break;
                case 5:
                    System.out.println("Add student grades");
                    System.out.println("Enter student ID: ");
                    int addID = scanner.nextInt();
                    for (int i = 0; i < listSt.size(); i++) {
                        if (listSt.get(i).getID() == addID) {
                            int choiceAddSc = -1;
                            while (true) {
                                System.out.println("1. Add first time score");
                                System.out.println("2. Add second time score");
                                System.out.println("3. Add third time score");
                                System.out.println("4. Add forth time score");
                                System.out.println("0. Exit");
                                System.out.println("Name: " + listSt.get(i).getNameStudent() + "\n");

                                System.out.println("Enter your choice: ");
                                choiceAddSc = scanner.nextInt();
                                if (choiceAddSc == 0) {
                                    saveFile("listStudent.txt");
                                    break;
                                }

                                float newScore;
                                switch (choiceAddSc) {
                                    case 1:
                                        System.out.println("Enter first score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore1(newScore);
                                        break;
                                    case 2:
                                        System.out.println("Enter second score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore2(newScore);
                                        break;
                                    case 3:
                                        System.out.println("Enter third score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore3(newScore);
                                        break;
                                    case 4:
                                        System.out.println("Enter fourth score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore4(newScore);
                                        break;
                                    default:
                                        System.out.println("No choice!");
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Edit student grades");
                    System.out.println("Enter student ID to edit score: ");
                    int checkID = scanner.nextInt();
                    for (int i = 0; i < listSt.size(); i++) {
                        if (listSt.get(i).getID() == checkID) {
                            int choiceEditSc = -1;
                            while (true) {
                                System.out.println("1. Edit first time score");
                                System.out.println("2. Edit second time score");
                                System.out.println("3. Edit third time score");
                                System.out.println("4. Edit forth time score");
                                System.out.println("0. Exit");
                                System.out.println("Old name: " + listSt.get(i).getNameStudent() + "\n"
                                        + "Old first score: " + listSt.get(i).getScore1() + "\n"
                                        + "Old second score: " + listSt.get(i).getScore2() + "\n"
                                        + "Old third score: " + listSt.get(i).getScore3() + "\n"
                                        + "Old fourth score: " + listSt.get(i).getScore4() + "\n");
                                System.out.println("Enter your choice: ");
                                choiceEditSc = scanner.nextInt();
                                if (choiceEditSc == 0) {
                                    saveFile("listStudent.txt");
                                    break;
                                }

                                float newScore;
                                switch (choiceEditSc) {
                                    case 1:
                                        System.out.println("Enter new first score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore1(newScore);
                                        break;
                                    case 2:
                                        System.out.println("Enter new second score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore2(newScore);
                                        break;
                                    case 3:
                                        System.out.println("Enter new third score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore3(newScore);
                                        break;
                                    case 4:
                                        System.out.println("Enter new fourth score: ");
                                        newScore = scanner.nextFloat();
                                        listSt.get(i).setScore4(newScore);
                                        break;
                                    default:
                                        System.out.println("No choice!");
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Student rank");
                    for (int i = 0; i < listSt.size(); i++) {
                        for (int j = i + 1; j < listSt.size(); j++) {
                            if (listSt.get(i).getMediumScore() < listSt.get(j).getMediumScore()) {
                                Collections.swap(listSt, i, j);
                            }
                        }
                    }

                    saveFile("listStudent.txt");

                    System.out.println("ID\tName\t\t Score 1\tScore 2\tScore 3\tScore 4\n");
                    for (int i = 0; i < listSt.size(); i++) {
                        System.out.println(listSt.get(i).getAllInfo());
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void saveFile(String fileName){
        try {
            FileWriter myWriter = new FileWriter(fileName);
            String strTemp = "";
            for (int j = 0; j < listSt.size(); j++) {
                strTemp += listSt.get(j).getID() + ","
                        + listSt.get(j).getNameStudent() + ","
                        + listSt.get(j).getScore1() + ","
                        + listSt.get(j).getScore2() + ","
                        + listSt.get(j).getScore3() + ","
                        + listSt.get(j).getScore1() + "\n";
            }
            myWriter.write(strTemp);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName){
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] words=data.split(",");

                Student student = new Student();
                for (int i = 0; i < words.length; i++) {
                    switch (i){
                        case 0:
                            student.setID(Integer.parseInt(words[0]));
                            break;
                        case 1:
                            student.setNameStudent(words[1]);
                            break;
                        case 2:
                            student.setScore1(Float.parseFloat(words[2]));
                            break;
                        case 3:
                            student.setScore2(Float.parseFloat(words[3]));
                            break;
                        case 4:
                            student.setScore3(Float.parseFloat(words[4]));
                            break;
                        case 5:
                            student.setScore4(Float.parseFloat(words[5]));
                            break;
                    }
                }
                listSt.add(student);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createFile(String fileName) {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
