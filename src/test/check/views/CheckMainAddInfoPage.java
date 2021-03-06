/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.check.views;

import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

/**
 *
 * @author dell
 */

@StyleSheet
@Template(CrudFormPage.class)
public class CheckMainAddInfoPage extends javax.swing.JPanel {

    /**
     * Creates new form HousingLedgerPage
     */
    public CheckMainAddInfoPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xTabbedPane1 = new com.rameses.rcp.control.XTabbedPane();
        xPanel1 = new com.rameses.rcp.control.XPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLookupField3 = new com.rameses.rcp.control.XLookupField();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();

        xFormPanel1.setCaptionWidth(120);

        xLookupField3.setCaption("Resp. Center Code");
        xLookupField3.setExpression("#{entity.respcentercode}");
        xLookupField3.setHandler("lookupRespcentercode");
        xLookupField3.setName("entity.respcentercode"); // NOI18N
        xLookupField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLookupField3);

        xCheckBox1.setCaption("Accounts Payable");
        xCheckBox1.setName("entity.accountspayable"); // NOI18N
        xFormPanel1.add(xCheckBox1);

        xComboBox2.setCaption("FUND");
        xComboBox2.setItems("provfunds");
        xComboBox2.setName("entity.provfund"); // NOI18N
        xComboBox2.setPreferredSize(new java.awt.Dimension(300, 20));
        xFormPanel1.add(xComboBox2);

        xComboBox1.setCaption("Expense Class");
        xComboBox1.setDepends(new String[] {"entity.accountspayable"});
        xComboBox1.setDynamic(true);
        xComboBox1.setItems("expenseclasses");
        xComboBox1.setName("entity.expenseclass"); // NOI18N
        xComboBox1.setPreferredSize(new java.awt.Dimension(300, 20));
        xComboBox1.setVisibleWhen("#{entity.accountspayable==false}");
        xFormPanel1.add(xComboBox1);

        xDataTable1.setColumns(new com.rameses.rcp.common.Column[]{
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "duesname"}
                , new Object[]{"caption", "Dues Name"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.LookupColumnHandler("#{item.duesname}", "lookupExpenseclassitems")}
            }),
            new com.rameses.rcp.common.Column(new Object[]{
                new Object[]{"name", "amount"}
                , new Object[]{"caption", "Amount"}
                , new Object[]{"width", 100}
                , new Object[]{"minWidth", 0}
                , new Object[]{"maxWidth", 0}
                , new Object[]{"required", false}
                , new Object[]{"resizable", true}
                , new Object[]{"nullWhenEmpty", true}
                , new Object[]{"editable", true}
                , new Object[]{"editableWhen", null}
                , new Object[]{"textCase", com.rameses.rcp.constant.TextCase.NONE}
                , new Object[]{"typeHandler", new com.rameses.rcp.common.DecimalColumnHandler("#,##0.00", -1.0, -1.0, false, 2)}
            })
        });
        xDataTable1.setHandler("itemHandler");
        xDataTable1.setName("selectedItem"); // NOI18N
        xDataTable1.setReadonlyWhen("null");

        javax.swing.GroupLayout xPanel1Layout = new javax.swing.GroupLayout(xPanel1);
        xPanel1.setLayout(xPanel1Layout);
        xPanel1Layout.setHorizontalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(xPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xDataTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );
        xPanel1Layout.setVerticalGroup(
            xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(xPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(xPanel1Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(xDataTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        xTabbedPane1.addTab("Cheque Add'l Info", xPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLookupField xLookupField3;
    private com.rameses.rcp.control.XPanel xPanel1;
    private com.rameses.rcp.control.XTabbedPane xTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
