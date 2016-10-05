/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FolderSync;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class Class
{
    public void ReadConfig(javax.swing.JTextField jSourceDirectoryTextField, javax.swing.JTextField jDestinationDirectoryTextField) throws IOException
    {
        try
        {
            java.io.File File = new java.io.File("config.txt");
            if (File.exists())
            {
                java.io.FileInputStream FileInputStream = new java.io.FileInputStream("config.txt");
                java.io.DataInputStream DataInputStream = new java.io.DataInputStream(FileInputStream);
                java.io.BufferedReader BufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(DataInputStream));
                String TextLine;
                while ((TextLine = BufferedReader.readLine()) != null)
                {
                    if (jSourceDirectoryTextField.getText().isEmpty())
                    {
                        jSourceDirectoryTextField.setText(TextLine);
                    }
                    else if (jDestinationDirectoryTextField.getText().isEmpty())
                    {
                        jDestinationDirectoryTextField.setText(TextLine);
                    }
                }
                DataInputStream.close();
            }
        }
        catch (IOException ex)
        {
            throw ex;
        }
    }

    public void WriteConfig(javax.swing.JTextField jSourceDirectoryTextField, javax.swing.JTextField jDestinationDirectoryTextField) throws IOException
    {
        try
        {
            java.io.Writer Writer;
            java.io.File File = new java.io.File("config.txt");
            if (!File.exists())
            {
                File.createNewFile();
            }
            Writer = new java.io.BufferedWriter(new java.io.FileWriter(File));
            Writer.write(jSourceDirectoryTextField.getText() + "\n" + jDestinationDirectoryTextField.getText());
            Writer.close();
        }
        catch (IOException ex)
        {
            throw ex;
        }
    }

    public void SetFolderLocation(javax.swing.JFileChooser JFileChooser, javax.swing.JTextField JTextField) throws Exception
    {
        try
        {
            JFileChooser.setCurrentDirectory(new java.io.File("\\"));
            JFileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
            if (JFileChooser.showOpenDialog(null) == javax.swing.JFileChooser.APPROVE_OPTION)
            {
                JTextField.setText(JFileChooser.getSelectedFile().toString());
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null, "No Selection ");
            }
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public void Sync(javax.swing.JTextField jSourceDirectoryTextField, javax.swing.JTextField jDestinationDirectoryTextField) throws Exception
    {
        try
        {
            String SourceFileCanonical;
            String SourceFileNames;
            Long SourceFileDates;
            String DestinationFileCanonical;
            String DestinationFileNames;
            Long DestinationFileDates;
            SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            java.io.File SourceFolder = new java.io.File(jSourceDirectoryTextField.getText());
            java.io.File DestinationFolder = new java.io.File(jDestinationDirectoryTextField.getText());
            java.util.List<java.io.File> listOfSourceFiles = (java.util.List<java.io.File>) FileUtils.listFiles(SourceFolder, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

            for (int i = 0; i < listOfSourceFiles.size(); i++)
            {
                if (listOfSourceFiles.get(i).isFile())
                {
                    SourceFileCanonical = listOfSourceFiles.get(i).getCanonicalPath();

                    SourceFileNames = listOfSourceFiles.get(i).getName();
                    SourceFileDates = listOfSourceFiles.get(i).lastModified();

                    DestinationFileCanonical = SourceFileCanonical.replace(jSourceDirectoryTextField.getText(), jDestinationDirectoryTextField.getText());

                    java.io.File DestinationFile = new java.io.File(DestinationFileCanonical);

                    DestinationFileNames = DestinationFile.getName();
                    DestinationFileDates = DestinationFile.lastModified();

                    if (DestinationFile.exists())
                    {
                        if (SourceFileDates > DestinationFileDates)
                        {
                            this.CopyFile(SourceFileCanonical, DestinationFileCanonical);
                        }
                    }
                    else
                    {
                        this.CopyFile(SourceFileCanonical, DestinationFileCanonical);
                    }
                }
            }

            javax.swing.JOptionPane.showMessageDialog(null, "Folder Synchronized!");
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

    public void CopyFile(String Source, String Destination) throws Exception
    {
        try
        {
            java.io.File FileSource = new java.io.File(Source);

            java.io.File FileDestination = new java.io.File(Destination);

            java.io.File FileDestinationFolder = new java.io.File(FileDestination.getParent());

            if (!(FileDestinationFolder.exists()))
            {
                FileDestinationFolder.mkdirs();
            }

            java.io.InputStream InputStream = new java.io.FileInputStream(FileSource);
            java.io.OutputStream OutputStream = new java.io.FileOutputStream(FileDestination);
            byte[] buffer = new byte[512];
            int length;
            while ((length = InputStream.read(buffer)) > 0)
            {
                OutputStream.write(buffer, 0, length);
            }
            InputStream.close();
            OutputStream.close();
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
