import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver{

    public static void main(String[]args){
        Maze f;
        try{f = new Maze("data1.dat");
        f.setAnimate(true);
        f.solve();

        System.out.println(f);
}//true animates the maze.
	catch(FileNotFoundException e){System.out.println("no file");}
    }
}
