package baitaplon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GDThuChi extends javax.swing.JFrame {
    
    List<QuanLyThuChi> qltc = new ArrayList<>();
    QuanLyThuChi thuchi;
    List<NguonThu> nt = new ArrayList<>();
    NguonThu thu;
    List<NguonChi> nc = new ArrayList<>();
    NguonChi chi;
    HashMap<String,Double> tknt = new HashMap<>();
    HashMap<String,Double> tknc = new HashMap<>();
    public static int pos = 0;
    public static double moneytam = 0;
    public static int checkt = 0;
    public static int checkc = 0;
    public static String name_txt;
    public GDThuChi() {
        initComponents();
        setLocationRelativeTo(null);
        
        openFile();
        for(NguonThu x : nt){
            if(tknt.containsKey(x.getKhoanThu())){
                tknt.put(x.getKhoanThu(), tknt.get(x.getKhoanThu())+x.getSoTien());
            }else{
                tknt.put(x.getKhoanThu(), x.getSoTien());
            }
        }
        for(NguonChi x : nc){
            if(tknc.containsKey(x.getKhoanChi())){
                tknc.put(x.getKhoanChi(), tknc.get(x.getKhoanChi())+x.getSoTien());
            }else{
                tknc.put(x.getKhoanChi(), x.getSoTien());
            }
        }
        
        ViewThu();
        ViewTableThu();
        
        ViewChi();
        ViewTableChi();
        
        ViewTableQuanLyThuChi();
        ViewTableThongKeNguonThu();
        ViewTableThongKeNguonChi();
    }

    public void ViewThu(){
        if(nt.isEmpty()){
            OnOffThu(true,false);
        }else{
            thu = nt.get(pos);
            this.txt_dateThu.setText(thu.getDate());
            this.txt_moneyThu.setText(""+thu.getSoTien());
            this.txt_tenNguonThu.setText(thu.getKhoanThu());
            OnOffThu(true,false);
        }
    }
    public void OnOffThu(boolean a,boolean b){
        this.btn_saveKhoanThu.show(b);
        this.btn_huyThu.show(b);
        
        this.btn_themKhoanThu.show(a);
        this.btn_editThu.show(a);
        this.btn_deleteThu.show(a);
    }
    public void OnOffChi(boolean a,boolean b){
        this.btn_saveKhoanChi.show(b);
        this.btn_huyChi.show(b);
        
        this.btn_themKhoanChi.show(a);
        this.btn_editChi.show(a);
        this.btn_deleteChi.show(a);
    }
    public void ViewTableThu(){
        DefaultTableModel model = (DefaultTableModel) this.tableThu.getModel();
        model.setNumRows(0);
        int n = 1;  
        for(NguonThu x : nt){
            model.addRow(new Object[]{n++,x.getKhoanThu(),x.getDate(),x.getSoTien()});
        }
    }
    public void ViewChi(){
        if(nc.isEmpty()){
            OnOffChi(true,false);
        }else{
            chi = nc.get(pos);
            this.txt_dateChi.setText(chi.getDate());
            this.txt_moneyChi.setText(""+chi.getSoTien());
            this.txt_tenNguonChi.setText(chi.getKhoanChi());
            OnOffChi(true,false);
        }
    }
    public void ViewTableChi(){
        DefaultTableModel model = (DefaultTableModel) this.tableChi.getModel();
        model.setNumRows(0);
        int n = 1;  
        for(NguonChi x : nc){
            model.addRow(new Object[]{n++,x.getKhoanChi(),x.getDate(),x.getSoTien()});
        }
    }
    public void ViewTableQuanLyThuChi(){
        DefaultTableModel model = (DefaultTableModel) this.tableThuChi.getModel();
        model.setNumRows(0);
        int n =1;
        for(QuanLyThuChi x : qltc){
            model.addRow(new Object[]{n++,x.getTenKhoan(),x.getDate(),x.getSoTien()});
        }
    }
    public void ViewTableThongKeNguonThu(){
        DefaultTableModel model = (DefaultTableModel) this.tableThongKeNT.getModel();
        model.setNumRows(0);
        for(String x : tknt.keySet()){
            model.addRow(new Object[]{x,tknt.get(x)});
        }
    }
    public void ViewTableThongKeNguonChi(){
        DefaultTableModel model = (DefaultTableModel) this.tableThongKeNC.getModel();
        model.setNumRows(0);
        for(String x : tknc.keySet()){
            model.addRow(new Object[]{x,tknc.get(x)});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThuChi = new javax.swing.JTable();
        btn_huyTim = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_dateThu = new javax.swing.JTextField();
        txt_moneyThu = new javax.swing.JTextField();
        txt_tenNguonThu = new javax.swing.JTextField();
        btn_themKhoanThu = new javax.swing.JButton();
        btn_editThu = new javax.swing.JButton();
        btn_deleteThu = new javax.swing.JButton();
        btn_saveKhoanThu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableThu = new javax.swing.JTable();
        btn_huyThu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_dateChi = new javax.swing.JTextField();
        txt_tenNguonChi = new javax.swing.JTextField();
        txt_moneyChi = new javax.swing.JTextField();
        btn_themKhoanChi = new javax.swing.JButton();
        btn_editChi = new javax.swing.JButton();
        btn_deleteChi = new javax.swing.JButton();
        btn_saveKhoanChi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableChi = new javax.swing.JTable();
        btn_huyChi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableThongKeNT = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableThongKeNC = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuanLyThuChiCaNhan");

        jLabel1.setText("Tìm kiếm:");

        btn_timkiem.setText("Tìm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        tableThuChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tên khoản Thu/Chi", "Ngày", "Số tiền"
            }
        ));
        jScrollPane1.setViewportView(tableThuChi);

        btn_huyTim.setText("Hủy Tìm");
        btn_huyTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyTimActionPerformed(evt);
            }
        });

        btnSaveFile.setText("Save");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_timkiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_huyTim))
                    .addComponent(btnSaveFile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem)
                    .addComponent(btn_huyTim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnSaveFile)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Quản Lý Thu Chi", jPanel2);

        jLabel2.setText("Tên Nguồn Thu:");

        jLabel3.setText("Ngày/Tháng/Năm:");

        jLabel4.setText("Số Tiền:");

        txt_dateThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateThuActionPerformed(evt);
            }
        });

        txt_tenNguonThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenNguonThuActionPerformed(evt);
            }
        });

        btn_themKhoanThu.setText("Thêm");
        btn_themKhoanThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themKhoanThuActionPerformed(evt);
            }
        });

        btn_editThu.setText("Sửa");
        btn_editThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editThuActionPerformed(evt);
            }
        });

        btn_deleteThu.setText("Xóa");
        btn_deleteThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteThuActionPerformed(evt);
            }
        });

        btn_saveKhoanThu.setText("Lưu");
        btn_saveKhoanThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveKhoanThuActionPerformed(evt);
            }
        });

        tableThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tên Khoản Thu", "Ngày/Tháng/Năm", "Số Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableThu);
        if (tableThu.getColumnModel().getColumnCount() > 0) {
            tableThu.getColumnModel().getColumn(0).setResizable(false);
            tableThu.getColumnModel().getColumn(1).setResizable(false);
            tableThu.getColumnModel().getColumn(2).setResizable(false);
            tableThu.getColumnModel().getColumn(3).setResizable(false);
        }

        btn_huyThu.setText("Hủy");
        btn_huyThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_themKhoanThu, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_tenNguonThu)
                        .addComponent(txt_dateThu)
                        .addComponent(txt_moneyThu, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_editThu)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteThu)
                        .addGap(18, 18, 18)
                        .addComponent(btn_saveKhoanThu)
                        .addGap(18, 18, 18)
                        .addComponent(btn_huyThu)))
                .addContainerGap(157, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_tenNguonThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dateThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_moneyThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themKhoanThu)
                    .addComponent(btn_editThu)
                    .addComponent(btn_deleteThu)
                    .addComponent(btn_saveKhoanThu)
                    .addComponent(btn_huyThu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nguồn Thu", jPanel3);

        jLabel5.setText("Tên Nguồn Chi:");

        jLabel6.setText("Ngày/Tháng/Năm:");

        jLabel7.setText("Số Tiền:");

        txt_dateChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateChiActionPerformed(evt);
            }
        });

        txt_tenNguonChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenNguonChiActionPerformed(evt);
            }
        });

        txt_moneyChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_moneyChiActionPerformed(evt);
            }
        });

        btn_themKhoanChi.setText("Thêm");
        btn_themKhoanChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themKhoanChiActionPerformed(evt);
            }
        });

        btn_editChi.setText("Sửa");
        btn_editChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editChiActionPerformed(evt);
            }
        });

        btn_deleteChi.setText("Xóa");
        btn_deleteChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteChiActionPerformed(evt);
            }
        });

        btn_saveKhoanChi.setText("Lưu");
        btn_saveKhoanChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveKhoanChiActionPerformed(evt);
            }
        });

        tableChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tên Khoản Chi", "Ngày/Tháng/Năm", "Số Tiền"
            }
        ));
        tableChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableChi);

        btn_huyChi.setText("Hủy");
        btn_huyChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(btn_themKhoanChi))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_editChi)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteChi)
                        .addGap(18, 18, 18)
                        .addComponent(btn_saveKhoanChi)
                        .addGap(18, 18, 18)
                        .addComponent(btn_huyChi))
                    .addComponent(txt_tenNguonChi, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dateChi, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_moneyChi, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tenNguonChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dateChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_moneyChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themKhoanChi)
                    .addComponent(btn_editChi)
                    .addComponent(btn_deleteChi)
                    .addComponent(btn_saveKhoanChi)
                    .addComponent(btn_huyChi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nguồn Chi", jPanel1);

        jPanel4.setPreferredSize(new java.awt.Dimension(900, 912));

        tableThongKeNT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Khoản Thu", "Số Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableThongKeNT);

        tableThongKeNC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Khoản Chi", "Số Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableThongKeNC);

        jLabel10.setText("Thống Kê Nguồn Thu:");

        jLabel11.setText("Thống Kê Nguồn Chi:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Thống Kê", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_dateThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateThuActionPerformed
        // TODO add your handling code here:
        String date = txt_dateThu.getText();
        String reg = "^\\d{2}/\\d{2}/\\d{4}$";
        if(!date.matches(reg)){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
            txt_dateThu.requestFocus();
        }else{
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5));
            int year = Integer.parseInt(date.substring(6, 10));
            if(month <= 0 || month >12){
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
            }
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day <1 || day >31){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                }
            }else if(month == 2){
                if(day<1 || day >29){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                }
            }else if(month == 4 || month == 6 || month == 9 || month == 10){
                if(day<1 || day > 30){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                }
            }
        }
    }//GEN-LAST:event_txt_dateThuActionPerformed

    private void btn_saveKhoanThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveKhoanThuActionPerformed
        // TODO add your handling code here:
        String date = txt_dateThu.getText();
        String name = txt_tenNguonThu.getText();
        double money = 0;
        boolean checkmoney = true;
        boolean checkname = true;
        try{
            money = Double.parseDouble(txt_moneyThu.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nSố tiền: VND");
            checkmoney = false;
        }
        if(money < 1000){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nSố tiền phải lớn hơn 1000VND");
            checkmoney = false;
        }
        String reg = "^\\d{2}/\\d{2}/\\d{4}$";
        boolean checkdate = true;
        if(name.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Tên không được để trống");
            checkname = false;
        }
        if(!date.matches(reg)){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nNgày/Tháng/Năm: DD/MM/YYYY");
            checkdate = false;
        }else{
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5));
            int year = Integer.parseInt(date.substring(6, 10));
            if(month <= 0 || month >12){
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                checkdate = false;
            }
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day <1 || day >31){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                    checkdate = false;
                }
            }else if(month == 2){
                if(day<1 || day >29){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                    checkdate = false;
                }
            }else if(month == 4 || month == 6 || month == 9 || month == 10){
                if(day<1 || day > 30){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                    checkdate = false;
                }
            }
        }
        if(checkt == 1 && checkdate && checkmoney && checkname){
            nt.add(new NguonThu(date,money,name));
            qltc.add(new QuanLyThuChi(date, name, money));
            if(tknt.containsKey(name)){
                tknt.put(name, tknt.get(name) + money);
            }else{
                tknt.put(name, money);
            }
        }
        if(checkt == -1 && checkdate && checkmoney && checkname){
            nt.set(pos,new NguonThu(date, money, name));
            
            for(QuanLyThuChi x : qltc){
                if(x.getDate().equals(thuchi.getDate()) && x.getSoTien()==thuchi.getSoTien() && x.getTenKhoan().equals(thuchi.getTenKhoan())){
                    x.setDate(date);
                    x.setSoTien(money);
                    x.setTenKhoan(name);
                    break;
                }
            }
            if(tknt.containsKey(name)){
                if(name.equals(name_txt)){
                    tknt.put(name_txt,tknt.get(name_txt)+money-moneytam);
                }else{
                    tknt.put(name, tknt.get(name) + money);
                    tknt.put(name_txt,tknt.get(name_txt)- money);
                    if(tknt.get(name_txt) <= 0){
                        tknt.remove(name_txt);
                    }
                }   
            }else{
                tknt.put(name, money);
                tknt.put(name_txt,tknt.get(name_txt) - money);
                if(tknt.get(name_txt) <= 0){
                    tknt.remove(name_txt);
                }
            }
        }
        
        ViewThu();
        ViewTableThu();
        ViewTableQuanLyThuChi();
        ViewTableThongKeNguonThu();
        
    }//GEN-LAST:event_btn_saveKhoanThuActionPerformed

    private void btn_editThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editThuActionPerformed
        // TODO add your handling code here:
        checkt = -1;
        
        OnOffThu(false,true);
    }//GEN-LAST:event_btn_editThuActionPerformed

    private void txt_tenNguonChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenNguonChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenNguonChiActionPerformed

    private void tableThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThuMouseClicked
        pos = this.tableThu.getSelectedRow();
        moneytam = nt.get(pos).getSoTien();
        thuchi = new QuanLyThuChi(nt.get(pos).getDate(),nt.get(pos).getKhoanThu(),nt.get(pos).getSoTien());
        name_txt = nt.get(pos).getKhoanThu();
        ViewThu();    
    }//GEN-LAST:event_tableThuMouseClicked

    private void btn_themKhoanThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themKhoanThuActionPerformed
        // TODO add your handling code here:
        checkt = 1;
        this.txt_dateThu.setText("");
        this.txt_moneyThu.setText("");
        this.txt_tenNguonThu.setText("");
        OnOffThu(false, true);
        
    }//GEN-LAST:event_btn_themKhoanThuActionPerformed

    private void btn_huyThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyThuActionPerformed
        // TODO add your handling code here:
        ViewThu();
    }//GEN-LAST:event_btn_huyThuActionPerformed

    private void btn_deleteChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteChiActionPerformed
        // TODO add your handling code here:
        NguonChi test = nc.get(pos);
        nc.remove(pos);
        for(QuanLyThuChi tc : qltc){
            if(tc.getDate().equals(test.getDate()) && tc.getTenKhoan().equals(test.getKhoanChi()) && tc.getSoTien() == test.getSoTien()){
                qltc.remove(tc);
                break;
            }
        }
        tknc.put(test.getKhoanChi(), tknc.get(test.getKhoanChi()) - test.getSoTien());
        if(tknc.get(test.getKhoanChi()) <= 0){
            tknc.remove(test.getKhoanChi());
        }
        ViewTableChi();
        ViewTableQuanLyThuChi();
        ViewTableThongKeNguonChi();
    }//GEN-LAST:event_btn_deleteChiActionPerformed

    private void txt_dateChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateChiActionPerformed

    private void txt_moneyChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_moneyChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_moneyChiActionPerformed

    private void btn_themKhoanChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themKhoanChiActionPerformed
        // TODO add your handling code here:
        checkc = 1;
        this.txt_dateChi.setText("");
        this.txt_moneyChi.setText("");
        this.txt_tenNguonChi.setText("");
        OnOffChi(false, true);
    }//GEN-LAST:event_btn_themKhoanChiActionPerformed
    
    private void btn_saveKhoanChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveKhoanChiActionPerformed
        // TODO add your handling code here:
        String date = txt_dateChi.getText();
        String name = txt_tenNguonChi.getText();
        double money = 0;
        boolean checkmoney = true;
        boolean checkname = true;
        try{
            money = Double.parseDouble(txt_moneyChi.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nSố tiền: VND");
            checkmoney = false;
        }
        if(money <1000){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nSố tiền phải lớn hơn 1000VND");
            checkmoney = false;
        }
        String reg = "^\\d{2}/\\d{2}/\\d{4}$";
        boolean checkdate = true;
        if(name.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Tên không được để trống");
            checkname = false;
        }
        if(!date.matches(reg)){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nNgày/Tháng/Năm: DD/MM/YYYY");
            checkdate = false;
        }else{
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5));
            int year = Integer.parseInt(date.substring(6, 10));
            if(month <= 0 || month >12){
                JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                checkdate = false;
            }
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day <1 || day >31){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                    checkdate = false;
                }
            }else if(month == 2){
                if(day<1 || day >29){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                    checkdate = false;
                }
            }else if(month == 4 || month == 6 || month == 9 || month == 10){
                if(day<1 || day > 30){
                    JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng\nĐịnh dạng: DD/MM/YYYY");
                    checkdate = false;
                }
            }
        }
        if(checkc == 1 && checkdate && checkmoney && checkname){
            nc.add(new NguonChi(date, money, name));
            qltc.add(new QuanLyThuChi(date, name, money));
            if(tknc.containsKey(name)){
                tknc.put(name, tknc.get(name) + money);
            }else{
                tknc.put(name, money);
            }
        }
        if(checkc == -1 && checkdate && checkmoney && checkname){
            nc.set(pos,new NguonChi(date, money, name));
            for(QuanLyThuChi x : qltc){
                if(x.getDate().equals(thuchi.getDate()) && x.getSoTien()==thuchi.getSoTien() && x.getTenKhoan().equals(thuchi.getTenKhoan())){
                    x.setDate(date);
                    x.setSoTien(money);
                    x.setTenKhoan(name);
                    break;
                }
            }
            
            if(tknc.containsKey(name)){
                if(name.equals(name_txt)){
                    tknc.put(name_txt,tknc.get(name_txt)+money-moneytam);
                }else{
                    tknc.put(name, tknc.get(name) + money);
                    tknc.put(name_txt,tknc.get(name_txt)- money);
                    if(tknc.get(name_txt) <= 0){
                        tknc.remove(name_txt);
                    }
                }   
            }else{
                tknc.put(name, money);
                tknc.put(name_txt,tknc.get(name_txt) - money);
                if(tknc.get(name_txt) <= 0){
                    tknc.remove(name_txt);
                }
            }
        }
        ViewChi();
        ViewTableChi();
        ViewTableThongKeNguonChi();
        ViewTableQuanLyThuChi();
    }//GEN-LAST:event_btn_saveKhoanChiActionPerformed

    private void btn_deleteThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteThuActionPerformed
        // TODO add your handling code here:
        NguonThu test = nt.get(pos);
        nt.remove(pos);
        for(QuanLyThuChi tc : qltc){
            if(tc.getDate().equals(test.getDate()) && tc.getTenKhoan().equals(test.getKhoanThu()) && tc.getSoTien() == test.getSoTien()){
                qltc.remove(tc);
                break;
            }
        }
        tknt.put(test.getKhoanThu(), tknt.get(test.getKhoanThu()) - test.getSoTien());
        if(tknt.get(test.getKhoanThu()) <= 0){
            tknt.remove(test.getKhoanThu());
        }
        ViewTableThongKeNguonThu();
        ViewTableQuanLyThuChi();
        ViewTableThu();
    }//GEN-LAST:event_btn_deleteThuActionPerformed

    private void btn_huyChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyChiActionPerformed
        // TODO add your handling code here:
        ViewChi();
    }//GEN-LAST:event_btn_huyChiActionPerformed
    
    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) this.tableThuChi.getModel();
        String txtSearch = txtsearch.getText();
        Double t = 0.0;
        boolean checktien = true;
        try{
            t = Double.parseDouble(txtSearch);
        }catch(Exception e){
            checktien = false;
        }
        int soluongdong = model.getRowCount();
