
package mx.itsin.edu.clas;

/**
 *
 * @author Marco Lopez
 */
public class ReplyComment {

    
    private String DescriptionR;
    private int like;
    private int dislike;
    private String day;   
    private User user;
    
    
    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }


    
    /**
     * @return the DescriptionR
     */
    public String getDescriptionR() {
        return DescriptionR;
    }

    /**
     * @param DescriptionR the DescriptionR to set
     */
    public void setDescriptionR(String DescriptionR) {
        this.DescriptionR = DescriptionR;
    }

    /**
     * @return the like
     */
    public int getLike() {
        return like;
    }

    /**
     * @param like the like to set
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * @return the dislike
     */
    public int getDislike() {
        return dislike;
    }

    /**
     * @param dislike the dislike to set
     */
    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    
    
    
   
    
}
