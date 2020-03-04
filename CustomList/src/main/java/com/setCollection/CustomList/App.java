package com.setCollection.CustomList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Customlist<Integer> list = new Customlist<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(78);
        LOGGER.debug(list);
        list.remove(2);
        LOGGER.debug(list);
        LOGGER.debug(list.get(0) );
        LOGGER.debug(list.get(1) );
        LOGGER.debug(list.size());
        Customlist<String>list2=new Customlist<>();
        list2.add("apple");
        list2.add("bat");
        list2.add("cat");
        list2.add("dog");
        LOGGER.debug(list2);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list2.size());
        list2.remove(2);
        LOGGER.debug(list2);
    }
}
