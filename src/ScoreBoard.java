//import javax.swing.*;
//import java.util.ArrayList;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListener;
//public class ScoreBoard extends JPanel implements ActionListener{
//    private static ArrayList<Person> people;
//    private Person person1;
//    private Person person2;
//    private Person person3;
//    private Person person4;
//    private Person person5;
//    private JLabel place1;
//    private JLabel place2;
//    private JLabel place3;
//    private JLabel place4;
//    private JLabel place5;
//    private JButton submit;
//    private JTextField nameInsert;
//    private String currentName;
//    public ScoreBoard(){
//        people = new ArrayList<Person>();
//        person1 = new Person("n/a", 0);
//        person2 = new Person("n/a", 0);
//        person3 = new Person("n/a", 0);
//        person4 = new Person("n/a", 0);
//        person5 = new Person("n/a", 0);
//        place1 = new JLabel(person1.getName());
//        place2 = new JLabel(person2.getName());
//        place3 = new JLabel(person3.getName());
//        place4 = new JLabel(person4.getName());
//        place5 = new JLabel(person5.getName());
//
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);
//        people.add(person4);
//        people.add(person5);
//        nameInsert = new JTextField(10);
//        nameInsert.setFont(new Font("ARIAL", Font.BOLD, 40));
//        add(nameInsert);
//        submit = new JButton(" ");
//        add(submit);
//    }
//
//    public void addPerson(Person currentPerson){
//        if (currentPerson.getScore()>people.get(0).getScore()){
//            people.add(0, currentPerson);
//        }
//        for (int i = 1; i<people.size(); i++){
//            if ((people.get(i).getScore()<currentPerson.getScore()) &&(currentPerson.getScore()<people.get(i-1).getScore())){
//                people.add(i,currentPerson);
//            }
//        }
//        //resets persons
//        person1 = people.get(0);
//        person2 = people.get(1);
//        person3 = people.get(2);
//        person4 = people.get(3);
//        person5 = people.get(4);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        JButton button = (JButton) source;
//        String text = button.getText();
//
//        if (text.equals(" ")) {
//            String name = nameInsert.getText();
//            Person currentPerson = new Person(name, Geese.getCurrentScore());
//            addPerson(currentPerson);
//            place1 = new JLabel(person1.getName());
//            place2 = new JLabel(person2.getName());
//            place3 = new JLabel(person3.getName());
//            place4 = new JLabel(person4.getName());
//            place5 = new JLabel(person5.getName());
//            add(place1);
//            add(place2);
//            add(place3);
//            add(place4);
//            add(place5);
//            place1.setVisible(true);
//            place2.setVisible(true);
//            place3.setVisible(true);
//            place4.setVisible(true);
//            place5.setVisible(true);
//        }
//    }
//
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        ImageIcon icon0 = new ImageIcon("src/scoreboard.png");
//        Image iconImg = icon0.getImage();
//        g.drawImage(iconImg, 0, 0, null);
//        nameInsert.setLocation(150,30);
//        submit.setLocation(500, 100);
//        place1.setLocation(250,200);
//        place2.setLocation(250,350);
//        place3.setLocation(250,530);
//        place4.setLocation(250,650);
//        place5.setLocation(250,780);
//
//    }
//
//
//
//}


