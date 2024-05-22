/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailproject;

//import java.awt.Image;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ajymu
 */
public class CocktailJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CocktailJFrame
     */
    ArrayList<Ingredients> ingredients = new ArrayList();
    Cocktail drink = new Cocktail();
    String List[] = new String[ingredients.size()];

    public CocktailJFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTime();
        scaleAppleImage();
        scaleBananaImage();
        scaleKiwiImage();
        scaleMangoImage();
        scaleStrawberryImage();
        scalePineappleImage();
        scaleBlueberryImage();
        scaleCowsMilkImage();
        scaleAlmondImage();
        scaleCocoImage();
        scaleLacImage();
        scaleNutsImage();
        scaleChocoImage();
        scaleHoneyImage();
    }

    public void displayList() {

        String List[] = new String[ingredients.size()];
        for (int i = 0; i < ingredients.size(); i++) {
            Ingredients ing = ingredients.get(i);
            List[i] = ing.getName();
        }
        ingredientsList1.setListData(List);
    }

    public void scaleAppleImage() {
        ImageIcon apple = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\apple pp.png");
        Image imgapple = apple.getImage();
        Image imgapplescale = imgapple.getScaledInstance(appleLabel5.getWidth(), appleLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedappleicon = new ImageIcon(imgapplescale);
        appleLabel5.setIcon(selectedappleicon);
    }

    public void scaleBananaImage() {
        ImageIcon banana = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\banana pp.png");
        Image imgbanana = banana.getImage();
        Image imgbananascale = imgbanana.getScaledInstance(bananaLabel6.getWidth(), bananaLabel6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedbananaicon = new ImageIcon(imgbananascale);
        bananaLabel6.setIcon(selectedbananaicon);
    }

    public void scaleKiwiImage() {
        ImageIcon kiwi = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\kiwi pp.png");
        Image imgkiwi = kiwi.getImage();
        Image imgkiwiscale = imgkiwi.getScaledInstance(kiwiLabel7.getWidth(), kiwiLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedkiwiicon = new ImageIcon(imgkiwiscale);
        kiwiLabel7.setIcon(selectedkiwiicon);
    }

    public void scaleMangoImage() {
        ImageIcon mango = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\mango p.png");
        Image imgmango = mango.getImage();
        Image imgmangoscale = imgmango.getScaledInstance(mangoLabel9.getWidth(), mangoLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedmangoicon = new ImageIcon(imgmangoscale);
        mangoLabel9.setIcon(selectedmangoicon);
    }

    public void scaleStrawberryImage() {
        ImageIcon strawberry = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\straw p.png");
        Image imgstrawberry = strawberry.getImage();
        Image imgstrawberryscale = imgstrawberry.getScaledInstance(strawberryLabel6.getWidth(), strawberryLabel6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedstrawberryicon = new ImageIcon(imgstrawberryscale);
        strawberryLabel6.setIcon(selectedstrawberryicon);
    }

    public void scalePineappleImage() {
        ImageIcon pine = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\pine pp.png");
        Image imgpine = pine.getImage();
        Image imgpinescale = imgpine.getScaledInstance(pineappleLabel7.getWidth(), pineappleLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedpineicon = new ImageIcon(imgpinescale);
        pineappleLabel7.setIcon(selectedpineicon);
    }

    public void scaleBlueberryImage() {
        ImageIcon blue = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\blue p.png");
        Image imgblue = blue.getImage();
        Image imgbluescale = imgblue.getScaledInstance(blueberryLabel9.getWidth(), blueberryLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedblueicon = new ImageIcon(imgbluescale);
        blueberryLabel9.setIcon(selectedblueicon);
    }

    public void scaleCowsMilkImage() {
        ImageIcon cmilk = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\milk p.png");
        Image imgcmilk = cmilk.getImage();
        Image imgcmilkscale = imgcmilk.getScaledInstance(cmilkLabel11.getWidth(), cmilkLabel11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedcmilkicon = new ImageIcon(imgcmilkscale);
        cmilkLabel11.setIcon(selectedcmilkicon);
    }

    public void scaleAlmondImage() {
        ImageIcon almond = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\almond p.png");
        Image imgalmond = almond.getImage();
        Image imgalmondscale = imgalmond.getScaledInstance(almondmilkLabel12.getWidth(), almondmilkLabel12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedalmondicon = new ImageIcon(imgalmondscale);
        almondmilkLabel12.setIcon(selectedalmondicon);
    }

    public void scaleCocoImage() {
        ImageIcon coco = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\coco p.png");
        Image imgcoco = coco.getImage();
        Image imgcocoscale = imgcoco.getScaledInstance(cocomilkLabel13.getWidth(), cocomilkLabel13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedcocoicon = new ImageIcon(imgcocoscale);
        cocomilkLabel13.setIcon(selectedcocoicon);
    }

    public void scaleLacImage() {
        ImageIcon lac = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\lac ppp.png");
        Image imglac = lac.getImage();
        Image imglacscale = imglac.getScaledInstance(lacmilkLabel14.getWidth(), lacmilkLabel14.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedlacicon = new ImageIcon(imglacscale);
        lacmilkLabel14.setIcon(selectedlacicon);
    }

    public void scaleNutsImage() {
        ImageIcon nut = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\nuts p.jpg");
        Image imgnut = nut.getImage();
        Image imgnutscale = imgnut.getScaledInstance(nutsLabel15.getWidth(), nutsLabel15.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectednuticon = new ImageIcon(imgnutscale);
        nutsLabel15.setIcon(selectednuticon);
    }

    public void scaleChocoImage() {
        ImageIcon choco = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\choco.png");
        Image imgchoco = choco.getImage();
        Image imgchocoscale = imgchoco.getScaledInstance(chocolateLabel18.getWidth(), chocolateLabel18.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedchocoicon = new ImageIcon(imgchocoscale);
        chocolateLabel18.setIcon(selectedchocoicon);
    }

    public void scaleHoneyImage() {
        ImageIcon honey = new ImageIcon("C:\\Users\\ajymu\\Desktop\\java images\\sugar p.png");
        Image imghoney = honey.getImage();
        Image imghoneyscale = imghoney.getScaledInstance(honeyLabel17.getWidth(), honeyLabel17.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedhoneyicon = new ImageIcon(imghoneyscale);
        honeyLabel17.setIcon(selectedhoneyicon);
    }

    public void setTime() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CocktailJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE ,dd-MM-YY");
                    String time = tf.format(date);
                    jTxTime1.setText(time.split(" ")[0] + " " + time.split(" ")[1] + " ");
                    jTxDate.setText(df.format(date));

                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        applePanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        appleButton1 = new javax.swing.JButton();
        appleLabel5 = new javax.swing.JLabel();
        bananaPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bananaButton2 = new javax.swing.JButton();
        bananaLabel6 = new javax.swing.JLabel();
        kiwiPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kiwiButton3 = new javax.swing.JButton();
        kiwiLabel7 = new javax.swing.JLabel();
        mangoPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mangoButton5 = new javax.swing.JButton();
        mangoLabel9 = new javax.swing.JLabel();
        strawberryPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        strawberryButton2 = new javax.swing.JButton();
        strawberryLabel6 = new javax.swing.JLabel();
        pineapplePanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pineappleButton3 = new javax.swing.JButton();
        pineappleLabel7 = new javax.swing.JLabel();
        blueberryPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        blueberryButton5 = new javax.swing.JButton();
        blueberryLabel9 = new javax.swing.JLabel();
        cmilkPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmilkButton7 = new javax.swing.JButton();
        cmilkLabel11 = new javax.swing.JLabel();
        almondmilkPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        almondmilkButton8 = new javax.swing.JButton();
        almondmilkLabel12 = new javax.swing.JLabel();
        cocomilkPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cocomilkButton9 = new javax.swing.JButton();
        cocomilkLabel13 = new javax.swing.JLabel();
        lacmilkPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lacmilkButton10 = new javax.swing.JButton();
        lacmilkLabel14 = new javax.swing.JLabel();
        NutsPanel13 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        nutsButton11 = new javax.swing.JButton();
        nutsLabel15 = new javax.swing.JLabel();
        HoneyPanel15 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        sugarButton13 = new javax.swing.JButton();
        honeyLabel17 = new javax.swing.JLabel();
        chocolatePanel16 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        chocoButton14 = new javax.swing.JButton();
        chocolateLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientsList1 = new javax.swing.JList<>();
        removeButton1 = new javax.swing.JButton();
        MixButton2 = new javax.swing.JButton();
        pourButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxDate = new javax.swing.JLabel();
        jTxTime1 = new javax.swing.JLabel();
        ResetButton4 = new javax.swing.JButton();
        ExitButton2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cocktail machine ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 226));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(152, 87, 0));
        jLabel2.setText("  Menu Items :  ");

        applePanel3.setBackground(new java.awt.Color(255, 255, 226));
        applePanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Calories : 95cal ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Quantity : 182g");

        appleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appleButton1.setText("Add");
        appleButton1.setToolTipText("if you wanna to add this item , click add");
        appleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        appleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout applePanel3Layout = new javax.swing.GroupLayout(applePanel3);
        applePanel3.setLayout(applePanel3Layout);
        applePanel3Layout.setHorizontalGroup(
            applePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applePanel3Layout.createSequentialGroup()
                .addGroup(applePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(applePanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(applePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(appleLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(applePanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(appleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        applePanel3Layout.setVerticalGroup(
            applePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applePanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appleLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        bananaPanel4.setBackground(new java.awt.Color(255, 255, 226));
        bananaPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Calories : 90cal ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Quantity : 100g");

        bananaButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bananaButton2.setText("Add");
        bananaButton2.setToolTipText("if you wanna to add this item , click add");
        bananaButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bananaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bananaPanel4Layout = new javax.swing.GroupLayout(bananaPanel4);
        bananaPanel4.setLayout(bananaPanel4Layout);
        bananaPanel4Layout.setHorizontalGroup(
            bananaPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bananaPanel4Layout.createSequentialGroup()
                .addGroup(bananaPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bananaPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(bananaPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(bananaLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bananaPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bananaButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        bananaPanel4Layout.setVerticalGroup(
            bananaPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bananaPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bananaLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bananaButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        kiwiPanel5.setBackground(new java.awt.Color(255, 255, 226));
        kiwiPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Calories : 61cal ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Quantity : 80g");

        kiwiButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kiwiButton3.setText("Add");
        kiwiButton3.setToolTipText("if you wanna to add this item , click add");
        kiwiButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kiwiButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiwiButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kiwiPanel5Layout = new javax.swing.GroupLayout(kiwiPanel5);
        kiwiPanel5.setLayout(kiwiPanel5Layout);
        kiwiPanel5Layout.setHorizontalGroup(
            kiwiPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kiwiPanel5Layout.createSequentialGroup()
                .addGroup(kiwiPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kiwiPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(kiwiPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(kiwiLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kiwiPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(kiwiButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        kiwiPanel5Layout.setVerticalGroup(
            kiwiPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kiwiPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kiwiLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kiwiButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        mangoPanel7.setBackground(new java.awt.Color(255, 255, 226));
        mangoPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Calories : 143cal ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Quantity : 220g");

        mangoButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mangoButton5.setText("Add");
        mangoButton5.setToolTipText("if you wanna to add this item , click add");
        mangoButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mangoButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangoButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mangoPanel7Layout = new javax.swing.GroupLayout(mangoPanel7);
        mangoPanel7.setLayout(mangoPanel7Layout);
        mangoPanel7Layout.setHorizontalGroup(
            mangoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mangoPanel7Layout.createSequentialGroup()
                .addGroup(mangoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mangoPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mangoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mangoLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mangoPanel7Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(mangoButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        mangoPanel7Layout.setVerticalGroup(
            mangoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mangoPanel7Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(mangoLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mangoButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        strawberryPanel4.setBackground(new java.awt.Color(255, 255, 226));
        strawberryPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Calories : 7cal ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Quantity : 21g");

        strawberryButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        strawberryButton2.setText("Add");
        strawberryButton2.setToolTipText("if you wanna to add this item , click add");
        strawberryButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        strawberryButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout strawberryPanel4Layout = new javax.swing.GroupLayout(strawberryPanel4);
        strawberryPanel4.setLayout(strawberryPanel4Layout);
        strawberryPanel4Layout.setHorizontalGroup(
            strawberryPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(strawberryPanel4Layout.createSequentialGroup()
                .addGroup(strawberryPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(strawberryPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(strawberryPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(strawberryLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(strawberryPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(strawberryButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        strawberryPanel4Layout.setVerticalGroup(
            strawberryPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, strawberryPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(strawberryLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(strawberryButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pineapplePanel5.setBackground(new java.awt.Color(255, 255, 226));
        pineapplePanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Calories : 79cal ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Quantity : 165g");

        pineappleButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pineappleButton3.setText("Add");
        pineappleButton3.setToolTipText("if you wanna to add this item , click add");
        pineappleButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pineappleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pineappleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pineapplePanel5Layout = new javax.swing.GroupLayout(pineapplePanel5);
        pineapplePanel5.setLayout(pineapplePanel5Layout);
        pineapplePanel5Layout.setHorizontalGroup(
            pineapplePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pineapplePanel5Layout.createSequentialGroup()
                .addGroup(pineapplePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pineapplePanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pineapplePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(pineappleLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pineapplePanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(pineappleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pineapplePanel5Layout.setVerticalGroup(
            pineapplePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pineapplePanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pineappleLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pineappleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        blueberryPanel7.setBackground(new java.awt.Color(255, 255, 226));
        blueberryPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Calories : 4cal ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Quantity : 2g");

        blueberryButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blueberryButton5.setText("Add");
        blueberryButton5.setToolTipText("if you wanna to add this item , click add");
        blueberryButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blueberryButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueberryButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blueberryPanel7Layout = new javax.swing.GroupLayout(blueberryPanel7);
        blueberryPanel7.setLayout(blueberryPanel7Layout);
        blueberryPanel7Layout.setHorizontalGroup(
            blueberryPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueberryPanel7Layout.createSequentialGroup()
                .addGroup(blueberryPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blueberryPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(blueberryPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)))
                    .addGroup(blueberryPanel7Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(blueberryButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blueberryPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(blueberryLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        blueberryPanel7Layout.setVerticalGroup(
            blueberryPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueberryPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blueberryLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueberryButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        cmilkPanel9.setBackground(new java.awt.Color(255, 255, 226));
        cmilkPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Calories : 155cal ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Quantity : 250ml");

        cmilkButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmilkButton7.setText("Add");
        cmilkButton7.setToolTipText("if you wanna to add this item , click add");
        cmilkButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmilkButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmilkButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cmilkPanel9Layout = new javax.swing.GroupLayout(cmilkPanel9);
        cmilkPanel9.setLayout(cmilkPanel9Layout);
        cmilkPanel9Layout.setHorizontalGroup(
            cmilkPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmilkPanel9Layout.createSequentialGroup()
                .addGroup(cmilkPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cmilkPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(cmilkPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)))
                    .addGroup(cmilkPanel9Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmilkButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cmilkPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmilkLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cmilkPanel9Layout.setVerticalGroup(
            cmilkPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cmilkPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmilkLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmilkButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        almondmilkPanel10.setBackground(new java.awt.Color(255, 255, 226));
        almondmilkPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Calories : 45cal ");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Quantity : 250ml");

        almondmilkButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        almondmilkButton8.setText("Add");
        almondmilkButton8.setToolTipText("if you wanna to add this item , click add");
        almondmilkButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        almondmilkButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almondmilkButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout almondmilkPanel10Layout = new javax.swing.GroupLayout(almondmilkPanel10);
        almondmilkPanel10.setLayout(almondmilkPanel10Layout);
        almondmilkPanel10Layout.setHorizontalGroup(
            almondmilkPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(almondmilkPanel10Layout.createSequentialGroup()
                .addGroup(almondmilkPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(almondmilkPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(almondmilkPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(almondmilkLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(almondmilkPanel10Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(almondmilkButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        almondmilkPanel10Layout.setVerticalGroup(
            almondmilkPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, almondmilkPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(almondmilkLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(almondmilkButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        cocomilkPanel11.setBackground(new java.awt.Color(255, 255, 226));
        cocomilkPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Calories : 440 ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Quantity : 250ml");

        cocomilkButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cocomilkButton9.setText("Add");
        cocomilkButton9.setToolTipText("if you wanna to add this item , click add");
        cocomilkButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cocomilkButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocomilkButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cocomilkPanel11Layout = new javax.swing.GroupLayout(cocomilkPanel11);
        cocomilkPanel11.setLayout(cocomilkPanel11Layout);
        cocomilkPanel11Layout.setHorizontalGroup(
            cocomilkPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cocomilkPanel11Layout.createSequentialGroup()
                .addGroup(cocomilkPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cocomilkPanel11Layout.createSequentialGroup()
                        .addGroup(cocomilkPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cocomilkPanel11Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(cocomilkPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)))
                            .addGroup(cocomilkPanel11Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(cocomilkButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cocomilkPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cocomilkLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cocomilkPanel11Layout.setVerticalGroup(
            cocomilkPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cocomilkPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cocomilkLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cocomilkButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        lacmilkPanel12.setBackground(new java.awt.Color(255, 255, 226));
        lacmilkPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Calories : 124cal ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Quantity : 250ml");

        lacmilkButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lacmilkButton10.setText("Add");
        lacmilkButton10.setToolTipText("if you wanna to add this item , click add");
        lacmilkButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lacmilkButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacmilkButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lacmilkPanel12Layout = new javax.swing.GroupLayout(lacmilkPanel12);
        lacmilkPanel12.setLayout(lacmilkPanel12Layout);
        lacmilkPanel12Layout.setHorizontalGroup(
            lacmilkPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lacmilkPanel12Layout.createSequentialGroup()
                .addGroup(lacmilkPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lacmilkPanel12Layout.createSequentialGroup()
                        .addGroup(lacmilkPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lacmilkPanel12Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(lacmilkPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)))
                            .addGroup(lacmilkPanel12Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lacmilkButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(lacmilkPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lacmilkLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lacmilkPanel12Layout.setVerticalGroup(
            lacmilkPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lacmilkPanel12Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lacmilkLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lacmilkButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        NutsPanel13.setBackground(new java.awt.Color(255, 255, 226));
        NutsPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Calories : 121cal ");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Quantity : 20g");

        nutsButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nutsButton11.setText("Add");
        nutsButton11.setToolTipText("if you wanna to add this item , click add");
        nutsButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nutsButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NutsPanel13Layout = new javax.swing.GroupLayout(NutsPanel13);
        NutsPanel13.setLayout(NutsPanel13Layout);
        NutsPanel13Layout.setHorizontalGroup(
            NutsPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutsPanel13Layout.createSequentialGroup()
                .addGroup(NutsPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NutsPanel13Layout.createSequentialGroup()
                        .addGroup(NutsPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NutsPanel13Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(NutsPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31)))
                            .addGroup(NutsPanel13Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(nutsButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NutsPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nutsLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        NutsPanel13Layout.setVerticalGroup(
            NutsPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NutsPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nutsLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutsButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        HoneyPanel15.setBackground(new java.awt.Color(255, 255, 226));
        HoneyPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Calories : 16cal ");

        sugarButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sugarButton13.setText("Add");
        sugarButton13.setToolTipText("if you wanna to add this item , click add");
        sugarButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sugarButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugarButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HoneyPanel15Layout = new javax.swing.GroupLayout(HoneyPanel15);
        HoneyPanel15.setLayout(HoneyPanel15Layout);
        HoneyPanel15Layout.setHorizontalGroup(
            HoneyPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoneyPanel15Layout.createSequentialGroup()
                .addGroup(HoneyPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoneyPanel15Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sugarButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoneyPanel15Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(HoneyPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(honeyLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        HoneyPanel15Layout.setVerticalGroup(
            HoneyPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoneyPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(honeyLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(sugarButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        chocolatePanel16.setBackground(new java.awt.Color(255, 255, 226));
        chocolatePanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 87, 0)));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Calories : 70cal ");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Quantity : 25g");

        chocoButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chocoButton14.setText("Add");
        chocoButton14.setToolTipText("if you wanna to add this item , click add");
        chocoButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chocoButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chocolatePanel16Layout = new javax.swing.GroupLayout(chocolatePanel16);
        chocolatePanel16.setLayout(chocolatePanel16Layout);
        chocolatePanel16Layout.setHorizontalGroup(
            chocolatePanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chocolatePanel16Layout.createSequentialGroup()
                .addGroup(chocolatePanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chocolatePanel16Layout.createSequentialGroup()
                        .addGroup(chocolatePanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chocolatePanel16Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(chocolatePanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37)))
                            .addGroup(chocolatePanel16Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(chocoButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(chocolatePanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chocolateLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        chocolatePanel16Layout.setVerticalGroup(
            chocolatePanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chocolatePanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chocolateLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chocoButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        ingredientsList1.setBackground(new java.awt.Color(255, 251, 226));
        ingredientsList1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 0), 1, true), "Your Ingredients List : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 24), new java.awt.Color(153, 102, 0))); // NOI18N
        ingredientsList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ingredientsList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ingredientsList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ingredientsList1);

        removeButton1.setBackground(new java.awt.Color(153, 102, 0));
        removeButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        removeButton1.setForeground(new java.awt.Color(255, 255, 204));
        removeButton1.setText("Remove");
        removeButton1.setToolTipText("if you want to remove any item of the list , clicl remove");
        removeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButton1ActionPerformed(evt);
            }
        });

        MixButton2.setBackground(new java.awt.Color(153, 102, 0));
        MixButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        MixButton2.setForeground(new java.awt.Color(255, 255, 204));
        MixButton2.setText("Mix");
        MixButton2.setToolTipText("if you want to remove any item of the list , clicl remove");
        MixButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MixButton2ActionPerformed(evt);
            }
        });

        pourButton1.setBackground(new java.awt.Color(153, 102, 0));
        pourButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        pourButton1.setForeground(new java.awt.Color(255, 255, 204));
        pourButton1.setText("Pour");
        pourButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pourButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 87, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cocktail Machine ... Welcome");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 87, 0), 2));

        jTxDate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTxDate.setForeground(new java.awt.Color(153, 102, 0));

        jTxTime1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTxTime1.setForeground(new java.awt.Color(153, 102, 0));

        ResetButton4.setBackground(new java.awt.Color(153, 102, 0));
        ResetButton4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ResetButton4.setForeground(new java.awt.Color(255, 255, 204));
        ResetButton4.setText("Reset");
        ResetButton4.setToolTipText("if you want to remove any item of the list , clicl remove");
        ResetButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton4ActionPerformed(evt);
            }
        });

        ExitButton2.setBackground(new java.awt.Color(153, 102, 0));
        ExitButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ExitButton2.setForeground(new java.awt.Color(255, 255, 204));
        ExitButton2.setText("Exit");
        ExitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 524, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1122, 1122, 1122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(applePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmilkPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bananaPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(kiwiPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mangoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lacmilkPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(almondmilkPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cocomilkPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(strawberryPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chocolatePanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pineapplePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HoneyPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NutsPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueberryPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MixButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(removeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ResetButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pourButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1538, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1109, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1234, 1234, 1234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pineapplePanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(strawberryPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mangoPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kiwiPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bananaPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(applePanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blueberryPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NutsPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HoneyPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chocolatePanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(almondmilkPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lacmilkPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmilkPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cocomilkPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MixButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pourButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(ExitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleButton1ActionPerformed
        // TODO add your handling code here:
        Ingredients apple = new Fruits("Apple", 95, 1, 182, new DColor(255, 0, 0));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(apple);
            ingredients.add(apple);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
        drink.blender.setList(drink.ingredients);
    }//GEN-LAST:event_appleButton1ActionPerformed

    private void bananaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaButton2ActionPerformed
        // TODO add your handling code here:
        Ingredients banana = new Fruits("Banana", 90, 1, 100, new DColor(255, 223, 43));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(banana);
            ingredients.add(banana);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bananaButton2ActionPerformed

    private void kiwiButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiwiButton3ActionPerformed
        // TODO add your handling code here:
        Ingredients kiwi = new Fruits("kiwi", 61, 1, 80, new DColor(162, 165, 104));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(kiwi);
            ingredients.add(kiwi);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kiwiButton3ActionPerformed

    private void mangoButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangoButton5ActionPerformed
        // TODO add your handling code here:
        Ingredients mango = new Fruits("Mango", 143, 3, 220, new DColor(255, 87, 51));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(mango);
            ingredients.add(mango);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mangoButton5ActionPerformed

    private void strawberryButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberryButton2ActionPerformed
        // TODO add your handling code here:
        Ingredients strawberry = new Fruits("Strawberry", 7, 1, 21, new DColor(252, 90, 141));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(strawberry);
            ingredients.add(strawberry);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_strawberryButton2ActionPerformed

    private void pineappleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pineappleButton3ActionPerformed
        // TODO add your handling code here:
        Ingredients pineapple = new Fruits("pineapple", 79, 4, 165, new DColor(254, 234, 99));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(pineapple);
            ingredients.add(pineapple);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pineappleButton3ActionPerformed

    private void blueberryButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueberryButton5ActionPerformed
        // TODO add your handling code here:
        Ingredients blueberry = new Fruits("Blueberry", 4, 1, 3, new DColor(79, 134, 247));
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(blueberry);
            ingredients.add(blueberry);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_blueberryButton5ActionPerformed

    private void cmilkButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmilkButton7ActionPerformed
        // TODO add your handling code here:
        Ingredients milk = new Milk();
        milk = new Milk(" Cow's Milk", 155, milk.getVolume(), 2);
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(milk);
            ingredients.add(milk);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmilkButton7ActionPerformed

    private void almondmilkButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almondmilkButton8ActionPerformed
        // TODO add your handling code here:
        Ingredients almondmilk = new Milk();
        almondmilk = new Milk("Almond Milk", 45, almondmilk.getVolume(), 4);
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(almondmilk);
            ingredients.add(almondmilk);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_almondmilkButton8ActionPerformed

    private void cocomilkButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocomilkButton9ActionPerformed
        // TODO add your handling code here:
        Ingredients coconutmilk = new Milk();
        coconutmilk = new Milk("Coconut Milk", 440, coconutmilk.getVolume(), 4);
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(coconutmilk);
            ingredients.add(coconutmilk);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cocomilkButton9ActionPerformed

    private void lacmilkButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacmilkButton10ActionPerformed
        // TODO add your handling code here:
        Ingredients lacmilk = new Milk();
        lacmilk = new Milk("Lactose-free Milk", 124, lacmilk.getVolume(), 7);
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(lacmilk);
            ingredients.add(lacmilk);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lacmilkButton10ActionPerformed

    private void nutsButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsButton11ActionPerformed
        // TODO add your handling code here:
        Ingredients nut = new Nuts();
        nut = new Nuts("Nuts ", 121, nut.getPrice(), nut.getVolume(), nut.getColor());
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(nut);
            ingredients.add(nut);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nutsButton11ActionPerformed

    private void sugarButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugarButton13ActionPerformed
        // TODO add your handling code here:
        Sugar sugar = new Sugar();
        sugar = new Sugar("Sugar", 16, sugar.getPrice(), sugar.getVolume(), sugar.getColor());
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(sugar);
            ingredients.add(sugar);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sugarButton13ActionPerformed

    private void chocoButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoButton14ActionPerformed
        // TODO add your handling code here:
        Ingredients seryp = new ChocolateSerup();
        seryp = new ChocolateSerup("Chocolate seryp", 70, seryp.getPrice(), seryp.getVolume(), seryp.getColor());
        drink.blender.setList(drink.ingredients);
        try {
            drink.blender.add(seryp);
            ingredients.add(seryp);
            displayList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + drink.blender.getRemainedcapacity() + " Add another ingredients << one or more >> that suits the remain capacity OR click Mix the ingredients have been chosen", "Blender Is Over Flow ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_chocoButton14ActionPerformed

    private void removeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButton1ActionPerformed
        // TODO add your handling code here:
        int index = ingredientsList1.getSelectedIndex();
        if (index != -1) {
            ingredients.remove(index);
            displayList();
        } else {
            JOptionPane.showMessageDialog(this, " You Must Select an Ingredient From the List to Remove it ", "Warning ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeButton1ActionPerformed

    private void MixButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MixButton2ActionPerformed
        // TODO add your handling code here:
        try {
            drink.blender.blend(drink.ingredients);
            JOptionPane.showMessageDialog(this, "Ingredients Have been Mixed Succssesfully ! \n \n Now Click Pour Button ", "Succsses", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), " Blender Is Empty  ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MixButton2ActionPerformed

    private void ingredientsList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ingredientsList1ValueChanged
        // TODO add your handling code here:
        int index = ingredientsList1.getSelectedIndex();
    }//GEN-LAST:event_ingredientsList1ValueChanged

    private void pourButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pourButton1ActionPerformed
        // TODO add your handling code here:

        if (ingredients.isEmpty() || drink.blender.getCalPerMl() == 0) {
            JOptionPane.showMessageDialog(this, " You must to click Mix before Pour ", "Warning ", JOptionPane.OK_OPTION);
        } else {
            String size[] = {"Small", "Medium", "Large"};
            JComboBox cb = new JComboBox(size);
            int input;
            input = JOptionPane.showConfirmDialog(this, cb, "Select the Size you need ", JOptionPane.DEFAULT_OPTION);
            if (input == JOptionPane.OK_OPTION) {
                String str = (String) cb.getSelectedItem();
                if (str.equalsIgnoreCase("Small")) {
                    Cup small = new Cup();
                    small = new Cup(200, (int) (drink.blender.getCalPerMl() * 200));
                    try {
                        drink.blender.pour(small);
                        int res = JOptionPane.showConfirmDialog(this, "The Whole Amount has " + (int) (drink.blender.getTotalvolume() * drink.blender.getCalPerMl()) + " Cal" + "\n \n The Quantitiy can pour " + drink.blender.getCupsnum() + " Cups of Size " + small.getCapacity() + " ml " + " \n\n The Calories in Each Cup = " + small.getCalories() + "Cal " + " \n\n Each Cup Price = " + drink.blender.getPrice()
                                + "NIS" + " \n \n  The Remain Quantity = " + drink.blender.getTotalvolume() + " ml" + "\n \n The Calories in this quantity = " + small.getCalories() + " Cal ", "Your Drink Info ", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (res == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(this, " Drink Poured into Cups Succssesfully !", "Succsses", JOptionPane.PLAIN_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                } else if (str.equalsIgnoreCase("Medium")) {
                    Cup med = new Cup();
                    med = new Cup(400, (int) (drink.blender.getCalPerMl() * 400));
                    try {
                        drink.blender.pour(med);
                        int res2 = JOptionPane.showConfirmDialog(this, "The Whole Amount has " + (int) (drink.blender.getTotalvolume() * drink.blender.getCalPerMl()) + " Cal" + "\n \n The Quantitiy can pour " + drink.blender.getCupsnum() + " Cups of Size " + med.getCapacity() + " ml " + " \n\n The Calories in Each Cup = " + med.getCalories() + "Cal " + " \n\n Each Cup Price = " + drink.blender.getPrice()
                                + "NIS" + " \n \n  The Remain Quantity = " + drink.blender.getTotalvolume() + " ml" + "\n \n The Calories in this quantity = " + med.getCalories() + " Cal ", "Your Drink Info ", JOptionPane.YES_NO_OPTION);
                        if (res2 == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(this, "Drink Poured into Cups Succssesfully !", " Succsses", JOptionPane.PLAIN_MESSAGE);

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                } else if (str.equalsIgnoreCase("Large")) {
                    Cup large = new Cup();
                    large = new Cup(600, (int) (drink.blender.getCalPerMl() * 600));
                    try {
                        drink.blender.pour(large);
                        int res3 = JOptionPane.showConfirmDialog(this, "The Whole Amount has " + (int) (drink.blender.getTotalvolume() * drink.blender.getCalPerMl()) + " Cal" + "\n \n The Quantitiy can pour " + drink.blender.getCupsnum() + " Cups of Size " + large.getCapacity() + " ml " + " \n\n The Calories in Each Cup = " + large.getCalories() + "Cal " + " \n\n Each Cup Price = " + drink.blender.getPrice()
                                + "NIS" + " \n \n  The Remain Quantity = " + drink.blender.getTotalvolume() + " ml" + "\n \n The Calories in this quantity = " + large.getCalories() + " Cal ", "Your Drink Info ", JOptionPane.YES_NO_OPTION);
                        if (res3 == JOptionPane.YES_OPTION) {

                            JOptionPane.showMessageDialog(this, "Drink Poured into Cups Succssesfully !", "Succsses ", JOptionPane.PLAIN_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_pourButton1ActionPerformed

    private void ResetButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton4ActionPerformed
        // TODO add your handling code here:
        ingredients.clear();
        drink.blender.getList().clear();
        displayList();
    }//GEN-LAST:event_ResetButton4ActionPerformed

    private void ExitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButton2ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do You Really Want to Exit From the Application ? ", " Warning ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_ExitButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CocktailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CocktailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CocktailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CocktailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CocktailJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton2;
    private javax.swing.JPanel HoneyPanel15;
    private javax.swing.JButton MixButton2;
    private javax.swing.JPanel NutsPanel13;
    private javax.swing.JButton ResetButton4;
    private javax.swing.JButton almondmilkButton8;
    private javax.swing.JLabel almondmilkLabel12;
    private javax.swing.JPanel almondmilkPanel10;
    private javax.swing.JButton appleButton1;
    private javax.swing.JLabel appleLabel5;
    private javax.swing.JPanel applePanel3;
    private javax.swing.JButton bananaButton2;
    private javax.swing.JLabel bananaLabel6;
    private javax.swing.JPanel bananaPanel4;
    private javax.swing.JButton blueberryButton5;
    private javax.swing.JLabel blueberryLabel9;
    private javax.swing.JPanel blueberryPanel7;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton chocoButton14;
    private javax.swing.JLabel chocolateLabel18;
    private javax.swing.JPanel chocolatePanel16;
    private javax.swing.JButton cmilkButton7;
    private javax.swing.JLabel cmilkLabel11;
    private javax.swing.JPanel cmilkPanel9;
    private javax.swing.JButton cocomilkButton9;
    private javax.swing.JLabel cocomilkLabel13;
    private javax.swing.JPanel cocomilkPanel11;
    private javax.swing.JLabel honeyLabel17;
    private javax.swing.JList<String> ingredientsList1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTxDate;
    private javax.swing.JLabel jTxTime1;
    private javax.swing.JButton kiwiButton3;
    private javax.swing.JLabel kiwiLabel7;
    private javax.swing.JPanel kiwiPanel5;
    private javax.swing.JButton lacmilkButton10;
    private javax.swing.JLabel lacmilkLabel14;
    private javax.swing.JPanel lacmilkPanel12;
    private javax.swing.JButton mangoButton5;
    private javax.swing.JLabel mangoLabel9;
    private javax.swing.JPanel mangoPanel7;
    private javax.swing.JButton nutsButton11;
    private javax.swing.JLabel nutsLabel15;
    private javax.swing.JButton pineappleButton3;
    private javax.swing.JLabel pineappleLabel7;
    private javax.swing.JPanel pineapplePanel5;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JButton pourButton1;
    private javax.swing.JButton removeButton1;
    private javax.swing.JButton strawberryButton2;
    private javax.swing.JLabel strawberryLabel6;
    private javax.swing.JPanel strawberryPanel4;
    private javax.swing.JButton sugarButton13;
    // End of variables declaration//GEN-END:variables

}
