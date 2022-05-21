package HM8;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyWindow extends JFrame {
    public static Random rand = new Random();
    String gamer = "X";
    String AI = "0";


    public MyWindow() {
        setBounds(500, 500, 400, 300);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel display = new JLabel("Игра началась!");
        display.setHorizontalAlignment(SwingConstants.CENTER);
        display.setFont(new Font("Arial", Font.BOLD, 17));
        add(display, BorderLayout.NORTH);

        ActionListener numberListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                button.setText("X");
            }
        };


        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(3, 3);
        numberPanel.setLayout(numberLayout);

        JButton[] buttons = new JButton[9];
        buttons[0] = new JButton();
        buttons[1] = new JButton();
        buttons[2] = new JButton();
        buttons[3] = new JButton();
        buttons[4] = new JButton();
        buttons[5] = new JButton();
        buttons[6] = new JButton();
        buttons[7] = new JButton();
        buttons[8] = new JButton();
        for (int i = 0; i < buttons.length; i++) {
            numberPanel.add(buttons[i]);
            String text = buttons[i].getText();
            buttons[i].addActionListener(numberListener);
            buttons[i].setText("*");
        }
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();

                if ("X".equals(text0)) {
                    if ("*".equals(text1)) {
                        buttons[1].setText("0");
                    } else {
                        if ("*".equals(text3)) {
                            buttons[3].setText("0");
                        } else {
                            if ("*".equals(text4)) {
                                buttons[4].setText("0");
                            }
                        }
                    }


                }


            }
        });
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text1)) {
                    if ("*".equals(text4)) buttons[4].setText("0");
                } else {
                    if ("*".equals(text0)) {
                        buttons[0].setText("0");
                    } else {
                        if ("*".equals(text3)) {
                            buttons[3].setText("0");
                        }
                    }
                }
                if ("X".equals(text1)) {
                    if ("X".equals(text0) || "X".equals(text4) || "X".equals(text2)) {
                        buttons[3].setText("0");
                    } else {
                        if ("X".equals(text0) || "X".equals(text4) || "X".equals(text2) || "X".equals(text3)) {
                            buttons[5].setText("0");
                        }
                    }
                }
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text2)) {
                    if ("*".equals(text4)) buttons[4].setText("0");
                } else {
                    if ("*".equals(text1)) {
                        buttons[1].setText("0");
                    } else {
                        if ("*".equals(text5)) {
                            buttons[5].setText("0");
                        }
                    }
                }
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text3)) {
                    if ("*".equals(text0)) buttons[0].setText("0");
                } else {
                    if ("*".equals(text4)) {
                        buttons[4].setText("0");
                    } else {
                        if ("*".equals(text6)) {
                            buttons[6].setText("0");
                        }
                    }
                }
                if ("X".equals(text3)) {
                    if ("X".equals(text0) || "X".equals(text4) || "X".equals(text6)) {
                        buttons[1].setText("0");
                    } else {
                        if ("X".equals(text0) || "X".equals(text4) || "X".equals(text2) || "X".equals(text1)) {
                            buttons[7].setText("0");
                        }
                    }
                }
            }
        });
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text4)) {
                    if ("*".equals(text0)) buttons[0].setText("0");
                } else {
                    if ("*".equals(text8)) {
                        buttons[8].setText("0");
                    } else {
                        if ("*".equals(text7)) {
                            buttons[7].setText("0");
                        }
                    }
                }
            }
        });
        buttons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text5)) {
                    if ("*".equals(text4)) buttons[4].setText("0");
                } else {
                    if ("*".equals(text2)) {
                        buttons[2].setText("0");
                    } else {
                        if ("*".equals(text8)) {
                            buttons[8].setText("0");
                        }
                    }
                }
                if ("X".equals(text5)) {
                    if ("X".equals(text2) || "X".equals(text4) || "X".equals(text8)) {
                        buttons[1].setText("0");
                    } else {
                        if ("X".equals(text2) || "X".equals(text4) || "X".equals(text8) || "X".equals(text1)) {
                            buttons[7].setText("0");
                        }
                    }
                }
            }
        });
        buttons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text6)) {
                    if ("*".equals(text3)) buttons[3].setText("0");
                } else {
                    if ("*".equals(text4)) {
                        buttons[4].setText("0");
                    } else {
                        if ("*".equals(text7)) {
                            buttons[7].setText("0");
                        }
                    }
                }
            }
        });
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text7)) {
                    if ("*".equals(text4)) buttons[4].setText("0");
                } else {
                    if ("*".equals(text8)) {
                        buttons[8].setText("0");
                    } else {
                        if ("*".equals(text6)) {
                            buttons[6].setText("0");
                        }
                    }
                }
                if ("X".equals(text7)) {
                    if ("X".equals(text6) || "X".equals(text4) || "X".equals(text8)) {
                        buttons[3].setText("0");
                    } else {
                        if ("X".equals(text6) || "X".equals(text4) || "X".equals(text8) || "X".equals(text3)) {
                            buttons[5].setText("0");
                        }
                    }
                }
            }
        });
        buttons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text0 = buttons[0].getText();
                String text1 = buttons[1].getText();
                String text2 = buttons[2].getText();
                String text3 = buttons[3].getText();
                String text4 = buttons[4].getText();
                String text5 = buttons[5].getText();
                String text6 = buttons[6].getText();
                String text7 = buttons[7].getText();
                String text8 = buttons[8].getText();
                if ("X".equals(text8)) {
                    if ("*".equals(text4)) buttons[4].setText("0");
                } else {
                    if ("*".equals(text7)) {
                        buttons[7].setText("0");
                    } else {
                        if ("*".equals(text5)) {
                            buttons[5].setText("0");
                        }
                    }
                }
            }
        });




        ActionListener valListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                button.setText("X");

            }
        };


        add(numberPanel, BorderLayout.CENTER);
        setVisible(true);


    }


    public static void main(String[] args) {
        new MyWindow();

    }
}







