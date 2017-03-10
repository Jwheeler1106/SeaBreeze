/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game2;

/**
 *
 * @author johnwheeler
 */
public class FileReader {
    
    public static String title;
    public static String author;
    public static String company;
    public static String copyright;
    
    public FileReader () {
        
    }
    
    public FileReader (String title, String author, String company, String copyright)
    {
        this.title = title;
        this.author = author;
        this.company = company;
        this.copyright = copyright;
        
    }
    
    public void setTitle (String theTitle)
    {
        theTitle = title;
    }
    
    public void setAuthor (String theAuthor)
    {
        theAuthor = author;
    }
    
    public void setCompany (String theCompany)
    {
        theCompany = company;
    }
    
    public void setCopyright (String theYear)
    {
        theYear = copyright;
    }
    
    public String getTitle ()
    {
        return title;
    }
    
    public String getAuthor ()
    {
        return author;
    }
    
    public String getCompany ()
    {
        return company;
    }
    
    public String getCr ()
    {
        return copyright;
    }
    
    public String toString () {
        return title + "\n Author: " + author + "\n Company: " + company + "\n (c): " + copyright; 
    }
    
}
