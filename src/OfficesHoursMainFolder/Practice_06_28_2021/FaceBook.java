package OfficesHoursMainFolder.Practice_06_28_2021;

import day_56_abstraction.transportation.Tesla;

import java.util.ArrayList;

/*
Facebook User•Create a class for a facebook user which inherits the Social Media class and has additional instance variables: username, password, full name, age, number of friends, and posts (ArrayList of Post)•Encapsulate all the variables. •Set the platform for "Facebook" using static block•Create a constructor that will create aFacebook user by taking username and password. -If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.-Create and assign the user's person url by using 'facebook.com/' and adding their username-Create an empty ArrayList of Posts •Overload the constructor to accept username, password, and the user’s name. -If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’•Overload the constructor to accept username, password, the user’s name, age and number of friends. -Only store the age and number of friends into the variables if they are valid numbers. The age cannot be a negative number and the number of friends cannot be negative or more than 5000.If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.•Implement all methods coming from Social Media classoDirect messaging(String username, String message)-print =%message sent to %username
oPost(String body)-Should be added to theArrayList of Posts of the useroNotifications()-Checks the current time. If the time is between 8 am -5 pm print "Notification", otherwise print "Sleep mode"Note: use this code to get the current hour: LocalTime.now().getHour()-The return value will be given in 24 hour format. •Override the toString method to print all of the information of a Facebook user when they are searched. •Create a sendFriendRequestmethod that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false). -If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.” -If the user you are trying to send the request to has already hit the limit,then print “$theUsersName cannot accept any more friend request. -If both the user and you are under the limit print “Friend request sent to $theUsersName” and increase your number of friends by one.
 */
public class FaceBook extends SocialMedia {
   private String username;
   private String password;
   private String fullName;
    int age;
    int numberOfFriends;
    ArrayList<Post> allPost;

    static {
        platform = "Facebook";
    }

    public FaceBook(String username,String password){
    this.username = username;
    setPassword(password);
    }

    @Override
    public void DirectMessage(String username, String message) {

    }

    @Override
    public void post(String body) {

    }

    @Override
    public void notification() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(this.username)){
            System.out.println("Password contained username");
            this.password = "password";
        }else{
            this.password = password;
        }

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<Post> getAllPost() {
        return allPost;
    }

    public void setAllPost(ArrayList<Post> allPost) {
        this.allPost = allPost;
    }
}
