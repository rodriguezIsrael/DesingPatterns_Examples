package com.dp.examples.behavioral.memento;

/**
 * Clase recuerdo (Memento)
 *
 * @author Israel Rodriguez E.
 * @since 14/01/2020
 */
public class EditorMemento {
    /**
     * Estato que se debera de guardar cuando se inicie el objeto.
     */
    private final String editorState;

    /**
     * @param editorState - Estado inicial del recuerdo.
     */
    public EditorMemento(String editorState) {
        this.editorState = editorState;
    }

    /**
     * Se obtiene el ultimo estado guardado
     *
     * @return String - Ultimo recuerdo guardado.
     */
    public String getSavedState() {
        return editorState;
    }
}
