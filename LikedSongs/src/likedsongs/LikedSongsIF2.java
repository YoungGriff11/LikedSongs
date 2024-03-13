/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likedsongs;

/**
 *
 * @author conor
 */
//Stack interface
public interface LikedSongsIF2{
    
    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newSong);

    public Object pop();

    public int size();

    public void emptyStack();

    public String displayStack();
}
