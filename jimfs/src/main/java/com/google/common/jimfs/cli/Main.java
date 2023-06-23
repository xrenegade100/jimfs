package com.google.common.jimfs.cli;

import com.google.common.jimfs.cli.core.CliColors;
import com.google.common.jimfs.cli.core.Commands;
import com.google.common.jimfs.cli.core.Executor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Executor executor = new Executor();

        System.out.print("\n" + CliColors.ANSI_BG);
        System.out.println(CliColors.ANSI_BLACK + "Mantra" + CliColors.ANSI_RED + "Coding" + CliColors.ANSI_RESET + "\n");
        System.out.println("Welcome to the command-line program for creating a RAM-based file system.\n" +
                            "This program utilizes the Google's Jimfs library.\n" +
                            "Please note that this program is just a prototype and allows you to execute various commands, including:");
        executor.ExecuteHelp();
        System.out.println("to have a list of available commands type HELP");
        System.out.println("--------------------------------------------------------------------------------------------------------");

        String cmdLine = "Type a command: ";

        do{
            System.out.print(cmdLine);
            String command = scanner.nextLine();
            command = command.trim();
            scanner.reset();
            switch (command.toLowerCase().split(" ")[0]){
                case Commands.INIT:
                    String root = executor.ExecuteInit();
                    cmdLine = root + ">";
                    break;
                case Commands.MKDIR:
                    String dir = executor.ExecuteCreateDir(command.toLowerCase().split(" ")[1]);
                    System.out.println(dir);
                    break;
                case Commands.CD:
                    String changedDir = executor.ExecuteChangeDir(command.split(" ")[1]);
                    if (changedDir != null) {
                        cmdLine = changedDir + ">";
                    } else {
                        System.out.println("Cartella inesistente");
                    }
                    break;
                case Commands.LS:
                    ArrayList<String> list = executor.ExecuteListContent();
                    if (list.size() != 0) {
                        for (String item : list) {
                            System.out.println("    \\" + item);
                        }
                    } else {
                        System.out.println("La cartella è vuota");
                    }
                    break;
                case Commands.TOUCH:
                    String file = executor.ExecuteTouch(command.split(" ")[1]);
                    System.out.println(file);
                    break;
                case Commands.RM:
                    String del = executor.ExecuteRemove(command.split(" ")[1]);
                    System.out.println(del);
                    break;
                case Commands.HELP:
                    executor.ExecuteHelp();
                    break;
                case Commands.EXIT:
                    executor.ExecuteExit();
                    break;
                default:
                    System.out.println("Comando Insistente, Riprova");
                    break;

            }
        }while (executor.getProgramOn());
    }
}