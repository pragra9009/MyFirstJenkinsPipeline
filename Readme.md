```java
public interface WebDriver extends SearchContext {
    void get(String var1);
    // Get Method allow to open a particular addreess 
    // Any string supplied to it, will be added in 
    // address bar of broswer

    String getCurrentUrl();
    /*
     Return you URL currently displayed in address bar
    */

    // Return the PAGE TITLE DISPLAYED ON THE WINDOW 
    String getTitle();

    List<WebElement> findElements(By var1);

    WebElement findElement(By var1);
   // Return HTML of the page
    String getPageSource();
   
    // Close Vs Quit
    // Will close the current active window or tab
    void close();
    
   // close the brower
    void quit();

    /* 
      Selenium assign a unique id for your opened window 
      this method returns all ids for windows/tab currently open
     */
    Set<String> getWindowHandles();

    // Return handle of currently active window
    String getWindowHandle();

    // IT allow to change your active window , or 
    //
    WebDriver.TargetLocator switchTo();

    WebDriver.Navigation navigate();

    WebDriver.Options manage();

    @Beta
    public interface Window {
        void setSize(Dimension var1);

        void setPosition(Point var1);

        Dimension getSize();

        Point getPosition();

        void maximize();

        void fullscreen();
    }

    public interface ImeHandler {
        List<String> getAvailableEngines();

        String getActiveEngine();

        boolean isActivated();

        void deactivate();

        void activateEngine(String var1);
    }

    public interface Navigation {
        void back();

        void forward();

        void to(String var1);

        void to(URL var1);

        void refresh();
    }

    public interface TargetLocator {
        WebDriver frame(int var1);

        WebDriver frame(String var1);

        WebDriver frame(WebElement var1);

        WebDriver parentFrame();

        WebDriver window(String var1);

        WebDriver defaultContent();

        WebElement activeElement();

        Alert alert();
    }

    public interface Timeouts {
        WebDriver.Timeouts implicitlyWait(long var1, TimeUnit var3);

        WebDriver.Timeouts setScriptTimeout(long var1, TimeUnit var3);

        WebDriver.Timeouts pageLoadTimeout(long var1, TimeUnit var3);
    }

    public interface Options {
        void addCookie(Cookie var1);

        void deleteCookieNamed(String var1);

        void deleteCookie(Cookie var1);

        void deleteAllCookies();

        Set<Cookie> getCookies();

        Cookie getCookieNamed(String var1);

        WebDriver.Timeouts timeouts();

        WebDriver.ImeHandler ime();

        WebDriver.Window window();

        @Beta
        Logs logs();
    }
```