//        JOptionPane.showMessageDialog(tableThongKeNT, soluongdong);
        for(int i = 0;i < soluongdong;i++){
            String name = (String) model.getValueAt(i, 1);
            String date = (String) model.getValueAt(i, 2);
            Double money = (Double) model.getValueAt(i, 3);
            if(name.equals(txtSearch) || date.equals(txtSearch) ||(checktien && money == Double.parseDouble(txtSearch))){
                continue;
            }else{
                model.removeRow(i);
                i--;
                soluongdong--;
            }
        }
    }//GEN-LAST:event_btn_timkiemActionPerformed
    
    private void btn_huyTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyTimActionPerformed
        // TODO add your handling code here:
        ViewTableQuanLyThuChi();
    }//GEN-LAST:event_btn_huyTimActionPerformed

    private void txt_tenNguonThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenNguonThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenNguonThuActionPerformed

    private void tableChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChiMouseClicked
        // TODO add your handling code here:
        pos = this.tableChi.getSelectedRow();
        moneytam = nc.get(pos).getSoTien();
        thuchi = new QuanLyThuChi(nc.get(pos).getDate(),nc.get(pos).getKhoanChi(),nc.get(pos).getSoTien());
        name_txt = nc.get(pos).getKhoanChi();
        ViewChi();
        
    }//GEN-LAST:event_tableChiMouseClicked

    private void btn_editChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editChiActionPerformed
        // TODO add your handling code here:
        checkc = -1;
        
        OnOffChi(false, true);
    }//GEN-LAST:event_btn_editChiActionPerformed
    private void openFile(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream("data.dat");
            ois = new ObjectInputStream(fis);
            nt = (List<NguonThu>) ois.readObject();
            nc = (List<NguonChi>) ois.readObject();
            qltc = (List<QuanLyThuChi>) ois.readObject();
        }catch(FileNotFoundException e){
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if(ois != null && fis != null){
                    ois.close();
                    fis.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        // TODO add your handling code here:
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(nt);
            oos.writeObject(nc);
            oos.writeObject(qltc);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                oos.close();
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btnSaveFileActionPerformed

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
            java.util.logging.Logger.getLogger(GDThuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDThuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDThuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDThuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDThuChi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JButton btn_deleteChi;
    private javax.swing.JButton btn_deleteThu;
    private javax.swing.JButton btn_editChi;
    private javax.swing.JButton btn_editThu;
    private javax.swing.JButton btn_huyChi;
    private javax.swing.JButton btn_huyThu;
    private javax.swing.JButton btn_huyTim;
    private javax.swing.JButton btn_saveKhoanChi;
    private javax.swing.JButton btn_saveKhoanThu;
    private javax.swing.JButton btn_themKhoanChi;
    private javax.swing.JButton btn_themKhoanThu;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableChi;
    private javax.swing.JTable tableThongKeNC;
    private javax.swing.JTable tableThongKeNT;
    private javax.swing.JTable tableThu;
    private javax.swing.JTable tableThuChi;
    private javax.swing.JTextField txt_dateChi;
    private javax.swing.JTextField txt_dateThu;
    private javax.swing.JTextField txt_moneyChi;
    private javax.swing.JTextField txt_moneyThu;
    private javax.swing.JTextField txt_tenNguonChi;
    private javax.swing.JTextField txt_tenNguonThu;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
