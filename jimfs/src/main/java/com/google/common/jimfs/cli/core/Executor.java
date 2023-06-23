package com.google.common.jimfs.cli.core;

import com.google.common.jimfs.cli.manager.FileSystemManager;

import java.io.IOException;
import java.util.ArrayList;

public class Executor {

    private FileSystemManager fileSystemManager;
    private boolean ProgramOn = true;

    public boolean getProgramOn() {
        return ProgramOn;
    }

    public void ExecuteHelp(){
        System.out.println(" - " + CliColors.ANSI_CYAN + Commands.INIT + CliColors.ANSI_RESET + ": to create a new file system,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.MKDIR + " FolderName" + CliColors.ANSI_RESET + ": to create a folder,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.CD + " FolderName" + CliColors.ANSI_RESET + ": to enter a folder,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.LS + CliColors.ANSI_RESET + ": to print a list of the folder's contents,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.TOUCH + " FileName.Extension" + CliColors.ANSI_RESET + ": to create a file,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.RM + " FolderName/FileName" + CliColors.ANSI_RESET + ": to delete a file or folder along with its contents,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.HELP + CliColors.ANSI_RESET + ": to print the list of available commands,\n" +
                            " - " + CliColors.ANSI_CYAN + Commands.EXIT + CliColors.ANSI_RESET + ": to exit the program.\n");
    }

    public void ExecuteExit(){
        fileSystemManager.closeFileSystem();
        ProgramOn = false;
    }

    public String ExecuteInit(){
        try {
            if (fileSystemManager == null) {
                fileSystemManager = new FileSystemManager();
            }

            return fileSystemManager.getRoot();
        } catch (Exception e){
            System.err.println("Unable to create a file system at this time, unknown error.");
            ExecuteExit();
        }

        return "";
    }

    public String ExecuteCreateDir(String path){
        try {
            if (fileSystemManager.createDir(path)) {
                return "Folder <" + path + "> created successfully!";
            } else {
                return "Folder already exists.";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String ExecuteChangeDir(String path){
        if (fileSystemManager != null){
            if (fileSystemManager.SwitchDir(path))
                return fileSystemManager.getCurrentPath();
            else
                return null;
        }

        return null;
    }

    public ArrayList<String> ExecuteListContent(){
        if (fileSystemManager != null){
            try {
                return fileSystemManager.listContent();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public String ExecuteTouch(String fileName){
        if (fileSystemManager != null) {
            try {
                if(fileSystemManager.CreateFile(fileName))
                    return "File <" + fileName + "> created successfully.";
                else
                    return "File already exists.";
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return null;
    }

    public String ExecuteRemove(String fileName){
        if (fileSystemManager != null) {
            try {
                if(fileSystemManager.Remove(fileName))
                    return "File/Folder <" + fileName + "> deleted successfully.";
                else
                    return "File/Folder does not exist.";
                } catch (IOException e) {
                   e.printStackTrace();
                }
            }
        return null;
    }
}