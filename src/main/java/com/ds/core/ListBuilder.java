package com.ds.core;

import com.ds.dynamic.linear.*;

public class ListBuilder<T> implements Constantes {

    private final ListModel<T> oldListModel;
    private final String newListType;

    public ListBuilder(ListModel<T> oldModel, String newType) {
        this.oldListModel = oldModel;
        this.newListType = newType;
    }

    public ListModel<T> changeModel() {
        switch (this.newListType) {
            case LISTA_DOBLE:
                return fill(new DoubleLinkedList<>());
            case LISTA_CIRCULAR_SIMPLE:
                return fill(new SimplyLinkedCircularList<>());
            case LISTA_CIRCULAR_DOBLE:
                return fill(new DoubleLinkedCircularList<>());
            default:
                return fill(new SimpleLinkedList<>());
        }
    }

    private ListModel<T> fill(ListModel<T> newListModel) {
        if (this.oldListModel != null) {
            newListModel.fill(this.oldListModel);
        }
        return newListModel;
    }

}
