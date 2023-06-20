# Project-7-Programming-Concepts
Java Exercise 7
Song Playlist
On canvas, you received an Array of Objects example that shows you how to manage a
DVD collection. Modify that code so that it manages a song playlist instead.
You will need to perform the following steps:
Using the DVD class as a template:
1. Create a class called Song that has the following private members:
• Song title (String)
• Song artist (String)
• Album that the Song is on (String)
• Track number on Album (int)
• Year the song was released (int)
2. Modify the constructor so that it sets up a Song object
3. Modify the toString so that it displays the contents of the Song object
• Tip: use the format method from the String class to make your output
look more presentable in the toString method. (Instructions for how to
use this method was outlined in Assignment 4.)
Using the DVDCollection class as a template:
1. Create a class called PlayList that has the following private members:
a. An array of Song objects
b. A counter (int)
• Keep the same count variable, (with initialization) from the
example.
2. Modify the constructor so that it creates a Song array of size 3. (We should test
the increaseSize method, so let’s set the array to a small value.)
3. Modify the addDVD method (call it addSong) so that it accepts the 5
corresponding parameters for a song to set up a Song object
4. Modify the toString method to Display information for the playlist
5. Modify the increaseSize method (as needed) so that it doubles the size of the
playlist array if needed
Using the Movie class is as template:
1. Create a driver program called SongDriver, that tests your Array of Song objects
2. Use your PlayList constructor to create a PlayList object.
3. Create 5 local variables to allow you to copy values to the corresponding private
members of your class
4. Prompt the user for the number of songs they’d like to enter in the playlist. Store
this in an int variable.
5. Create a loop that runs according to the number of songs entered by the user.
• In each iteration, make sure that you prompt the user for all the
information needed for each song.
• As soon as you get all five values, pass the values to your addSong
method.
6. Check the contents of the array (your increase size method should work
automatically if your code is modified correctly).
Tip: Remember to check your loop to ensure that you identify and fix any pesky String
input errors!
A sample of the output is shown below:
How many songs for this playlist? 4
Enter metadata for song 1:
Song Title: Voyager
Artist: Daft Punk
Album: Discovery
Track number: 10
Year released: 2001
Enter metadata for song 2:
Song Title: Hated
Artist: Beartooth
Album: Aggressive
Track number: 2
Year released: 2016
Enter metadata for song 3:
Song Title: Spectrum
Artist: Zedd
Album: Clarity
Track number: 3
Year released: 2012
Enter metadata for song 4:
Song Title: Black
Artist: Trivium
Album: In Waves
Track number: 6
Year released: 2011
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
My Playlist
Number of Songs: 4
Voyager Daft Punk Discovery 10 2001
Hated Beartooth Aggressive 2 2016
Spectrum Zedd Clarity 3 2012
Black Trivium In Waves 6 2011
