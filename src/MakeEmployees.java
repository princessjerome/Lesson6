import TerminalIO.*;

public class MakeEmployees {

    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        Employee emp; //employee
        String name; //name
        int type; //type
        double rate; //hourly pay rate
        int hours; //hours worked
        String prompt; //user prompt
        emp = new Employee();
        while (true){
            //get the name and break if blank
            System.out.println("Enter employee data");
            name = r.readLine("Name (or <enter> to quit):");
            if(!(emp.setName(name)))break;
            //get the type until valid
            while (true){
                prompt = " Type (" + emp.getTypeRules() + "): ";
                type = r.readInt(prompt);
                if(emp.setType(type))break;
            }
            //get the hourly pay rate until valid
            while(true){
                prompt = " Hourly rate(" + emp.getRateRules()+ "): ";
                rate = r.readDouble(prompt);
                if(emp.setRate(rate)) break;
            }
            //get the hours worked until valid
            while(true){
                prompt = " Hours(" + emp.getHourRules() + "): ";
                hours = r.readInt(prompt);
                if(emp.setHours(hours))break;
            }
            //print the name and pay
            System.out.print(" The weekly pay for ");
            System.out.print(emp.getName());
            System.out.println(" is $" + emp.getPay());
            
        }//end larger while       
    }//end main
    
}
