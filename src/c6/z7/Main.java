package c6.z7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/c6/z7/in.txt";
        String outputFilePath = "src/c6/z7/out.txt";
        Map<String, List<Purchase>> purchases = getPurchasesFromFile(inputFilePath);

        writeOutputToFile(outputFilePath, purchases);
    }

    private static void writeOutputToFile(String filePath, Map<String, List<Purchase>> purchases) {
        try {
            FileWriter myWriter = new FileWriter(filePath);

            myWriter.write(""); // clear previous file

            for (String person : purchases.keySet()) {
                List<Purchase> personPurchases = purchases.get(person);
                Set<String> products = new HashSet<>();
                int total = personPurchases
                        .stream()
                        .mapToInt(Purchase::getPrice)
                        .sum();

                personPurchases.forEach(purchase -> {
                    products.add(purchase.getName());
                });

                myWriter.append(person + " " + personPurchases.size() + " " + products.size() + " " + total + "\n");
            }

            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, List<Purchase>> getPurchasesFromFile(String filePathName) {
        Scanner scanner = null;
        Map<String, List<Purchase>> purchases = new HashMap<>();

        try {
            scanner = new Scanner(new File(filePathName));

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String person = getPersonFromLine(line);
                Purchase purchase = getPurchaseFromLine(line);

                if (person.equals("") || purchase == null) continue;

                if (!purchases.containsKey(person)) {
                    purchases.put(person, new ArrayList<>());
                }

                purchases.get(person).add(purchase);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return purchases;
    }

    private static String getPersonFromLine(String line) {
        Pattern pattern = Pattern.compile("(\\w+) ");
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) return matcher.group(1);

        return "";
    }

    private static Purchase getPurchaseFromLine(String line) {
        Pattern pattern = Pattern.compile(" (\\w+) (\\d+)");
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            return new Purchase(
                    matcher.group(1),
                    Integer.parseInt(matcher.group(2))
            );
        }

        return null;
    }
}
