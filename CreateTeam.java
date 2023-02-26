public class CreateTeam {
    private Team team;
    public static void main(String[] args) {
        // create 5 persons but know them as Players
        Player p0 = new Person("Jim",78); 
        p0.setPosition("Centre"); 
        p0.setJerseyNumber(1);
        
        
        Player p1 = new Person("Sue",62);
        p1.setPosition("Left Wing"); 
        p1.setJerseyNumber(3);
        
        Player p2 = new Person("Sam",75);
        p2.setPosition("Right Wing"); 
        p2.setJerseyNumber(8); 
        
        Player p3 = new Person("Tom",75);
        p3.setPosition("Left Defence"); 
        p3.setJerseyNumber(4);
        
        Player p4 = new Person("Deb",66);
        p4.setPosition("Right Defence"); 
        p4.setJerseyNumber(9); 
        
        //System.out.println(p4 instanceof Person);
        //System.out.println(p4.getYear());
        
        // Person p5 = new Person("Ghengis", 12);
        // System.out.println(p5.getYear());
        
        //Person p6 = (Person)p4;
        //System.out.println(p6.getYear());
        
        // create a team
        Team rr = new Team("Red River CC");
        // add players to the team and display
        rr.addPlayer(p0);
        rr.addPlayer(p1);
        rr.addPlayer(p2);
        rr.addPlayer(p3);
        rr.addPlayer(p4);
        
        
        
        rr.display();
    }
}