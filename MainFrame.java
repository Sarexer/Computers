import sun.java2d.windows.GDIRenderer;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends Frame implements ActionListener {
    ListNode<Computer> computers;
    ArrayList<String> names;

    private Label labelName;
    private Label labelFreq;
    private Label labelCores;
    private Label labelRAM;
    private Label labelMemory;
    private Label labelHoldMemory;
    private Label labelNewHoldMem;
    private Label labelNewMem;
    private Label labelFileSize;
    private Label labelAllMem;

    private TextField txtfieldName;
    private TextField txtfieldFrea;
    private TextField txtfieldCores;
    private TextField txtfieldRAM;
    private TextField txtfieldMemory;
    private TextField txtfieldHoldMemory;
    private TextField txtfieldFreeMem;
    private TextField txtfieldNewHoldMem;
    private TextField txtfieldNewMem;
    private TextField txtfieldEditHoldMem;
    private TextField txtfieldFileSize;
    private TextField txtfieldAllMem;

    private Button btnVVodInfo;
    private Button btnVivodInfo;
    private Button btnCompare;
    private Button btnFreeMem;
    private Button btnNewMem;
    private Button btnPlusMem;
    private Button btnMinusMem;
    private Button btnCopyFile;
    private Button btnALlMem;

    private List list;


    public MainFrame(String title) throws HeadlessException {
        super(title);
        computers = new ListNode<>();
        names = new ArrayList<>();
        labelName = new Label("Имя компьютера");
        labelFreq = new Label("Частота");
        labelCores = new Label("Ядра");
        labelRAM = new Label("ОП");
        labelMemory = new Label("Объём памяти");
        labelHoldMemory = new Label("Объём занятой памяти");
        labelNewMem = new Label("Новый жесткий диск");
        labelNewHoldMem = new Label("Новая занятая память");
        labelFileSize = new Label("Размер файла");
        labelAllMem = new Label("Объём всех дисков");

        txtfieldName = new TextField(3);
        txtfieldFrea = new TextField(3);
        txtfieldCores = new TextField(3);
        txtfieldRAM = new TextField(3);
        txtfieldMemory = new TextField(3);
        txtfieldHoldMemory = new TextField(3);
        txtfieldFreeMem = new TextField(5);
        txtfieldNewMem = new TextField(3);
        txtfieldNewHoldMem = new TextField(3);
        txtfieldEditHoldMem = new TextField(3);
        txtfieldFileSize = new TextField(3);
        txtfieldAllMem = new TextField(3);


        btnVVodInfo = new Button("Ввод");
        btnVivodInfo = new Button("Показать информацию");
        btnCompare = new Button("Сравнить");
        btnFreeMem = new Button("Свободная память");
        btnNewMem = new Button("Установить");
        btnPlusMem = new Button("+");
        btnMinusMem = new Button("-");
        btnCopyFile = new Button("Копировать");
        btnALlMem = new Button("Показать");
        list = new List(0, true);






        //setBackground(new Color(102, 102, 153));
        setSize(700,400);
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(layout);



        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,0,5);

        layout.setConstraints(labelName, gbc);
        layout.setConstraints(labelCores, gbc);
        layout.setConstraints(labelFreq, gbc);
        layout.setConstraints(labelRAM, gbc);
        layout.setConstraints(labelMemory, gbc);


        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 0.5;
        layout.setConstraints(labelHoldMemory, gbc);

        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        layout.setConstraints(txtfieldName, gbc);
        layout.setConstraints(txtfieldCores, gbc);
        layout.setConstraints(txtfieldFrea, gbc);
        layout.setConstraints(txtfieldRAM, gbc);
        layout.setConstraints(txtfieldMemory, gbc);
        layout.setConstraints(txtfieldHoldMemory, gbc);


        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 0.5;
        layout.setConstraints(btnVVodInfo, gbc);


        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridheight = GridBagConstraints.REMAINDER;
        layout.setConstraints(list, gbc);


        gbc.weighty = 0.0;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.5;
        gbc.gridheight = 1;
        layout.setConstraints(btnVivodInfo, gbc);


        gbc.gridx = 2;
        gbc.weightx = 0.5;
        layout.setConstraints(btnCompare, gbc);


        gbc.gridx = 3;
        layout.setConstraints(txtfieldFreeMem, gbc);


        gbc.gridx = 4;
        gbc.weightx = 0.5;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(btnFreeMem, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.0;
        gbc.gridwidth = 1;
        layout.setConstraints(labelNewMem, gbc);
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(labelNewHoldMem,gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        layout.setConstraints(txtfieldNewMem,gbc);

        gbc.gridx = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        layout.setConstraints(txtfieldNewHoldMem,gbc);
        gbc.gridx = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(btnNewMem, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        layout.setConstraints(txtfieldEditHoldMem, gbc);
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 2;
        layout.setConstraints(btnPlusMem,gbc);
        gbc.gridx = 3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(btnMinusMem,gbc);

        gbc.gridx = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(labelFileSize,gbc);


        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        layout.setConstraints(txtfieldFileSize, gbc);
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(btnCopyFile,gbc);

        gbc.gridx = 1;
        layout.setConstraints(labelAllMem,gbc);
        layout.setConstraints(txtfieldAllMem,gbc);
        layout.setConstraints(btnALlMem,gbc);






        add(labelName);
        add(labelCores);
        add(labelFreq);
        add(labelRAM);
        add(labelMemory);
        add(labelHoldMemory);
        add(txtfieldName);
        add(txtfieldCores);
        add(txtfieldFrea);
        add(txtfieldRAM);
        add(txtfieldMemory);
        add(txtfieldHoldMemory);
        add(btnVVodInfo);
        add(list);
        add(btnVivodInfo);
        add(btnCompare);
        add(txtfieldFreeMem);
        add(btnFreeMem);
        add(labelNewMem);
        add(labelNewHoldMem);
        add(txtfieldNewMem);
        add(txtfieldNewHoldMem);
        add(btnNewMem);
        add(txtfieldEditHoldMem);
        add(btnPlusMem);
        add(btnMinusMem);
        add(labelFileSize);
        add(txtfieldFileSize);
        add(btnCopyFile);
        add(labelAllMem);
        add(txtfieldAllMem);
        add(btnALlMem);

        btnVVodInfo.addActionListener(this);
        btnVivodInfo.addActionListener(this);
        btnCompare.addActionListener(this);
        btnFreeMem.addActionListener(this);
        btnNewMem.addActionListener(this);
        btnPlusMem.addActionListener(this);
        btnMinusMem.addActionListener(this);
        btnCopyFile.addActionListener(this);
        btnALlMem.addActionListener(this);
        WindowAdapter adapter = new WindowAdapter(this);
        addWindowListener(adapter);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String idButton = e.getActionCommand();
        int ind = 0;
        switch (idButton){
            case "Ввод":
                Computer computer = new Computer();
                names.add(txtfieldName.getText());
                computer.setCores(Integer.parseInt(txtfieldCores.getText()));
                computer.setFrequency(Double.parseDouble(txtfieldFrea.getText()));
                computer.setRAM(Integer.parseInt(txtfieldRAM.getText()));
                computer.setMemory(Integer.parseInt(txtfieldMemory.getText()));
                computer.setHoldMemory(Integer.parseInt(txtfieldHoldMemory.getText()));
                computers.addEnd(computer);

                list.add(txtfieldName.getText());
                break;
            case "Показать информацию":
                ind = list.getSelectedIndex();
                Computer comp = (Computer) computers.find(ind).data;
                DialogInfo d = new DialogInfo(this, "Информация о компьюетере", comp.toString());
                d.setVisible(true);
                break;
            case "Сравнить":
                int[] indxs = list.getSelectedIndexes();
                Computer comp1 = (Computer) computers.find(indxs[0]).data;
                Computer comp2 = (Computer) computers.find(indxs[1]).data;
                int res = comp1.compateTo(comp2);
                String inf;
                DialogInfo d1 = null;
                if(res == 0){
                    inf = names.get(indxs[0]) + " и " + names.get(indxs[1]) + " равны";
                    d1 = new DialogInfo(this, "Сравнение компьтеров", inf);
                }else if(res == 1){
                    inf = names.get(indxs[0]) + " лучше " + names.get(indxs[1]);
                    d1 = new DialogInfo(this,"Сравнение компьютера", inf);
                }else if(res == -1){
                    inf = names.get(indxs[0]) + " хуже " + names.get(indxs[1]);
                    d1 = new DialogInfo(this,"Сравнение компьютера", inf);

                }
                d1.setVisible(true);
                break;
            case "Свободная память":
                ind = list.getSelectedIndex();
                Computer c1 = (Computer) computers.find(ind).data;
                txtfieldFreeMem.setText(Integer.toString(c1.freeMemory()));
                break;
            case "Установить":
                int newHoldMem = 0;
                if(txtfieldNewMem.getText().equals("")){
                    newHoldMem = Integer.parseInt(txtfieldNewHoldMem.getText());
                    ind = list.getSelectedIndex();
                    Computer comp3 = (Computer) computers.find(ind).data;
                    comp3.changeMemory(newHoldMem);
                }else{
                    newHoldMem = Integer.parseInt(txtfieldNewHoldMem.getText());
                    int newMem = Integer.parseInt(txtfieldNewMem.getText());
                    ind = list.getSelectedIndex();
                    Computer comp4 = (Computer) computers.find(ind).data;
                    comp4.changeMemory(newMem, newHoldMem);
                }
                break;
            case "+":
                ind = list.getSelectedIndex();
                Computer comp5 = (Computer) computers.find(ind).data;
                comp5.plusHoldMemory(Integer.parseInt(txtfieldEditHoldMem.getText()));
                break;
            case "-":
                ind = list.getSelectedIndex();
                Computer comp6 = (Computer) computers.find(ind).data;
                comp6.minusHoldMemory(Integer.parseInt(txtfieldEditHoldMem.getText()));
                break;
            case "Копировать":
                ind = list.getSelectedIndex();
                Computer comp7 = (Computer) computers.find(ind).data;
                int fileSize = Integer.parseInt(txtfieldFileSize.getText());

                boolean res1 = comp7.copy(fileSize);

                if(res1){
                    DialogInfo d2 = new DialogInfo(this, "Копирование файла", "Файл может быть скопирован");
                    d2.setVisible(true);
                }else{
                    DialogInfo d3 = new DialogInfo(this, "Копирование файла", "Файл нельзя скопировать. Недостаточно места");
                    d3.setVisible(true);
                }
                break;
            case "Показать":
                txtfieldAllMem.setText(Integer.toString(Computer.getAllMemory()));
                break;
        }
    }
}
