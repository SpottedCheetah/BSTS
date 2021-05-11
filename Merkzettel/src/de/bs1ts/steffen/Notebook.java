package de.bs1ts.steffen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notebook {

    private List<Entry> notebook;

    public Notebook() {
        notebook = new ArrayList<>();
    }

    public boolean append(String content) {
        notebook.add(new Entry(content, new Date(System.currentTimeMillis())));
        return true;
    }

    public boolean remove(int id) {
        if (id < notebook.size()) {
            notebook.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public Entry getEntry(int id) {
        if (id < notebook.size()) {
            return notebook.get(id);
        } else {
            return null;
        }
    }

    public void printNotebook() {
        for (Entry e : notebook) {
            System.out.println(e);
        }

    }
}