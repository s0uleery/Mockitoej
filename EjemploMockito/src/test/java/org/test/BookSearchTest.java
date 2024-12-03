package org.test;

import org.app.BookConst;
import org.app.BookSearch;
import org.app.BookService;
import org.app.MockBookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class BookSearchTest {

    private BookService service;

    @Before
    public void init(){

        service = Mockito.mock(BookService.class);
        when(service.search(anyInt())).thenReturn(BookConst.NULLBOOK);
        when(service.search(1234)).thenReturn(BookConst.ESM);
    }

    @Test
    public void testGetBook(){

        BookSearch bs = new BookSearch(service);
        String titulo = bs.getBook(1234).getTitle();
        assertEquals("Eng Soft Moderna", titulo);

    }


}
