# RevealPassword
An android small library to show and hide password in a EditText.

# How to use
Using only XML:
``` 
<br.com.redcode.revealpassword.library.EditTextWithImageForRevealPassword
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:drawableRevealPassword="@android:drawable/ic_menu_add"
        app:hint="Custom Hint Hardcoded" />
```
        
Using XML and JAVA/Kotlin:
``` 
    <EditText
        android:id="@+id/editTextSampleFunction"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:inputType="textWebPassword"
        android:text="\@pedrofsn" />

    <Button
        android:id="@+id/buttonShowHidePassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show/hide password" />
```
``` 
 buttonShowHidePassword.setOnClickListener { editTextSampleFunction.showOrHidePassword() }
 ```

You can see more samples in [XML](https://github.com/pedrofsn/RevealPassword/blob/master/app/src/main/res/layout/activity_main.xml) and [Java/Kotlin](https://github.com/pedrofsn/RevealPassword/blob/master/app/src/main/java/br/com/redcode/revealpassword/sample/MainActivity.kt).
