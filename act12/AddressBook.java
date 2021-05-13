package act12;
import java.util.Collections;
import java.io.*;
import java.util.*;

public class AddressBook {
    final static  String inputFilePath = "src/act12/input.txt";
    HashMap<String, String> phoneNumbers = new HashMap<String, String>();
    File inputFile = new File(inputFilePath);
    BufferedWriter bf = null;
    BufferedReader bfReader = null;

   public void load() {
        try {
            bfReader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = bfReader.readLine()) != null) {
                String[] parts = line.split(",");
                phoneNumbers.put(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bfReader != null) {
                    bfReader.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void save(String phone, String name) {
       if (phone != "") {
           FileWriter fw = null;
           try {
               fw = new FileWriter(inputFile, true);
               bf = new BufferedWriter(fw);
               bf.write(phone + "," + name + "\n");
           } catch (Exception e) {
               System.out.println(e.getMessage());
           } finally {
               try {
                   if (bf != null) {
                       bf.close();
                   }
               } catch (Exception e) {
                   System.out.println(e.getMessage());
               }
           }
       }else{}
    }
    public void list(){
        System.out.println("Contactos:");
        for (String i : phoneNumbers.keySet()) {
            System.out.println("{" + i + "} {" + phoneNumbers.get(i) + "}");
        }
    }

    public void delete(String phone){
        if (phoneNumbers.containsKey(phone)) {
            phoneNumbers.remove(phone);
            System.out.println("Contacto borrado");

            try {
                bf = new BufferedWriter(new FileWriter(inputFile));
                int c = 0;
                for (Map.Entry<String, String> entry : phoneNumbers.entrySet()) {
                    if (c == 0) {
                        bf.write(entry.getKey() + "," + entry.getValue());
                        c++;
                    } else {
                        bf.write("\n" + entry.getKey() + "," + entry.getValue());
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (bf != null) {
                        bf.close();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("No se ha encontrado algún contacto con ese número telefónico");
        }
    }
    public void create(String phone, String name){
        phoneNumbers.put(phone, name);
        try{
            bf = new BufferedWriter(new FileWriter(inputFile));
            for (Map.Entry<String,String> entry : phoneNumbers.entrySet()){
                bf.write(entry.getKey() + "," + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bf.close();
            }catch (Exception e){}
        }
    }
}
