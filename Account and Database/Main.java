import com.sun.source.tree.UsesTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        Table table = mainMenu.table;  //Use
        mainMenu.Add_Donor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.frame.setVisible(false);
                AddDoner addDoner = new AddDoner();
            }
        });

        mainMenu.update_Donor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.frame.setVisible(false);
                UpdateDonor updateDonor = new UpdateDonor();
            }
        });

        mainMenu.delete_Donor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.frame.setVisible(false);
                DeleteDonor deleteDonor = new DeleteDonor();
            }
        });

        mainMenu.show_all_records.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.frame.setVisible(false);
                ShowAllRecords showAllRecords = new ShowAllRecords();
            }
        });



        AddDoner addDoner = new AddDoner();
        addDoner.frame.setVisible(false);
        addDoner.insertDoner_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AddDoner addDoner = new AddDoner();
                if (addDoner.txt1.getText().isEmpty() || addDoner.txt2.getText().isEmpty() || addDoner.txt3.getText().isEmpty() || addDoner.txt4.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(addDoner.frame, "Enter all fields");
                } else {

                    table.setName(addDoner.txt1.getText());
                    table.setCity(addDoner.txt2.getText());
                    table.setContact(Integer.parseInt(addDoner.txt3.getText()));
                    table.setBloodgroup(addDoner.txt4.getText());

                    try {
                        ConnectionClass connectionClass = new ConnectionClass();
                        String InsertQuery = "INSERT INTO bdtable (name, city, phoneNo, boodgroup), VALUES (?, ?, ?, ?)";
                        Connection connection = connectionClass.connection;
                        PreparedStatement statement = connection.prepareStatement(InsertQuery);

                        statement.setString(1, table.getName());
                        statement.setString(2, table.getCity());
                        statement.setInt(3, table.getContact());
                        statement.setString(4, table.getBloodgroup());
                        statement.executeUpdate();
                        System.out.println("Data inserted successfully");
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                    addDoner.txt1.setText("");
                    addDoner.txt2.setText("");
                    addDoner.txt3.setText("");
                    addDoner.txt4.setText("");
                }
            }
        });

        DeleteDonor deleteDonor = new DeleteDonor();
        deleteDonor.frame.setVisible(false);
        deleteDonor.deleteDoner_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table.setContact(Integer.parseInt(deleteDonor.txt3.getText()));
                try {
                    String DeleteQuery = "delete from acct where registrationNo=?";
                    ConnectionClass connectionClass = new ConnectionClass();
                    Connection connection = connectionClass.connection;
                    PreparedStatement statement = connection.prepareStatement(DeleteQuery);
                    statement.setInt(1, table.getContact());
                    statement.executeUpdate();
                    deleteDonor.txt2.setText("");
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });

        UpdateDonor updateDonor = new UpdateDonor();
        updateDonor.updateDoner_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!updateDonor.txt2.getText().isEmpty()) {
                    table.setName(updateDonor.txt1.getText());
                    table.setCity(updateDonor.txt2.getText());
                    table.setContact(Integer.parseInt((updateDonor.txt3.getText())));
                    table.setBloodgroup((updateDonor.txt4.getText()));
                    try {

                        String updateQuery = "UPDATE acct SET name =?,salary = ?, location = ? WHERE registrationNo = ?";
                        ConnectionClass connectionClass = new ConnectionClass();
                        Connection connection = connectionClass.connection;
                        PreparedStatement statement = connection.prepareStatement(updateQuery);
                        statement.setString(1, table.getName());
                        statement.setString(2, table.getCity());
                        statement.setString(3, table.getBloodgroup());
                        statement.setInt(4, table.getContact());

                        statement.executeUpdate();
                        updateDonor.txt2.setText("");
                        updateDonor.txt3.setText("");
                        updateDonor.txt4.setText("");
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                updateDonor.txt1.setText("");
                updateDonor.txt2.setText("");
                updateDonor.txt3.setText("");
                updateDonor.txt4.setText("");
            }
        });

    }
}