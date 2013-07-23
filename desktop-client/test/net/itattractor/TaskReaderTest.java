package net.itattractor;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TaskReaderTest {
    @Test
    public void testTaskListIsNotEmpty() throws Exception {
        Downloader downloader = new Downloader("http://tracker-trac.demo.esdp.it-attractor.net/","beknazar","beknazar31");
        TaskReader taskReader = new TaskReader(downloader.downloadFromUrl());
        List<String> tasks = taskReader.readTasks();
        Assert.assertFalse(tasks.isEmpty());
    }
}