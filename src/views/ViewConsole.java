package views;



import models.Persona;

public class ViewConsole {

    public void printArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        System.out.println("------------------------");
    }

}

// private Scanner scanner;

// public ViewConsole(){
//     this.scanner = new Scanner(System.in);
//     ShowBanner();
// }

// public void ShowBanner(){
//     System.out.println("*** METODOS DE BUSQUEDA ***");
// }

// public int inputCode(){
//     System.out.println("Ingrese la edad");
//     int code = scanner.nextInt();
//     return code;
// }

// public void showMessage(String message){
//     System.out.println(message);
// }

// public String inputName() {
//     System.out.println("Ingrese un nombre:");
//     scanner.nextLine(); 
//     return scanner.nextLine();
// }

// public void printPersonasArray2(Persona[] personas){
    //     StringBuilder resultado1= new StringBuilder();
    //     for (Persona persona: personas){
    //         if (persona !=null) {
    //             resultado1.append(persona.toString()).append("| |");
    //         }
    //     }
    //     if (resultado1.length()>0) {
    //         resultado1.setLength(resultado1.length() -4);
    //     }
    //     System.out.println(resultado1.toString());
    // }

    // public void printMessage1(String message1){
    //     System.out.println(message1);
    // 