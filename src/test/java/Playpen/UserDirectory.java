package Playpen;

import BaseClass.OpenBrowser;
import org.junit.Test;

import java.io.IOException;

public class UserDirectory {

    @Test
    public void userdir1() {
        System.out.println(System.getProperty("user.dir"));
    }
@Test
    public void openweb() throws IOException {
    OpenBrowser.NavtoWebsite("url");}


}
