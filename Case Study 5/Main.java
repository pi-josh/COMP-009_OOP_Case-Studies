/**
* Telephone Directory - FILE HANDLING
* A program that stores and updates a small telephone directory in a file.
*
* @author: Aldas, Dominic Syd
* @author: Fernandez, Cassidy
* @author: Lafuente, Rafael
* @author: Macatunao, Joshua
*
* @date: 01/06/2024
*/


import java.io.*;
import java.util.*;

public class Main {
  private static final String fileName = "telephone.csv";

  // method for reading and returning info from file
  public static ArrayList<TelephoneRecord> readFile() {
    // create an ArrayList to store each instance of TelephoneRecord class
    ArrayList<TelephoneRecord> directory = new ArrayList<TelephoneRecord>();

    try {
      FileReader fr = new FileReader(fileName);
      BufferedReader reader = new BufferedReader(fr);
      String line;
      while ((line = reader.readLine()) != null) {
        String[] fields = line.split(";");
        String name = fields[0];
        String address = fields[1];
        String telephone = fields[2];
        TelephoneRecord newRecord = new TelephoneRecord(name, address, telephone);
        directory.add(newRecord);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }
    directory = sortRecords(directory);
    return directory;
  }

  // method for writing info into file
  public static void writeRecords(ArrayList<TelephoneRecord> directory) {
    try {
      FileWriter fw = new FileWriter(fileName);
      BufferedWriter writer = new BufferedWriter(fw);
      for (TelephoneRecord record : directory) {
        writer.write(record.getName() + ";" + record.getAddress() + ";" + record.getTelephone());
        writer.newLine();
      }
      writer.close();
    } catch (IOException e) {
      System.out.println("Error writing file: " + e.getMessage());
    }
  }

  // method for inserting info into file
  public static void insertRecord() {
    Scanner scanner = new Scanner(System.in);

    String name, address, telephone;

    while (true) {
      System.out.println("Enter name [Last, First] (Type exit to cancel): ");
      name = scanner.nextLine();
      if (name.toLowerCase().equals("exit")) {
        System.out.println("Exiting...\n");
        return;
      } else if(name.length() > 20) {
        System.out.println("Name cannot be longer than 20 characters.");
        continue;
      }
      if (!name.isEmpty()) break;
      System.out.println("Name cannot be empty. Please try again.");
    }

    while (true) {
      System.out.println("Enter address: ");
      address = scanner.nextLine();

      if(address.length() > 20) {
        System.out.println("Address cannot be longer than 20 characters.");
        continue;
      }
      if (!address.isEmpty()) break;
      System.out.println("Address cannot be empty. Please try again.");
    }

    while (true) {
      System.out.println("Enter telephone number: ");
      telephone = scanner.nextLine();
      if (!telephone.isEmpty()) break;
      System.out.println("Telephone number cannot be empty. Please try again.");
    }

    TelephoneRecord record = new TelephoneRecord(name, address, telephone);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
      writer.write(record.getName() + ";" + record.getAddress() + ";" + record.getTelephone());
      writer.newLine();
    } catch (IOException e) {
      System.out.println("Error writing to file: " + e.getMessage());
    }
  }

  // method for deleting info from file
  public static void deleteRecord() {
    Scanner input = new Scanner(System.in);

    ArrayList<TelephoneRecord> directory = readFile();

    String deleteName, deleteAddress;
  
    while (true) {
      System.out.print("Enter the name of the entry to delete (Type exit to cancel): ");
      deleteName = input.nextLine();
      if (deleteName.toLowerCase().equals("exit")) {
        System.out.println("Exiting...\n");
        return;
      } else if(deleteName.length() > 20) {
        System.out.println("Name cannot be longer than 20 characters.");
        continue;
      }
      if (!deleteName.isEmpty()) break;
      System.out.println("Name cannot be empty. Please try again.");
    }

    while (true) {
      System.out.print("Enter the address of the entry to delete: ");
      deleteAddress = input.nextLine();

      if(deleteAddress.length() > 20) {
        System.out.println("Address cannot be longer than 20 characters.");
        continue;
      }
      if (!deleteAddress.isEmpty()) break;
      System.out.println("Address cannot be empty. Please try again.");
    }

    boolean found = false;
    Iterator<TelephoneRecord> iterator = directory.iterator();
    while (iterator.hasNext()) {
      TelephoneRecord record = iterator.next();
      if (record.getName().equalsIgnoreCase(deleteName) && record.getAddress().equalsIgnoreCase(deleteAddress)) {
        iterator.remove();
        found = true;
      }
    }
    if (found) {
      writeRecords(directory);
      System.out.println("Record deleted successfully.\n");
    } else {
      System.out.println("Record not found.\n");
    }
  }

  // method for displaying info from file
  public static void displayRecords() {
    ArrayList<TelephoneRecord> directory = readFile();

    System.out.println("\n================== TELEPHONE RECORDS ===================");
    System.out.printf("%-20s %-20s %-20s\n", "Name", "Address", "Telephone");
    if (directory.isEmpty()) {
      System.out.println("No records found.\n\n");
    } else {
      for (TelephoneRecord record : directory) {
        System.out.println(record);
      }
      System.out.println("\n");
    }
  }

  // method for arranging arraylist in alphabetical order
  public static ArrayList<TelephoneRecord> sortRecords(ArrayList<TelephoneRecord> directory) {
    ArrayList<TelephoneRecord> sortedDirectory = new ArrayList<TelephoneRecord>();
    if (directory.isEmpty()) {
      System.out.println("No records found.\n\n");
    } else {
      for(TelephoneRecord record : directory) {
        boolean inserted = false;
        for (int i = 0; i < sortedDirectory.size(); i++) {
            if (record.getName().charAt(0) <= sortedDirectory.get(i).getName().charAt(0)) {
                sortedDirectory.add(i, record);
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            sortedDirectory.add(record);  // Add to the end if not inserted yet
        }
      }
    }

    return sortedDirectory;
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char choice;

    System.out.println("Welcome to the Telephone Directory!");
    do {
      System.out.println("Telephone Directory");
      System.out.println("1. Add a new entry");
      System.out.println("2. Delete an entry");
      System.out.println("3. Display all entries");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = input.next().charAt(0);
      input.nextLine();  // consume the newline character

      switch (choice) {
        case '1':
          // add a new entry
          insertRecord();
          break;
        case '2':
          // delete an entry
          deleteRecord();
          break;
        case '3':
          // display all entries
          displayRecords();
          break;
        case '4':
          // exit
          System.out.println("Thank you for using the Telephone Directory!\n");
          break;
        default:
          System.out.println("Invalid choice. Please try again.\n");
          break;
      }
    } while (choice != '4');

    input.close();
  }
}

// A class to store each info of record from the file
class TelephoneRecord {
  private String name;
  private String address;
  private String telephone;

  public TelephoneRecord(String name, String address, String telephone) {
    this.name = name;
    this.address = address;
    this.telephone = telephone;
  }

  // getters
  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getTelephone() {
    return telephone;
  }

  // method to display the record
  public String toString() {
    return String.format("%-20s %-20s %-20s", name, address, telephone);
  }
}
