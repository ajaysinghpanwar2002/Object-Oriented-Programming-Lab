package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class files {
    public static void main(String[] args) throws IOException {
        int i;
        // iscommand se apne file ke details de de h, example uski location, and "f1" ke
        // reference bna diya h.
        File f1 = new File("C:/Users/Ajay singh/vscode/OOPslab/ajayhandlesfile.txt");
        // it is command to create a new file
        f1.createNewFile();
        System.out.println("Is Exists: " + f1.exists());
        System.out.println("file name: " + f1.getName());
        System.out.println("can file Read: " + f1.canWrite());
        System.out.println("file size: " + f1.length());
        // delete krne ke command h
        // f1.delete();

        // file output stream ka 1 refernce bna diya h "fout"
        FileOutputStream fout;
        // iscommand se apne file ke details de de h, example uski location, and "fout" ke reference bna diya h.
        fout = new FileOutputStream("C:/Users/Ajay singh/vscode/OOPslab/ajayhandlesfile.txt", true);
        // yeh string ko ab yeh character by character file mein likhega
        String s = "ajay";
        // string ka character array bna diya
        char ch[] = s.toCharArray();
        // for loop utne baar chalege jitne character honge
        for (i = 0; i < s.length(); i++) {
            fout.write(ch[i]);
        }
        // .close kerne se changes harddrive mein chale gye h
        fout.close();
        System.out.println("succefully added string");

        // file input stream ka 1 refernce bna diya h "fin"
        FileInputStream fin;
        // iscommand se apne file ke details de de h, example uski location, and "fin" ke reference bna diya h.
        fin = new FileInputStream("C:/Users/Ajay singh/vscode/OOPslab/ajayhandlesfile.txt");
        // so ab yeh loop chal jayega file mein word by word padhenge and print krte rhenge 
        do {
            i = fin.read();
            if (i != -1) {
                System.out.println((char) i);
            }
        } while (i != -1);
        fin.close();
    }
}
