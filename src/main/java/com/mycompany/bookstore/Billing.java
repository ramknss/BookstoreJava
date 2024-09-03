/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        DisplayBooks();
        Countrow();
        BnTb.setEditable(false);
        PriceTb.setEditable(false);
    }
    public Billing(String UN)
    {
        initComponents();
        Unamelbl.setText(UN);
        DisplayBooks();
        BooksQuantityUpdate();
        BnTb.setEditable(false);
        PriceTb.setEditable(false);
        Countrow();
    }
    Connection Con=null;
    PreparedStatement St=null;
    ResultSet Rs=null;
    private void DisplayBooks() 
    {
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","Shreya#Siva@1206?");
            //St = Con.createStatement();
            //Rs = St.executeQuery("select * from booktb");
            //BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
            String sql="select * from booktb";
            St = Con.prepareStatement(sql);
            Rs = St.executeQuery();
            BooksTable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Resetbtn = new javax.swing.JButton();
        Addtobillbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Unamelbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        BnTb = new javax.swing.JTextField();
        CnTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        Printbtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        Gtotallbl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BillnumTb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 51, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("              Book Store Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        Resetbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Resetbtn.setText("Reset");
        Resetbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetbtnMouseClicked(evt);
            }
        });
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        Addtobillbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Addtobillbtn.setText("Add to Bill");
        Addtobillbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtobillbtnMouseClicked(evt);
            }
        });
        Addtobillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtobillbtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 51, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Book Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("->");

        Unamelbl.setBackground(new java.awt.Color(204, 51, 0));
        Unamelbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Unamelbl.setForeground(new java.awt.Color(204, 51, 0));
        Unamelbl.setText("Users");

        jLabel8.setBackground(new java.awt.Color(204, 51, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("Bill Number");

        jLabel10.setBackground(new java.awt.Color(204, 51, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 51, 0));
        jLabel10.setText("Price");

        jLabel11.setBackground(new java.awt.Color(204, 51, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 51, 0));
        jLabel11.setText("Client Name");

        QtyTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTbActionPerformed(evt);
            }
        });

        BnTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnTbActionPerformed(evt);
            }
        });

        CnTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnTbActionPerformed(evt);
            }
        });

        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        Printbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Printbtn.setText("Print");
        Printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintbtnMouseClicked(evt);
            }
        });
        Printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbtnActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(204, 51, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 51, 0));
        jLabel15.setText("           Books Available");

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "title", "author", "category", "quantity", "price"
            }
        ));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        Gtotallbl.setBackground(new java.awt.Color(204, 51, 0));
        Gtotallbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Gtotallbl.setForeground(new java.awt.Color(204, 51, 0));
        Gtotallbl.setText("Total");

        jLabel17.setBackground(new java.awt.Color(204, 51, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 51, 0));
        jLabel17.setText("Bill");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("<-");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        BillnumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillnumTbActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(204, 51, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 51, 0));
        jLabel14.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(CnTb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BnTb, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Addtobillbtn)
                                            .addComponent(Unamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BillnumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(275, 275, 275))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Gtotallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Gtotallbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Unamelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BnTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillnumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CnTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Addtobillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void AddtobillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtobillbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddtobillbtnActionPerformed

    private void QtyTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTbActionPerformed

    private void BnTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BnTbActionPerformed

    private void CnTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnTbActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed

    private void PrintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintbtnActionPerformed
int Stock=0;
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        BnTb.setText(model.getValueAt(MyIndex,1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex,4).toString());
        PriceTb.setText(model.getValueAt(MyIndex,5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked
//int stock=0;
private void SaveBill()
{
    if(BillnumTb.getText().isEmpty() || CnTb.getText().isEmpty()  )
    {
        JOptionPane.showMessageDialog(this,"Information is missing");
    }
    else
    {
        try
        {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","Shreya#Siva@1206?");
            PreparedStatement add= Con.prepareStatement("insert into billtb values(?,?,?,?)");
            add.setInt(1,Integer.valueOf(BillnumTb.getText()));
            
            add.setString(2,Unamelbl.getText());
            add.setString(3,CnTb.getText());
            
            add.setInt(4,Integer.valueOf(total));
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Bill Saved");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
private void Reset()
{
    BnTb.setText("");
    QtyTb.setText("");
    PriceTb.setText("");
    CnTb.setText("");
    BillTxt.setText("");
    //i=0;
    Gtotallbl.setText("total");
}
int BId;
private void BooksQuantityUpdate()
{
    int newqty = Stock-Integer.valueOf(QtyTb.getText());
    try
    {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","Shreya#Siva@1206?");
                
        String Query = "Update booktb Quantity="+newqty+" where Bid="+BId;
        Statement Delete = Con.createStatement();
        Delete.executeUpdate(Query);
        JOptionPane.showMessageDialog(this,"Book Quantity Updated");
        DisplayBooks();
        //Reset();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
int i=0,total=0,Gtotal=0;
    private void AddtobillbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtobillbtnMouseClicked
        // TODO add your handling code here:
        if(QtyTb.getText().isEmpty() || BnTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Information is missing");
        }
        else if(Integer.valueOf(QtyTb.getText())>Stock)
        {
               JOptionPane.showMessageDialog(this,"There are not enough books");     
        }
        else{
            i++;
            total=Integer.valueOf(PriceTb.getText())*Integer.valueOf(QtyTb.getText());
            if(i==1)
            {
                BillTxt.setText(BillTxt.getText()+"   ==================BOOK SHOP=================\n"+" NUM     PRODUCT         PRICE          QUANTITY       TOTAL\n"+i+"          "+BnTb.getText()+"                     "+PriceTb.getText()+"                    "+QtyTb.getText()+"                   "+total+"\n");
            }
            else
            {
                BillTxt.setText(BillTxt.getText()+i+"            "+BnTb.getText()+"                 "+PriceTb.getText()+"                    "+QtyTb.getText()+"                    "+total+"\n");
            }
            Gtotal=Gtotal+total;
            Gtotallbl.setText("Rs."+Gtotal);
            BooksQuantityUpdate();
        }
                    
    }//GEN-LAST:event_AddtobillbtnMouseClicked

//Connection Con=null;
//Statement St1=null;
//ResultSet Rs1=null;
private void Countrow()
{
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","Shreya#Siva@1206?");
        Statement St1 = Con.createStatement();
        ResultSet Rs1 = St.executeQuery("select * from billtb order by BNum  FETCH  ROWS ONLY");
        Rs1.next();
        int Id=Rs1.getInt(1)+1;
        BnTb.setText(Id+"");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    private void PrintbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintbtnMouseClicked
        // TODO add your handling code here:
        try{
            BillTxt.print();
        }catch(Exception e){
            
        }
        SaveBill();
        Reset();
    }//GEN-LAST:event_PrintbtnMouseClicked

    private void ResetbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetbtnMouseClicked
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_ResetbtnMouseClicked

    private void BillnumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillnumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillnumTbActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addtobillbtn;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BillnumTb;
    private javax.swing.JTextField BnTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JTextField CnTb;
    private javax.swing.JLabel Gtotallbl;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton Printbtn;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JLabel Unamelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
