# RecylerveiwInFragment
This project mainly focused on implemeting Fragments in an activity and then a recycler view in that fragments and passing data from one fragment to another using View Binding

### view Binding
we are using view Binding to intract between fragments. Its importent to know this before you start implementing data passing from one fragment to another
This link below explains What is view binding and more info in it
## https://www.youtube.com/watch?v=omml4lK_b-A

### navComponents
Going form one fragment to another is done by using navComponents 
#### Safe Args
we are using safe args to pass data from one fragment to another

this implentaion is mailnly based on the nav Componet in android 
PLease go through this link for more info  : 
## https://developer.android.com/guide/navigation/navigation-getting-started

### View Binding

 



Geeks for Geeks also provides a breaf overview of how to implement this. its good if can go through it once.
## https://www.geeksforgeeks.org/view-binding-in-android-jetpack/
* First implement

  `dependencies {
        def nav_version = "2.5.3"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
    }`
    
  ###  As well as plugins
    
    `plugins {
    id("androidx.navigation.safeargs")
}`

* Set view Binding = true
<br/> ![image](https://user-images.githubusercontent.com/47454954/202839265-aa2b1999-0fb9-4e31-afcf-62cee5a67fa8.png)
*  First implemting the xml layout as shown in the code

* Create a Navhost container 
* We initlize the recycler view in the MainActivity 
* create an Interface and some metodes of which ever name you like (I created Passer as interface in this project and a method in it)
* ## Demo : https://drive.google.com/file/d/11rJkQffbn8SikFYy0_pE4aA4LyiaZQPw/view?usp=share_link
* remember you pass interface to your adapter to make call backfunction in Adapter
