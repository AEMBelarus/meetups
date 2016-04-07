package by.minsk.aem.dynamicdialogs.hello.impl;

import org.apache.sling.jcr.api.SlingRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.jcr.Repository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by pano on 17/02/16.
 */
public class HelloServiceImplTest {

    @Mock
    private SlingRepository repository;

    @InjectMocks
    private final HelloServiceImpl target = new HelloServiceImpl();

    @Before
    public void before() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() throws Exception{
        when(repository.getDescriptor(Repository.REP_NAME_DESC)).thenReturn("test");

        assertEquals(target.getRepositoryName(), "test");
    }
}