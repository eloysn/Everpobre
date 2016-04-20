package com.fratelliapps.everpobre;

import android.test.AndroidTestCase;

import com.fratelliapps.everpobre.model.Notebook;

/**
 * Created by eloysanznavarro on 18/4/16.
 */
public class NotebookTests extends AndroidTestCase {

    public static final String NOTEBOOK_TITLE = "Notebook title";

    public void testCanCreateANotebook() {

        final Notebook sut = new Notebook(1, NOTEBOOK_TITLE);
        assertNotNull(sut);
        assertEquals(NOTEBOOK_TITLE, sut.getName());
        assertEquals(1, sut.getId());
    }

    public void testCreatingANotebookWithEmptyOrNullNameSetDefaultName () {

        final Notebook sut = new Notebook(1, null);
        assertEquals(Notebook.DEFAULT_NAME, sut.getName());

        final   Notebook sut2 = new Notebook(1, "");
        assertEquals(Notebook.DEFAULT_NAME, sut2.getName());


    }

}
