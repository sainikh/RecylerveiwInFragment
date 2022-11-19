# RecylerveiwInFragment
This project mainly focused on implemeting Fragments in an activity and then a recycler view in that fragments and passing data from one fragment to another using View Binding

### view Binding
we are using view Binding to intract between fragments. Its importent to know this before you start implementing data passing from one fragment to another
This link below explains What is view binding and more info in it
## https://www.youtube.com/watch?v=omml4lK_b-A

### navComponents
Going form one fragment to another is done by using navComponents 

### safe args
we are using safe args to pass data from one fragment to another
 

this implentaion is mailnly based on the nav Componet in android 
PLease go through this link for more info  : 
## https://developer.android.com/guide/navigation/navigation-getting-started

* First implement

  `dependencies {
        def nav_version = "2.5.3"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
    }`
    
  ###  As well as plugins
    
    `plugins {
    id("androidx.navigation.safeargs")
}`

* Set view Binding = true her ![image](https://user-images.githubusercontent.com/47454954/202839265-aa2b1999-0fb9-4e31-afcf-62cee5a67fa8.png)
*  First implemting the xml layout as shown in the code

* Create a Navhost container 
* We initlize the recycler view in the MainActivity 
* create an Interface and some metodes of which ever name you like (I create Passer as interface in this project and a method in it)

Creating a View Binding to access the 

passing Data Through fragments using safeArgs, All with the help of view Binding in fragments.
