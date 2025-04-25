package controllers;

import models.Persona;

public class PersonaController {
    
    public void sortByDireccion(Persona[] personas){
        for(int i = 0; i < personas.length - 1; i++) {
            int IndexMayor = i;
    
            for(int j = i + 1; j < personas.length; j++) {
                if (personas[j].compareCodigoDireccion(personas[IndexMayor])) {
                    IndexMayor = j;
                }
            }
    
            if (i != IndexMayor) {
                Persona temp = personas[i];
                personas[i] = personas[IndexMayor];
                personas[IndexMayor] = temp;
            }
        }
    }
    public Persona findBersonByCodigoDireccion(Persona[] personas, int codigo){
        int bajo= 0;
        int alto= personas.length;

        while (bajo<=alto) {
            int centro= (bajo+alto)/2;

            if (personas[centro].equalsByCodigoDireccion(codigo)) {
                return personas[centro];
            }else if (personas[centro].compareCodigoDireccion(codigo)) {
                bajo= centro+1;
            }else{
                alto= centro-1;
            }
            
        }
        return null;
    }
}

// if(persona[centro].getDireccion().getCodigo()> codigo)