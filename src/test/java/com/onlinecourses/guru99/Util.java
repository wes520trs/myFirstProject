package com.onlinecourses.guru99;

/*
Declare some common parameters for scripts
You can change them adopt you environment
 */

public class Util {
    //you can change the Path of Firefox based on your environment here
    public static final String FIREFOX_PATH="c:\\webdriver\\geckodriver.exe";

    //Setting base URL
    public static final String  BASE_URL="http://www.demo.guru99.com/";

    //time to wait when searching for a GUI element
    public static final int WAIT_TIME=30;

    //valid account for login
    public static final String USER_NAME="mngr304479";
    public static final String PASSWORD="sAjUrYd";

    //expected output
    public static final String EXPECT_TITLE="Guru99 Bank Manager HomePage";

}
