/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likedsongs;


import java.util.*;
/**
 *
 * @author conor
 */

public class LikedSongs implements LikedSongsIF2{
    public String name, genre;
   
    
    public ArrayList<String> songs;
    
    
    public LikedSongs(){
        songs = new ArrayList<String>();
    }
     public int size() {
        return songs.size();

    }

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public Object pop() {
        if (!(songs.isEmpty())) {
            return songs.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newSong) {
        songs.add(0, (String) newSong);
    }

    // removes all elements from the stack
    public void emptyStack() {
        while (!songs.isEmpty()) {
            pop();
        }
    }

    // return a String object that consists of all elements from the stack
    // a FOR loop is used here, but you can use an Iterator instead
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (songs.isEmpty()) {
            sMessage = sMessage.concat("Playlist is EMPTY!");
        } else {
            sMessage = "Playlist contains: ";
            for (iCount = 0; iCount < songs.size(); iCount++) {
                sMessage = sMessage.concat(songs.get(iCount));
                sMessage = sMessage.concat("; ");
            }
        }
        return sMessage;
    }
    
 }


