package main;


/**
 * Telephone Directory - DATABASES
 * A program that stores and updates a small telephone directory in a database.
 *
 * @author: Aldas, Dominic Syd
 * @author: Fernandez, Cassidy
 * @author: Lafuente, Rafael
 * @author: Macatunao, Joshua
 *
 * @date: 15/06/2024
 */

import java.sql.*;
import java.util.Scanner;

public class Main extends DBManager {

  // Create method (insert record)
  public void insertRecord() {
    Scanner scanner = new Scanner(System.in);

    String Name, Address, Telephone;

    while (true) {
      System.out.println("Enter name [Last, First] (Type exit to cancel): ");
      Name = scanner.nextLine();
      if (Name.toLowerCase().equals("exit")) {
        System.out.println("Exiting...\n");
        return;
      } else if (Name.length() > 35) {
        System.out.println("Name cannot be longer than 35 characters.");
        continue;
      }
      if (!Name.isEmpty())
        break;
      System.out.println("Name cannot be empty. Please try again.");
    }

    while (true) {
      System.out.println("Enter address: ");
      Address = scanner.nextLine();

      if (Address.length() > 35) {
        System.out.println("Address cannot be longer than 35 characters.");
        continue;
      }
      if (!Address.isEmpty())
        break;
      System.out.println("Address cannot be empty. Please try again.");
    }

    while (true) {
      System.out.println("Enter telephone number: ");
      Telephone = scanner.nextLine();

      if (Telephone.length() > 10) {
        System.out.println("Telephone cannot be longer than 10 characters.");
      }
      if (!Telephone.isEmpty())
        break;
      System.out.println("Telephone number cannot be empty. Please try again.");
    }

    // Querying the database
    String sql = "INSERT INTO tbltelephone (Name, Address, Telephone) VALUES (?, ?, ?)";

    try {
      prep = con.prepareStatement(sql);
      prep.setString(1, Name);
      prep.setString(2, Address);
      prep.setString(3, Telephone);
      prep.executeUpdate();
      System.out.println("Recorded successfully!\n");
    } catch (SQLException e) {
      System.out.println("Error inserting record: " + e.getMessage());
    }
  }

  // Read method (display all records)
  public void displayRecords() {
    // Querying the database
    String sql = "SELECT * FROM tbltelephone ORDER BY Name";

    try {
      if (con == null) {
          System.out.println("Database connection is not established.");
          return;
      }
      state = con.createStatement();
      result = state.executeQuery(sql);

      System.out.println("\n================================ TELEPHONE RECORDS =======================================");
      System.out.printf("%-37s %-37s %-12s\n", "Name", "Address", "Telephone");

      while (result.next()) {
        String name = result.getString("Name");
        String address = result.getString("Address");
        String telephone = result.getString("Telephone");
        System.out.printf("%-37s %-37s %-12s\n", name, address, telephone);
      }
    } catch (SQLException e) {
      System.out.println("Error displaying record: " + e.getMessage());
    } 
  }

  // Delete method (delete record)
  public void deleteRecord() {
    Scanner input = new Scanner(System.in);

    // Asking for the name of the record to be deleted
    String deleteName;
    while (true) {
      System.out.print("Enter the name of the entry to delete (Type exit to cancel): ");
      deleteName = input.nextLine();
      if (deleteName.toLowerCase().equals("exit")) {
        System.out.println("Exiting...\n");
        return;
      } else if (deleteName.length() > 35) {
        System.out.println("Name cannot be longer than 35 characters.");
        continue;
      }
      if (!deleteName.isEmpty())
        break;
      System.out.println("Name cannot be empty. Please try again.");
    }

    // Querying the database
    String sql = "DELETE FROM tbltelephone WHERE Name = ?";

    try {
      prep = con.prepareStatement(sql);
      prep.setString(1, deleteName);
      int rowsAffected = prep.executeUpdate();
      if (rowsAffected > 0) {
        System.out.println("Record deleted successfully!\n");
      } else {
        System.out.println("No record found with the given name.\n");
      }
    } catch (SQLException e) {
      System.out.println("Error deleting record: " + e.getMessage());
    }
  }

  // Main method
  public static void main(String[] args) {
    Main main = new Main();
    main.connect();

    Scanner scan = new Scanner(System.in);
    char choice;

    System.out.println("Welcome to the Telephone Directory!");
    // initial record display
    main.displayRecords();
    do {
      System.out.println("==========================================================================================");
      System.out.println("Telephone Directory");
      System.out.print("I - Insert record, D - Delete record, E - Exit: ");
      choice = scan.next().charAt(0);
      scan.nextLine();

      switch (Character.toUpperCase(choice)) {
        case 'I':
          main.insertRecord();
          break;
        case 'D':
          main.deleteRecord();
          break;
        case 'E':
          main.displayRecords();
          System.out.println("Thank you for using the Telephone Directory!\n");
          break;
        default:
          System.out.println("Invalid choice. Please try again.\n");
          break;
      }
    } while (choice != 'E');
    scan.close();

    main.disconnect();
  }
}