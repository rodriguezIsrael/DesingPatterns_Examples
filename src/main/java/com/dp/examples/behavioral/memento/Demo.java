package com.dp.examples.behavioral.memento;

/**
 * @author Israel Rodriguez Espinoza.
 * @since 14/01/2020
 */
public class Demo {

    public static final void main(String... args) {
        Editor editor = new Editor(); // se crea objeto de editor
        editor.setState("Hola mundo"); // se asigna un estado
        System.out.println("Valor: " + editor.getState());
        EditorMemento stateOne = editor.save(); // se guarda el estado asignado
        editor.setState("Ya cambio"); // se modifica el estado
        System.out.println("Valor : " + editor.getState());
        String memento = stateOne.getSavedState(); // se obtiene el estado que se encontraba guardado
        editor.setState(memento);  // se reestablece el estado guardado.
        System.out.println("Valor reestaurado: " + editor.getState());

    }
}
