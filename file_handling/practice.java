import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine().trim();

        // Add .txt if not present
        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }

        File file = new File(fileName);

        try {
            // CREATE FILE
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            // WRITE TO FILE
            FileWriter writer = new FileWriter(file);
            System.out.print("Enter text to write in file: ");
            String content = sc.nextLine();
            writer.write(content);
            writer.close();
            System.out.println("Successfully written to file");

            // READ FILE
            System.out.println("\nReading from file:");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();

            // DELETE FILE
            System.out.print("\nDo you want to delete the file? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                if (file.delete()) {
                    System.out.println("File deleted successfully");
                } else {
                    System.out.println("Failed to delete file");
                }
            } else {
                System.out.println("File not deleted");
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        sc.close();
    }
}
