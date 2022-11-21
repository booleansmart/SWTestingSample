package data;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Muhamad Hanif on 21/11/2022
 * @project SwTestingSampleAutomation
 */
public class CheckBoxData {

    private String general;
    private String classified;
    private String pri_vate;
    private String pub_lic;
    private String office;
    private String workspace;
    private String react;
    private String angular;
    private String veu;
    private String downloads;
    private String wordFile;
    private String excelFile;
    private String desktop;
    private String notes;
    private String commands;
    private String documents;

    private String[] officeFolder;
    private String[] workspaceFolder;
    private String[] documentsFolder;

    private String[] downloadsFolder;
    private String[] desktopFolder;

    private String[] prehome;
    private String[] home;

    public CheckBoxData() {
        this.general = "general";
        this.classified = "classified";
        this.pri_vate = "private";
        this.pub_lic = "public";
        this.office = "office";
        this.workspace = "workspace";
        this.react = "react";
        this.angular = "angular";
        this.veu = "veu";
        this.downloads = "downloads";
        this.wordFile = "wordFile";
        this.excelFile = "excelFile";
        this.desktop = "desktop";
        this.notes = "notes";
        this.commands = "commands";
        this.documents = "documents";

        this.officeFolder = new String[]{this.office, this.pub_lic, this.pri_vate, this.classified, this.general};
        this.workspaceFolder = new String[]{this.workspace, this.react, this.angular, this.veu};
        this.documentsFolder = Stream.concat(Arrays.stream(this.officeFolder), Arrays.stream(this.workspaceFolder))
                .toArray(String[]::new);
        this.downloadsFolder = new String[]{this.downloads, this.wordFile, this.excelFile};
        this.desktopFolder = new String[]{this.desktop, this.notes, this.commands};

        this.prehome = Stream.concat(Arrays.stream(this.documentsFolder), Arrays.stream(this.downloadsFolder))
                .toArray(String[]::new);

        this.home = Stream.concat(Arrays.stream(this.prehome), Arrays.stream(this.desktopFolder)).toArray(String[]::new);
    }



    public String getGeneral() {
        return general;
    }

    public String getClassified() {
        return classified;
    }

    public String getPri_vate() {
        return pri_vate;
    }

    public String getPub_lic() {
        return pub_lic;
    }

    public String getOffice() {
        return office;
    }

    public String getWorkspace() {
        return workspace;
    }

    public String getReact() {
        return react;
    }

    public String getAngular() {
        return angular;
    }

    public String getVeu() {
        return veu;
    }

    public String getDownloads() {
        return downloads;
    }

    public String getWordFile() {
        return wordFile;
    }

    public String getExcelFile() {
        return excelFile;
    }

    public String getDesktop() {
        return desktop;
    }

    public String getNotes() {
        return notes;
    }

    public String getCommands() {
        return commands;
    }

    public String getDocuments() {
        return documents;
    }

    public String[] getOfficeFolder() {
        return officeFolder;
    }

    public String[] getDocumentsFolder() {
        return documentsFolder;
    }

    public String[] getDownloadsFolder() {
        return downloadsFolder;
    }

    public String[] getDesktopFolder() {
        return desktopFolder;
    }

    public String[] getHome() {
        return home;
    }
}
