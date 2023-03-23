package DeveloperTeam.Application;

import javax.swing.*;
public class WindowManager {
    public static String getPath(){
        String path = "";

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        fileChooser.setDialogTitle("Select the path to save the ticket");

        int result = fileChooser.showOpenDialog(frame);
        if(result==JFileChooser.APPROVE_OPTION){
            path = fileChooser.getSelectedFile().getAbsolutePath();
        } else{
            System.out.println("Process has been canceled, current directory will be used");
        }
        return path;
    }

}
