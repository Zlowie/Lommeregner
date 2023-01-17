import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {
    public static JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, BPlus, BMinus, BDivide, BMultiply, BEquals, BClear, BComma, BDelete, BTrigonometri, BAndet, BCos, BTan, BSin, BX2, BPi, BSqrt;
    public static JTextField Result;
    public static Color symbolFarve = new Color(50,50,50);
    public static Color talFarve = new Color(59,59,59);
    static Font fontResult = new Font("SansSerif", Font.BOLD, 40);
    static Font fontText = new Font("SansSerif", Font.BOLD, 20);
    static Font dropdownText = new Font("SansSerif", Font.BOLD, 10);
    public static boolean trigonometri = false;
    public static boolean andet = false;

    static void MainPanel(){
        JFrame frame = new JFrame("Lommeregner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(32,32,32));
        frame.setSize(340, 443);
        frame.setResizable(false);

        Result = new JTextField(20);
        Result.setBounds(2,2,315,146);
        Result.setBackground(new Color(32,32,32));
        Result.setForeground(Color.WHITE);
        Result.setHorizontalAlignment(SwingConstants.RIGHT);
        Result.setFont(fontResult);
        Result.setBorder(BorderFactory.createEmptyBorder());

        //Række 0
        BTrigonometri = new JButton("Trigonometri ↓");
        BTrigonometri.setBounds(2,150,162,24);
        BTrigonometri.setBackground(symbolFarve);
        BTrigonometri.setForeground(Color.WHITE);
        BTrigonometri.setBorder(BorderFactory.createEmptyBorder());
        BTrigonometri.setFont(dropdownText);

        //Trigonometri - Toggle Frame
        BCos = new JButton("Cos");
        BCos.setBounds(2,202,80,50);
        BCos.setBackground(talFarve);
        BCos.setForeground(Color.WHITE);
        BCos.setBorder(BorderFactory.createEmptyBorder());
        BCos.setFont(fontText);
        BCos.setVisible(false);
        BSin = new JButton("Sin");
        BSin.setBounds(84,202,80,50);
        BSin.setBackground(talFarve);
        BSin.setForeground(Color.WHITE);
        BSin.setBorder(BorderFactory.createEmptyBorder());
        BSin.setFont(fontText);
        BSin.setVisible(false);
        BTan = new JButton("Tan");
        BTan.setBounds(166,202,80,50);
        BTan.setBackground(talFarve);
        BTan.setForeground(Color.WHITE);
        BTan.setBorder(BorderFactory.createEmptyBorder());
        BTan.setFont(fontText);
        BTan.setVisible(false);


        BAndet = new JButton("Andet ↓");
        BAndet.setBounds(2,176,162,24);
        BAndet.setBackground(symbolFarve);
        BAndet.setForeground(Color.WHITE);
        BAndet.setBorder(BorderFactory.createEmptyBorder());
        BAndet.setFont(dropdownText);

        //Andet - Toggle Frame
        BX2 = new JButton("x²");
        BX2.setBounds(2,202,80,50);
        BX2.setBackground(talFarve);
        BX2.setForeground(Color.WHITE);
        BX2.setBorder(BorderFactory.createEmptyBorder());
        BX2.setFont(fontText);
        BX2.setVisible(false);

        BPi = new JButton("\uD835\uDF0B");
        BPi.setBounds(84,202,80,50);
        BPi.setBackground(talFarve);
        BPi.setForeground(Color.WHITE);
        BPi.setBorder(BorderFactory.createEmptyBorder());
        BPi.setFont(fontText);
        BPi.setVisible(false);

        BSqrt = new JButton("\u221A");
        BSqrt.setBounds(166,202,80,50);
        BSqrt.setBackground(talFarve);
        BSqrt.setForeground(Color.WHITE);
        BSqrt.setBorder(BorderFactory.createEmptyBorder());
        BSqrt.setFont(fontText);
        BSqrt.setVisible(false);

        //Række 1
        BClear = new JButton("C");
        BClear.setBounds(166,150,80,50);
        BClear.setBackground(symbolFarve);
        BClear.setForeground(Color.WHITE);
        BClear.setBorder(BorderFactory.createEmptyBorder());
        BClear.setFont(fontText);
        BDelete = new JButton("Slet");
        BDelete.setBounds(248,150,80,50);
        BDelete.setBackground(symbolFarve);
        BDelete.setForeground(Color.WHITE);
        BDelete.setBorder(BorderFactory.createEmptyBorder());
        BDelete.setFont(fontText);


        //Række 2
        B1 = new JButton("1");
        B1.setBounds(2,202,80,50);
        B1.setBackground(talFarve);
        B1.setForeground(Color.WHITE);
        B1.setBorder(BorderFactory.createEmptyBorder());
        B1.setFont(fontText);
        B2 = new JButton("2");
        B2.setBounds(84,202,80,50);
        B2.setBackground(talFarve);
        B2.setForeground(Color.WHITE);
        B2.setBorder(BorderFactory.createEmptyBorder());
        B2.setFont(fontText);
        B3 = new JButton("3");
        B3.setBounds(166,202,80,50);
        B3.setBackground(talFarve);
        B3.setForeground(Color.WHITE);
        B3.setBorder(BorderFactory.createEmptyBorder());
        B3.setFont(fontText);
        BPlus = new JButton("+");
        BPlus.setBounds(248,202,80,50);
        BPlus.setBackground(symbolFarve);
        BPlus.setForeground(Color.WHITE);
        BPlus.setBorder(BorderFactory.createEmptyBorder());
        BPlus.setFont(fontText);


        //Række 3
        B4 = new JButton("4");
        B4.setBounds(2,254,80,50);
        B4.setBackground(talFarve);
        B4.setForeground(Color.WHITE);
        B4.setBorder(BorderFactory.createEmptyBorder());
        B4.setFont(fontText);
        B5 = new JButton("5");
        B5.setBounds(84,254,80,50);
        B5.setBackground(talFarve);
        B5.setForeground(Color.WHITE);
        B5.setBorder(BorderFactory.createEmptyBorder());
        B5.setFont(fontText);
        B6 = new JButton("6");
        B6.setBounds(166,254,80,50);
        B6.setBackground(talFarve);
        B6.setForeground(Color.WHITE);
        B6.setBorder(BorderFactory.createEmptyBorder());
        B6.setFont(fontText);
        BMinus = new JButton("-");
        BMinus.setBounds(248,254,80,50);
        BMinus.setBackground(symbolFarve);
        BMinus.setForeground(Color.WHITE);
        BMinus.setBorder(BorderFactory.createEmptyBorder());
        BMinus.setFont(fontText);

        //Række 4
        B7 = new JButton("7");
        B7.setBounds(2,306,80,50);
        B7.setBackground(talFarve);
        B7.setForeground(Color.WHITE);
        B7.setBorder(BorderFactory.createEmptyBorder());
        B7.setFont(fontText);
        B8 = new JButton("8");
        B8.setBounds(84,306,80,50);
        B8.setBackground(talFarve);
        B8.setForeground(Color.WHITE);
        B8.setBorder(BorderFactory.createEmptyBorder());
        B8.setFont(fontText);
        B9 = new JButton("9");
        B9.setBounds(166,306,80,50);
        B9.setBackground(talFarve);
        B9.setForeground(Color.WHITE);
        B9.setBorder(BorderFactory.createEmptyBorder());
        B9.setFont(fontText);
        BMultiply = new JButton("*");
        BMultiply.setBounds(248,306,80,50);
        BMultiply.setBackground(symbolFarve);
        BMultiply.setForeground(Color.WHITE);
        BMultiply.setBorder(BorderFactory.createEmptyBorder());
        BMultiply.setFont(fontText);


        //Række 5
        BComma = new JButton(",");
        BComma.setBounds(2,358,80,50);
        BComma.setBackground(talFarve);
        BComma.setForeground(Color.WHITE);
        BComma.setBorder(BorderFactory.createEmptyBorder());
        BComma.setFont(fontText);
        B0 = new JButton("0");
        B0.setBounds(84,358,80,50);
        B0.setBackground(talFarve);
        B0.setForeground(Color.WHITE);
        B0.setBorder(BorderFactory.createEmptyBorder());
        B0.setFont(fontText);
        BEquals = new JButton("=");
        BEquals.setBounds(166,358,80,50);
        BEquals.setBackground(new Color(160,18,18));
        BEquals.setForeground(Color.WHITE);
        BEquals.setBorder(BorderFactory.createEmptyBorder());
        BEquals.setFont(fontText);
        BDivide = new JButton("/");
        BDivide.setBounds(248,358,80,50);
        BDivide.setBackground(symbolFarve);
        BDivide.setForeground(Color.WHITE);
        BDivide.setBorder(BorderFactory.createEmptyBorder());
        BDivide.setFont(fontText);


        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "1");
            }
        });

        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "2");
            }
        });

        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "3");
            }
        });

        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "4");
            }
        });

        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "5");
            }
        });

        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "6");
            }
        });

        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "7");
            }
        });

        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "8");
            }
        });

        B9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "9");
            }
        });

        B0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "0");
            }
        });

        BPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "+");
            }
        });

        BMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "-");
            }
        });

        BMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "*");
            }
        });

        BDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + "/");
            }
        });

        BComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(Result.getText() + ".");
            }
        });

        BEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Solve();
            }
        });

        BClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText("");
            }
        });

        BDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = Result.getText();
                Result.setText("");
                for(int i = 0; i < s.length() - 1; i++){
                    Result.setText(Result.getText() + s.charAt(i));
                }
            }
        });



        BTrigonometri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(trigonometri){
                    Hide();

                } else if (andet) {
                    Hide();

                    BTan.setVisible(true);
                    BCos.setVisible(true);
                    BSin.setVisible(true);

                    B1.setVisible(false);
                    B2.setVisible(false);
                    B3.setVisible(false);

                    trigonometri = true;
                } else if(!trigonometri){
                    BTan.setVisible(true);
                    BCos.setVisible(true);
                    BSin.setVisible(true);

                    B1.setVisible(false);
                    B2.setVisible(false);
                    B3.setVisible(false);

                    trigonometri = true;
                }


            }
        });

        BTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double f1 = Double.parseDouble(Result.getText());
                double a = Math.tan(f1*Math.PI/180);
                double result = Math.round(a * 1000.0) / 1000.0;
                Result.setText(String.valueOf(result));

            }
        });

        BCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double f1 = Double.parseDouble(Result.getText());
                double a = Math.cos(f1*Math.PI/180);
                double result = Math.round(a * 1000.0) / 1000.0;
                Result.setText(String.valueOf(result));

            }
        });

        BSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double f1 = Double.parseDouble(Result.getText());
                double a = Math.sin(f1*Math.PI/180);
                double result = Math.round(a * 1000.0) / 1000.0;
                Result.setText(String.valueOf(result));

            }
        });

        BAndet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(andet){
                    Hide();
                } else if (trigonometri){
                    Hide();

                    BX2.setVisible(true);
                    BPi.setVisible(true);
                    BSqrt.setVisible(true);

                    B1.setVisible(false);
                    B2.setVisible(false);
                    B3.setVisible(false);

                    andet = true;
                } else if( !andet){
                    BX2.setVisible(true);
                    BPi.setVisible(true);
                    BSqrt.setVisible(true);

                    B1.setVisible(false);
                    B2.setVisible(false);
                    B3.setVisible(false);

                    andet = true;
                }
            }
        });

        BX2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(Result.getText());
                double result = x*x;
                Result.setText(String.valueOf(result));

            }
        });

        BPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Math.round((Math.PI) * 1000.0) / 1000.0;
                Result.setText(Result.getText() + result);
            }
        });

        BSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(Result.getText());
                double result = Math.round((Math.sqrt(x)) * 1000.0) / 1000.0;
                Result.setText(String.valueOf(result));
            }
        });


        frame.add(B1);
        frame.add(B2);
        frame.add(B3);
        frame.add(B4);
        frame.add(B5);
        frame.add(B6);
        frame.add(B7);
        frame.add(B8);
        frame.add(B9);
        frame.add(B0);
        frame.add(BPlus);
        frame.add(BMinus);
        frame.add(BDivide);
        frame.add(BMultiply);
        frame.add(BEquals);
        frame.add(BClear);
        frame.add(BComma);
        frame.add(Result);
        frame.add(BDelete);
        frame.add(BTrigonometri);
        frame.add(BAndet);
        frame.add(BCos);
        frame.add(BTan);
        frame.add(BSin);
        frame.add(BX2);
        frame.add(BPi);
        frame.add(BSqrt);

        frame.setLayout(null);
        frame.setVisible(true);
    }


    public static void Solve(){
        String s = Result.getText();
        String[] s1 = s.split("\\+");
        String[] s2 = s.split("\\-");
        String[] s3 = s.split("\\*");
        String[] s4 = s.split("\\/");

        if(s1.length == 2){
            double d1 = Double.parseDouble(s1[0]);
            double d2 = Double.parseDouble(s1[1]);
            double d3 = d1 + d2;
            Result.setText(Double.toString(d3));
        }
        else if(s2.length == 2){
            double d1 = Double.parseDouble(s2[0]);
            double d2 = Double.parseDouble(s2[1]);
            double d3 = d1 - d2;
            Result.setText(Double.toString(d3));
        }
        else if(s3.length == 2){
            double d1 = Double.parseDouble(s3[0]);
            double d2 = Double.parseDouble(s3[1]);
            double d3 = d1 * d2;
            Result.setText(Double.toString(d3));
        }
        else if(s4.length == 2){
            double d1 = Double.parseDouble(s4[0]);
            double d2 = Double.parseDouble(s4[1]);
            double d3 = d1 / d2;
            Result.setText(Double.toString(d3));
        }
    }

    public static void Hide(){
        BTan.setVisible(false);
        BCos.setVisible(false);
        BSin.setVisible(false);
        BX2.setVisible(false);
        BPi.setVisible(false);
        BSqrt.setVisible(false);

        B1.setVisible(true);
        B2.setVisible(true);
        B3.setVisible(true);

        trigonometri = false;
        andet = false;
    }


    public static void main(String[] args) {
        MainPanel();
    }
    
}


