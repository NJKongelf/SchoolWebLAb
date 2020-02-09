package se.iths.plugin;

import spi.Page;


public class Plugin1 implements Page {
   public String n = "Plugin Test prints ! ";
   @Override
    public void execute() {
        System.out.println(n);

    }
}
