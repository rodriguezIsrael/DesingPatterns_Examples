package com.dp.examples.behavioral.memento;

/**
 * @author Israel Rodriguez E.
 * @since 14/01/2020
 */
public class Editor {

    /**
     * Instancia que guarda el contenido del edior
     */
    private String editorContents;


    /**
     * Guarda el ultimo estado asignado.
     *
     * @return EditorMemento - Regresa el objeto con el recuerdo almacenado
     */
    public EditorMemento save() {
        System.out.println("Guardando el estado.");
        return new EditorMemento(editorContents);
    }

    /**
     * Se encarga de reestaurar el estado actual
     *
     * @param memento - Objeto que tiene el recuerdo
     */
    public void restoreToState(EditorMemento memento) {
        editorContents = memento.getSavedState();
    }

    public void setState(String contents) {
        this.editorContents = contents;
    }

    public String getState() {
        return this.editorContents;
    }
}
